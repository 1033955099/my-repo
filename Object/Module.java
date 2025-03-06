// 模块


/* .class文件是JVM看到的最小可执行文件，
而一个大型程序需要编写很多Class，并生成一堆.
class文件，很不便于管理，所以，jar文件就是class文件的容器。 */

/* 在Java 9之前，一个大型Java程序会生成自己的jar文件，同时引用依赖的第三方jar文件，
而JVM自带的Java标准库，实际上也是以jar文件形式存放的，这个文件叫rt.jar，一共有60多M。 */

// 如果是自己开发的程序，除了一个自己的app.jar以外，还需要一堆第三方的jar包，运行一个Java程序，一般来说，命令行写这样：
// java -cp app.jar:a.jar:b.jar:c.jar com.liaoxuefeng.sample.Main
// 注意:JVM自带的标准库rt.jar不要写到classpath中，写了反而会干扰JVM的正常运行。

// 如果漏写了某个运行时需要用到的jar，那么在运行期极有可能抛出ClassNotFoundException。
// 所以，jar只是用于存放class的容器，它并不关心class之间的依赖。

/* 从Java 9开始引入的模块，主要是为了解决“依赖”这个问题。如果a.jar必须依赖另一个b.jar才能运行，那我们应该给a.jar加点说明啥的，
让程序在编译和运行的时候能自动定位到b.jar，这种自带“依赖关系”的class容器就是模块。 */

/* Java 9开始，原有的Java标准库已经由一个单一巨大的rt.jar分拆成了几十个模块，
这些模块以.jmod扩展名标识，可以在$JAVA_HOME/jmods目录下找到它们:
java.base.jmod
java.compiler.jmod
java.datatransfer.jmod
java.desktop.jmod */

/* 
这些.jmod文件每一个都是一个模块，模块名就是文件名。例如java.base对应的就是java.base.jmod。模块内部的依赖关系已经被写入到模块
内的module-info.class文件了。所有模块都直接或者间接地依赖java.base模块，只有java.base不依赖于任何模块，它可以被看作为"根模块"，
好比所有的类都是从Object直接或间接继承而来。
 */

 /*
把一堆class封装为jar仅仅是一个打包过程，而把一堆类class封装为模块，而把一堆class封装为模块则不但需要打包，还需要写入依赖关系
并且还可以包含二进制代码（通常是JNI扩展）。此外，模块支持多版本，即在同一模块中可以为不同的JVM提供不同的版本。
  */


//   编写模块
// 创建模块和原有的创建Java项目是完全一样的
/* bin目录存放编译后的class文件，src目录存放源码，按包名的目录结构存放，
仅仅在src目录下多了一个module-info.java这个文件，这就是模块的描述文件。
module hello.world {
	requires java.base; // 可不写，任何模块都会自动引入java.base
	requires java.xml;
}
其中，module是关键字，后面的hello.world是模块的名称，它的命名规范与包一致。
花括号的requires xxx;表示这个模块需要引用的其他模块名。除了java.base可以被
自动引入外，这里我们引入了一个java.xml的模块。
 */

// 当我们使用模块声明了依赖关系后，才能使用引入的模块。
 

// 运行模块
// 想要运行一个jar，我们使用java -jar xxx.jar命令。想要运行一个模块，我们只需要指定模块名。
// $ java --module-path hello.jar --module hello.world
// Hello, xml!


// 打包jar
/* 为了支持模块化，Java 9首先带头把自己的一个巨大无比的rt.jar拆成了几十个.jmod模块，
原因就是，运行Java程序的时候，实际上我们用到的JDK模块，并没有那么多。不需要的模块，完全可以删除。 */

/* JDK提供了jlink命令“复制”一份JRE，但只带上用到的模块。 */
// $ jlink --module-path hello.jmod --add-modules java.base,java.xml,hello.world --output jre/
/* 我们在--module-path参数指定了我们自己的模块hello.jmod，然后，在--add-modules参数中指定了我们用到
的3个模块java.base、java.xml和hello.world，用,分隔。最后，在--output参数指定输出目录。 */
// 在当前目录下，我们可以找到jre目录，这是一个完整的并且带有我们自己hello.jmod模块的JRE。
/* $ jre/bin/java --module hello.world
     Hello, xml! */  
/* 要分发我们自己的Java应用程序，只需要把这个jre目录打个包给对方发过去，
对方直接运行上述命令即可，既不用下载安装JDK，也不用知道如何配置我们自己
的模块，极大地方便了分发和部署。 */


// 访问权限
// Java的class访问权限分为public、protected、private和默认的包访问权限。引入模块后，这些访问权限的规则就要稍微做些调整。
// class的访问权限只在一个模块类有效，模块和模块之间，例如  a模块需要访问b模块的某个class，必要条件是b模块明确地导出可以访问的包。
/* 假如：我们模块Hello.word用到了模块java.xml的一个类javax.xml.XMLConstants，我们之所以能直接使用这个类，是因为m模块java.xml的
 * module-info.java中声明了诺干导出
 */

/* 
module java.xml {
  exports java.xml;
  exports javax.xml.catalog;
  exports javax.xml.datatype;
  ...
}
*/
/* 只有它声明的导出的包，外部代码才被允许访问。换句话说，
如果外部代码想要访问我们的hello.world模块中的com.itranswarp.sample.Greeting类，我们必须将其导出： */
/*
 module hello.world {
  exports com.itranswarp.sample;

  requires java.base;
	requires java.xml;
}

因此，模块进一步隔离了代码的访问权限。
*/

/* 
Java 9引入的模块目的是为了管理依赖；

使用模块可以按需打包JRE；

使用模块对类的访问权限有了进一步限制。 */
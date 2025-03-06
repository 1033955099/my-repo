// classpath是JVM用到的一个环境变量，它用来指示JVM如何搜索class。
// java是编译型语言，源码文件是.java,而编译后的.class文件才是真正可以被jvm执行的字节码，因此jvm需要知道，如果要加载一个abc.xxs.Hello的
// 类，应该去哪儿搜索对应的Hello.class文件。
// classpath就是一组目录的集合，它设置的搜索路径与操作系统相关。


/* JVM通过环境变量classpath决定搜索class的路径和顺序；

强烈建议不要设置系统环境变量classpath，建议始终通过-cp命令传入；

jar包本质上是zip格式，相当于目录，可以包含很多.class文件，方便下载和使用；

MANIFEST.MF文件可以提供jar包的信息，如Main-Class，这样可以直接运行jar包。 */
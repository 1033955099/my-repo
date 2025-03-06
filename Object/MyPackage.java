// Java 的 包（Package） 是用来组织类和接口的一种机制，类似于文件夹的概念。包可以避免类名冲突，并且提高代码的可管理性。
// Java定义了一种名字空间，称之为包：package。一个类总是属于某个包，类名（比如Person）只是一个简写，真正的完整类名是包名.类名。
// 在定义class的时候，我们需要在第一行声明这个class属于哪个包。

// package zhang; // 声明包名zhang
// public class Person{
// }

// 在Java虚拟机执行的时候，JVM只看完整类名，因此，只要包名不同，类就不同。
// 包可以是多层结构，用.隔开。例如：java.util。
// 包没有父子关系。java.util和java.util.zip是不同的包，两者没有任何继承关系。
// 没有定义包名的class，它使用的是默认包，非常容易引起名字冲突，因此，不推荐不写包名的做法。

// 即所有Java文件对应的目录层次要和包的层次一致。
// 编译后的.class文件也需要按照包结构存放。如果使用IDE，把编译后的.class文件放到bin目录下，那么，编译的文件结构就是：


// 包作用域
// 位于同一个包的类，可以访问包作用域的字段和方法。protected、private修饰的字段和方法就是包作用域。例如，Person类定义在hello包下面：
// package hello;
// public class Person{
//     // 包的作用域
//     void hello(){
//         System.out.println("hello");
//     }
// }

// public class MyPackage{
//     public static void main(String[] args) {
//         Person p = new Person();
//         p.hello(); // 可以调用，因为MyPackage和Person在同一个包
//     }
// }


// import
// 在一个class中我们总会引用其它的class。
// package mypackage; // 定义包名

// public class MyClass {
//     public void showMessage() {
//         System.out.println("Hello from MyClass in mypackage!");
//     }
// }

// 如果你想在另一个 Java 文件中使用 mypackage 里的 MyClass，可以用 import 关键字：

// import mypackage.MyClass; // 导入mypackage里的MyClass

// public class MyPackage {
//     public static void main(String[] args) {
//         MyClass obj = new MyClass(); // 创建MyClass对象
//         obj.showMessage();
//     }
// }

/* 
 编写class的时候，编译器会自动帮我们做两个import动作：
  默认自动import当前package的其他class；
  默认自动import java.lang.*。 
 */


// java内建的package机制是为了避免class命名冲突；
// jdk的核心类使用java.lang包，编译器h会自动导入；
// jdk的其他常用类定义在Java.util.*，java.math.*,java.text.*,......;
// 包名推荐使用倒置的域名，如org.apache.
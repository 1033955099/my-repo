// 在Java中，我们经常看到public，protected,privat这些修饰符。在Java中，这些修饰符可以用来限定访问作用域

// public
// 定义为public的class，interface可以被其他任何类访问:
// package abc;

// public class Hello{
//     public void hi(){
//     }
// } 
// // 上面的Hello是public，因此，可以被其它包的类访问：

// package xyz;

// class Main{
//     void foo{
//         // Main可以访问Hello
//         Hello a = new Hello();
//     }
// } 

// 定义为public的field，method可以被其它类访问，前提是首先有访问class权限：
// package abc;
// public class Hello{
//     public void hi(){
//     }
// }
// // 上面的hi()方法是public，可以被其它类调用，前提是首先要能访问Hello类:
// package xzy;
// class Main{
//     void foo(){
//         hello h = new Hello()
//     }
// }

// private（私人的）
// 定义为private的field、method无法被其他类访问：
// private访问权限被限定在class的内部，而且与方法声明顺序无关。
// 推荐把private方法放到后面，因为public方法定义了类对外提供的功能，阅读代码的时候，应该先关注public方法：
// package abc; // 包名

// public class Hello { // 公开的修饰符类
//     public void hello() {
//         this.hi();
//     }
//     // 不能被其他类调用:
//     private void hi() { // 因为有private所以不能被其它的类访问
//     }
// }
// 由于Java支持嵌套类，如果一个类内部还定义了嵌套类，那么，嵌套类拥有访问private的权限：
// private
// public class Main {
//     public static void main(String[] args) {
//         Inner i = new Inner();
//         i.hi();
//     }

//     // private方法:
//     private static void hello() {
//         System.out.println("private hello!");
//     }

//     // 静态内部类:
//     static class Inner {
//         public void hi() {
//             Main.hello();
//         }
//     }
// }
// 定义在一个class内部的class称为嵌套类（nested class），Java支持好几种嵌套类。


// protected（受保护的）
// protected作用于继承关系。定义为protected的字段和方法可以被子类访问，以及子类的子类：
// package abc;

// public class Hello {
//     // protected方法:
//     protected void hi() {
//     }
// }
// // 上面的protected方法可以被继承的类访问：
// package xyz;

// class Main extends Hello {
//     void foo() {
//         // 可以访问protected方法:
//         hi();
//     }
// }


// package
// 最后包作用域是指一个类允许访问同一个package有没有public,private修饰的class，以及没有public,protected,private修饰的字段和方法
// package abc;
// // package权限的类:
// class Hello {
//     // package权限的方法:
//     void hi() {
//     }
// }
// 只要在同一个包，就可以访问package权限的class、field和method
// package abc;

// class Main {
//     void foo() {
//         // 可以访问package权限的类:
//         Hello h = new Hello();
//         // 可以调用package权限的方法:
//         h.hi();
//     }
// }
// 包名必须完全一致，包没有父子关系，com.apache和com.apache.abc是不同的包。


// 局部变量，在方法内部定义的变量称为局部变量，局部变量作用域从变量声明处开始到对应的块结束。方法参数也是局部变量。


// final
// Java还提供了一个final修饰符。final与访问权限不冲突，它有很多作用。
// 用final修饰class可以阻止被继承：
// package abc;

// // 无法被继承:
// public final class Hello {
//     private int n = 0;
//     protected void hi(int t) {
//         long i = t;
//     }
// }

// 用final修饰method可以阻止被子类覆写：
// package  abc;
// public class Hello {
//     // 无法被覆写:
//     protected final void hi() {
//     }
// }

// 用final修饰field可以阻止被重新赋值：

// package abc;

// public class Hello {
//     private final int n = 0;
//     protected void hi() {
//         this.n = 1; // error!
//     }
// }

// 用final修饰局部变量可以阻止被重新赋值；
// package abc;

// public class Hello{
//     protected void hi(final int t) {
//         t = 1; // error!
//     }
// }

// 如果不确定是否需要public，就不声明为public，即尽少地暴露对外的字段和方法。
// 把方法定义为package权限有助于测试，因为测试类和被测试类只要位于同一个package，测试代码就可以访问被测试类的package权限方法。
// 一个.java文件只能包含y一个public类，但可以包含多个非public类。如果有public类，文件名必须和public类的名字相同。

// java内建的访问权限包括public，protected,private和package权限。
// java在内部定义的变量是局部变量，局部的变量是从声明开始到一个块结束。
// final修饰符不是访问权限，它可以修饰class，field和method；
// 一个.java文件只能包含y一个public类，但可以包含多个非public类。
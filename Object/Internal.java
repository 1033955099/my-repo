// 在Java程序中，通常情况下，我们把不同的类组织在不同的包下面，对于一个包下面的类来说，它们是在同一层次，没有父子关系
// 还有一种类，它被定义在另一个类的内部，所以称为内部类。java的内部类分为好几种，通常情况用的不多，但也需要了解它是如何使用的


// lnner class
// 如果一个类定义在另一个类的内部，那么这个类就是lnner class
// class Outer{
//     class lnner{
//         // 定义了一个内部 lnner class
//     }
// }
// 上述定义的Outer是一个普通类，而lnner是一个内部类lnner class，它与普通类有最大的不同，就是lnner class的实例不能单独存在
// 必须依附于一个Outer class的实例。 
// inner class
// public class Internal {
//     public static void main(String[] args) {
//         Outer outer = new Outer("Nested"); // 实例化一个Outer
//         Outer.Inner inner = outer.new Inner(); // 实例化一个Inner
//         inner.hello();
//     }
// }

// class Outer {
//     private String name;

//     Outer(String name) {
//         this.name = name;
//     }

//     class Inner {
//         void hello() {
//             System.out.println("Hello, " + Outer.this.name);
//         }
//     }
// }
// 通过代码得出，如果需要实例话化部类inner，那我们就必须先创建一个Outer的实例，然后调用Outerd实例的new来创建Inner的实例：
// Outer.Inner inner = outer.new Inner();
// Inner Class除了有一个this指向它自己，还隐含地持有一个Outer Class实例，
// 可以用Outer.this访问这个实例。所以，实例化一个Inner Class不能脱离Outer实例。

// Inner class和普通class相比，除了能引用Outer实例外，还有一个额外"特权"，就是可以修改Outer class的private字段，因为lnner Class
// 的作用域在Outer Class内部，所以能访问Outer Class的private字段和方法。


// Anonymous Class(匿名类)
// 还有一种定义Inner class的方法，它不需要在Outer Class中明确地定义这个Class，而是在方法内部，通过匿名类Anonymous Class来定义。
// 匿名类就是没有名字的类。它通常用来简化代码，在某些场景下临时使用，不需要正式定义一个类。

// class Outer{
//     private String name; // 字段

//     Outer(String name){ //  构造方法
//         this.name=name;
//     }

//     void Hello(){ // Hello 方法
//         Runnable r = new Runnable() { // 我们在Hello方法内部写的匿名类
//             @Override
//             public void run(){ // run方法
//                 System.out.println("Hello"+Outer.this.name); // 打印字符串
//             }
//         };
//         new Thread(r).start(); // new Thread代表线程，start代表启动
//     }
// }

// public class Internal{
//     public static void main(String []args){
//         Outer outer = new Outer("Word!"); // Outer的实例
//         outer.Hello(); // Outer的实例调用Hello方法
//     }
// }
// 观察Hello方法，(Runnable是Java自带的接口，所有接口是不能实例化的)所以是定义了一个实现Runnable接口的一个匿名类，并且可以通过
// new实例化该匿名类，然后转型为Runnable。在定义匿名类的时候就必须实化它，定义匿名类的写法如下：
// Runnable r = new Runnable(){
//     // 实现必要的抽象方法
// }

// 匿名类和Inner class一样，可以访问Outer的private字段和方法。之所以我们要定义匿名类，是因为我们通常不关心类名，比直接定义Inner Class可以
// 少些很多代码
// 除了接口外，匿名类也完全可以继承自普通类。


// Static Nested Class(静态嵌套类)
// 最后一种内部类和inner Classl类似，但是使用static修饰，称为静态内部类(Static Nested Class)
// 入口方法
public class Internal {
    public static void main(String[] args) {
        // 创建静态内部类的实例
        Outer.StaticNested sn = new Outer.StaticNested(); //直接通过 Outer.StaticNested 创建静态内部类的实例，而不需要先创建 Outer 的对象。
        sn.hello();
    }
}
class Outer {
    private static String NAME = "OUTER";  // 静态变量

    private String name;  // 普通成员变量（实例变量）

    Outer(String name) {
        this.name = name;
    }

    // 静态内部类
    static class StaticNested {
        void hello() {
            // 只能访问外部类的静态成员变量
            System.out.println("Hello, " + Outer.NAME);
        }
    }
}
// 静态内部类 StaticNested 只能访问 Outer 类的静态成员
// Outer.NAME 是一个 static 变量，所以 StaticNested 可以访问它。
// StaticNested 不能直接访问 Outer 的 name 实例变量，因为它是非静态成员。
/* 
 * 用static修饰的内部类和Inner Class有很大的不同，
 * 它不再依附于Outer的实例，而是一个完全独立的类，
 * 因此无法引用Outer.this，但它可以访问Outer的private静态字段和静态方法。
 * 如果把StaticNested移到Outer之外，就失去了访问private的权限。
 */

 /* 
小结
Java的内部类可分为Inner Class、Anonymous Class和Static Nested Class三种；
Inner Class和Anonymous Class本质上是相同的，都必须依附于Outer Class的实例，
即隐含地持有Outer.this实例，并拥有Outer Class的private访问权限；
Static Nested Class是独立类，但拥有Outer Class的private访问权限。
  */
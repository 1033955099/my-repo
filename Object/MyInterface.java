public class MyInterface {
    
}
// 在抽象类中抽象方法本质上是定义接口规范：即规定高层类的接口，从而保证所有子类都有相同的接口实现，这样多态度就能发挥出威力。
// 如果一个抽象类没有字段，所有方法全部都是抽象方法：
// abstract class Person{
//     public abstract void run();
//     public abstract String getName();
// }
// 就可以把抽象类改写为接口interface
// 在java中使用interface可以声明一个接口
// interface Person{
//     void run();
//     String getName();
// }
// 所谓interface就是比抽象类还抽象的接口，因为它连字段都不能有。因为接口定义的所有方法默认都是public abstract的，所以这两个修饰符不需要写出来

// 当一个具体的class去实现一个interface时，需要使用implements关键字

// class Student implements Person{
//     private String name;

//     public Student(String name){
//         this.name=name;
//     }

//     @Override
//     public void run(){
//         System.out.println(this.name+"run");
//     }

//     @Override
//     public String getName(){
//         return this.name;
//     }
// }
// // 一个类可以实现多个implements
// class Student implements Person,Hello{
//     // 实现了两个implements
// }

// 术语
// java的接口特指interface的定义，表示一个接口类型和一组方法签名，而编程接口泛指接口范围，如方法签名，数据格式，网络协议等。
// 抽象类和接口的对比

//             abstract class	           interface
// 继承	       只能extends一个class	    可以implements多个interface
// 字段	       可以定义实例字段	         不能定义实例字段
// 抽象方法	   可以定义抽象方法	         可以定义抽象方法
// 非抽象方法	可以定义非抽象方法	     可以定义default方法

// 接口继承
// 一个interface可以继承另一个interface.interface继承自interface使用extends,它相当于扩展了接口方法。
// interface Hello(){
//     void hello();
// }
// interface Person extends Hello {
//     void run();
//     String getName();
// }
// 此时person接口继承了Hello接口的方法，Person现在实际上就有三个抽象方法签名，其中一个来自继承的Hello接口。


// 继承关系
// 合理设计interface和abstract class的继承关系可以充分复用代码。一般，公共逻辑适合放在abstract class中，具体逻辑放到各个子类，
// 而接口层次代表抽象程度。
// 在使用时，实例化的对象永远只能是具体的某个子类，但是通过接口去引用它，因为接口比抽象类更抽象
// import java.util.ArrayList;
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
// list list = new ArrayList(); // 用list接口引用具体子类的实例
// Collection coll = List; // 向上转型为Collection接口
// Iterable it = coll; // 向上转行为Iterable接口


// default方法
// 在接口中,可以定义default方法。例如，把Person接口的run()方法改为default方法:
// interface
// public class MyInterface{
//     public static void main(String[] args) {
//         Person p = new Student("Xiao Ming"); // 创建一个Student对象并且赋给Person类型的变量
//         p.run(); // 调用Person接口中的run()方法，输出名字+"run"
//     }
// }
// // 首先定义一个Person接口
// interface Person{
//     // person接口定义了一个抽象方法getName();所有实现Person接口的类都需要提供getName()方法的实现
//     String getName(); // 定义了一个方法没有实现，必须由于实现接口的类来提供实现。
//     default void run(){ //default  方法是由java8引入的，接口可以有默认实现
//         System.out.println(getName()+"run"); // 调用接口中getName方法，输出名字和run
//     } 
// }

// class Student implements Person{
//     private String name; // name是每个Student的名字
//     public Student(String name){
//         this.name = name; // 构造方法将名字传给name变量
//     }
// }
// @Override
// public String getName(){
//     return this.name; // 返回Student的名字
// }
// 实现类可以不必覆写default方法，default方法的目的是，当我们需要给接口新增一个方法时，会设计到修改全部子类。如果新增的是
// default方法,那么子类无需全部修改,只需要在覆写的地方去覆写新增方法

// default方法和抽象类的普通方法是有所不同的。因为interface没有字段，default方法无法访问字段，而抽象类的普通方法可以访问实例字段


// 用接口给一个有工资收入和稿费的小伙伴算税

// 创建Person接口
interface Person{
    double getTax(); // 创建抽象方法getTax()
}

class Salary implements Person{ //创建Salary类并实现Person接口
    private double salary; // 创建工资属性

    public Salary(double salary){
        this.salary=salary; // 构造方法将salary传递到salary属性
    }

    @Override
    public double getTax(){ // 使用接口的抽象方法计算工资所要交的税值
        if(this.salary>5000){
            return (this.salary-5000)*0.2;
        }else{
            return 0;
        }
    }
}

class Manuscript implements Person{ // 创建一个Manuscript类并实现Person接口
    private double manuscript;

    public Manuscript(double manuscript){
        this.manuscript=manuscript;
    }

    @Override
    public double getTax(){
        return this.manuscript*0.1;
    }
}

public class MyInterface{
    public static void main(String []args){
        Person[] persons = new Person[]{new Salary(8000),new Manuscript(5000)};
        System.out.println(calculateTax(persons));
    }
    public static double calculateTax(Person...persons){
        double tax = 0;
        for(Person person:persons){
            tax += person.getTax();
        }
        return tax;
    }
}
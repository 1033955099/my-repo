// 由于多态的存在，每个子类都可以覆写父类的方法
// 例如：
// 父类
// class Person{
//     public void run(){}
// }
// // 子类1
// class Student extends Person{
//     @Override
//     public void run(){}
// }
// // 子类2
// class Teacher extends Person{
//     @Override
//     public void run(){}
// }
// 从Person类派生的Student和Tercher都可以覆写父类的run()方法
// 父类Person的run()方法即使没有实际意义，也不能去掉方法的执行语句，否则会导致编译错误因为定义方法的时候，必须实现方法的语句
// 也不能去掉Person的run()方法，去掉了就失去了多态的特性。如果去掉了就会导致：// Person没有run()方法，编译错误

// 如果父类的方法本身不需要实现任何功能，仅仅是为了定义方法签名，目的是让子类覆写它，那可以把父类的方法声明为抽象方法
// class Person{
//     public abstract void run();
// }
// 把一个方法声明为abstract，表示它是一个抽象方法，本身没有实现任何方法语句。因为这个抽象方法本身是无法执行的。
// 所以Person类也无法被实例化。编译器会告诉我们，无法编译Person类，因为它包含抽象方法
// 必须把person类本身也抽象化才能正确编译它
// abstract class Person{
//     public abstract void run();
// }


// 抽象类
// 如果一个class定义了方法，但是没有具体执行代码，这个方法就是抽象方法，抽象方法用abstract修饰
// 因为无法执行抽象方法,因此这个类也必须申明为抽象类
// 使用abstract修饰的类就是抽象类，我们无法实例化一个抽象类
// Person p = new Person(); //编译错误
// 抽象类本身被设计成只用于被继承，抽象类可以强迫子类实现其定义的抽象方法，否则编译会报错。因此抽象方法实际上相当于定义了"规范"。
// 例如：
// Person类定义了抽象方法run(),那么在实现子类Student的时候，就必须覆写run()方法：
// abstract class Person{
//     public abstract void run();
// }
// class Student extends Person{
//     @Override
//     public void run(){
//         System.out.println("nihao");
//     }
// }
// public class MyAbstract{
//     public static void main(String []args){
//         Person p = new Student();
//         p.run();
//     }
// }


// 面向抽象编程
// 当我们定义了抽象类Person,以及具体的Student,Teacher子类的时候,我们可以通过抽象类Person类型去引用具体的子类的实例
// Person p = new Student();
// Person t = new Teacher();
// 这种引用抽象类的好处在于，我们对其方法调用，并不关心Person类型变量的具体子类型：
// p.run();
// t.run();
// 同样的代码，如果引用的是一个新的子类，我们仍然不关心具体类型：
// Person h = new Heppy();
// h.run();

// 这种尽量引用高层类型，避免引用实际子类型的方式，称之为面向抽象编程

// 面向抽象编程的本质就是:
// 上层代码只定义规范(例如：adstract class Person)
// 不需要子类就可以实现业务逻辑(正常编译)
// 具体的业务逻辑由不同的子类实现，调用者并不关心


// 用抽象类给一个有工资收入和稿费的小伙伴算税

// 定义抽象类Income
abstract class Income{
    // double income;
    // // protected double gao;
    // Income(double income){this.income=income;}
    public abstract double getTax(); 
}

class Salary extends Income{
    double salary;

    public Salary(double salary) {this.salary=salary;}
    
    @Override
    public double getTax(){
        if(this.salary>5000){
            return (this.salary-5000)*0.1;
        }else{
            return 0;
        }
    }
}

class Payment extends Income{
    double payment;

    public Payment(double payment){this.payment=payment;}

    @Override
    public double getTax(){
        if(this.payment>1000){
            return (payment=1000)*0.2;
        }else{
            return 0;
        }
    }
}

public class MyAbstract{
    public static void main(String[] args) {
        Income[] incomes = new Income[] {new Salary(6000),new Payment(1300)};
        System.out.println(totalTax(incomes));
    }
    public static int totalTax(Income[] incomes){
        int totalTax=0;
        for(Income income:incomes){
            totalTax += income.getTax();
        }
        return totalTax;
    }
}

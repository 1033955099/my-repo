// 在继承关系中，子类如果定义了一个与父类方法签名完全相同的方法，被成为覆写(Override)。
// 例如在person类中，我们定义一个run方法
// class Person{
//     public void run(){
//         System.out.println("person.run");
//     }
// }
// // 在子类中覆写这个run方法
// class Student extends Person{
//     public void run(){
//         System.out.println("student.run");
//     }
// }
// Override和Overload不同的是，如果方法签名不同，就是Overload，Overload方法是一个新方法；如果方法签名相同，并且返回值也相同，就是Override。
// 方法名相同，方法参数相同，但是方法返回值不同，也是不同的方法。在java中出现这种情况，编译器会报错。
// class Person{
//     public void run(){

//     }
// }
// class Student extends Person{
//     // 不是Override，因为参数不同：
//     public void run(String s){

//     }
//     // 不是Override,因为返回值不同：
//     public int run(){}
// }
// 加上@Override可以让编译器帮助检查是否进行了正确的覆写。希望进行覆写，但是不小心写错了方法签名，编译器会报错。
// public class Polymorphic {
//     public static void main(String []args){

//     }    
// }
// class Person{
//     public void run(){}
// }
// class Student extends Person{
//     @Override
//     public void run(String s){}
// }
// 但是@Override不是必需的。

// 引用变量的声明类型 可能与其实际类型不符，：例如：
// Person p = new Student();
// 如果子类覆写了父亲的方法：
// class Person{
//     public void run(){
//         System.out.println("Person.run");
//     }
// }
// class Student extends Person{
//     @Override
//     public void run(){
//         System.out.println("Student.run");
//     }
// }
//  public class Polymorphic{
//     public static void main(String[] args) {
//          Person p = new Student();
//         p.run(); // 调用的方法是Student.run
//     }
// }
// 上述代码调用的是Student方法的run()方法。
// java的实例方法调用是基于运行时的实际类型的动态调用，而非变量的声明类型。
// 这个非常重要的特性在面向对象编程中成为多态。


// 多态
// 多态是指，针对某个类型的方法调用，其真正执行的方法取决于运行时期实际类型的方法。例如：
// Person p = new student();
// p.run(); // 无法确定运行时究竟调用的是哪个run.()方法
// 多态的特性是，运行期才能动态决定调用的子类方法。对某个类型调用某个方法，执行的实际方法可能是某个子类的覆写方法。

// 假如我们定义一种收入，需要给它报税，那么先定义一个Income类：
// class Income{
//     protected double income;
//     public double getTax(){
//         return income*0.1;//税率10％
//     }
// }
// // 对于工资收入，可以减去一个基数，那么我们可以从Income派生出SalaryIncome，并覆写getTax():
// class Salary extends Income{
//     @Override
//     public double getTax(){
//         if(income<=5000){
//             return 0;
//         }
//         return (income - 5000)*0.2;
//     }
// }
// // 如果享受国务院特殊津贴，那么按照规定，可以全部免税：
// class SrateCouncilSpecialAllowance extends Income{
//     @Override
//     public double getTax(){
//         return 0;
//     }
// }
// // 编写一个报税的财务软件，对于一个人的所有收入进行报税：
// public double totalTax(Income...incomes){
//     double total = 0;
//     for(Income income:incomes){
//         total = total + income.getTax();
//     }
//     return total;
// }

// public class Polymorphic{
//     public static void main(String[] args) {
//         // 给一个有普通收入，工资收入，和享国务院特殊津贴的小伙伴算税：
//         Income[] incomes = new Income[]{
//             new Income(3000);
//             new Salary(7500);
//             new StateCouncilSpecialAllowance(15000);
//         };
//         System.out.println(totalTax(incomes));
//     }

//     public static double totalTax(Income income incomes){
//         double total = 0;
//         for(Income income:incomes){
//             total = total + income.getTax();
//         }
//         return total;
//     }
// }

public class Polymorphic {
    public static void main(String[] args) {
        // 给一个有普通收入、工资收入和享受国务院特殊津贴的小伙伴算税:
        // 创建不同收入对象的数组
        Income[] incomes = new Income[] {
            new Income(3000), // 普通收入
            new Salary(7500), // 工资收入
            new StateCouncilSpecialAllowance(15000) // 国务院特殊津贴收入
        };
        System.out.println(totalTax(incomes)); // 打印总稿费
        // totalTax(incomes)是一个方法，用来计算所有收入的总稿费，并输出到控制台。
    }

    // totalTax方法接受一个可变参数Income...income,这意味着它可以接收多个Income类型的对象。
    public static double totalTax(Income... incomes) {
        double total = 0;
        // 在方法中，遍历每个收入对象（for (Income income : incomes)），并调用每个对象的 getTax() 方法来计算税费。
        for (Income income: incomes) {
            total = total + income.getTax(); // 逐个累加每个收入的税费
        }
        // 每个收入的稿费会加到total变量上，最后返回计算出总搞费
        return total;
    }
}

// Income是一个父类，它表示一种通用的收入类型。
class Income{
    protected double income; //income字段存储收入金额

    public Income(double income){ // 这是构造法，用来初始化收入金额
        this.income = income;
    }

    public double getTax(){ // 这是一个方法，计算并且税费
        return income * 0.1; //税率10％
    }
}
// Salary是继承自Income的子类，专门处理工资收入。
class Salary extends Income{
    public Salary(double income){ // 调用父类的构造方法来初始化收入金额
        super(income);
    }

    @Override
    public double getTax(){ // 重写父类的getTax()方法，定义工资收入的税费计算规则
        if(income <= 5000){
            return 0; // 如果工资不超过5000就返回0
        }
        return (income - 5000) * 0.2; // 如果工资超过5000，就按20％的税率征税
    }
}
// 国务院津贴收入
// StateCouncilSpecialAllowance 也是继承自 Income 的子类，用来处理国务院特殊津贴收入。
class StateCouncilSpecialAllowance extends Income{
    public StateCouncilSpecialAllowance(double income){
        super(income);
    }

    @Override
    public double getTax(){ // 重写了父类的方法，规定国务院津贴是 免税 的，所以直接返回 0。
        return 0;
    }
}  
/* 
第一个收入是普通收入，3000元，税率是 10%，所以税费是 3000 * 0.1 = 300 元。
第二个收入是工资收入，7500元。根据 Salary 类的规则，5000元以内免税，超过部分 (7500 - 5000) 
按 20% 征税，所以税费是 (7500 - 5000) * 0.2 = 500 元。
第三个收入是国务院特殊津贴，15000元。根据 StateCouncilSpecialAllowance 类的规则，所有国务院津贴都是免税的，所以税费是 0 元。
*/
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

// public class Polymorphic {
//     public static void main(String[] args) {
//         // 给一个有普通收入、工资收入和享受国务院特殊津贴的小伙伴算税:
//         // 创建不同收入对象的数组
//         Income[] incomes = new Income[] {
//             new Income(3000), // 普通收入
//             new Salary(7500), // 工资收入
//             new StateCouncilSpecialAllowance(15000) // 国务院特殊津贴收入
//         };
//         System.out.println(totalTax(incomes)); // 打印总稿费
//         // totalTax(incomes)是一个方法，用来计算所有收入的总稿费，并输出到控制台。
//     }

//     // totalTax方法接受一个可变参数Income...income,这意味着它可以接收多个Income类型的对象。
//     public static double totalTax(Income... incomes) {
//         double total = 0;
//         // 在方法中，遍历每个收入对象（for (Income income : incomes)），并调用每个对象的 getTax() 方法来计算税费。
//         for (Income income: incomes) {
//             total = total + income.getTax(); // 逐个累加每个收入的税费
//         }
//         // 每个收入的稿费会加到total变量上，最后返回计算出总搞费
//         return total;
//     }
// }

// // Income是一个父类，它表示一种通用的收入类型。
// class Income{
//     protected double income; //income字段存储收入金额

//     public Income(double income){ // 这是构造法，用来初始化收入金额
//         this.income = income;
//     }

//     public double getTax(){ // 这是一个方法，计算并且税费
//         return income * 0.1; //税率10％
//     }
// }
// // Salary是继承自Income的子类，专门处理工资收入。
// class Salary extends Income{
//     public Salary(double income){ // 调用父类的构造方法来初始化收入金额
//         super(income);
//     }

//     @Override
//     public double getTax(){ // 重写父类的getTax()方法，定义工资收入的税费计算规则
//         if(income <= 5000){
//             return 0; // 如果工资不超过5000就返回0
//         }
//         return (income - 5000) * 0.2; // 如果工资超过5000，就按20％的税率征税
//     }
// }
// // 国务院津贴收入
// // StateCouncilSpecialAllowance 也是继承自 Income 的子类，用来处理国务院特殊津贴收入。
// class StateCouncilSpecialAllowance extends Income{
//     public StateCouncilSpecialAllowance(double income){
//         super(income);
//     }

//     @Override
//     public double getTax(){ // 重写了父类的方法，规定国务院津贴是 免税 的，所以直接返回 0。
//         return 0;
//     }
// }  
/* 
第一个收入是普通收入，3000元，税率是 10%，所以税费是 3000 * 0.1 = 300 元。
第二个收入是工资收入，7500元。根据 Salary 类的规则，5000元以内免税，超过部分 (7500 - 5000) 
按 20% 征税，所以税费是 (7500 - 5000) * 0.2 = 500 元。
第三个收入是国务院特殊津贴，15000元。根据 StateCouncilSpecialAllowance 类的规则，所有国务院津贴都是免税的，所以税费是 0 元。
*/

// 多态具有非常强大的功能，就是允许添加更多类型的子类实现功能拓展，却不需要修改基于父类的代码。


// 覆写Objact
// 所有的class都继承于Objack,而Objack定义了几个重要方法：
// toString():把instance输出为String;
// equals():判断两个instance是否逻辑相等；
// hashCode():计算一个instance的哈西值。

// 在必要情况下，我们可以覆写objact的这几个方法：
// class Person{
//     protected String name;
//     // 显示更有意义的字符串：
//     @Override
//     public String toString(){
//         return "Person:name"+name;
//     }


//     // 比较是否相等：
//     @Override
//     public boolean equals(Object o){
//         // 当且仅当O为Person类型：
//         if(o instanceof Person) {
//             Person p = (Person) o;
//             // 并且name字段相同时，返回trun：
//             return this.name.equals(p.name);
//         }
//         return false;
//     }
//     // 计算hash：
//     @Override
//     public int hashCode(){
//         return this.name.hashCode();
//     }
// }


// 调用super
// 在子类的覆写方法中，如果要调用父类的被覆写的方法，可以通过super来调用。
// class Person{
//     protected String name;
//     public String hello(){
//         return "hello"+name;
//     }
// }
// class Student extends Person {
//     @Override
//     public String hello(){
//         // 调用父类的hello方法
//         return super.hello()+"!";
//     }
// }


// final
// 继承可以允许子类覆写父类的方法。如果一个父类不允许子类对它的某个方法进行覆写，可以把该方法标记为final。
// 用final修饰的方法不能被Override
// class Person {
//     protected String name;
//     public final String hello(){
//         return "Hello,"+name;
//     }
// }

// class Student extends  Person {
//     @Override
//     public String hello(){
        
//     }
// }
// 如果一个类不希望任何其他类继承自它，那么可以把这个类本身标记为final。用final修饰的类不能被继承:
// final class Person {
//     protected String name;
// }

// 用final修饰了父类，所以子类不能继承:
// class Student extends Person {
// }

// 对于一个类的实例字段，同样可以y用final修饰。用final修饰的字段在初始化后不能修改。
// class Person {
//     public final String name = "Unamed";
// }

// 对final字段重新赋值会报错：
// Person p = new Person();
// p.name = "New Name";

// 可以在构造方法中初始化final字段:
// class Person {
//     public String name;
//     public Person(String name) {
//         this.name = name;
//     }
// }
// 这种方法更为常用，因为可以保证实例一旦创建，其final字段就不可修改。

// 子类可以覆写父类的方法，覆写在子类中改变了父类方法的行为;
// java的方法调用总是作用于运行期对象的实际类型，这种行为称为多态;

// final 修饰符有多种作用:
// final 修饰的方法可以阻止被覆写;
// final 修饰的class可以阻止被继承;
// final 修饰的field必须在创建对象时初始化，随后不可修改;

// 给一个有工资收入和稿费收入的伙伴算税
// 工资按照10％来收税，如果超过5000按照20％来收税

// 先定义一个通用收入的类

class Income {
    private double income;
    public Income(double income) {
        this.income = income;
    }
    public double getIncome() {
        return income;
    }
    public double getTax() {
        return this.income * 0.1;
    }
}

class Salary extends Income {
    public Salary(double income) {
        super(income);
    }
    public double getTax() {
        if(super.getIncome()<5000) {
            return 0;
        }
        return (super.getIncome() - 5000) * 0.2;
    }
}

class Royalties extends Income {
    public Royalties(double income) {
        super(income);
    }
    public double getTax() {
        return 0;
    }
}

public class Polymorphic {
    public static void main(String[] args) {
        Income[] incomes = new Income[]{new Salary(6000), new Royalties(500)};
        System.out.println(totalTax(incomes));
    }

    public static double totalTax(Income... incomes) {
        double total = 0;
        for(Income income : incomes) {
            total += income.getTax();
        }
        return total;
    }
}
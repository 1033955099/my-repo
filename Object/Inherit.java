
// import javax.crypto.Cipher;

// public class Inherit {
//     public static void main(String []args){

//     }
// }

// class Student {
//     private String name;
//     private int age;
//     private int score;

//     public String getName() {
//         return this.name;
//     }
//     public void setName(String name) {
//         this.name=name;
//     }
//     public int getAge() {
//         return this.age;
//     }
//     public void setAge(int age) {
//         this.age=age;
//     }
//     public int getScore() { 
//         return this.score;
//      }
//     public void setScore(int score) {
//         this.score=score;
//     }
// }

// 继承是面向对象中非常强大的一种机制，它首先可以复用代码。当我们让student从Person继承时，Student就获得了Person的所有功能，
// 我们只需要为Student编写新增功能

// class Person {
//     private String name;
//     private int age;

//     public String getName() {
//         return this.name;
//     }
//     public void setName(String name) {
//         this.name=name;
//     }
//     public int getAge() {
//         return this.age;
//     }
//     public void setAge(int age) {
//         this.age=age;
//     }
// }
// // java使用extends关键词来实现继承

// class Student extends Person{
//     // 不要重复name和age的字段和方法
//     // 只需要定义新增的score字段和方法
//     //注意： 子类自动获得了父类的所有字段，严禁定义与父类重名的字段。
//     private int score;
//     // Student 类继承了 Person 类，所以它不需要重复 name 和 age 字段及相关方法。
//     // 只需要在 Student 类中新增 score 字段和对应的 getter/setter 方法即可。
//     public int getScore(){
//         return this.score;
//     }

//     public void setScore(int score){
//         this.score=score;
//     }
    /* 
     * 在 Student 类的实例中通过继承得到 getName()、setName()、getAge()、setAge() 方法，
     * 并且可以使用 getScore() 和 setScore() 来操作学生的成绩。
     */
// }
// 通过继承Student只需要编写额外的功能，不再需要重复代码。

// 在面向对象中(OOP)术语中，我们把person成为超类(super class),父类(parent class),基类(base class),把student成为子类(subclass),扩展类(extendedclass)。


// 继承树

// 注意我们在定义person的时候，没有写extends。在java中没有明确写extends的类，编译器会自动加上extends Object(扩展对象)。
// 所以，任何类，除了Object,都会继承自某个类。
// person，student的继承数：
// Object  
//   |
// Person
//   |
// Student

// java只允许一个class继承一个类，因此，一个类有且仅有一个父类。只有Object特殊它没有父类。


// protected(受保护)

// 继承有个特点，就是子类无法访问父亲private字段或者private方法。例如，Student类就无法访问person类的name和age字段:
// class Person{
//     private String namae;
//     private int age;
// }

// class Student extends Person{
//     public String hello(){
//         return "Hello"+name; // 编译错误：无法访问naem字段
//     }
    
// }

// 这使得继承的作用被削弱了。为了让子类访问父类的字段，我们需要把private改为protected。用protected修饰的字段可以被子类访问：

// class Person{
//     protected String name;
//     protected int age;
// }
// // class student extends Person{
// //     public String hello(){
// //         return "Hello"+name; // 成功访问
// //     }
// // }
// // 因此protected 关键字可以把字段和方法的访问权限控制在继承树内部，一个protected字段和方法可以被其子类，以及子类的子类所访问。


// // super

// // super关键字表示父类(超类)。子类引用父类的字段时，可以用super.fieldName。
// class student extends Person{
//     public String hello(){
//         return "Hello,"+ super.name;
//     }
// }
// 这里使用super，this，或name,效果都是一样的。编译器会自动定位到父类的name字段

// 在java中，任何class的构造方法，第一行语句必须是调用父类的构造方法。如果没有明确地调用父类的构造方法，编译器会帮我们自动加一句
// super();,所以,Student类的构造方法实际上是这样：
// class Person{
//     protected String name;
//     protected int age;

//     public Person(String name,int age){
//         this.name=name;
//         this.age=age;
//     }
// }

// class Student extends Person{
//         protected int score;
//         public Student(String name,int age,int score){
//             super(name,age); // 调用父类的构造方法
//             this.score=score;
//         }
// }
// 如果父类没有明确的构造方法，子类就必须显示调用super()并给出参数以便让编译器定位到父类的一个合适的构造方法。
// 子类不会继承父类的构造方法。子类默认的构造方法是编译器自动生成的，不是继承的。


// 阻止继承
// 正常情况下只要某个class没有final修饰符，那么任何类都可以从该类继承。
// 从java15开始，允许使用sealed修饰class，并通过permits明确写出能够从该class继承的子类名称。
// 定义一个shape类
// Shape类就是一个sealed类，它只允许指定的3个类继承它。
// public sealed class shape permits Rect,Circle,Triangle{
// }
// 上述shape类就是一个sealed类，它只允许指定的三个类继承它。
// public final class Rect extends Shape{
// }
// 这样写没问题因为Rect出现在了permits的列表中。如果定义没在permits列表中的类就会报错。
// 这种sealed类主要用于一些框架，防止继承被滥用。
// sealed类在Java 15中目前是预览状态，要启用它，必须使用参数--enable-preview和--source 15。 


// 向上转行
// 如果一个引用变量类型是student，那么它可以指向一个student类型的实例
// Student s = new Student();
// 如果一个引用类型的变量是Person，那么它可以指向一个Person类型的实例：
// Person p = new Person();
// 如果Student是从Person继承下来的，一个引用类型为Person的变量，会指向Student类型的实例
// Person p = new Student();
// 因为Student继承自Person，因此，它拥有Person的全部功能。Person类型的变量，如果指向Student类型的实例，对它进行操作，是没有问题的！
// 这种把一个子类类型安全地变为父类类型的赋值，被称为向上转型（upcasting）。
// 向上转型实际上是把一个子类型安全地变为更加抽象的父类型：
// Student s = new Student();
// Person p = s; // upcasting, ok
// Object o1 = p; // upcasting, ok
// Object o2 = s; // upcasting, ok
// 注意到继承树是Student > Person > Object，所以，可以把Student类型转型为Person，或者更高层次的Object。

// 向下转行
// 和向上转行相反，如果把一个父类类型强制转型为子类类型，那就是向下转行。
// Person p1 = new Student(); // upcasting, ok
// Person p2 = new Person();
// Student s1 = (Student) p1; // ok
// Student s2 = (Student) p2; // runtime error! ClassCastException!
/* 
 * 
 * Person类型p1实际指向Student实例，Person类型变量p2实际指向Person实例。
 * 在向下转型的时候，把p1转型为Student会成功，因为p1确实指向Student实例，
 * 把p2转型为Student会失败，因为p2的实际类型是Person，不能把父类变为子类，
 * 因为子类功能比父类多，多的功能无法凭空变出来。
 * 
 * 向下转型很可能会失败。失败的时候，Java虚拟机会报ClassCastException。
 * 
 */

// 为了避免向下转型出错，Java提供了instanceof操作符，可以先判断一个实例究竟是不是某种类型：
// Person p = new Person();
// System.out.println(p instanceof Person); // true
// System.out.println(p instanceof Student); // false

// Student s = new Student();
// System.out.println(s instanceof Person); // true
// System.out.println(s instanceof Student); // true

// Student n = null;
// System.out.println(n instanceof Student); // false
// instanceof实际上判断一个变量所指向的实例是否是指定类型，或者这个类型的子类。如果一个引用变量为null，那么对任何instanceof的判断都为false。
// 利用instanceof，在向下转型前可以先判断：
// Person p = new Student();
// if (p instanceof Student) {
//     // 只有判断成功才会向下转型:
//     Student s = (Student) p; // 一定会成功
// }
// 从Java 14开始，判断instanceof后，可以直接转型为指定变量，避免再次强制转型。
// instanceof variable:
// public class Inherit {
//     public static void main(String[] args) {
//         Object obj = "hello";
//         if (obj instanceof String s) {
//             // 可以直接使用变量s:
//             System.out.println(s.toUpperCase());
//         }
//     }
// }
// 区分继承和组合
// 在使用继承时，我们要注意逻辑一致性。
// 假如Person是父类，Student就是子类型，Student就只能继承Person
// 具有组合关系（has）不应该使用继承，而是使用组合： 即是student持有Book类的一个实例
// class Student extends Person{
//     protected Book book;
//     protected int score;
// }
// 继承是is关系，组合是has关系


// 定义PrimaryStudent，从Student继承，并新增一个grade字段：
public class Inherit {
    public static void main(String[] args) {
        Person p = new Person("小明", 12);
        Student s = new Student("小红", 20, 99);
        // TODO: 定义PrimaryStudent，从Student继承，新增grade字段:
        Student ps = new PrimaryStudent("小军", 9, 100, 5);
        System.out.println(ps.getName()+ps.getScore()+","+ps.getAge());
    }
}

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}

class Student extends Person {
    protected int score;

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public int getScore() { return score; }
}

class PrimaryStudent extends Student{
    protected int grade;
    
    public PrimaryStudent(String name,int age,int score,int grade){
        super(name, age, score);
        this.grade=grade;
    }

    public int getGrade(){ return grade; }
}
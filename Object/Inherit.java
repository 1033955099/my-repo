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
class Person{
    protected String name;
    protected int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
}

class Student extends Person{
        protected int score;
        public Student(String name,int age,int score){
            super(name,age); // 调用父类的构造方法
            this.score=score;
        }
}
// 如果父类没有明确的构造方法，子类就必须显示调用super()并给出参数以便让编译器定位到父类的一个合适的构造方法。
// 子类不会继承父类的构造方法。子类默认的构造方法是编译器自动生成的，不是继承的。


// 阻止继承
// 正常情况下只要某个class没有final修饰符，那么任何类都可以从该类继承。
// 从java15开始，允许使用sealed修饰class，并通过permits明确写出能够从该class继承的子类名称。

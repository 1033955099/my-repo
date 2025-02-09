// public class Construction {
//     public static void main(String []args){
//         // 构造方法
//         // 创建实例的时候，实际上是通过构造方法来初始实例的。我们先来定义一个构造方法，能在创建Person实例的时候，一次性传入name和age，玩成初始化
//         // 在创建实例时就把内部字段全部初始化为合适的值
//         Person p = new Person("xiaoming",16);
//         System.out.println(p.getName());
//         System.out.println(p.getAge());
//     }
// }
// class Person{
//     private String name;
//     private int age;

//     public Person(String name,int age){
//         this.name=name;
//         this.age=age;
//     }

//     public String getName(){
//         return  this.name;
//     }

//     public int getAge(){
//         return this.age;
//     }

// }
// 由于构造方法特殊，所以构造方法名称就是类名。构造方法的参数没有限制，在方法内部 也可以编写任意语句。和普通方法相比，构造方法没有
// 返回值（也没有void），调用构造方法，必须用new操作符。


// 默认构造方法
// 任何class都有构造方法
// 如果一个类没有定义构造方法，编译器会自动为我们生成一个默认构造方法，它没参数，也没有执行语句。
// 例如：
// class Person{
//     public Person(){
//     }
// }
// 要注意，如果我们自定义了一个构造方法，那么，编译器就不再自动创建默认构造方法：
// public class Construction{
//     public static void main(String []agrs){
//         Person p = new Person(); // 编译错误找不到这个构造方法
//     }
// }

// class Person{
//     private String name;
//     private int age;

//     public Person(String name,int age){
//         this.name=name;
//         this.age=age;
//     }
//     public String getName(){
//         return  this.name;
//     }
//     public int getAge(){
//         return  this.age;
//     }
// }

// 如果既要能使用参数的构造方法，又想保留不带参的构造方法，那么只能把两个构造方法都定义出来
// public class Construction{
//     public static void main(String []agrs){
//         Person p1 = new Person("xiaomign",16);
//         Person p2 = new Person();
//     }
// }

// class Person{
//     private String name;
//     private int age;

//     public Person(){

//     }

//     public Person(String name,int age){
//         this.name=name;
//         this.age=age;
//     }
//     public String getName(){
//         return  this.name;
//     }
//     public int getAge(){
//         return  this.age;
//     }
// }

// 没有在构造方法中初始化字段时，引用类型的字段默认是null，数值类型的字段用默认值，int类型默认值是0，布尔类型默认值是false

// class Person{
//     // private String name; // 默认初始化为null
//     // private int age; // 默认初始化为0

//     // 也可以对字段进行直接初始化:
//     private String name = "un";
//     private int age = 16;

//     public Person(){

//     }
     
// }


// 多个构造方法
// 可以定义多个构造方法，在通过new操作符调用的时候，编译器通过构造方法的参数数量，位置和类型自动区分。
// class Person{
//     private String name;
//     private int age;

//     public Person(String name,int age){
//         this.name=name;
//         this.age=age;
//     }

//     public Person(String name){
//         this.name=name;
//         this.age=12;
//     }

//     public Person(){

//     }
// }

// public class Construction{
//     public static void main(String []args){
//         Person p1 = new Person("xiaoming",15); // 自动匹配String name，int age
//         Person p2 = new Person("zhang"); // 自动匹配String name
//         Person p3 = new Person(); // 自动匹配Person
//     }
// }

// 一个构造方法可以调用其它构造方法，这样做的目的便于代码复用。调用其它构造方法的语法是this(...)
// class Person {
//     private String name;
//     private int age;

//     public Person(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     public Person(String name) {
//         this(name, 18); // 调用另一个构造方法Person(String, int)
//         // 这个构造方法只接收一个参数 name，然后通过 this(name, 18) 调用第一个构造方法，设置 name 属性，并默认 age 为 18。
//     }

//     public Person() {
//         this("Unnamed"); // 调用另一个构造方法Person(String)
//     }
//     // 这是无参构造方法。当没有提供任何参数时，会调用第二个构造方法，默认设置 name 为 "Unnamed"，
//     // 并默认 age 为 18（因为第二个构造方法会默认 age 为 18）。
// }


// 请给Person类增加(String, int)的构造方法：
// public class Construction {
//     public static void main(String[] args) {
//         // TODO: 给Person增加构造方法:
//         Person ming = new Person("小明", 12);
//         System.out.println(ming.getName());
//         System.out.println(ming.getAge());
//     }
// }

// class Person {
//     private String name;
//     private int age;

//     public Person(String name,int age){
//         this.name=name;
//         this.age=age;
//     }

//     public String getName() {
//         return name;
//     }

//     public int getAge() {
//         return age;
//     }
// }
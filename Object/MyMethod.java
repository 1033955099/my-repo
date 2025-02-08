// // 先定义person类，MyMethod类需要使用它，所以首先要写它
// class Person {
//     private String name;
//     private int age;
    
//     public String getName(){
//         return this.name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public int getAge() {
//         return this.age;
//     }

//     public void setAge(int age) {
//         if (age < 0 || age > 100) {
//             throw new IllegalArgumentException("invalid age value");
//         }
//         this.age = age;
//     }
// }
// // 在MyMethod类的main方法中创建并且使用main对象
// public class MyMethod{
//     public static void main(String []args){
//         // 一个class可以包含多个field，例如，我们给person定义了两个field
//         Person ming = new Person();
//         ming.setName("Xiao Ming"); // 对字段name赋值
//         ming.setAge(12);  // 对字段age赋值
//         System.out.println(ming.getName()+","+ming.getAge());
//     }
// }
// class person{

//     private String name;
//     private int age;
//     public String getName(){
//         return this.name;
//     }
//     public void setName(String name){
//         if(name==null||name.isBlank()){
//             throw new IllegalArgumentException("inbalid age value");
//         }
//         this.name=name.strip(); // 去掉收尾空格
//     }
//     public int getAge(){
//         return this.age;
//     }
//     public void setAge(int age){
//         if(age<0||age>100){
//             throw new IllegalArgumentException("inbalid age value");
//         }
//         this.age=age;
//     }

// }
// // 外部代码不能直接读取private字段，但可以通过getName()和getAge()间接获取private字段的值。
// // 外部代码可以调用方法setName（）和setAge()来间接修改private字段
// // setAge（）会检查传入的参数，参数超出了范围会直接报错。这样外部代码就没有任何机会把age设置成不合理的值
// public class MyMethod{
//     public static void main(String []args){
//         person ming = new person();
//         ming.setName("xiaoming"); // 调用方法的语句是 实例方法.方法名（参数）;一个方法调用就是一个语句，所以 要在好后面加;
//         ming.setAge(15); // 例如 ming.setName("xiaoming");
//         System.out.println(ming.getName()+","+ming.getAge());
//     }
// }


// 定义方法
/* 
 * 定义方法的语法是
 * 修饰符 方法返回类型 方法名（方法参数列表）{
 *      若干方法语句;
 *      return 方法返回值;
 * }
 * 方法返回值通过return语句实现，如果没有返回值，返回类型设置为void，可以省略return。
 * 
 */


//  private方法 （私人的）

// 有public方法就有private方法，和private字段一样，private方法不允许外部调用，
// 定义private方法的理由是内部方法可以调用private方法。

// public class MyMethod{
//     public static void main(String []args){
//         Person ming = new Person();
//         ming.setBirth(2008);
//         System.out.println(ming.getAge());
//     }
// }

// class Person{
//     private String name;
//     private int birth;

//     public void setBirth(int birth){
//         this.birth=birth;
//     }
//     public int getAge(){
//         return calcAge(2019); // 调用private方法
//     }
    
//     private int calcAge(int currentYear){
//         return currentYear - this.birth;
//     }
// }
// calcAge是一个private方法，外部代码无法调用，但是内部方法getAge（）可以调用它。
/* 
 * person类只定义了birth字段，没有定义age字段，获取age时，通过方法getAge（）返回的是一个实时计算的值，并非
 * 储存在某个字段的值。这说明方法可以封装一个类的对外接口，调用方不需要知道也不关心person实例在内部到底有没有age字段。
 */


//  this变量
// 在方法内部可以使用一个隐含的变量this，它始终指向当前实例。因此通过this。field就可以访问当前实例的字段。
// // 如果没有命名冲突可以省略this。
// class Person{
//     private String name;
//     public String getname(){
//         return name; // 相当于this.name
//     }
// }
// 如果有局部变量和字段重名，那么局部变量优先级更高，就必须加上this：
// class Person{
//     public void getName(String name){
//         this.name=name; // 前面的this不可少，少了就成局部变量name了
//     }
// }


// 方法参数
// 方法可以包含0个或任意个参数。方法参数用于接收传递方法的变量值。调用方法时，必须严格按照参数的定义--传递。

// class Person{
//     private String name;
//     private int age;

//     public void setNameAndAge(String name,int age){
//         this.name = name;
//         if (age < 0 || age > 100) {
//             throw new IllegalArgumentException("invalid age value");
//         }
//         this.age = age;
//     }
// }

// public class MyMethod{
//     public static void main(String []args){
//         Person ming = new Person();
//         ming.setNameAndAge("xioaming",16);
//         // 调用这个setNameAndAeg()方法时，必须有两个参数，且第一个参数必须为String，第二个为int
//     }
// }


// 可变参数
// 可变参数用类型...定义,可变参数相当于数组类型
// class Group{
//     private String[] names;
//     public void setNames(String...names){ 
//         this.names=names;
//     }
// }
// // 上面的setNames定义了一个可变参数。调用时可以这么写
// public class MyMethod{
//     public static void main(String []args){
//         Group g = new Group();
//     g.setNames("dajfl","asjdf","fjkalsjdf"); // 传入三个String
//     g.setNames("dafl","sdf"); // 传入二个String
//     }
// }

// class Group{
//     private String[] names;
//     public void setNames(String[] names){ // 完全可以把可变参数变为String[]类型 
//         this.names=names;
//     }
// }

// public class MyMethod{
//     public static void main(String []args){
//         Group g = new Group();
//         // 调用方需要自己构建String[],比较麻烦
//         g.setNames(new String[]{"djlsa","hjkasd"}); // 传入一个String
//         // 调用方也可以传入null
//         g.setNames(null);
//         // 可变参数可以无法保证传入null，因为传入0个参数时，接收到的实际值是一个空数组而不是null。
//     }
// }

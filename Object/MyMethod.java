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
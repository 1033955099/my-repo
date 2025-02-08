
// import java.util.Scanner;

// public class Tetx {
//      public static void main(String []args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("请输入有");
//         String str = sc.nextLine();
//      }
// }
// class Person{
//    private String name;
//    private int age;

//    public String getName(){
//       return name;
//    }
//    public void  setName(String name){
//       this.name=name;
//    }
//    public int getAge(){
//       return age;
//    }
//    public void setAge(int age){
//       this.age=age;
//    }
//    public void sys(){
//       System.out.println("姓名："+getName()+"年龄："+getAge());
//    }
// }
// public class Tetx{
//    public static void main(String[] args) {
//        Person ming = new Person();
//        ming.setName("wangxiaotao");
//        ming.setAge(16);
//        ming.sys();
//    }
// }
// class Person{
//    private String name;
//    private int age;

//    public void setNameAndAge(String name,int age){
//        this.name = name;
//        if (age < 0 || age > 100) {
//            throw new IllegalArgumentException("invalid age value");
//        }
//        this.age = age;
//    }
// }

// public class Tetx{
//    public static void main(String []args){
//        Person ming = new Person();
//        ming.setNameAndAge("xioaming",16);
//    }
// }
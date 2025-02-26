// 在一个class中定义的字段，我们称之为实例字段。实例字段的特点是每个实例都有独立的字段，各个实例的同名字段互不影响。
// 还有一种字段是static修饰的字段，成为静态字段static field。
// 实例字段都会有一个独立"空间"，但是静态字段只有一个共享"空间"，所有实例都会共享该字段。
// 比如：
// class Person{
//     private String name;
//     private int age;
//     // 定义静态字段number
//     public static int number;
// }

// 对于静态字段无论修改哪个实例的静态字段效果都是一样的:所有实例的静态字段都被修改了，原因是静态字段不属于实例

// (错误示范)

// class Person{
//     public  String name;
//     public  int age;

//     public static int number;

//     public Person(String name,int age){
//         this.name=name;
//         this.age=age;
//     }
// }

// public class MyStatic{
//     public static void main(String []args){
//         Person hong = new Person("xiao hong",16);
//         Person ming = new Person("xiao ming",17);

//         hong.number=88;
//         System.out.println(hong.number);
//         ming.number=99;
//         System.out.println(ming.number);
//     }
// }
// 虽然实例可以访问静态字段，但是它们指向的其实是Person class的静态字段。所以，所有实例共享一个静态字段。

// 用类名来访问静态字段。可以把静态字段理解为描述class本身的字段
// public class MyStatic {
//     public static void main(String[] args) {
//         Person hong = new Person("xiao hong", 16);
//         Person ming = new Person("xiao ming", 17);

//         Person.number = 88;  // 通过类名访问静态变量
//         System.out.println(Person.number);  // 打印静态变量

//         Person.number = 99;  // 通过类名访问静态变量
//         System.out.println(Person.number);  // 打印静态变量
//     }
// }

// class Person{
//     public String name;
//     public int age;

//     public static int number;

//     public Person(String name,int age){
//         this.name=name;
//         this.age=age;
//     }
// }


// 静态方法
// 有静态字段就有静态方法，用static修饰的方法就是静态方法。
// 调用实例方法必须通过一个实例变量，而调用静态方法则不需要实例变量，通过类名就可以调用。静态方法类似于其它编程语言的函数。

public class MyStatic{
    public static void main(String []args){
        Person.number=99;
        System.out.println(Person.number);
    }
}

class Person{
    public static int number;

    public static void setNumber(int value){
        number = value;
    }
}

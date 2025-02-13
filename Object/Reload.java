// public class Reload {
//     public static void main(String []args){
//     }
// }
// 在一个类中我们可以定义多个办法。如果有一系列方法，它们的功能都是类似的，只有参数有所不同，那么，可以把这一组方法名做成同名方法。
// 在hello类中，定义多个hello()方法:
// class Hello{
//     public void hello{
//         System.out.println("Hello,Word!");
//     }
//     public void hello(String name){
//         System.out.println("Hello,"+name+"!");
//     }
//     public void hello("hello!"+name,int age){
//         if(age<18){
//             System.out.println("hi,"+name+"!");
//         }else{
//             System.out.println("Hello,"name+"!");
//         }
//     }
// }
// 这种方法名称相同，但是各自的参数不同，称为方法重载(Overloed).
// 方法重载的返回值通常是相同的。
// 方法重载的目的是，功能类似的方法使用同一名字，更容易记住，因此调用起来更简单。

// String.indexOf()
// indexOf() 用来查找变量里的字符串中的字符位置
// public class Reload {
//     public static void main(String[] args) {
//         String s = "Test string";
//         int n1 = s.indexOf('T');
//         int n2 = s.indexOf("st");
//         int n3 = s.indexOf("st", 4);
//         System.out.println(n1);
//         System.out.println(n2);
//         System.out.println(n3);
//     }
// }


// 给Person增加重载方法setName(String, String)：

public class Reload {
    public static void main(String[] args) {
        Person ming = new Person();
        Person hong = new Person();
        ming.setName("Xiao Ming");
        // TODO: 给Person增加重载方法setName(String, String):
        hong.setName("Xiao", "Hong");
        System.out.println(ming.getName());
        System.out.println(hong.getName());
    }
}

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName(String name,String name1){
        this.name=name+name1;
    }

<<<<<<< HEAD
}
// 方法重载是指多个方法的方法名相同，但各自的参数不同；
// 重载方法应该完成类似的功能，参考String的indexOf()；
// 重载方法返回值类型应该相同。
=======
}
>>>>>>> origin/main

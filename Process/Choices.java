
import java.util.Scanner;

public class Choices {
    public static void main(String []args){
        // 除了if语句，还有一种条件判断，是根据某个标的式的不同结果，分别去执行不同的分支
        // switch 语句根据 switch（表达式）计算的结果，跳转到匹配 case 结果，然后继续执行后续语句，知道遇到break结束执行。
        // int age = 1;   // 修改这个整数变量的字面量数字对应 case 的数字，修改1则返回1的结果；
        // switch(age){
        //     case 1: // case语句并没有花括号{}
        //         System.out.println("one 1");
        //         break; // case语句具有“穿透性”，漏写break将导致意想不到的结
        //     case 2:
        //         System.out.println("two 2");
        //         break;
        //     case 3:
        //         System.out.println("there 3");
        //         break;
        //     default:
        //         System.out.println("没有更多"); // 添加default因为如果option的值没有匹配到任何case，则执行default
        //         break;
        // }
        // 对比if ... else if语句，对于多个==判断的情况，使用switch结构更加清晰。

        // 如果有几个case语句执行的是同一组语句块,可以这么写：
        // int b = 2;
        // switch(b){
        //     case 1:
        //         System.out.println("这是1");
        //         break;
        //     case 2:
        //     case 3:
        //         System.out.println("这是1和2");
        //         break;
        //     default:
        //         System.out.println("什么也没有");
        //         break;
        // }

        // switch语句还可以匹配字符串。字符串匹配时，是比较“内容相等”。
        // String fish = "two";
        // switch (fish) {
        //     case "one":
        //     System.out.println("one");
        //     break;
        //     case "two":
        //     System.out.println("two");
        //     break;
        //     case "there":
        //     System.out.println("there");
        //     break;
        //     default:
        //     System.out.println("not int");
        //     break;
        // }


        // switch表达式
        // 使用switch时，如果遗漏了break，就会造成严重的逻辑错误，而且不易在源代码中发现错误。
        // 使用类似模式匹配（Pattern Matching）的方法，保证只有一种路径会被执行，并且不需要break语句
        // String sum = "two";
        // switch (sum) {
        //     case "one" ->System.out.println("这是one"); // 新语法使用 ->
        //     case "two" ->{ // 遇到多条语句需要使用{}来括起来
        //         System.out.println("这是two");
        //         System.out.println("vary,good");
        // }
        // case "there"->System.out.println("there");
        // default ->System.out.println("无对象");
        // 不需要写break语句，因为新语法只会执行匹配的语句，没有穿透效应。
        // }

        // String sum = "two";
        // int opt = switch (sum) {
        //     case "one"->1;
        //     case "two","2"->2;
        //     default -> 0;
        // }; // 赋值语句需要 ; 来结束
        // System.out.println("opt="+opt);

        // String fruit = "orange";
        // int opt = switch (fruit) {
        //     case "apple" -> 1;
        //     case "pear", "mango" -> 2;
        //     default -> {
        //         int code = fruit.hashCode(); // 哈西码
        //         yield code; // switch语句返回值
        //     }
        // };
        // System.out.println("opt = " + opt);


        // 剪刀石头布
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入");
        int sum = sc.nextInt();
        int comeputer = (int)(Math.random()*3);

        switch (sum) {
            case 1->{
                switch(comeputer){
                    case 1->System.out.println("平局");
                    case 2->System.out.println("赢了");
                    case 3->System.out.println("输了");
                }
            }
            case 2->{
                switch(comeputer){
                    case 1->System.out.println("赢了");
                    case 2->System.out.println("输了");
                    case 3->System.out.println("平局");
                }
            } 
            case 3->{
                switch(comeputer){
                    case 1->System.out.println("输了");
                    case 2->System.out.println("平局");
                    case 3->System.out.println("赢了");
                }
            }
            default->{
                System.out.println("请选择正确");
            }
            
        }



    }

}


import java.util.Scanner;

public class Judge {
    public static void main(String []args){
        // 在Java程序中，如果要根据条件来决定是否执行某一段代码，就需要 if 语句
        /* 
         * if 语句的基本用法
         * 
         * if(条件){
         *      条件满足时执行
         *   }
         * 
         */
        // 根据 if 的计算结果（trun还是false），JVM决定是否执行语句块（即{}内所包含的所有语句）

        // int n = 70; // 输入你的成绩来判断合不合格（60分为及格线）
        // int n = 50; 这个条件判断为 false 时，成绩不合格
        // 当条件n >= 60计算结果为true时，if语句块被执行，将打印"及格了"，否则，if语句块将被跳过。修改n的值可以看到执行效果。
        // if ( n>=60 ){
        //     System.out.print("成绩及格");
        //     System.out.print("\n恭喜你"); // if语句包含的块可以包含多条语句
        // }else{
        //     System.out.print("成绩不合格");
        //     System.out.print("\n请继续努力");
        // }
        // 当if语句块只有一行语句时，可以省略花括号{} （不推荐）
        // if ( n>=60 )
        //     System.out.print("成绩及格");


        // else
        // if 语句还可以编写一个else{...},当条件判断为 false 时，将执行 else 的语句块
        // int a = 50;
        // if(a>=60){
        //     System.out.println("恭喜你及格了");
        // }else{
        //     System.out.println("很遗憾没及格，继续努力"); // if p判断条件为false时，程序执行这个语句块。
        // }

        // 还可以用多个if ... else if ...串联
        // int x = 60;
        // if (x>=80){ // x >= 80 为 trun 时： 执行 优秀
        //     System.out.println("优秀");
        // }else if (x>=60){  // x >= 80 为 false ：验证 X >= 60
        //     System.out.println("恭喜你及格了"); // 如果验证X >= 60正确 执行:恭喜你及格了
        // }else{
        //     System.out.println("没及格"); // 如果验证X >= 60错误 执行:没及格
        // }
        // 在串联使用多个if时，要特别注意判断顺序。
        // 正确的方式是按照判断范围从大到小依次判断或从小到大依次判断

        // 浮点数在计算机中常常无法精确表示，要利用差值小于某个临界值来判断
        // double x = 1 - 9.0 / 10;
        // if (Math.abs(x - 0.1) < 0.00001) {
        //     System.out.println("x is 0.1");
        // } else {
        //     System.out.println("x is NOT 0.1");
        // }


        // 判断引用类型相等
        /* 
         * 在Java中，判断值类型的变量是否相等，可以使用==运算符。但是，
         * 判断引用类型的变量是否相等，==表示“引用是否相等”，或者说，是
         * 否指向同一个对象。例如，下面的两个String类型，它们的内容是相
         * 同的，但是，分别指向不同的对象，用==判断，结果为false：
         * 
         */
        // 要判断引用类型的变量内容是否相等，必须使用equals()方法：
        // String s1 = "hello";
        // String s2 = "HELLO".toLowerCase();
        // System.out.println(s1);
        // System.out.println(s2);
        // if (s1.equals(s2)) {
        //     System.out.println("s1 equals s2");
        // } else {
        //     System.out.println("s1 not equals s2");
        // }
        // String a = "Hello"; // 比如把 a 内容里的首字母大写来区分a,b字符串的内容，则会输出 a not equals b
        // String b = "HELLO".toLowerCase(); // 这个方法是大写转换小写
        // System.out.println(a);
        // System.out.println(b);
        // if(a.equals(b)){
        //     System.out.println("a equals b");
        // }else{
        //     System.out.println("a not equals b");
        // }
        // 执行语句s1.equals(s2)时，如果变量s1为null，会报NullPointerException：
        // 要避免NullPointerException错误，可以利用短路运算符&&


        /* 
          过轻：低于18.5
          正常：18.5 ~ 25
          过重：25 ~ 28
          肥胖：28 ~ 32
          非常肥胖：高于32
        */

         Scanner x = new Scanner(System.in);
         System.out.print("输入你的身高");
         double a = x.nextDouble();
         System.out.print("输入你的体重");
         double b = x.nextDouble();
         double c = b/(a*a);
         System.out.printf("%.1f\n",c);
         if(c<18.5){
            System.out.printf("体重过轻");
         }else if (c>=18.5 && c<=25){
            System.out.printf("正常");
         }else if (c>=25 && c<=28){
            System.out.printf("过重");
         }else if (c>=28 && c<=32){
            System.out.printf("肥胖");
         }else{
            System.out.printf("过于肥胖，注意健康");
         }

    }
}

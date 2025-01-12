public class Index{
    public static void main(String[] args) {

        // 整数运算
        // int a = (200+100)*20;//6000
        // int b = a+(6000/2);
        // System.err.println(a);
        // System.err.println(b);

        // 整数溢出
        // int a = 2147483640;
        // int b = 100;
        // int sum = a + b; // -2147483556 整数计算值超出范围，就会溢出，成为负数。
        // System.err.println(sum);

        
        // 整数溢出
        long a = 2147483640;
        long b = 100;
        long sum = a + b; // -2147483556 整数计算值超出范围，就会溢出，成为负数。
        sum += 33; // 简写运算符
        System.err.println(sum);
        sum--; // 自增自减与运算
        System.err.println(sum);
       
    }
}
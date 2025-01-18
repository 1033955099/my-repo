

public class Enter{
    public static void main(String []args){
        // 我们总是使用System.out.println()来向屏幕输出一些内容。
        // // println是print line的缩写，表示输出并换行。因此，如果输出后不想换行，可以用print()
        // System.out.print("A,");
        // System.out.print("B,");
        // System.out.print("C.");
        // System.out.println();
        // System.out.println("END");
        // // 上面的print输出结果是A,B,C   而println换行并且输出了END


        // 格式化输出
        // java还提供了格式化输出的功能，计算机提供的数据不一定合适人来阅读
        // double a = 12900000;
        // System.out.println(a); // 结果为 1.29E7
        // 如果要把数据显示成我们期望的格式，就需要使用格式化输出的功能
        // 格式化输出使用System.out.printf()，通过使用占位符%?，printf()可以把后面的参数格式化成指定格式
        double d = 3.1415926;
        System.out.printf("%.2f\n", d); // 显示两位小数3.14
        // 使用 %.2f、%.4f 等格式化字符串时，Java 会根据你指定的小数位数进行四舍五入处理
        System.out.printf("%.4f\n", d); // 显示4位小数3.1416
        System.out.printf("%.6f\n", d); // 显示6位小数3.141593
        System.out.printf("%.7f\n", d); // 显示7位小数3.1415926
       



    }
}
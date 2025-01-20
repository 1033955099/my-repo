
import java.util.Scanner;


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
        // double d = 3.1415926;
        // System.out.printf("%.2f\n", d); // 显示两位小数3.14
        // // 使用 %.2f、%.4f 等格式化字符串时，Java 会根据你指定的小数位数进行四舍五入处理
        // System.out.printf("%.4f\n", d); // 显示4位小数3.1416
        // System.out.printf("%.6f\n", d); // 显示6位小数3.141593
        // System.out.printf("%.7f\n", d); // 显示7位小数3.1415926
       
        // java的格式化功能提供了多种占位符，可以把各种数据类型"格式化"成指定的字符串
        /* 
         *  %d	格式化输出整数
            %x	格式化输出十六进制整数
            %f	格式化输出浮点数
            %e	格式化输出科学计数法表示的浮点数
            %s	格式化字符串
         * 
         */
        // 因为%表示占位符，连续两个%%表示一个%本身
        // // 占位符本身还有更详细的格式化参数。下面把一个整数格式化成十六进制，并用零补足8位
        // int n = 12345000;
        // System.out.printf("n=%d,hex=%08x",n,n); // hex=%08x 打印十六进制表示，%08x 确保输出至少 8 位，不足部分用 0 填充，所以输出为
        // // 结果为 n=12345000,hex=00bc5ea8


        //输入
        // Scanner scanner = new Scanner(System.in); // 创建Scanner对象
        // // Scanner 是 Java 提供的一个类，专门用来从控制台读取输入。System.in 表示输入流，这里是从键盘读取数据。
        // System.out.print("Input your name: "); // 打印提示
        // // System.out.print 用来打印提示信息。与 System.out.println 不同，print 不会自动换行，所以提示语后面会继续等待用户输入。
        // String name = scanner.nextLine(); // 读取一行输入并获取字符串
        // // nextLine() 是 Scanner 类的一个方法，用于读取用户输入的一整行字符串，直到用户按下回车键。用户输入的内容会被赋值给 name 变量。
        // System.out.print("Input your age: "); // 打印提示
        // // 这行代码再次提示用户输入年龄
        // int age = scanner.nextInt(); // 读取一行输入并获取整数
        // // nextInt() 用来读取用户输入的整数。这个方法会读取输入的第一个整数，并将其赋值给 age 变量。
        // System.out.printf("Hi, %s, you are %d\n", name, age); // 格式化输出
        // System.out.printf 用来格式化输出信息。%s 用来格式化字符串（这里是 name），%d 用来格式化整数（这里是 age）。\n 表示换行。

        // Scanner why =new Scanner(System.in);
        // System.out.print("输入你的名字：");
        // String name = why.nextLine(); // 读取输入，并且获取字符串
        // System.out.printf("输入你的年龄");
        // int age = why.nextInt(); // 读取输入，并获取整数
        // System.out.printf("你好,%s,你的年龄是 %d\n",name,age);
        
        /* 
         * 首先，我们通过import语句导入java.util.Scanner，import是导入某个类的语句，必须放到Java源代码的开头。
         * 
         * 创建Scanner对象并传入System.in。System.out代表标准输出流，而System.in代表标准输入流。直接使用System.in读取用户输入虽然是可以的，
         * 但需要更复杂的代码，而通过Scanner就可以简化后续的代码。
         * 
         * 有了Scanner对象后，要读取用户输入的字符串，使用scanner.nextLine()，要读取用户输入的整数，
         * 使用scanner.nextInt()。Scanner会自动转换数据类型，因此不必手动转换。
         */


        //  请帮小明同学设计一个程序，输入上次考试成绩（int）和本次考试成绩（int），然后输出成绩提高的百分比，保留两位小数位（例如，21.75%）。


        Scanner man = new Scanner(System.in); // 创建扫描对象 Scanner
        System.out.print("请输入上次成绩"); //创建上次成绩的输入
        double a = man.nextDouble(); // 创建扫描对象的方法，nextDouble是读取用户输入的数值，然后作为返回值
        System.out.print("请输入本次成绩");
        double b = man.nextDouble();

        if(a==b){ // 如果a等于b那么就执行输出"你的成绩没有提升"
            System.out.println("你的成绩没有提升");
        }else if (b<a) { // 如果本次成绩小于上次成绩，那么计算成绩下降的百分比，并输出下降的百分比
            double x =(double)(a-b)/a;
            System.out.printf("你的成绩下降了%.2f%%",x*100 );
        }else{ // 如果本次成绩大于上次成绩，那么计划成绩提升的百分比，并输出提升的百分比
            double y =(double)(b-a)/b;
            System.out.printf("你的成绩提升了%.2f",y*100);
        }
        
    }
}
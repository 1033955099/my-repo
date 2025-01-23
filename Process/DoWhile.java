public class DoWhile{
    public static void main(String []args){
        // While 是先判断循环条件，再执行循环。do while 先执行循环再判断条件，条件满足时继续循环，不满足时退出。
        /* 
         * do{
         *   执行循环语句
         * }while（条件表达式）;
         * 
         * do while 循环会至少循环一次
         */

        //  如果我们把1到100的求和用do while循环改写一下：
        // int sum = 0;
        // int n = 1;
        // do { 
        //     sum = n + sum;
        //     n ++;
        // } while (n<=100);
        // System.out.println(sum);


        int sum = 0;
        int m = 20;
		int n = 100;
		// 使用do while计算M+...+N:
		do {
            sum += m;
            m ++;
		} while (m<=n);
		System.out.println(sum);

    }
}
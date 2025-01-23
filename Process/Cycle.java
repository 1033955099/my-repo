public class Cycle {
    public static void main(String []args){
        // while 循环
        // 循环语句就是让计算机根据条件做循环计算，在条件满足时继续循环，条件不满足时退出循环。
        /* 
         * while(表达式){
         *      循环语句
         * }    //继续执行后续代码
         * 
         */
        // while循环在每次循环开始前，首先判断条件是否成立，如果计算为true，酒吧循环提内的语句执行一遍，
        //  如果计算结果为false，就直接跳到while循环的末尾，继续往下执行。
        
        // 比如使用while循环来累加1到100
        // int sum = 0; // 累加的和初始化为零
        // int n = 1;
        // while(n<=100){  // 循环条件是n <= 100
        //     sum = sum + n; // 把n累加到sum中
        //     n ++; // n 自身加1
        // }
        // System.out.println(sum);


        int sum = 0;
		int m = 20;
		int n = 100;
		while (m <= n) {
            sum += m;
            m ++;
		}
		System.out.println(sum);

    }
}

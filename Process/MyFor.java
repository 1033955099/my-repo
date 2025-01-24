public class MyFor {
    public static void main(String []args){
        // 了while和do while循环，Java使用最广泛的是for循环
        /* 
         * for循环很强大，它使用计数器实现循环。for循环会先初始化计数器，在每次循环前检测循环条件，
         * 在每次循环后更新计数器，计数器变量通常命名为i。
         * 
         */
        // 把 1 到 100 求和，用for循环写一下
        //  int sum = 0; //初始化为总和0
        //  for(int i = 1;i<=100;i++){ // 从1到100循环
        //     sum = sum + i; // 将当前数字累加到sum
        //  }
        //  System.out.println(sum); // 输出总和
        /* 
         * 在for循环执行前会先执行初始化语句int i = 1, 它定义了计数器变量 i 并且赋值为 1，循环前先检查循环条件i<=100,
         * 循环后自动执行 i++，和while循环相比，for循环把更新计数器的代码统一放到了一起。在for循环体内部，不需要去更新变量i
         * 
         * for（初始条件；循环检测条件；循环后更新计数器）{
         *      // 执行语句
         * }
         * 
         * 
         */
        // int[] ns = {10,20,30,40,50}; // 定义一个数组 ns
        // int sum = 0; // 定义一个容器sum，用来储存累加的和
        // for(int i = 0;i < ns.length;i++){ // 用循环遍历数组，i从0到ns.length
        //     System.out.println("i="+i+"ns[i]="+ns[i]); // 输出当前索引 i 和该索引下的元素 ns[i]
        //     sum = sum + ns[i]; //将当前ns[i]累加到sum变量中；
        // }
        // System.out.println("sum="+sum); // 输出最终的总和sum

        // 注意for循环的初始化计数器总是会被执行，并且for循环也可能循环0次。
        // 使用for循环时，千万不要在循环体内修改计数器！在循环体中修改计数器常常导致莫名其妙的逻辑错误。

        // 如果只想循环偶数那么将i+2就可以了
        int[] ns = { 1, 4, 9, 16, 25 };
        for (int i=0; i<ns.length; i=i+2) { // 使用for循环时，计数器变量i要尽量定义在for循环中
        System.out.println(ns[i]);
        }


    }
}

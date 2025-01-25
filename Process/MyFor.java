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
        // int[] ns = { 1, 4, 9, 16, 25 };
        // for (int i=0; i<ns.length; i=i+2) { // 使用for循环时，计数器变量i要尽量定义在for循环中
        // System.out.println(ns[i]);
        // }


        // for each 循环
        // for 循环经常用来遍历数组，因为通过计数器可以根据索引来访问数组的某个元素
        // int[] ns ={12,13,45,26,37};
        // for(int i=0;i<ns.length;i++){
        //     System.out.println(ns[i]);
        // }
        // 如果想要访问的是数组每个元素的值，java还提供了另一种 for each 循环，它可以更简单的遍历数组
        // int[] ns ={9,12,34,54,76};
        // for(int n:ns){
        //     System.out.println(n);
        // }
        // 和for循环相比for each循环的变量n不再是计数器，而是直接对应到数组的每个元素
        // for each 的循环也更简洁，但是 for each 无法指定遍历顺序，也无法获取数组的索引

        // 除了数组外，for each 循环能够遍历所有可迭代的数据类型。


        // 给定一个数组，请用for循环倒序输出每一个元素：
        // int[] ns = {43,21,56,32,67};
        // for(int i=0;i<ns.length;i++){
        //     System.out.println(ns[i]);
        // }


        // 利用for each循环对数组每个元素求和：
        // int sum =0;
        // int[] ns ={10,20,30,15,50}; // 创建的数组
        // for(int i:ns){ // for each 的 i 对应ns数组里的每个元素
        //     // System.out.println(i);
        //     sum += i; // 将ns数组里的元素累加到sum里
        // }
        // System.out.println(+sum); // 输出 则是ns数组内所有元素的累加值


        // 圆周率π可以使用公式计算：
        // 要利用 for 循环计算圆周率π，常见的一种方法是使用莱布尼茨公式

        double pi = 0; // 初始pi的值
        int ci = 1000 ;// 循环次数，循环次数越多越精准
         // 使用for循环实现莱布尼茨公式
         for (int i = 0; i < ci; i++) {
            // 计算当前项
            double term = 1.0 / (2 * i + 1);
            if (i % 2 == 0) {
                pi += term;  // 正项
            } else {
                pi -= term;  // 负项
            }
        }

        // 最终的π值是计算结果乘以4
        pi *= 4;

        // 输出结果
        System.out.println("Calculated Pi: " + pi);

    }
}

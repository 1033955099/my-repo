public class Array{
    public static void main(String []args){
        // 假如我们定义一组类型相同的变量，例如：5个同学成绩
        // int n1 = 77;
        // int n2 = 65;
        // int n3 = 70;
        // int n4 = 68;
        // int n5 = 80;
        // 可以使用数组来表示"一组"int类型。
        // int[] ns = new int[5]; // 定义一个数组类型的变量，使用数组变量类型"[]"
        // // ns[0] = 77;
        // ns[1] = 65;
        // ns[2] = 70;
        // ns[3] = 68;
        // ns[4] = 80;
        // int[]。和单个基本类型变量不同，数组变量初始化必须使用new int[5]表示创建一个可容纳5个int元素的数组。

        // java 数组有几个特点：
        /* 
         * 数组所有元素初始化为默认值，整型都是0，浮点型是0.0，布尔型是false;
         * 数组一旦创建后，大小就不可改变。
         * 
         * 要访问数组中的某一个元素，需要使用索引。数组索引从0开始，5个元素的数组，索引范围是0~4;
         * 可以修改数组中的某一个元素，使用赋值语句，例如：ns[1] = 65;
         * 
         * 可以用数组变量.length获取数组大小
         */
        // System.out.println(ns.length); // 显示数组为5
        // 数组是引用类型，在使用索引访问数组元素时，如果索引超出范围，运行时将报错：
        // System.out.println(ns[5]); // 使用索引如果超出范围，则会报错

        // 可以在定义数组时直接指定初始化的元素，这样就不必写出数组的大小，而是由编译器自动推算数组大小。
        // 五位同学的成绩
        // int[] ns = new int[] { 10, 20, 30, 40, 50};
        // System.out.println(ns.length); // 编译器自动计算出数组大小为 5

        // 还可以进一步简写
        // int [] ns = { 11, 22, 33, 44, 55}; // 更加方便
        // System.out.println(ns.length); // 5

        // 数组是引用类型，数组大小不可改变

        // 5位同学的成绩:
        // int[] ns;
        // ns = new int[] { 68, 79, 91, 85, 62 }; // 对于数组ns来说，执行ns = new int[] { 68, 79, 91, 85, 62 };时，它指向一个5个元素的数组
        // System.out.println(ns.length); // 5
        // ns = new int[] { 1, 2, 3 }; // 执行ns = new int[] { 1, 2, 3 };时，它指向一个新的3个元素的数组
        // System.out.println(ns.length); // 3
        // // 原有的5个元素的数组并没有改变，只是无法通过变量ns引用到它们而已。


        // 字符串数组
        // 如果数组元素不是基本类型，而是一个引用类型,字符串是引用类型
        // String[] names = {
        //     "ABC", "DEF", "ZOO"
        // };
        // // 对于String[]类型的数组变量 s ，它实际上包括三个元素，每个元素都指向某个字符串对象
        // names[1] = "cat";
        // System.out.println(names[0]); // 结果ABC
        // System.out.println(names[1]); // 结果cat
        // System.out.println(names[2]); // 结果ZOO
        /* 
         * names[1]指向的字符串"XYZ"并没有改变，
         * 仅仅是将names[1]的引用从指向"XYZ"改
         * 成了指向"cat"，其结果是字符串"XYZ"再
         * 也无法通过names[1]访问到了。
         *
         */

        // String[] names = {"ABC", "XYZ", "zoo"};
        // String s = names[1]; // 将 names[1] 的值赋给 s ， s 只是复制了 names[1] 中存储的字符串 "XYZ" 的值，而 names[1] 仍然指向 "XYZ" 这个字符串对象。
        // names[1] = "cat"; // names[1] 的值发生了改变，指向 "cat"，但 s 仍然保持指向最初赋给它的 "XYZ"。
        // 字符串是不可变的对象，因此 names[1] 被修改后，并不会影响 s，因为 s 是一个 副本。
        // System.out.println(s); // s是"XYZ"还是"cat"?
        // 由于 s 在 names[1] 被修改之前就已经保存了 "XYZ"，所以打印 s 时它仍然是 "XYZ"，而 不受 names[1] 修改的影响。
        //  s 的结果是 XYZ 

    }
}
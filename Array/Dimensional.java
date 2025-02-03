package Array;

public class Dimensional {
    public static void main(String []args){
        // 二维数组
        // 二维数组就是数组的数组
        // int[][] ns = {
        //     {12,13,11},
        //     {23,33,22},
        //     {43,45,23}
        // };
        // System.out.println(ns.length); // 输出结果是数组的数量为3
        // 因为ns包含三个数组，因此ns.length的结果为3

        // 如果我们定义一个普通数组arr0，然后把ns[0]赋值给它：
        // int[][] ns = {
        //     { 1, 2, 3, 4 },
        //     { 5, 6, 7, 8 },
        //     { 9, 10, 11, 12 }
        // };
        // int[] arr0 = ns[0];
        // System.out.println(arr0.length); // 4
        // // arr0获取了ns的第0个元素也就是 { 1, 2, 3, 4 },因为ns数组的每一个元素也是一个数组

        // // 访问二维数组的某个元素需要使用array[row][col]
        // System.out.println(ns[1][0]);

        // 要打印二维的数组可以使用两层嵌套的for循环，或使用Java标准库的Arrays.deepToString()

        // int[][] ns = {
        //     { 1, 2, 3, 4 },
        //     { 5, 6 },
        //     { 7, 8, 9 }
        // };

        // System.out.println(Arrays.deepToString(ns));


        // 三维数组就是二维数组的数组

        // int[][][] ns={
        //    {
        //     {12,13},
        //     {22,23}
        //    },
        //    {
        //     {31,23},
        //     {11,32}
        //    },
        //    {
        //     {45,46},
        //     {45,66}
        //    }
        // };
        // // 如果我们要访问某个元素可以ns[0][0][1]
        // System.out.println(ns[0][0][1]);


        // 使用二维数组可以表示一组学生的各科成绩，请计算所有学生的平均分：
        // 用二维数组表示的学生成绩:
        int[][] scores = {
            { 82, 90, 91 }, // 学生甲的语数英成绩
            { 68, 72, 64 }, // 学生乙的语数英成绩
            { 95, 91, 89 }, // ...
            { 67, 52, 60 },
            { 79, 81, 85 },
        };
        // TODO:
        double average = 0;
        for(int[] ns:scores){
            for(int n : ns){
                average += n;
            }
        }
        average/=scores.length*scores[0].length;
        System.out.println(average);
        if (Math.abs(average - 77.733333) < 0.000001) {
            System.out.println("测试成功");
        } else {
            System.out.println("测试失败");
        }
    }
}

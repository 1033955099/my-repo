package Array;

import java.util.Arrays;

public class Sort {
    public static void main(String []args){
        // 对数组进行排序是程序中非常基本的需求。常用的排序方法有冒泡排序，插入排序和快速排序等。
        // 用冒泡排序算法对一个整型数组从大到小排序
        // int[] ns ={11,17,33,14,15};
        // // 排序前
        // System.out.println(Arrays.toString(ns));
        // // 外层循环 (i) 控制你要执行多少轮排序。因为每执行一轮，最大的数就“浮”到数组最后一位，所以最多只需要 n - 1 轮（n是数组长度）。
        // for(int i=0;i<ns.length-1;i++){ 
        //     for(int j=0;j<ns.length-i-1;j++){ 
        // // 内层循环 (j) 对数组相邻的元素进行比较和交换。如果 ns[j] > ns[j + 1]，就交换它们的位置。内层循环会不断地“交换”相邻元素，直到最大的数排到数组的最后。
        //         if(ns[j]>ns[j+1]){
        //             // 交换ns[j]和ns[j+1]:
        //             int tmp=ns[j];
        //             ns[j]=ns[j+1];
        //             ns[j+1]=tmp;
        //         }
        //     }
        // }
        // System.out.println(Arrays.toString(ns));
        /* 假设我们有一个数组 ns = {3, 2, 5, 1, 4}，我们要按从小到大的顺序排序它。

        第1轮：
        比较 3 和 2，因为 3 > 2，交换它们，数组变成 [2, 3, 5, 1, 4]。
        比较 3 和 5，因为 3 < 5，不交换。
        比较 5 和 1，因为 5 > 1，交换它们，数组变成 [2, 3, 1, 5, 4]。
        比较 5 和 4，因为 5 > 4，交换它们，数组变成 [2, 3, 1, 4, 5]。
        此时，最大的数 5 已经排好了。

        第2轮：
        比较 2 和 3，因为 2 < 3，不交换。
        比较 3 和 1，因为 3 > 1，交换它们，数组变成 [2, 1, 3, 4, 5]。
        比较 3 和 4，因为 3 < 4，不交换。
        这时 4 已经排好了。其他元素继续排序。 
        */

        // 每一轮循环后，最大的一个数被交换到末尾，因此，下一轮循环就可以"刨除"最后的数，每一轮循环都比上一轮循环的结束位置靠前一位。
        // 交换两个变量值，必须借助一个临时变量。
        // int x = 1;
        // int y = 2;

        // int t = x; // 把x的值保存在临时变量t中, t现在是1
        // x = y; // x现在是2
        // y = t; // y现在是t的值1 

        // Java的标准库已经内置了排序功能，我们只需要调用JDK提供的Arrays.sort()就可以排序

        // int[] ns ={11,17,33,14,15};
        // Arrays.sort(ns);
        // System.out.println(Arrays.toString(ns));
        // // 对数组排序实际上修改了数组本身

        // 对以下数组进行降序排序
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        // 排序前
        // System.out.println(Arrays.toString(ns));
        // 首先从大到小进行排序
        Arrays.sort(ns);
        // // 排序后
        System.out.println(Arrays.toString(ns));
        // [8, 12, 18, 28, 36, 50, 65, 73, 89, 96]
       // 然后将数组倒序
       for (int i = 0; i < ns.length / 2; i++) {
        int temp = ns[i];
        ns[i] = ns[ns.length - 1 - i];
        ns[ns.length - 1 - i] = temp;
    }
    
    // 打印排序后的数组
    System.out.println(Arrays.toString(ns));

    }
}

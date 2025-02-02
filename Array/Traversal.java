package Array;

public class Traversal {
    public static void main(String []args){
    //    int[] ns ={11,12,13,22,33};
    //    for(int i=0;i<ns.length;i++){ // 为了实现循环遍历初始条件i=0，因为索引总是从0开始，
    //     // 继续循环的条件为i<ns.length，因为当i=ns.length时，i已经超出了索引范围，每次循环后i++                                                                                                                                            //    
    //     int n = ns[i];
    //     System.out.println(n);
    //    }
    // 使用for循环就可以遍历数组。因为数组的每个元素都可以通过索引来访问，因此使用标准的for循环可以完成一个数组的遍历


    // 使用for each 循环，直接迭代数组的每个元素

    // int[] ns ={12,21,11,22,33};
    // for(int n:ns){ // 在for (int n : ns)循环中，变量n直接拿到ns数组的元素，而不是索引
    //     System.out.println(n);
    // }
    // for each循环更加简洁。但是，for each循环无法拿到数组的索引


    // 打印数组内容
    // 直接打印数组变量，打到数组在jvm中的引用地址
    // int[] ns1={12,21};
    // System.out.println(ns1); 
    // for(int n:ns1){
    //     // System.out.println(n);
    // }
    // // 使用for each麻烦，我们用java标准库提供的 Arrays.toStrign()，可开快速打印数组内容
    // System.out.println(Arrays.toString(ns1));

    
    // 请按倒序遍历数组并打印每个元素：
    int[] ns = { 1, 4, 9, 16, 25 };
    for(int i=4;i<ns.length;i-- ){
        int n =ns[i];
        System.out.println(n);
    }
    }
}

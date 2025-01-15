// 浮点数运算和整数运算相比，只能进行加减乘除这些数值计算，不能做位运算和移位运算。
// 在计算机中，浮点数虽然表示的范围大，但是，浮点数有个非常重要的特点，就是浮点数常常无法精确表示。
public class Float {
    public static void main(String[] args){
// 浮点数常常无法进行精确表示，所有会产生误差
// 浮点数计算误差
        // double x = 1.0 / 10;
        // double y = 9.0 - 1 / 10;
        // System.out.println(x);// 0.1
        // System.out.println(y);// 9.0 正确答案应该是8.9 因为误差所以说9.0
        // 由于浮点数存在运算误差，所以比较两个浮点数是否相等常常会出现错误的结果。
        // 正确的比较方法是判断两个浮点数之差的绝对值是否小于一个很小的数：
        // double r = Math.abs(x-y);
        // if(r<0.00001){
            // 可以认为相等
        //    System.out.println("x和y相等");
        // }else{
            // 不相等
            // System.out.println("x和y不相等");
        // }
        // 浮点数内存的表示方法比整数更为复杂。Java的浮点数完全遵循IEEE-754标准是计算机平台的标准。

        // 类型提升
        // 如果参与运算的两个数其中一个是整型，那么整型可以自动提升到浮点型
        // int x = 5;
        // double y = 1.2 + 24.0 / x; // 6.0
        // System.out.println(y); 
        // 需要特别注意，在一个复杂的四则运算中，两个整数的运算不会出现自动提升的情况。
        // double y = 1.2 + 24 / 5;
        // System.out.println(y); // 结果不是6.0 而是5.2
        // 计算结果是5.2，原因是计算24 / 5这个子表达式时，按两个整数进行运算，结果仍为整数4
        // 要修复这个计算结果，将24 / 5改为24.0/ 5。因为24.0是浮点数，因此计算除法时自动将5提升为浮点数


        // 溢出
        // 整数运算除以0时会报错，而浮点数除以0时，不会报错，但会返回几个特殊值。
        /* 
            NaN 表示 Not a Number
            Infinity 表示无穷大
            -Infinity 表示负无穷大
            double d1 = 0.0 / 0; // NaN
            double d2 = 1.0 / 0; // Infinity
            double d3 = -1.0 / 0; // -Infinity
            （这三种特殊值在实际运算中很少碰到）
        */ 


        // 强制转行
        // 可以将浮点数强制转型为整数，在转型时，浮点数小数部分会被丢掉。
        // 如果整型后返回值超过了整型能表示的最大限制，那么将返回整型的最大值。
        // int n1 = (int) 12.3; // 12
        // int n2 = (int) 12.7; // 12
        // int n3 = (int) -12.7; // -12
        // int n4 = (int) (12.7 + 0.5); // 13
        // int n5 = (int) 1.2e20; // 2147483647
        // System.out.println(n1);
        // System.out.println(n2);
        // System.out.println(n3);
        // System.out.println(n4);
        // System.out.println(n5);
        // 如果需要四舍五入，那么可以对浮点数加上0.5再强制转型
        // 四舍五入
        // double x = 2.6;
        // int y = (int) (x + 0.5);
        // System.out.println(y);
    }

}

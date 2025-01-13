public class Index{
    public static void main(String[] args) {

        // 整数运算
        // int a = (200+100)*20;//6000
        // int b = a+(6000/2);
        // System.err.println(a);
        // System.err.println(b);

        // 整数溢出
        // int a = 2147483640;
        // int b = 100;
        // int sum = a + b; // -2147483556 整数计算值超出范围，就会溢出，成为负数。
        // System.err.println(sum);

        
        // 整数溢出
        // long a = 2147483640;
        // long b = 100;
        // long sum = a + b; // -2147483556 整数计算值超出范围，就会溢出，成为负数。
        // sum += 33; // 简写运算符
        // System.err.println(sum);
        // sum--; // 自增自减与运算
        // System.err.println(sum);
        // sum--;
        // System.err.println(sum);


        // 移位运算
        // 整数二进制左移
        // int n = 7;      // 00000000 00000000 00000000 00000111 = 7
        // int a = n << 1; // 00000000 00000000 00000000 00001110 = 14
        // int b = n << 2; // 00000000 00000000 00000000 00011100 = 28
        // int c = n << 28;// 01110000 00000000 00000000 00000000 = 1879048192
        // int d = n << 29;// 11100000 00000000 00000000 00000000 = -536870912 由于最高位为1，结果变成负数。
        // 整数二进制右移
        // int n = 7;      // 00000000 00000000 00000000 00000111 = 7
        // int a = n >> 1;// 00000000 00000000 00000000 00000011 = 3
        // int b = n >> 2;// 00000000 00000000 00000000 00000001 = 1
        // int c = n >> 3;// 00000000 00000000 00000000 00000000 = 0
        // 还有一种无符号的右移运算，使用>>>，它的特点是不管符号位，右移后高位总是补0，
        // 因此，对一个负数进行>>>右移，它会变成正数，原因是最高位的1变成了0：
        // 左移不断乘二，右移不断除二


        // 位运算
        // 位运算是按位进行与、或、非和异或的运算。
        // 与运算的规则是：必须两个数同为1，结果才是1
        // n = 0 & 0; //结果为0
        // n = 1 & 0; //结果为0
        // n = 0 & 1; //结果为0
        // n = 1 & 1; //结果为1
        // 或运算的规则是：任意一个是1，结果就是1
        // n = 0 | 0; //结果为0
        // n = 1 | 0; //结果为1
        // n = 0 | 1; //结果为1
        // n = 1 | 1; //结果为1
        // 非运算的规则是：0和1互换
        // n = ~0; //结果是1
        // n = ~1; //结果为0
        //异或运算的规则是：如果两个数不同为1，否则为0
        // n = 0 ^ 0; //结果为0
        // n = 1 ^ 0; //结果为1
        // n = 0 ^ 1; //结果为1
        // n = 1 ^ 1; //结果为0
        // int i = 167776589; // 00001010 00000000 00010001 01001101
        // int n = 167776512; // 00001010 00000000 00010001 00000000
        // System.out.println(i&n);
        /* 
            十进制转二进制更好理解，通过位运算符"&"的规则机制，个数的对应位都是 1，则结果的该位为 1，否则结果的该位为 0。
            i: 00001010 00000000 00010001 01001101
            n: 00001010 00000000 00010001 00000000
             ---------------------------------------
            i & n: 00001010 00000000 00010001 00000000 // 二进制结果转换十进制 得出： 167776512
        */


        // 类型自动提升与强制转换
        /* 
         * 如果参与运算的类型不一样，那么结果是较大的整型，
         * 例如：short（短整数类型）和int（长整数类型），
         * short和int的运算结果总是int，因为short首先被转型为int。
         */
        // int i = 123456;
        // short s = 1234;
        // int x = i + s;  // s自动转型为int
        // short y = i + s;// 出现编译错误
        //可以进行强制转型，将大范围整数转型为小范围整数，强制转型使用（类型），例如：将int转换为short
        // int i = 123245;
        // short s = (short)i; //12345
        /* 
            要注意，超出范围的强制转型会得到错误的结果，
            原因是转型时，int的两个高位字节直接被扔掉，
            仅保留了低位的两个字节。因此，强制转型的结果很可能是错的。
        */

        // 计算前N个自然数的和
        // int n = 100;
        // int sum = (n*(n+1))/2;
        // System.out.println(sum);
        // System.out.println(sum == 5050 ? "测试通过" : "测试失败");


        /* 
         整数总结：
         可以强制转型，强制转型如果超出范围就会得到错误结果;
         应选择合适范围的整数类型（int和long），无需节省内存而选择byte和short进行整形运算。
        */
    }
}
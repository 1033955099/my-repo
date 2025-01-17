public class MyString {
    public static void main(String [] ager){
        // 在java中字符和字符串是两个不同的类型
        // 字符类型
        // 字符类型 char 是基本的数据类型，它是 character 的缩写。 一个 char 保存一个Unicode字符：
        // char c1 = 'A';
        // char c2 = '中';
        // java在内存中总是使用Unicode表示字符，一个英文字符和一个中文字符都用char类型来表示，它们都占用两个字节。
        // 要显示一个字符的Unicode编码，只需将char类型赋值给int类型即可：
        // int n1 = 'A'; // 字母的“A”的Unicode编码为65
        // int n2 = '中';// 汉子“中”的Unicode编码为20013 
        // System.out.println(n1);
        // System.out.println(n2);

        // 还可以将转义字符 \ u  + Unicode编码来表示一个字符
        // \ u  后面接 4 个十六进制数字（0-9 和 A-F），表示一个 Unicode 字符。
        // char c3 = '\u0041'; // A 的十六进制是 0041 = 十进制 65  结果：char（Unicode）转字符 A
        // char c4 = '\u4e2d'; // “中”的十六进制是 4e2d = 十进制20013
        // System.out.println(c3);
        // System.out.println(c4);


        // 字符串类型
        // 和 char 不同，字符串 String 是引用类型，我们用"..."来表示字符串。一个字符串可以储存0个到任意字节
        // String s = ""; // 空字符串表示0个字符
        // String s1 = "A"; // 包含一个字符
        // String s2 = "ABC"; // 包含三个字符
        // String s3 = "你好 ABC"; // 包含六个字符，一个空格也算一个字符
        // // 因为字符串使用 "..." 来表示开始和结束，如果字符串本身包括一个 " 怎么表示？
        // 例如："abc "def" ,编译器就无法判断是中间的引号究竟是字符串的一部分还是表示字符串结束，这个时候需要用转义字符 \ :
        // String x = "abc\"def";
        // System.out.println(x); // 结果就是一共七个字符：a,b,c,",d,e,f
        // 因为 \ 是转义符，所以用 \\ 来表示一个 \ 字符:
        // String y = "qwe\\zxc";
        // System.out.println(y);  //结果为 qwe\zxc

        // 常见的转义字符包括：
        /* 

            \" 表示字符"
            \' 表示字符'
            \\ 表示字符\
            \n 表示换行符
            \r 表示回车符
            \t 表示Tab
            \ n #### 表示一个Unicode编码的字符
            
         */
        //  String s = "ABC\n\u4e2d\u6587"; // 包含6个字符: A, B, C, 换行符, 中, 文
        //  System.out.println(s);


        // 字符串连接
        // Java的编译器对字符串做了特殊照顾，可以使用+连接任意字符串和其他数据类型，这样极大地方便了字符串的处理。例如：
        // 字符串处理
        // String s1 = "Hello";
        // String s2 = "Word";
        // String s = s1 + " " + s2 + "!"; // s1 加上空格再加上s2再加上一个感叹号，注意：空格和感叹号必须要用双引号括起来才行
        // System.out.println(s); // 输出结果为 Hello Word！

        // 如果用+连接字符串和其他数据类型，会将其他数据类型先自动转型为字符串，再连接：
        // int age = 75; // 整数类型
        // String s = "age is" +" "+  age; // 将int自动转换为字符串再连接
        // System.out.println(s); // 结果为 age is 75


        // 多行字符串
        // 字符串可以用"""..."""表示多行字符串（Text Blocks）
        // String s = """
                //    name name name name
                //    name name name name
                //    name name name name
                //    name name name name                
                //    """;
        // System.out.println(s);
        // 如果我们不想在字符串末尾加一个\n，就需要这么写：
        // String s = """
                // name name name name 
                // name name name name
                // name name name name
                // name name name name"""; // 多行字符串前面共同的空格会被去掉


        // 不可变特性
        // Java字符串除了是引用类型外，还有个重要特点就是字符串不可变
        // String s = "hello";
        // System.out.println(s); // 显示 hello
        // s = "world";
        // System.out.println(s); // 显示 world
        // 字符串没有变，而是变量 s 的 "指向" 变了
        /* 
         * 执行String s = "hello";时，JVM虚拟机先创建字符串"hello"，然后，把字符串变量s指向它
         * 紧接着，执行s = "world";时，JVM虚拟机先创建字符串"world"，然后，把字符串变量s指向它
         * 
         * 原来的字符串"hello"还在，只是我们无法通过变量s访问它而已。因此，字符串的不可变是指字符串内容不可变。
         * 至于变量，可以一会指向字符串"hello"，一会指向字符串"world"。
         * 
         */
        // String s = "hello"; // 创建一个字符串对象 "hello"，并让变量 s 指向它
        // // String t = s;       // t 和 s 指向同一个字符串对象 "hello"
        // s = "world";        // s 被重新赋值为另一个字符串对象 "world"
        // System.out.println(t); // t 仍然指向原来的字符串对象 "hello"


        // 空值null
        // // 引用类型的变量可以指向一个空值null，它表示不存在，即该变量不指向任何对象
        // String s1 = null; // s1 是null
        // System.out.println(s1);
        // String s2 = s1; // s2 也是null
        // System.out.println(s2);
        // String s3 = ""; // s3 是空字符串，不是null
        // System.out.println(s3);
        // 注意要区分空值null和空字符串""，空字符串是一个有效的字符串对象，它不等于null。


        // 将一组int值视为字符的Unicode编码，然后将它们拼成一个字符串
        // 请将下面一组int值视为字符的Unicode码，把它们拼成一个字符串：
        // int a = 72;
        // int b = 105;
        // int c = 65281;
        // 先用 ""（空字符串）将第一个字符拼接成字符串。
        // 然后再依次拼接其他字符，形成完整的字符串。
        // String s = "" + (char)a + (char)b + (char)c; // 强制类型转换 将 int 类型的 a b c 转换为其对应的 Unicode 字符。

        // System.out.println(s); 输出为：Hi！。
        



    }
}

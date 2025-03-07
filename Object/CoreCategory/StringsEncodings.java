package Object.CoreCategory;  // 你的包名（对应文件路径）
// 字符串和编码
// Strin
import java.util.Arrays;

// 在java中String是一个引用类型,它本身也是一个class。但是，java编译器对String有特殊处理，即可以直接用"..."来表示一个字符串:
// String s1 = "Hello!";
// 实际上字符串在String内部是通过yyi一个char[]数组表示的，因此，按下面的写法也可以的：
// String s2 = new String(new char[]{'H','E','L','L','O','!'});
// 因为Stirng太常用了，所以java提供了"..."这种字符串字面量表示方法。
// java字符串的一个重要特点就是字符串 不可变。这种不可变是通过内部的private final char[]字段，以及没有任何修改char[]的方法实现的。
// String
// public class StringsEncodings {
//     public static void main(String[] args) {
//         String s = "Hello"; // s变量的值是hello
//         System.out.println(s);
//         s = s.toUpperCase(); // 调用字符串对象的方法，方法作用为生成s值的大写形式
//         System.out.println(s); // HELLO并不是由原来的值变的，而是由方法新生成的
//     }
// }
/* 
 * String变量的值永远不会改变这是java铁律，s变量调用了方法后，并没有改变原本的值，而是生成了原本值的大写并且打印了出来
 */


// 字符串比较
// 当我们想要比较两个字符串是否相同时，要特别注意，我们实际上想比较字符串内容是否相同。必须用equals()方法，而不是==。
// 要忽略大小写比较，使用equalsIgnoreCase()方法。

// String类还提供了多种方法来搜索子串，提取子串。常用的方法有：
// "Hello".contains("ll"); // 返回true，因为Hello中包含LL
// 注意到contains()方法的参数是CharSequence而不是String，因为CharSequence是String实现的一个接口。

// 搜索子串
/* 
"Hello".indexOf("l"); // 2
"Hello".lastIndexOf("l"); // 3
"Hello".startsWith("He"); // true
"Hello".endsWith("lo"); // true
 */

// 提取子串
// "Hello".substring(2); // "llo"
// "Hello".substring(2, 4); "ll"
// 索引是从0开始


// 去除收尾空白字符
// 使用trim()方法可以移除字符串首尾空白字符。空白字符包括空格，\t,\r,\n:
// "\tHello\r\n".trim();//输出为"Hello"
// trim()并没有改变字符串内容，而是返回了一个新的字符串。

// strip()方法也可以移除字符串首尾空白字符。它和trim()不同的是，类似中文的空格字符\u3000也会被移除：
/* 
"\u3000Hello\u3000".strip(); // "Hello"
" Hello ".stripLeading(); // "Hello "
" Hello ".stripTrailing(); // " Hello"
 */

//String还提供了isEmpty()和isBlank()来判断字符串是否为空和空白字符串:
/*
"".isEmpty(); // true，因为字符串长度为0
"  ".isEmpty(); // false，因为字符串长度不为0
"  \n".isBlank(); // true，因为只包含空白字符
" Hello ".isBlank(); // false，因为包含非空白字符
 */ 


// 替换子串
// 要在字符串中替换子串，有两种方法，一种是字符或是字符串替换：
// String s1 = "Hello";
// s1.replace('l','w');//"hewwo",把所有字符l替换成'w'
// s1.replace("ll","--")//"he--o",把所有子串"ll",被替换成"--"
// 另一种是通过正则表达式替换
// String s = "A,,B;C ,D";
// s.replaceAll("[\\,\\;\\s]+", ","); // "A,B,C,D"
// 上面的代码通过正则表达式，把匹配的子串统一替换为","。


// 分割字符串
// 要分割字符串，使用split()方法，并且传入的也是正则表达式：
// String s3 = "a,b,c,d";
// String[] ss = s3.split("\\,"); {"A", "B", "C", "D"}


// 拼接字符串
// 拼接字符串使用静态方法join(),它指定的字符串连接字符串数组:
// String[] arr ={"A","B","C"};
// String s = String.join("***", arr);//"A***B***C"


// 格式化字符串
// 字符串提供了formatted()方法和format()静态方法，可以传入其它参数，替换占位符.然后生成新的字符串：
// String
// public class StringsEncodings {
//     public static void main(String[] args) {
//         String s = "Hi %s, your score is %d!"; // "Hi %s, your score is %d!" 是一个 格式化字符串，里面有 占位符
//         /* 
//         %s：表示 字符串（string）。
//         %d：表示 整数（digit）。
//          */
//         System.out.println(s.formatted("Alice", 80));
//         System.out.println(String.format("Hi %s, your score is %.2f!", "Bob", 59.5));
//         // formatted() 只能作用于已有的字符串，而 String.format() 适用于所有格式化字符串。
//     }
// }
/* 有几个占位符，后面就传入几个参数。参数类型要和占位符一致。我们经常用这个方法来格式化信息。常用的占位符有： */
/*
%s：显示字符串；
%d：显示整数；
%x：显示十六进制整数；
%f：显示浮点数。
*/
// 占位符还可以带格式，例如：%.2f表示显示两位小数。如果你不确定用啥占位符，那就始终用%s,因为%s可以显示任何数据类型。


// 类型转换
// 要把任意基本类型或引用类型转换为字符串，可以使用静态方法valueOf()。这是一个重载方法，编译器会自动根据参数自动选择合适的方法
/* 
String.valueOf(123); // "123"
String.valueOf(45.67); // "45.67"
String.valueOf(true); // "true"
String.valueOf(new Object()); // 类似java.lang.Object@636be97c
*/
// 要把字符串转换成其它类型，就需要根据情况。例如：把字符串转换成int类型:
// int n1 = Integer.parseInt("123");//123
// int n2 = Integer.parseInt("ff",16);//按十六进制转换,255  —— 括号内的16代表的是所要转换的进制数  
// 把字符串转换成boolean类型:
// boolean b1 = Boolean.parseBoolean("true"); // true
// boolean b2 = Boolean.parseBoolean("FALSE"); // false

// Integer有个getInteger(String)方法，它不是将字符串转换为int，而是把该字符串对应的系统变量转换为Integer
// Integer.getInteger("java.version"); // 版本号，11


// 转换为char[]
// String和char[]类型可以互相转换，方法是
// char[] cs = "Hello".toCharArray(); // String转char[]
// String s = new String(cs); // char[]转String
// 如果修改了char[]数组，String并不会改变:
// public class StringsEncodings{
//     public static void main(String[] args) {
//         char[] cs = "Hello".toCharArray();
//         String s = new String(cs); // s 拷贝了char[]的内容
//         System.out.println(s); // 输出"Hello"
//         cs[0]='x'; // 修改char[] 的内容
//         System.out.println(s); // 仍然输出"Hello"
//     }
// }
/* 
这是因为通过new String(char[])创建新的String实例时，它并不会直接引用传入的char[]数组，
而是会复制一份，所以,修改外部的char[]数组不会影响String实例n内部的char[]数组，因为这是两个不同的数组。
*/
// 从String的不变性设计可以看出，如果传入的对象有可能改变，我们需要复制而不是直接引用。

// int[]
public class StringsEncodings{
    public static void main(String []args){
        int[] scores = new int[]{22,33,44,55}; // 创建数组字段的实例
        Score s = new Score(scores); // 创建类的实例
        s.printScore(); // Score类调用Score数组方法
        scores[2]=99; //将第三个数字改成99
        s.printScore(); //调用打印方法
    }
}

class Score{ // 创建的分数类
    private int[] scores; // 声明一个分数数组字段
    public Score(int[] scores){ // 构造方法
        // 复制数组，防止外部修改影响内部数据
        this.scores = Arrays.copyOf(scores, scores.length);
    }
    public void printScore(){ //我们创建一个打印Score数组的方法
        System.out.println(Arrays.toString(scores)); // 打印数组内容，将 scores 数组转换为字符串，如 [22, 33, 44, 55]。
    }
}


// 字符编码
/* 
计算机只能理解0和1bit，但是我们人类用语言文字来交流，因此我们需要一种方法把文字符转换成计算机能理解的
二进制，这就是字符编码

举个例子：

字母 A -> 计算机存储时变成 01000001 （二进制）
字母 B -> 变成 01000010
*/

// 有很多不同的编码方式，常见的有：
// ASCLL(最基础的)
// 只包含英文，数字和一些符号(共128个字符)。
// 比如A-65(十进制)-01000001（二进制）。
// 问题：不支持汉字、日文等其他语言。

// GB2312/GBK（中文编码）
// GB2312：支持 6763 个常用汉字。
// GBK：扩展了 GB2312，支持更多汉字和符号。
// Unicode（万国码，解决所有语言字符问题）

// 统一了全球所有语言的字符编码，每个字符都分配一个独立的编号。
// 问题：Unicode 只是规定了字符的编号，实际存储时有不同方式。
// UTF-8（Unicode 的存储方式之一，最常用）

// 可变长编码（1~4字节）：
// 英文等常见字符用 1 个字节存储（节省空间）。
// 中文、日文等复杂字符用 3~4 个字节存储。
// 特点：兼容 ASCII，全球通用，适合网页、文件存储。
/* 
字符编码是把字符转换为二进制的规则。
常见编码有 ASCII（英文）、GBK（中文）、Unicode（全球通用）、UTF-8（最推荐）。
乱码的原因：编码和解码不匹配，解决方案是统一编码（推荐 UTF-8）。
*/

// 在Java中，char类型实际上就是两个字节的Unicode编码。如果我们要手动把字符串转换成其他编码，
/* 
byte[] b1 = "Hello".getBytes(); // 按系统默认编码转换，不推荐
byte[] b2 = "Hello".getBytes("UTF-8"); // 按UTF-8编码转换
byte[] b2 = "Hello".getBytes("GBK"); // 按GBK编码转换
byte[] b3 = "Hello".getBytes(StandardCharsets.UTF_8); // 按UTF-8编码转换
*/
// 转换编码后，就不再是char类型，而是byte类型表示的数组。
// 如果要把已知编码的byte[]转换为String，可以这样做：
/* 
byte[] b = ...
String s1 = new String(b, "GBK"); // 按GBK转换
String s2 = new String(b, StandardCharsets.UTF_8); // 按UTF-8转换
*/
// 始终牢记:Java的String和char在内存中总是以Unicode编码表示。

/* 
Java字符串String是不可变对象；
字符串操作不改变原字符串内容，而是返回新字符串；
常用的字符串操作：提取子串、查找、替换、大小写转换等；
Java使用Unicode编码表示String和char；
转换编码就是将String和byte[]转换，需要指定编码；
转换为byte[]时，始终优先考虑UTF-8编码。
*/
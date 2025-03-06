package Object.CoreCategory;  // 你的包名（对应文件路径）
// 字符串和编码
// String
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

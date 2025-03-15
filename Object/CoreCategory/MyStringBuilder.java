package Object.CoreCategory;

// java编译器对String做了特殊处理，这使得我们可以用+来连接字符串。

// public class MyStringBuilder{
//     public static void main(String[] args) {
//         String s = "";
//         for(int i = 0;i<1000;i++){
//             s = s + ","+i;
//         }
//         System.out.println(s);
//     }
// }
// 虽然可以直接拼接字符，但是在循环中，每次循环都会创建新的字符串对象，然后扔掉旧的字符串。这样大多字符串都是临时对象，不但浪费内存还会影响GC效率

/* 
 * 为了能高效拼接字符串，Java标准库提供了StringBuilder，它是一个可变对象，可以预分配缓冲区，往StringBuilder中新增字符时，不会创建
 * 新的临时对象
*/

// 定义的java类避免与java标准库提供的StringBuilder名字重复
// public class MyStringBuilder{
//     public static void main(String[] args) {
//         // 创建一个 StringBuilder 对象，并预分配 1024 个字符的空间，以减少扩容开销
//         StringBuilder sb = new StringBuilder(1024);
//         // 循环 1000 次，将 ",0,1,2,3,...,999" 追加到 StringBuilder 中
//         for(int i = 0;i < 1000;i++){
//             sb.append(','); // 先追加一个逗号
//             sb.append(i); // 再追加当前的数字
//         }
//         // 将 StringBuilde构造的字符串转换为普通字符串 
//         String s = sb.toString();
//         // 最终输出字符串
//         System.out.println(s);
//     }
// }

// StringBuilder还可以进行链式操作
// 链式操作
// public class MyStringBuilder{
//     public static void main(String[] args) {
//         // 创建一个StringBuilder对象，初始容量为1024
//         var sb = new StringBuffer(1024);
//         // 使用 append 方法拼接字符串
//         sb.append("I"+','+' ')
//           .append("love"+' ')
//           .append("You"+' ')
//           .append("!")
//           .insert(0, "Hello"+','); //在开头插入Hello

//         // 最终输出结果
//           System.out.println(sb.toString());
//     }
// }
// 查看StringBuilder可以发现，进行链式操作的关键是，定义append()方法返回this，这样就可以不断调用自身的其他方法。

// 我们可以设计链式操作的类，比如:一个不断增加的计数器
// 链式操作
/* public class MyStringBuilder {
    public static void main(String[] args) {
        // 创建Adder对象adder
        Adder adder = new Adder();
        // 使用链式调用()
        adder.add(3)
             .add(5)
             .inc()
             .add(10);
            // 输出最终结果
        System.out.println(adder.value()); // 结果19
    }
}

// 计算器类Adder
class Adder {
    // 私有变量sum，存储累加的结果，初始值为0
    private int sum = 0;

    // sum方法:给sum加上n，并返回当前对象 this，支持链式调用
    public Adder add(int n) {
        sum += n; // 将n加到sum身上
        return this; // 返回this(当前Adder对象)
    }

    // inc方法:将sum增加一，并且返回当前对象this，支持链式调用
    public Adder inc() {
        sum ++; // sum自增一
        return this; // 返回this(当前Adder对象)
    }

    // value 方法: 返回当前sum的值
    public int value() {
        return sum; // 直接返回 sum 
    }
} */


// 练习
// 请使用StringBuilder构造一个INSERT语句
public class MyStringBuilder {
    public static void main(String[] args) {
        String[] fields = { "name", "position", "salary" };
        String table = "employee";
        String insert = buildInsertSql(table, fields);
        System.out.println(insert);
        String s = "INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)";
        System.out.println(s.equals(insert) ? "测试成功" : "测试失败");
    }

    static String buildInsertSql(String table, String[] fields) {
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO ").append(table).append(" (");

        // 拼接字段名
        for (int i = 0; i < fields.length; i++) {
            sb.append(fields[i]);
            if (i < fields.length - 1) {
                sb.append(", ");
            }
        }

        sb.append(") VALUES (");

        // 拼接占位符 ?
        for (int i = 0; i < fields.length; i++) {
            sb.append("?");
            if (i < fields.length - 1) {
                sb.append(", ");
            }
        }

        sb.append(")");

        return sb.toString();
    }
}

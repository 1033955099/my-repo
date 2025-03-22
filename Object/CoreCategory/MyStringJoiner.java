package Object.CoreCategory;

import java.util.StringJoiner;

// 要高效拼接字符串，应该使用StringBuilder。

// 使用分隔符拼接数组的需求很常见，所以java标准库h还提供了一个Stringjoinerllalai来干这个事：
// 用StringJoiner的结果少了前面的"Hello "和结尾的"!"！遇到这种情况，需要给StringJoiner指定“开头”和“结尾
// public class MyStringJoiner {
//     public static void main(String[] args) {
//         String[] names = {"Bob","Lin","Sun"};
//         var sj = new StringJoiner(",","Hello","！");
//         for(String name:names){
//             sj.add(name);
//         } 
//         System.out.println(sj.toString());
//     }
// }


// String.join()
// String 还提供了一个静态方法join(),这个方法在内部使用了StirngJoiner来拼接字符串，在不需要指定"开头"和"结尾"的时候，用String.join()更方便
/* 
String[] names = {"Bob", "Alice", "Grace"};
var s = String.join(", ", names);
*/


// 练习
// 使用StringJoiner构造一个SELECT语句：

public class MyStringJoiner {
    public static void main(String[] args) {
        String[] fields = { "name", "position", "salary" };
        String table = "employee";
        String select = buildSelectSql(table, fields);
        System.out.println(select);
        System.out.println("SELECT name, position, salary FROM employee".equals(select) ? "测试成功" : "测试失败");
    }

    static String buildSelectSql(String table, String[] fields) {
        StringJoiner joiner = new StringJoiner(", ");
        for (String field : fields) {
            joiner.add(field);
        }
        return "SELECT " + joiner.toString() + " FROM " + table;
    }
}

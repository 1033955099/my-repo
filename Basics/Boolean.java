

public class Boolean {
    public static void main(String[] args){
    // 对于布尔类型，永远只有ture（真）和false（假）两个值
    /* 
        布尔运算是一种关系运算，包括以下几类：
        比较运算符：> , >= , < , <= , == , !=
        与运算：&&
        或运算：||
        非运算：！
    */  
    // boolean isGreater = 5 > 3; // 更大 true
    // System.out.println( isGreater);
    // int age = 12;
    // boolean iszero = age == 0; // 是零 false
    // System.out.println(iszero);
    // boolean isNonzero = !iszero; // 非零 true
    // System.out.println(isNonzero);
    // boolean isAdult = age > 18; // 成年 false
    // System.out.println(isAdult);
    // boolean isTeenager = age > 6 && age < 18; //是青少年 true   需要符合6岁以上，以及19岁以下的条件即是青少年
    // System.out.println(isTeenager); 
    // // 关系运算符的优先级从高到低依次是：
    /* 
        !
        >，>=，<，<=
        ==，!=
        &&
        ||
    */
    // 短路运算
    // 布尔运算的一个重要特点是短路运算。如果一个布尔运算的表达式能提前确定结果，则后续的计算不再执行，直接返回结果
    // 如果左侧为 false，整个表达式直接为 false，右侧不计算
    // boolean b = 5 < 3; //5 < 3是错，所以b=false
    // boolean result = b && (5 / 0 > 0); // 此处 5 / 0 不会报错   b = false，且由于短路特性，(5 / 0 > 0) 不会被执行。
    // System.out.println(result); //结果 就是false
    // 分析：因为 b 是 false，根据 短路逻辑，右侧的 (5 / 0 > 0) 不会被计算。
    // 所以，即使 5 / 0 是数学上的非法操作（会抛出 ArithmeticException），也不会触发。
    // boolean b = 5 < 6; // 变量b如果是true,那么将无法进行短路运算，表达式会因为除数是0而报错
    // boolean result = b && (5 / 0 > 0);
    // System.out.println(result);
    // 类似的 || 运算，只要确定第一个值为ture，后续计算也不再进行，而是直接返回ture ,和 && 一样
    // boolean a = 4 > 3;
    // boolean result = a || (5 / 0 > 0);
    // System.out.println(result);


    // 三元运算符
    // Java还提供一个三元运算符b ? x : y，它根据第一个布尔表达式的结果，分别返回后续两个表达式之一的计算结果
    // int num = -10;
    // String result = num > 1 ? "yes" : "no";
    // System.out.println(result);  // 输出：no
    // b ? x : y会首先计算b，如果b为true，则只计算x，否则，只计算y。此外，x和y的类型必须相同，因为返回值不是boolean，而是x和y之一。


    // 判断指定年龄是否是小学生，判断年龄为：（6~12）岁
        // int age = 7; 
        // boolean isPrimaryStudent = age >= 6 && age <= 12; 
        // String panduan = isPrimaryStudent ? "yse" : "no";
        // System.out.println(panduan); 
        // boolean isPrimaryStudent = 12; 
    }       
}

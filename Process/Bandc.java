public class Bandc {
    public static void main(String []args){
        // 无论是while循环还是for循环，有两个特别的语句可以使用，就是break语句和continue语句。

        // break
        // 在循环过程中，可以用break语句跳出当前循环。
        // int sum = 0;
        // for (int i = 1;;i++){
        //     sum = sum + i;
        //     if(i == 100){
        //         break;
        //     }
        // }
        // System.out.println(sum);
        // 使用for循环计算从1到100时，我们并没有在for（）中设置循环退出的检测条件。
        // 但是在for循环内部我们用if判断如果 i=100，就通过break退出循环。
        // 因此break语句通常都是配合if使用。但要小心break语句总是跳出自己所在的那一层循环。


        // continue
        // break 会跳出当前循环，也就是整个循环不会执行了。而continue则会提前结束本次循环，直接继续执行下次循环。

        int sum = 0;
        for(int i=1;i<=10;i++){
            System.out.println("beg i="+i);
            if(i % 2 == 0){
                continue;
            }
            sum=sum+i;
            System.out.println("end i="+i);
        }
        System.out.println(sum);

        // 注意观察continue语句效果。当i为奇数时，完整的执行了整个循环，因此会打印bag i =1和end i =1。在i为偶数时
        // continue语句会提前结束本次循环，因此会打印bag i =2但不会打印end=2。
        // 在多层嵌套的循环中，continue语句同样是结束本次自己所在的循环。
    }
}

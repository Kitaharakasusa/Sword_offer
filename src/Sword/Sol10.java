package Sword;//一只青蛙一次可以跳上1级台阶，也可以跳上2级。
// 求该青蛙跳上一个n级的台阶总共有多少种跳法。

public class Sol10 {
    public int JumpFloor(int target) {

        if(target<=0)
        {
            return 0;
        }
        if(target==1 ||target==2)
        {
            return target;
        }
        int a=1,b=2,c=3;
        for(int i=3;i<=target;i++)
        {
             c=a+b;
             a=b;
             b=c;

        }
//        while (target-->=2)
//        {
//            sum+=number;
//            number=sum-number;
//        }
        return c;
    }

}
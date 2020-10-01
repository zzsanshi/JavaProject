package LearningCode.BasicCode;
import java.util.Random;
import java.util.Scanner;
public class BasicCode1 {
    public static void main (String[] args){
        int zi=1;
       System.out.println(zi);

       String f="hello";
       System.out.println(f+20);

       char a1='a';
       System.out.println(a1+'b');

      int i=1;
      i++;
      ++i;
      System.out.println("i: "+i);
      int a=10;
      int b=20;
      int max=a>b?a:b;
      System.out.println(max);
      System.out.println("if else");
      if(a<b){
          System.out.println("我要学java");
      }
      else
      System.out.println(b);

      System.out.println("switch");
      int weak=2;
      switch (weak){
          case 1:System.out .println("1");break;
          case 2:System.out .println("12");break;
          default:break;
      }
        System.out.println("for");
       for (int j=0 ;j<10;j++)
       {
           System.out.print(j +" ");
       }

       int num=265;
       int x=num%10;
       System.out.println(x);
        System.out.println("while");
        int n=10;
        while(n>0){
           System.out.println(n);
           n--;
        }
       int count=0;
        double paper=0.1;
        int zf=8844430;
        while(paper<=zf){
            paper*=2;
                    count++;
        }
       System.out.println(count);
        int j=0;
        do {
            System.out.println(j);

        }while(j>0);
//        跳转控制语句
        for (j=0;j<10;j++){
            if (j==2){
               continue;//跳过该次循环
            }
            if(j==5){
                break;//直接退出循环
            }
            System.out.println(j);
        }
       Random r=new Random();//创建对象
        int number=r.nextInt(10);//获取随机数
        System.out.println(number);
//键盘录入
        Scanner sc=new Scanner(System.in);//创建对象
        System.out.print("请输入:");
        int m=sc.nextInt();//使用变量接受数据

        System.out.println(m);


    }

}

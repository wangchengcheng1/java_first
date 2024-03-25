// 导包的动作必须要在类上面
import java.util.Scanner;

public class HelloWorld {

  public static void main(String[] args) {
    /* long b=9999999999L;
        System.out.println(b); */
    // 创建对象
    Scanner sc = new Scanner(System.in);
    // 接收数据
    System.out.println("输入第一个数字！");
    int i = sc.nextInt();
    System.out.println(i);
    System.out.println("输入第二个数字！");
    int i2 = sc.nextInt();
    // System.out.println("和是",i+i2);报错
    int i3 = i + i2;
    System.out.println(i3);
  }
}

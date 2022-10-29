import java.util.*;
class Num
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        float ave=((float)(a+b)/2);
        System.out.printf("%.4f",ave);
    }
}
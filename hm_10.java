import java.util.Scanner;
public class hm_10 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        
        System.out.print("華氏溫度=");
        double f=scn.nextDouble();
        double a=((f-32)*5/9);
        System.out.printf("攝氏溫度= %.1f\n" ,a);
        scn.close();
    }
}

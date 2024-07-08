import java.util.Scanner;
public class hm_07 {
    public static void main(String[] args){
        double pi=3.14;
        Scanner scn=new Scanner(System.in);
        System.out.print("半徑=");
        double r=scn.nextDouble();
        System.out.print("面積="+r*r*pi);
        scn.close();

    }
}

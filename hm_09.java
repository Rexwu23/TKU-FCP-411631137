import java.util.Scanner;
public class hm_09 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
            System.out.print("長:");
            double l=scn.nextDouble();
            System.out.print("寬:");
            double i=scn.nextDouble();
            System.out.println("面積="+(l*i));
            scn.close();


    }
}

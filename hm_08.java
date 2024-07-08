import java.util.Scanner;
public class hm_08 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.print("姓名 ");
        String name=scn.next();
        System.out.print("年齡 ");
        int age=scn.nextInt();
        System.out.print("城市 ");
        String city=scn.next();
        System.out.print(name+", "+age+"years old, "+city);
        scn.close();


    }
}

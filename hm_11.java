import java.util.Scanner;
public class hm_11 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.print("第一件物品價格=");
        int p=scn.nextInt();
        System.out.print("第二件物品價格=");
        int q=scn.nextInt();
        System.out.print("第三件物品價格=");
        int o=scn.nextInt();
        System.out.print("總價="+(p+q+o));
        scn.close();
    }
}

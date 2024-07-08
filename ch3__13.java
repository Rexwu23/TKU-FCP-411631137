import java.util.Scanner;
public class ch3__13 {

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);



        System.out.print("What is your name?");
        String name=scn.next();
        System.out.print("How old are you? ");
        int age=scn.nextInt();
        System.out.print(name+" "+ age+ ":Years old.");
        scn.close();
    }
}

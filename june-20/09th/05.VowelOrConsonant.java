import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char v = scan.next().charAt(0);
       switch(v){
           case 'a' :
           case 'e' :
           case 'i' :
           case 'o' :
           case 'u' :
                System.out.print("V");
                break;
        default:
        System.out.print("C");

       }
    }
}

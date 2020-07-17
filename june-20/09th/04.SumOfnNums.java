import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int testCase = scan.nextInt();
        for(int i=1;i<=testCase;i++){
            int num = scan.nextInt();
            int total = 0;
            while(num>0){
                total=total+num;
                num=num-1;
            }
            System.out.println(total);
        }
      
    }
}

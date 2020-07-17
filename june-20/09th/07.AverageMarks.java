import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numOfStudents = scan.nextInt();
        int total = 0;
        for(int i=1; i<=numOfStudents; i++){
            int temp = scan.nextInt();
            total=total+temp;
        }
        System.out.print(total/numOfStudents);
    }
}

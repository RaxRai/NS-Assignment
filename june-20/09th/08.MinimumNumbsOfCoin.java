import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        int totalNotes = 0;
        for(int i=1; i<=testCases; i++){
            int amount = scan.nextInt();
            int temp=0;
            // 2000 notes
            temp = amount/2000;
            amount = amount%2000;
            totalNotes += temp;
            // 500 notes
            temp = amount/500;
            amount = amount%500;
            totalNotes += temp;
            // 200 notes
            temp = amount/200;
            amount = amount%200;
            totalNotes += temp;
            // 100 notes
            temp = amount/100;
            amount = amount%100;
            totalNotes += temp;
            // 50 notes
            temp = amount/50;
            amount = amount%50;
            totalNotes += temp;
            // 20 notes
            temp = amount/20;
            amount = amount%20;
            totalNotes += temp;
            // 10 notes
            temp = amount/10;
            amount = amount%10;
            totalNotes += temp;
            // 5 notes
            temp = amount/5;
            amount = amount%5;
            totalNotes += temp;
            // 2 notes
            temp = amount/2;
            amount = amount%2;
            totalNotes += temp;
            // 1 notes
            temp = amount/1;
            totalNotes += temp;
            

            System.out.println(totalNotes);
            totalNotes=0;
        }
    }
}

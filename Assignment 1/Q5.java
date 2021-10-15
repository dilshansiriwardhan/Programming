import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int continues = 1;

        do{
            System.out.print("Enter a Number :  ");
            String number = scan.nextLine();
            int n = Integer.parseInt(number);
            System.out.println("Square of the Number : " + n*n );

            System.out.print("Do you wish to perform the operation again ? (yes/no) :  ");
            String again = scan.nextLine();
            if(again.equals("no")){
                continues = 0;
            }

        }while( continues == 1);
        scan.close();
    }
}

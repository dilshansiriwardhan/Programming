import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Year  : ");
        String y = scan.nextLine(); 

        System.out.print("Enter the Month : ");
        String m = scan.nextLine();
        
        int month = Integer.parseInt(m);
        int year = Integer.parseInt(y);
        int numberOfDays = 0;

        if(month == 2){
            numberOfDays = 28 + (year % 4 == 0 ? 1 : 0) - (year % 100 == 0 ? 1 : 0) + (year % 400 == 0 ? 1 : 0);
        }else{
            numberOfDays = 30 + ( month < 8 ?  (month % 2 == 0 ? 0 : 1) : (month % 2 == 0 ? 1 : 0 ));
        }
  
        System.out.print( "Number of Days  : " + numberOfDays );       

        scan.close();
        
    }
}

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input  : " );
        String userInput = scan.nextLine();
        String output = "";

        for( int i = 0 ; i < userInput.length(); i++ ){
            if(userInput.charAt(i) == '1' ){
                output += "0";
            }else{
                output += "1";
            }
        
        }
        
        System.out.println("Output : " + output);
        scan.close();

    }
}

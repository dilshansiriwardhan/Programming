import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the SubString : ");
        String sub = scan.nextLine();

        System.out.print("Enter the    String : ");
        String sequence = scan.nextLine();

        int count = 0;

        for (int i = 0; i < sequence.length() - sub.length() + 1; i++) {
             if (sequence.substring(i, i + sub.length()).equals(sub)) {
                 count += 1;
            }
        }

        System.out.println("Number of occurrences of "+ sub + " : " + count);
        scan.close();

    }
}

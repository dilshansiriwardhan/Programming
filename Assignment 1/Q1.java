public class Q1{
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;
        
        for(int i = 2;  i < 100; i++){
            if( i % 2 == 0){
                even += i;

            }else{
                odd += i;
            }
        }

        System.out.println("Sum of Even = " + even);
        System.out.println("Sum of Odd  = " + odd);
    }
    
}

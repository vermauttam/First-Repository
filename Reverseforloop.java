import java.util.Scanner;

public class Reverseforloop 


{

    public static void main(String args[])
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = myObj.nextInt();
        int rev = 0;
        
        for (;num!=0;){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num/ 10;
        }

        System.out.println(rev);
        

    }
    
}

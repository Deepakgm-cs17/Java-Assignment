import java.util.Scanner;

class QuotientException extends Exception{
    public QuotientException(String message){
        super(message);
    }
}

public class problemSeven {

    static int quotient(int dividend, int divisor) throws QuotientException {
            if (dividend < divisor)
                throw new QuotientException("User Defined Exception : Quotient will be less than Zero.");
            return dividend / divisor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Dividend and divisor : ");
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        try{
            int quotient = quotient(dividend,divisor);
            System.out.print("Quotient of " + dividend + "/" + divisor +" is " + quotient + ".");
        }catch (Exception e){
            System.out.print(e.getMessage());
        }
    }
}

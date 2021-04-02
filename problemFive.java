import java.util.Scanner;

public class problemFive {

    static boolean palindrome(String str){
        if( str.length() == 0  || str.length() == 1 )
            return true;

        if( str.charAt(0) == str.charAt( str.length() - 1 ) )
            return palindrome(str.substring(1,str.length() - 1));

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        if(palindrome(str)){
            System.out.print( str + " is Palindrome.");
        }else {
            System.out.print( str + " not a Palindrome.");
        }
    }
}

import java.util.Scanner;

public class problemOne {

    static void gradePoints(int[] marks){
        int sum = 0;
        for(int mark : marks){
            sum += mark;
        }

        int averageMark = sum / marks.length;

        if(averageMark >= 80){
            System.out.println("Your Grade is A");
        }else if( averageMark < 80 && averageMark >= 60 ) {
            System.out.println("Your Grade is B");
        }else if( averageMark < 60 && averageMark >= 40 ){
            System.out.println("Your Grade is C");
        }else{
        System.out.println("Your Grade is D");
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter Five subject Marks:");
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        for(int i = 0 ; i < 5 ; i++){
            marks[i]=sc.nextInt();
        }
        gradePoints(marks);
    }
}

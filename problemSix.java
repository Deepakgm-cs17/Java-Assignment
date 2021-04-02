import java.util.Scanner;

public class problemSix {

    static void alphabeticalSorting(String[] arrayString){
        String temp;
        for (int i = 0 ; i < arrayString.length ; i++){
            for (int j = i + 1 ; j < arrayString.length ; j++){
                if( ( arrayString[i].compareTo(arrayString[j]) ) > 0){
                    temp = arrayString[i];
                    arrayString[i] = arrayString[j];
                    arrayString[j] = temp;
                }
            }
        }
        System.out.print("Sorted Order : ");
        for (String str : arrayString){
            System.out.print(str + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int size = sc.nextInt();
        String[] arrayString = new String[size];
        System.out.print("Enter " + size + " String : ");
        for (int i = 0 ; i < size ; i++ ){
            arrayString[i] = sc.next();
        }
        alphabeticalSorting(arrayString);
    }
}

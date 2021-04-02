import java.util.Scanner;

public class problemThree {

    static int binarySearch(int[] arrayNum,int start,int last,int find){
        if (last >= start) {
            int mid = start + (last - start) / 2;
            if (arrayNum[mid] == find)
                return mid;
            if (arrayNum[mid] > find)
                return binarySearch(arrayNum, start, mid - 1, find);
            return binarySearch(arrayNum, mid + 1, last, find);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array Size : ");
        int size = sc.nextInt();
        int[] arrayNum = new int[size];
        System.out.print("Enter "+ size +" elements : ");
        for(int i = 0 ; i < size ; i++){
            arrayNum[i]= sc.nextInt();
        }
        System.out.print("Enter the Number to Find : ");
        int find = sc.nextInt();
        int element = binarySearch(arrayNum,0,size-1,find);
        if(element == -1)
            System.out.println("Element " + find + " not found.");
        else
            System.out.println("Element "+ find +" found at index "+ element +".");
    }
}

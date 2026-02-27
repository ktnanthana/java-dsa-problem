//TC:O(n) SC:O(1)
import java.util.Scanner;
public class secondLargest {
    public static int secondMaximum(int size,int[] arr){
        int max = -1;
        int secondMax = -1;
        for(int i=0;i<size;i++){
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i]>secondMax){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        int res = secondMaximum(size,arr);
        System.out.println("The second largest element is:"+res);
    }
}

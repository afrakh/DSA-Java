import java.util.*;

public class bubbleSort{
    public static void bubbleSorting(int arr[]){
        for (int turn = 0; turn < arr.length - 1; turn++){
            for (int j = 0; j < arr.length - 1 - turn; j++){
                if (arr[j] > arr[j + 1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        int arr[] = {4, 8, 1, 3, 9, 10, 5, 7, 0, 2, 6};
        bubbleSorting(arr);
        printArray(arr);
    }
}
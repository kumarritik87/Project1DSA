package solutionTask1;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayOperation {
    Scanner sc = new Scanner(System.in);
   public void Insert(int arr[]) {
        System.out.println("Enter the position to insert the element");
        int pos = sc.nextInt();
        System.out.println("Enter the value to insert in array :");
        int value = sc.nextInt();
        for (int j = arr.length - 1; j > pos; j--) {
            arr[j] = arr[j - 1];
        }
        arr[pos] = value;
        System.out.println("array after insert value is : " + Arrays.toString(arr));
    }
    public void Deletion(int arr[]) {
        System.out.println("Enter the index of value  to delete : ");
        int index = sc.nextInt();
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.println("Array after deletion of value is " + Arrays.toString(arr));
    }

    public void sort(int arr[]) {
        int temp;
        System.out.println("Array is : " + Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        System.out.println("Sorted array is " + Arrays.toString(arr));

    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the " +i+" value of an array : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is " + Arrays.toString(arr));
        ArrayOperation ao = new ArrayOperation();
        System.out.println("Enter 1 for Insert \n 2 for delete \n 3 for sort the array \n");
        int choice = sc.nextInt();
        if (choice == 1) {
            ao.Insert(arr);
        } else if (choice == 2) {
            ao.Deletion(arr);
        } else if (choice == 3) {
            ao.sort(arr);
        } 
        else if (choice == 4) {
            ao.searching(arr);
        }
        else{
          System.out.println("Enter a valid number ");
    }
}


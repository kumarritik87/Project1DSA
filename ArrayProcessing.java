package solutionTask1;
import java.util.Scanner;

public class ArrayProcessing {
   static int arr[] = new int[10];
   public void Ans1() {
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println("\n");
    }
    public void Ans3a(){
        int arr[] ={1,2,3,4,5,6,7,8,9,10};
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println("\n");
    }
    public void Ans3c(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<arr.length; i++){
            System.out.println("Enter the "+i+" element of Array:-  ");
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public void Ans5(){
        int a = 0;
        int arr[] = {1,4,6,5,7,1,2,3,21,3};
        for(int i = 0; i<arr.length; i++){
            a = a + arr[i];
        }
       
        System.out.println("\n");
        int b = a/(arr.length);
        System.out.println("sum of Array element = "+a);
        System.out.println("Average =  "+b);
    }

    public static void main(String[] args) {
        ArrayProcessing ap = new ArrayProcessing();
        ap.Ans1();
        ap.Ans3a();
        ap.Ans3c();
        ap.Ans5();
    }
}

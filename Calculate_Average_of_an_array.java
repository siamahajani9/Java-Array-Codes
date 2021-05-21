import java.util.*;
class Main {
  public static void main(String[] args) {
   Scanner scn = new Scanner(System.in);
   System.out.println("Enter a number to check the length of an array");
   int average = 0;
   int sum = 0;
   int size = scn.nextInt();
   System.out.println("Enter array elements");
   int[] arr = new int [size];
   for (int i = 0; i < size ; i++) {
arr[i] = scn.nextInt(); 
sum = sum+arr[i];
   }
   for (int i = 0; i < size; i++){
System.out.print(arr[i] + " ");
   }
   System.out.println(" ");
   System.out.println("This is the sum of all numbers you had entered =" + " " + sum);
   average = sum/size;
   System.out.println("This is your calculated average = " + average);
  }
}
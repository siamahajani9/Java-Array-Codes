import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner ah = new Scanner (System.in);
    System.out.println("Enter length of Array");
  //int[] arrr = {98,56,74};
  int size = ah.nextInt();
  int[] arrr = new int [size];
  System.out.println("Enter array elements");
  for (int i = 0; i < size; i++){
  arrr[i] = ah.nextInt();
  }
  for (int i = 0; i < size; i++){
  System.out.print(arrr[i] + " ");  
  }
  }
}
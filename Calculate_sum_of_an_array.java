import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner (System.in);
    System.out.println("enter length of array");
    int l = scn.nextInt();
    System.out.println("enter array elements");
    int[] ars = new int [l];
    for (int i = 0; i < l; i++){
  ars[i] = scn.nextInt();
    }
    System.out.println("This is your calculated sum of all numbers you entered");
    int sum = 0;
    for (int r = 0; r < l; r++){
      sum = ars[r]+sum;
    }
    System.out.println(sum);
    for (int i = 0; i < l; i++){
      System.out.print(ars[i] + " ");
    }
  }
}
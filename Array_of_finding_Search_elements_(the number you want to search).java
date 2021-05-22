import java.util.*;
class Main {
  public static void main(String[] args) {
Scanner bee = new Scanner (System.in);
System.out.println("Enter a number for the length of array");
int size = bee.nextInt();
int[] arrrr = new int [size];
System.out.println("Enter array elements"); 
for (int i = 0; i < size; i++){
arrrr[i] = bee.nextInt();
}
System.out.println("Please enter a Search element");
int search_element = bee.nextInt();
for (int i = 0; i < arrrr.length; i++){
  if (search_element == arrrr[i]){
System.out.println("The number you were searching for exists at " + (i+ 1));
  }
}
}
  }
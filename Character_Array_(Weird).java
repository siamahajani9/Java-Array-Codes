class Main {
  public static void main(String[] args) {
Scanner fine = new Scanner (System.in);
System.out.println("Enter some characters without spaces (i know.. that's weird)");
char[] a = fine.next().toCharArray();
for (int i = 0;i < a.length;i++){
  System.out.print(a[i] + " ");
}
  }
}
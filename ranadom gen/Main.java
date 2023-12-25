import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter how many numbers you want to enter");
    int n= sc.nextInt();
    int[] v = new int[n];
    int rand = (int)(Math.random()*v.length);
    
    int i;
    
    for(i=0; i<n; i++){
      System.out.println("Enter a number: ");
      v[i]= sc.nextInt();
    }
    System.out.println("The number "+ v[rand]+ " was drawn " );

  }}

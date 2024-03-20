import java.util.Scanner;

public class Main {
public static void main(String[] args) 
{
   int min=100000;
   int[] liczba = new int[5];
   Scanner scanner = new Scanner(System.in);
   for(int i=0;i<5;i++)
     {
       liczba[i] = scanner.nextInt();
     }
   for(int i=0;i<5;i++)
     {
       if(liczba[i]<min) min=liczba[i];
     }
  System.out.println(min);
}
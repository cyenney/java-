//Cody Yenney


import java.util.Scanner;

public class squareDisplay
{
  public static void main(String[] args)
  {
    int input;

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a number no greater than 15.");

    input = scan.nextInt();

    for (int i = 0; i <= input; i++)
    {
      for (int j = 0; j <= input; j++)
      {
        System.out.print("X");
      }
      System.out.print("\n\n");
    }


  }
}

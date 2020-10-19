import java.util.Scanner;

public class sumOfNumbers
{
  public static void main(String[] args)
  {
    System.out.println("Enter a number to find the sum of all numbers up to it.");

    Scanner scan = new Scanner(System.in);
    String str;
    int input;
    str = scan.nextLine();
    input = Integer.parseInt(str);
    int total = 0;
    int temp = 0;

    for (int i = 0; i <= input; i++)
    {

      total += i;
    }

    System.out.println(total);
  }
}

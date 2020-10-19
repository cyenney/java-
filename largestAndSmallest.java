import java.util.Scanner;

public class largestAndSmallest
{
  public static void main(String[] args)
  {
    System.out.println("Enter a series of numbers, 1 number at a time, and Make sure the last number entered is '-99'. I'll tell you the largest and smallest number.");

    Scanner scan = new Scanner(System.in);

    int stopper = -99;

    int input;
    input = scan.nextInt();

    int small = input;
    int large = input;

    while (input != stopper)
    {
      if( input < small)
      {
        small = input;
      }
      else if( input > large)
      {
        large = input;
      }
      input = scan.nextInt();
    }

    System.out.println("The biggest number is " + large);
    System.out.println("The smallest number is " + small);
  }
}

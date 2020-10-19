// Cody Yenney

//bank charges

import java.util.Scanner;

public class bankCharges
{
  public static void main(String[] args)
  {
    System.out.println("Enter the number of checks you've written for the month.");
    Scanner scan = new Scanner(System.in);
    String str;
    int numChecks;
    double serviceFee;
    str = scan.nextLine();
    numChecks = Integer.parseInt(str);

    if(numChecks < 20)
    {
      serviceFee = .1 * numChecks;
    }

    else if(numChecks > 19 && numChecks < 40)
    {
      serviceFee = .08 * numChecks;
    }

    else if(numChecks >= 40 && numChecks <= 59)
    {
      serviceFee = .06 * numChecks;
    }

    else
    {
      serviceFee = .04 * numChecks;
    }

    System.out.println(serviceFee);


  }
}

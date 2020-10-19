//Cody Yenney

//roman numerals

import java.util.Scanner;


public class romanNumerals
{
  public static void main (String[] args)
  {
    System.out.println("Enter a number 1 - 10 to see the roman numeral version.");
    Scanner in = new Scanner(System.in);

    int input = in.nextInt();

    if (input == 1)
    {
      System.out.println("I");
    }
    else if (input == 2)
    {
      System.out.println("II");
    }
    else if (input == 3)
    {
      System.out.println("III");
    }
    else if (input == 4)
    {
      System.out.println("IV");
    }
    else if (input == 5)
    {
      System.out.println("V");
    }
    else if (input == 6)
    {
      System.out.println("VI");
    }
    else if (input == 7)
    {
      System.out.println("VII");
    }
    else if (input == 8)
    {
      System.out.println("VII");
    }
    else if (input == 9)
    {
      System.out.println("IX");
    }
    else if (input == 10)
    {
      System.out.println("X");
    }
    else
    {
      System.out.println("You didnt enter a number between 1 and 10!!!!");
    }

  }

}

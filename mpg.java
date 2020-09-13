import java.util.Scanner;


// Cody Yenney


public class mpg
{
  public static void main (String[] args)
  {

    System.out.println("Enter the number of miles driven.");
    Scanner in = new Scanner(System.in);
    int miles = in.nextInt();
    System.out.println("Enter the gallons of gas used.");
    int gallons = in.nextInt();

    int milesGallon = miles/gallons;

    System.out.println("Your miles per gallon is " + milesGallon);

  }


}

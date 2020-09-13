import java.util.Scanner;

// Cody Yenney

public class sManipulator
{
  public static void main (String[] args)
  {

    System.out.println("Enter the name of your favorite city.");
    Scanner in = new Scanner(System.in);
    String city = in.nextLine();
    int count = 0;

    for (int i = 0; i < city.length(); i++)
    {
      if(city.charAt(i) != ' ')
      {
        count++;
      }
    }

    int c = 0;
    System.out.println(count);
    System.out.println(city.toUpperCase());
    System.out.println(city.toLowerCase());
    System.out.println(city.charAt(c));




  }


}

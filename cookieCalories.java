import java.util.Scanner;


// Cody Yenney


public class cookieCalories
{
  public static void main (String[] args)
  {

    System.out.println("Enter how many cookies you ate, and I'll calculate the calories.");
    Scanner in = new Scanner(System.in);
    int input = in.nextInt();
    int cookie = 75;

    int cals = cookie * input;

    System.out.println(cals);

  }


}

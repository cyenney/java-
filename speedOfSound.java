//Cody Yenney
//Speed of sound

import java.util.Scanner;

public class speedOfSound
{
  public static void main(String[] args)
  {
    System.out.println("Enter the element you want to calculate the speed of sound.");
    Scanner scan = new Scanner(System.in);
    String medium = scan.nextLine();
    System.out.println("Now enter the distance.");
    String str;
    int distance;
    str = scan.nextLine();
    distance = Integer.parseInt(str);

    int time = 0;

    if(medium.equals("air"))
    {
      time = distance * 1100;
    }

    else if(medium.equals("water"))
    {
      time = distance * 4900;
    }

    else
    {
      time = distance * 16400;
    }

    System.out.println(time);


  }



}

//Cody Yenney


//celsiusTemperatureTable

public class celsiusTemperatureTable
{
  public static void main(String[] args)
  {
    System.out.println("F: C");
    for (double farenheit = 0; farenheit <=20; farenheit++)
    {
      double celsius = convertToCelsius(farenheit);
      System.out.println(farenheit + " " + celsius);
    }

  }
  static double convertToCelsius(double farenheit)
  {

    return (5. / 9.) * farenheit -32;




  }
}

package edu.cnm.deepdive;

import java.util.Scanner;

public class TempConverter { //highlight and click on refactor > rename, this will let you rename the class without any problems.

  //right click on the class of the same name over in the project viewer and click move. this will let you move it into a new
  //edu.cnm.deepdive package.
  private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    boolean repeat;

    do {
      double fahrenheit;
      double celsius;
      System.out.print("Enter a temperature in fahrenheit:");
      fahrenheit = input.nextDouble();
      celsius = (fahrenheit - 32) * 5 / 9;
      System.out.println(celsius);
      System.out.print("Convert another? true or false:");
      repeat = input.nextBoolean();
    } while (repeat);
  }
}

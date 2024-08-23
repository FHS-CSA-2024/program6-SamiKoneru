import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        final double pi = 3.14159;
        double radius = 0;
        double diameter = 0;
        double area = 0;
        double circumference = 0;    //declared all variables, set to 0 except pi
      
        Scanner myObj = new Scanner(System.in);    //new scanner
      
        System.out.println("Enter your radius:");    //takes input
        radius = myObj.nextDouble();
      
        diameter = (int) (radius * 2 * 1000 + 0.5) / 1000.0;    //does all the math, multiply by 1000, add 0.5, and make it int to round up/down at the thousandths, then divide by 1000
        area = (int) (pi * radius * radius * 1000 + 0.5) / 1000.0;
        circumference = (int) (2 * pi * radius * 1000 + 0.5) / 1000.0;
        radius = (int) (radius * 1000 + 0.5) / 1000.0;
      
        System.out.println("The radius of the circle is " + radius);    //print everything
        System.out.println("The diameter of the circle is " + diameter);
        System.out.println("The area of the circle is " + area);
        System.out.print("The circumference of the circle is " + circumference);
        
    }
}

//Paste console output below:
/*
Enter your radius:
3.712
The radius of the circle is 3.712
The diameter of the circle is 7.424
The area of the circle is 43.288
The circumference of the circle is 23.323

*/

import java.util.Scanner;

/*
 *  Section 2.2-2.12
 *  2.19
 * */
public class Main {
    public static void main(String[] args) {
        // Create Scanner
        var in = new Scanner(System.in);
        // Ask user to Enter the six Point
        System.out.print("Enter Three Point for a Triangle : ");
        //( X1,Y1 )
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        // ( X2 ,Y2 )
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        // ( X3 , Y3 )
        double x3 = in.nextDouble();
        double y3 = in.nextDouble();
        // first sum between group 1 and 2
        double side1 = DistanceBetweenToPoint(x1, y1, x2, y2);
        // Second sum between group 2 and 3
        double side2 = DistanceBetweenToPoint(x2, y2, x3, y3);
        // third sum between group 1 and 3
        double side3 = DistanceBetweenToPoint(x1, y1, x3, y3);

        // The Formula of s
        double s = (side1 + side2 + side3) / 2;
        // The Formula of Area
        double area = Math.pow(((s * (s - side1)) * (s - side2) * (s - side3)), 0.5);
        System.out.printf("The area of the Triangle is %s", area);

    }

    // make distance between tow point
    static double DistanceBetweenToPoint(double x1, double y1, double x2, double y2) {
        // Calc Distance between two Point
        return Math.pow((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)), 0.5);

    }

}
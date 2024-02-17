import java.util.Scanner;

public class PracticalNo3 {
    public static void main(String[] args) {
        VolumeCalculator calculator = new VolumeCalculator();

          Scanner scanner = new Scanner(System.in);

     

        // Volume of a cube with side length 5
        System.out.println("For Cube");
        System.out.println("-----------------------------------------------------------------");
        System.out.print("Enter the side of the cube: ");
        Double sideLength = scanner.nextDouble();
        Double cubeVolume = calculator.calculateVolume(sideLength);
        System.out.println("Volume of cube: " + cubeVolume);
        System.out.println("");
        // Volume of a cylinder with radius 3 and height 4
        System.out.println("For Cylinder");
        System.out.println("-----------------------------------------------------------------");
        System.out.print("Enter the radius of the cylinder: ");
        Double radius = scanner.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        Double height = scanner.nextDouble();
        Double cylinderVolume = calculator.calculateVolume(radius, height);
        System.out.println("Volume of cylinder: " + cylinderVolume);
        System.out.println("");

        // Volume of a box with length 2, width 3, and height 4
        System.out.println("For Box");
        System.out.println("-----------------------------------------------------------------");
        System.out.print("Enter the length of box: ");
        Double blength = scanner.nextDouble();
        System.out.print("Enter the width of the box: ");
        Double width = scanner.nextDouble();
        System.out.print("Enter the height of the box: ");
        Double bheight = scanner.nextDouble();
        Double boxVolume = calculator.calculateVolume(blength,width,bheight);
        System.out.println("Volume of box: " + boxVolume);
    }

    
}
 class VolumeCalculator {
    
    // Method to calculate the volume of a cube
    public Double calculateVolume(Double sideLength) {
        return sideLength * sideLength * sideLength;
    }
    
    // Method to calculate the volume of a cylinder
    public Double calculateVolume(Double radius, Double height) {
        return Math.PI * radius * radius * height;
    }
    
    // Method to calculate the volume of a box
    public Double calculateVolume(Double length, Double width, Double height) {
        return length * width * height;
    }

    
}

import java.util.Scanner;

public class Volume {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder: ");
        double radius = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the height of the cylinder: ");
        double height = Double.parseDouble(scanner.nextLine());

        Double volume = Math.PI * radius * radius * height;
        System.out.println(volume);

    }
}

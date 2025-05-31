package uapmains;

import java.util.Scanner;
import uapmodels.Torus;
import uapmodels.Sphere;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.print("NAMA LENGKAP: ");
        String nama = scanner.nextLine();
        System.out.print("NIM: ");
        String nim = scanner.nextLine();

        System.out.println("=========================================");
        System.out.println("Donat dengan lubang");
        System.out.println("=========================================");
        System.out.print("Isikan Radius: "); 
        double R = scanner.nextDouble();
        System.out.print("Isikan radius: "); 
        double r = scanner.nextDouble();

        Torus torus = new Torus(R, r);
        torus.setName("Donat dengan lubang");
        System.out.println("=========================================");
        torus.printInfo();

        System.out.println("=========================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("=========================================");
        System.out.print("Isikan radius: ");
        double radius = scanner.nextDouble();

        Sphere sphere = new Sphere(radius);
        sphere.setName("Donat tanpa lubang");
        System.out.println("=========================================");
        sphere.printInfo();

        scanner.close();
    }
}

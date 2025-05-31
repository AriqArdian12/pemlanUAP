package uapmodels;

import uapbases.Shape;
import uapinterface.MassCalculable;
import uapinterface.MassConverter;
import uapinterface.PiRequired;
import uapinterface.ShippingCostCalculator;
import uapinterface.ThreeDimensional;

public class Sphere extends Shape implements ThreeDimensional, PiRequired, MassCalculable, MassConverter, ShippingCostCalculator {
    private double radius;

    public Sphere() {
        this.radius = 0;
    }

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * PI * radius * radius * radius;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * PI * radius * radius;
    }

    @Override
    public double getMass() {
        return DENSITY * getSurfaceArea() * THICKNESS;
    }

    @Override
    public double gramToKilogram() {
        return Math.ceil(getMass() / DENOMINATOR);
    }

    @Override
    public double calculateCost() {
        return gramToKilogram() * PRICE_PER_KG;
    }

    @Override
    public void printInfo() {
        System.out.println("Volume: " + getVolume());
        System.out.println("Luas permukaan: " + getSurfaceArea());
        System.out.println("Massa: " + getMass());
        System.out.println("Massa dalam kg: " + (int) gramToKilogram());
        System.out.println("Biaya kirim: Rp" + (int) calculateCost());
    }
}

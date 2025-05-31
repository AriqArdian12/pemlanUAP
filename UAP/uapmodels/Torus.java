package uapmodels;

import uapbases.Shape;
import uapinterface.MassCalculable;
import uapinterface.MassConverter;
import uapinterface.PiRequired;
import uapinterface.ShippingCostCalculator;
import uapinterface.ThreeDimensional;

public class Torus extends Shape implements ThreeDimensional, PiRequired, MassCalculable, MassConverter, ShippingCostCalculator {
    private double majorRadius;
    private double minorRadius;

    public Torus() {
        this.majorRadius = 0;
        this.minorRadius = 0;
    }

    public Torus(double majorRadius, double minorRadius) {
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    @Override
    public double getVolume() {
        return 2 * PI * PI * majorRadius * minorRadius * minorRadius;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * PI * PI * majorRadius * minorRadius;
    }

    @Override
    public double getMass() {
        return DENSITY * getSurfaceArea() * THICKNESS;
    }

    @Override
    public double gramToKilogram() {
        double mass = getMass();
        return Math.ceil(mass / DENOMINATOR); 
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
        System.out.println("Massa dalam kg: " +  gramToKilogram());
        System.out.println("Biaya kirim: Rp" +  calculateCost());
    }
}

package Basics;

public class TotalSurfaceAreaOfCuboid {
    public static void main(String[] args) {
        double length = 10;
        double width = 2;
        double height = 5;
        double surfaceArea = 2 * (length * width + width * height + height * length);
        System.out.println(surfaceArea);
    }
}

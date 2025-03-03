package pattern.creational;

import pattern.creational.model.Plane;

public class BuilderMain {
    public static void main(String[] args) {
        Plane plane = new Plane.Builder()
                .setLength(200)
                .setMilitary(false)
                .setType("Bowing")
                .build();
        System.out.println(plane.getLength());
        System.out.println(plane.getType());
        System.out.println(plane.isMilitary());
    }
}

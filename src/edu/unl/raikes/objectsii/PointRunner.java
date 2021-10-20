package edu.unl.raikes.objectsii;

public class PointRunner {
    public static void main(String[] args) {
        ValsPoint point = new ValsPoint(89, 19);

        ValsPoint point2 = new ValsPoint(15, 7);

        ValsPoint point3 = new ValsPoint();
        // point3.setY(3);
        System.out.println(point.toString());
        System.out.println(point2);
        System.out.println(point3);
    }
}

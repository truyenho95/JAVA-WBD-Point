package point.test;

import point.model.Point3D;

public class TestPoint3D {
  public static void main(String[] args) {
    Point3D point3D1 = new Point3D();
    Point3D point3D2 = new Point3D(-2,10.2f,9.5f);

    System.out.println(point3D1);
    System.out.println(point3D2);
  }
}

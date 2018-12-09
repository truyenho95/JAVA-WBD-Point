package point.test;

import point.model.Point2D;

public class TestPoint2D {
  public static void main(String[] args) {
    Point2D point2D1 = new Point2D();
    Point2D point2D2 = new Point2D(12,-5.5f);

    System.out.println(point2D1);
    System.out.println(point2D2);
  }
}

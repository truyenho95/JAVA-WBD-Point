package point.model;

public class Point3D extends Point2D {
  private float z;

  public Point3D() {
    super();
    this.z = 0.0f;
  }

  public Point3D(float x, float y, float z) {
    super(x, y);
    this.z = z;
  }

  public float getZ() {
    return z;
  }

  public void setZ(float z) {
    this.z = z;
  }

  public void setXYZ(float x, float y, float z) {
    this.setX(x);
    this.setY(y);
    this.z = z;
  }

  public float[] getXYZ() {
    float[] XYZArray = {this.getX(), this.getY(), this.getZ()};
    return XYZArray;
  }

  @Override
  public String toString() {
    return String.format("(%s,%s,%s)", this.getX(), this.getY(), this.getZ());
  }
}

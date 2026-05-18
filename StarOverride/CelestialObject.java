import java.util.Objects;

public class CelestialObject {
    public static final double KM_IN_ONE_AU = 150000000.0;

    private double x;
    private double y;
    private double z;
    private String name;

    public CelestialObject() {
        this.name = "Soleil";
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
    }

    public CelestialObject(String name, double x, double y, double z) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static double getDistanceBetween(CelestialObject object1, CelestialObject object2) {
        double distanceX = object2.getX() - object1.getX();
        double distanceY = object2.getY() - object1.getY();
        double distanceZ = object2.getZ() - object1.getZ();

        return Math.sqrt(distanceX * distanceX + distanceY * distanceY + distanceZ * distanceZ);
    }

    public static double getDistanceBetweenInKm(CelestialObject object1, CelestialObject object2) {
        return getDistanceBetween(object1, object2) * KM_IN_ONE_AU;
    }

    @Override
    public String toString() {
        return String.format("%s is positioned at (%.3f, %.3f, %.3f)", name, x, y, z);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof CelestialObject)) {
            return false;
        }

        CelestialObject other = (CelestialObject) object;
        return Double.compare(x, other.x) == 0
            && Double.compare(y, other.y) == 0
            && Double.compare(z, other.z) == 0
            && Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z, name);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

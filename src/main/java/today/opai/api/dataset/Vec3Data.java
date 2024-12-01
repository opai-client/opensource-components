package today.opai.api.dataset;

import today.opai.api.interfaces.dataset.Vector3d;

public class Vec3Data implements Vector3d {
    public double xCoord, yCoord, zCoord;

    public Vec3Data(double x, double y, double z) {
        this.xCoord = x;
        this.yCoord = y;
        this.zCoord = z;
    }

    @Override
    public double getX() {
        return xCoord;
    }

    @Override
    public double getY() {
        return yCoord;
    }

    @Override
    public double getZ() {
        return zCoord;
    }
}

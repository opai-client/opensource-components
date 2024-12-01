package today.opai.api.dataset;

import net.minecraft.util.MathHelper;
import today.opai.api.interfaces.dataset.Vector3d;
import today.opai.api.interfaces.game.entity.Entity;

import java.util.Objects;

public class PositionData implements Vector3d {

    private double x, y, z;

    public PositionData(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public PositionData(BlockPosition blockPos) {
        this.x = blockPos.getX();
        this.y = blockPos.getY();
        this.z = blockPos.getZ();
    }

    public PositionData(Entity entity) {
        this.x = entity.getPosition().getX();
        this.y = entity.getPosition().getY();
        this.z = entity.getPosition().getZ();
    }

    public void add(double x, double y, double z) {
        this.x += x;
        this.y += y;
        this.z += z;
    }

    public double distance(double toX, double toY, double toZ) {
        double xDiff = this.x - toX;
        double yDiff = this.y - toY;
        double zDiff = this.z - toZ;
        return MathHelper.sqrt_double((float) (xDiff * xDiff + yDiff * yDiff + zDiff * zDiff));
    }

    public double distance(PositionData toPositionData) {
        double xDiff = this.x - toPositionData.getX();
        double yDiff = this.y - toPositionData.getY();
        double zDiff = this.z - toPositionData.getZ();
        return MathHelper.sqrt_double((float) (xDiff * xDiff + yDiff * yDiff + zDiff * zDiff));
    }

    public PositionData createAdded(double x, double y, double z) {
        return new PositionData(this.x + x, this.y + y, this.z + z);
    }

    public PositionData add(PositionData positionData) {
        this.x += positionData.getX();
        this.y += positionData.getY();
        this.z += positionData.getZ();
        return this;
    }

    public void resetTo(Entity entity) {
        this.x = entity.getPosition().getX();
        this.y = entity.getPosition().getY();
        this.z = entity.getPosition().getZ();
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PositionData positionData = (PositionData) o;
        return Double.compare(positionData.x, x) == 0 && Double.compare(positionData.y, y) == 0 && Double.compare(positionData.z, z) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}

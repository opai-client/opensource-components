package today.opai.api.dataset;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import today.opai.api.interfaces.dataset.Vector3d;
import today.opai.api.interfaces.game.entity.Entity;

import java.util.Objects;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
public class PositionData implements Vector3d {

    private double x, y, z;

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
        return Math.sqrt((float) (xDiff * xDiff + yDiff * yDiff + zDiff * zDiff));
    }

    public double distance(PositionData toPositionData) {
        double xDiff = this.x - toPositionData.getX();
        double yDiff = this.y - toPositionData.getY();
        double zDiff = this.z - toPositionData.getZ();
        return Math.sqrt((float) (xDiff * xDiff + yDiff * yDiff + zDiff * zDiff));
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
}

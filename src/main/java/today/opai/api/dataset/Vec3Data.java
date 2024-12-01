package today.opai.api.dataset;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import today.opai.api.interfaces.dataset.Vector3d;

@AllArgsConstructor
@EqualsAndHashCode
public class Vec3Data implements Vector3d {
    public double xCoord, yCoord, zCoord;

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

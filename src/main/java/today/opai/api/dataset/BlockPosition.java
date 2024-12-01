package today.opai.api.dataset;

import today.opai.api.interfaces.dataset.Vector3i;

public class BlockPosition implements Vector3i {
    public int x, y, z;

    public BlockPosition(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getZ() {
        return z;
    }
}

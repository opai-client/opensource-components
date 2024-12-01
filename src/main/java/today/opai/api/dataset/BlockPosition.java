package today.opai.api.dataset;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import today.opai.api.interfaces.dataset.Vector3i;

@EqualsAndHashCode
public class BlockPosition implements Vector3i {
    @Getter
    public int x, y, z;

    public BlockPosition(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

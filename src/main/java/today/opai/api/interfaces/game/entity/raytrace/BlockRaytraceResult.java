package today.opai.api.interfaces.game.entity.raytrace;

import today.opai.api.dataset.BlockPosition;
import today.opai.api.dataset.Vec3Data;
import today.opai.api.enums.EnumDirection;

public interface BlockRaytraceResult extends RaytraceResult {
    BlockPosition getBlockPosition();
    EnumDirection getDirection();
    Vec3Data getHitVector();
}

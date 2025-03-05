package today.opai.api.interfaces.game.entity.raytrace;

import today.opai.api.dataset.Vec3Data;
import today.opai.api.interfaces.game.entity.Entity;

public interface EntityRaytraceResult extends RaytraceResult {
    Entity getEntity();
    Vec3Data getHitVector();
}

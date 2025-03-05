package today.opai.api.interfaces.game.entity;

import today.opai.api.dataset.BoundingBox;
import today.opai.api.dataset.PositionData;
import today.opai.api.dataset.RotationData;
import today.opai.api.dataset.Vec3Data;
import today.opai.api.enums.EnumDirection;
import today.opai.api.interfaces.dataset.Vector3d;

import java.util.UUID;

public interface Entity {
    Vector3d getMotion();

    void setMotion(Vec3Data motion);

    PositionData getPosition();

    PositionData getLastTickPosition();

    void setPosition(PositionData position);

    RotationData getRotation();

    void setRotation(RotationData rotation);

    float getFallDistance();

    void setFallDistance(float distance);

    boolean isOnGround();

    void setOnGround(boolean onGround);

    boolean isMoving();

    boolean isCollidedHorizontally();

    boolean isCollidedVertically();

    int getTicksExisted();

    String getName();

    String getDisplayName();

    boolean isInvisible();

    boolean inRange(double range);

    double getDistanceToPosition(PositionData position);

    UUID getUUID();

    EnumDirection getDirection();

    int getEntityId();

    BoundingBox getBoundingBox();

    boolean equals(Entity entity);
}

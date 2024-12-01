package today.opai.api.interfaces.managers;

import today.opai.api.dataset.RotationData;
import today.opai.api.interfaces.EventHandler;

public interface RotationManager {

    /**
     * Retrieves the current rotation data.
     *
     * @return The current {@link RotationData} object.
     */
    RotationData getCurrentRotation();

    /**
     * Applies the specified rotation data.
     * Make sure called in {@link EventHandler#onPlayerUpdate()}
     *
     * @param rotationData The {@link RotationData} object to apply.
     * @param speed        The angle rotations pre-tick (10 - 180)
     * @param correction   Correct movement when rotating, useful in Grim Anti Cheat
     */
    void applyRotation(RotationData rotationData, int speed, boolean correction);
}

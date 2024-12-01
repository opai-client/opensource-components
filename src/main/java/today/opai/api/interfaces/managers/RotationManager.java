package today.opai.api.interfaces.managers;

import today.opai.api.dataset.RotationData;

public interface RotationManager {
    RotationData getCurrentRotation();

    void applyRotation(RotationData rotationData, int speed, boolean correction);
}

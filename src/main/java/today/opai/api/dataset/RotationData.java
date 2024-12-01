package today.opai.api.dataset;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import today.opai.api.interfaces.dataset.Vector2f;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class RotationData implements Vector2f {

    private float yaw, pitch;
    public void add(RotationData rotationData) {
        this.yaw += rotationData.getYaw();
        this.pitch += rotationData.getPitch();
    }

    public RotationData createAdded(RotationData rotationData) {
        return new RotationData(this.yaw + rotationData.getYaw(), this.pitch + rotationData.getPitch());
    }

    @Override
    public float getX() {
        return yaw;
    }

    @Override
    public float getY() {
        return pitch;
    }
}

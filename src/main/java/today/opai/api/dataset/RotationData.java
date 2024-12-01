package today.opai.api.dataset;


import today.opai.api.interfaces.dataset.Vector2f;

public class RotationData implements Vector2f {

    private float yaw, pitch;

    public RotationData(float yaw, float pitch) {
        this.yaw = yaw;
        this.pitch = pitch;
    }

    public void add(RotationData rotationData) {
        this.yaw += rotationData.getYaw();
        this.pitch += rotationData.getPitch();
    }

    public RotationData createAdded(RotationData rotationData) {
        return new RotationData(this.yaw + rotationData.getYaw(), this.pitch + rotationData.getPitch());
    }

    public float getYaw() {
        return yaw;
    }

    public void setYaw(float yaw) {
        this.yaw = yaw;
    }

    public float getPitch() {
        return pitch;
    }

    public void setPitch(float pitch) {
        this.pitch = pitch;
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

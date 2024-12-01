package today.opai.api.events;

public class EventRender3D {
    private final float renderPartialTicks;

    public EventRender3D(float renderPartialTicks) {
        this.renderPartialTicks = renderPartialTicks;
    }

    public float getRenderPartialTicks() {
        return renderPartialTicks;
    }
}

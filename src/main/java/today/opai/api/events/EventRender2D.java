package today.opai.api.events;

import today.opai.api.interfaces.render.WindowResolution;

public class EventRender2D {
    private final WindowResolution windowResolution;
    private final float renderPartialTicks;

    public EventRender2D(WindowResolution windowResolution, float renderPartialTicks) {
        this.windowResolution = windowResolution;
        this.renderPartialTicks = renderPartialTicks;
    }

    public WindowResolution getWindowResolution() {
        return windowResolution;
    }

    public float getRenderPartialTicks() {
        return renderPartialTicks;
    }
}

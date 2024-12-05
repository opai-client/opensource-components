package today.opai.api.events;

import lombok.AllArgsConstructor;
import lombok.Getter;
import today.opai.api.interfaces.render.WindowResolution;

@AllArgsConstructor
@Getter
public class EventRender2D {
    private final WindowResolution windowResolution;
    private final float renderPartialTicks;
}

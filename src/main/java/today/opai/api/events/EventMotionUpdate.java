package today.opai.api.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import today.opai.api.enums.EnumEventStage;

@Getter
@Setter
@AllArgsConstructor
public class EventMotionUpdate {
    private double x,y,z;
    private float yaw,pitch;
    private boolean ground;
    private EnumEventStage stage;
}

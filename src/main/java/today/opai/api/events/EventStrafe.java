package today.opai.api.events;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class EventStrafe extends EventCancelable {
    private float forward;
    private float strafe;
    private float friction;
    private float yaw;
}

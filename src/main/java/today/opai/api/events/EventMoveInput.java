package today.opai.api.events;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class EventMoveInput {
    private float forward, strafe;
}

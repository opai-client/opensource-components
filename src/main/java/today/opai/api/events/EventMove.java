package today.opai.api.events;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class EventMove {
    private double x, y, z;

    public double getSpeed() {
        return Math.sqrt(x * x + z * z);
    }
}

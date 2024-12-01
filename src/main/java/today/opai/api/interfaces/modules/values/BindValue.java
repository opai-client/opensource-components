package today.opai.api.interfaces.modules.values;

import today.opai.api.interfaces.modules.Value;

public interface BindValue extends Value<Integer> {
    String getKeyName();

    boolean isPressed();
}

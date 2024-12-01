package today.opai.api.interfaces.modules.values;

import today.opai.api.interfaces.modules.Value;

public interface ModeValue extends Value<String> {
    int getModeCount();

    String[] getAllModes();

    boolean isCurrentMode(String mode);
}

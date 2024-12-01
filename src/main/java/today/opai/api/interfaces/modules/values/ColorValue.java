package today.opai.api.interfaces.modules.values;

import today.opai.api.interfaces.modules.Value;

import java.awt.*;

public interface ColorValue extends Value<Color> {
    boolean isAlphaAllowed();

    ColorValue setAlphaAllowed(boolean value);
}

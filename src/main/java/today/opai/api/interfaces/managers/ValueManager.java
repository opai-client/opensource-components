package today.opai.api.interfaces.managers;

import today.opai.api.interfaces.modules.values.*;

import java.awt.*;

public interface ValueManager {
    LabelValue createLabel(String name);

    BooleanValue createBoolean(String name, boolean checked);

    NumberValue createDouble(String name, double value, double minimum, double maximum, double step);

    ModeValue createModes(String name, String currentMode, String[] modes);

    ColorValue createColor(String name, Color color);

    BindValue createKeyBind(String name, int key);

    TextValue createInput(String name, String string);
}

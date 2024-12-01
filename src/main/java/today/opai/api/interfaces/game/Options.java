package today.opai.api.interfaces.game;

import today.opai.api.enums.EnumKeybind;

public interface Options {

    int getThirdPersonViewState();

    void setThirdPersonView(int personView);

    boolean isPressed(EnumKeybind key);

    void setPressed(EnumKeybind key, boolean pressed);

    float getMouseSensitivity();

    void setMouseSensitivity(float sensitivity);

    boolean isViewBobbing();

    void setViewBobbing(boolean stage);

    void setTimerSpeed(float speed);

    float getTimerSpeed();
}

package today.opai.api.interfaces.game;

import today.opai.api.enums.EnumKeybind;

/**
 * Interface for managing game options and settings.
 *
 * @author cubk
 * @since 1.0
 */
public interface Options {

    /**
     * Retrieves the current third-person view state.
     * Value 0: First-person view.
     * Value 1: Third-person view.
     * Value 2: Second-person view.
     *
     * @return The third-person view state.
     */
    int getThirdPersonViewState();

    /**
     * Sets the third-person view state.
     * Value 0: First-person view.
     * Value 1: Third-person view.
     * Value 2: Second-person view.
     *
     * @param personView The third-person view state to set.
     */
    void setThirdPersonView(int personView);

    /**
     * Checks if the specified key is pressed.
     *
     * @param key The key to check.
     * @return {@code true} if the key is pressed, {@code false} otherwise.
     */
    boolean isPressed(EnumKeybind key);

    /**
     * Sets the pressed state of the specified key.
     *
     * @param key The key to set.
     * @param pressed The pressed state to set.
     */
    void setPressed(EnumKeybind key, boolean pressed);

    /**
     * Retrieves the current mouse sensitivity.
     *
     * @return The mouse sensitivity.
     */
    float getMouseSensitivity();

    /**
     * Sets the mouse sensitivity.
     *
     * @param sensitivity The mouse sensitivity to set.
     */
    void setMouseSensitivity(float sensitivity);

    /**
     * Checks if view bobbing is enabled.
     *
     * @return {@code true} if view bobbing is enabled, {@code false} otherwise.
     */
    boolean isViewBobbing();

    /**
     * Sets the view bobbing state.
     *
     * @param stage The view bobbing state to set.
     */
    void setViewBobbing(boolean stage);

    /**
     * Sets the timer speed.
     *
     * @param speed The timer speed to set.
     */
    void setTimerSpeed(float speed);

    /**
     * Retrieves the current timer speed.
     *
     * @return The timer speed.
     */
    float getTimerSpeed();

    /**
     * Sets the force Unicode font state.
     *
     * @param forceUnicodeFont The force Unicode font state to set.
     */
    void setForceUnicodeFont(boolean forceUnicodeFont);

    /**
     * Checks if the Unicode font is forced.
     *
     * @return {@code true} if the Unicode font is forced, {@code false} otherwise.
     */
    boolean isForceUnicodeFont();

    int getGuiScale();

    void setGuiScale(int scale);

    float getFovSetting();

    void setFovSetting(float fovSetting);
}

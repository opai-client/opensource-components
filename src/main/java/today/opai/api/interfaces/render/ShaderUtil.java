package today.opai.api.interfaces.render;

import java.awt.*;

public interface ShaderUtil {
    void pushBlur();

    void popBlur(int radius);

    void pushBloom();

    void popBloom(int radius, Color color);

    void pushGradient(Color bottomLeft, Color topLeft, Color bottomRight, Color topRight);

    void popGradient();

    /**
     * WARNING: This method requires user enable "Blur" option in HUD Settings
     *
     * @param runnable the action to render with blur
     */
    void drawWithBlur(Runnable runnable);

    /**
     * WARNING: This method requires user enable "Bloom" option in HUD Settings
     *
     * @param runnable the action to render with bloom
     */
    void drawWithBloom(Runnable runnable);
}

package today.opai.api.interfaces.render;

import today.opai.api.dataset.BlockPosition;
import today.opai.api.dataset.BoundingBox;
import today.opai.api.features.ExtensionWidget;
import today.opai.api.interfaces.dataset.Vector2f;
import today.opai.api.interfaces.functions.WorldToScreenCallback;
import today.opai.api.interfaces.game.entity.Entity;
import today.opai.api.interfaces.game.entity.Player;
import today.opai.api.interfaces.game.item.ItemStack;

import java.awt.*;
import java.io.InputStream;

public interface RenderUtil {
    Image createImage(byte[] data);

    Image createImage(InputStream data);

    Image createImage(String base64Data);

    void renderWidgetBackground(ExtensionWidget widget);

    void worldToScreen(Entity entity, WorldToScreenCallback callback);

    void worldToScreen(BlockPosition position, WorldToScreenCallback callback);

    void worldToScreen(BoundingBox boundingBox, WorldToScreenCallback callback);

    Vector2f worldToScreen(float x, float y, float z);

    void drawRect(float x, float y, float width, float height, Color color);

    void drawLine(float x1, float y1, float x2, float y2, float width, Color color);

    void drawRoundRect(float x, float y, float width, float height, int radius, Color color);

    void drawShadow(float x, float y, float width, float height, float radius, Color color);

    void drawGradientRect(float x, float y, float width, float height, Color color, Color color2);

    void drawVerticalGradientRect(float x, float y, float width, float height, Color color, Color color2);

    long getDelta();

    void drawPlayerHead(float x, float y, float size, Player player);

    void drawRoundPlayerHead(float x, float y, float size, Player player, float radius);

    void drawBoundingBox(Entity entity, Color color);

    void drawItem(ItemStack itemStack, float x, float y);

    void drawItemNoCount(ItemStack itemStack, float x, float y);

    void drawStencil();

    void readStencil();

    void endStencil();

    boolean isFrameBufferWriting();

    float getPartialTicks();

    void drawBoundingBox(BoundingBox boundingBox,Color color);
}

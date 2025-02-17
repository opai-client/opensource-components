package today.opai.api.interfaces.render;

public interface Font {
    float drawString(String text, double x, double y, int color);

    float drawStringWithShadow(String text, double x, double y, int color);

    float drawCenteredString(String text, double x, double y, int color);

    void drawCenteredStringWithShadow(String text, double x, double y, int color);

    int getWidth(String text);

    int getHeight();

    void close();
}

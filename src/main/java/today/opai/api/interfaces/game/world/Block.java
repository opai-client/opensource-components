package today.opai.api.interfaces.game.world;

public interface Block {
    String getType();
    String getName();
    int getVariant();
    double getHeight();
    double getWidth();
    boolean isLiquid();
    boolean isSolid();
    boolean isOpaque();
    double getLength();
    boolean isTranslucent();
}
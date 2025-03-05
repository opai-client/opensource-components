package today.opai.api.interfaces.game.network.server;

public interface SPacket06UpdateHealth {
    float getHealth();
    float getSaturation();
    int getFoodLevel();
    void setHealth(float health);
    void setSaturation(float saturation);
    void setFoodLevel(int foodLevel);
}

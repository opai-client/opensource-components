package today.opai.api.interfaces.game.network.server;

import today.opai.api.interfaces.game.network.NetPacket;

public interface SPacket06UpdateHealth extends NetPacket {
    float getHealth();
    float getSaturation();
    int getFoodLevel();
    void setHealth(float health);
    void setSaturation(float saturation);
    void setFoodLevel(int foodLevel);
}

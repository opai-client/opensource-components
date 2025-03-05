package today.opai.api.interfaces.game.network.server;

import today.opai.api.interfaces.game.network.NetPacket;

public interface SPacket45Title extends NetPacket {
    String getType();
    String getMessage();
    int getFadeInTime();
    int getDisplayTime();
    int getFadeOutTime();
    void setType(String type);
    void setMessage(String message);
    void setFadeInTime(int fadeInTime);
    void setDisplayTime(int displayTime);
    void setFadeOutTime(int fadeOutTime);
}

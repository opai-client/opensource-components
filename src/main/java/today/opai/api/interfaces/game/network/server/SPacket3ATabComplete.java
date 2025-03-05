package today.opai.api.interfaces.game.network.server;

import today.opai.api.interfaces.game.network.NetPacket;

public interface SPacket3ATabComplete extends NetPacket {
    String[] getText();
    void setText(String[] text);
}

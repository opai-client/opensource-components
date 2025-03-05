package today.opai.api.interfaces.game.network.server;

import today.opai.api.interfaces.game.network.NetPacket;

public interface SPacket48ResourcePacket extends NetPacket {
    String getUrl();
    String getHash();
    void setUrl(String url);
    void setHash(String hash);
}

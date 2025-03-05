package today.opai.api.interfaces.game.network.server;

public interface SPacket48ResourcePacket {
    String getUrl();
    String getHash();
    void setUrl(String url);
    void setHash(String hash);
}

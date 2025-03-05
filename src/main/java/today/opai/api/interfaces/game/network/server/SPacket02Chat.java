package today.opai.api.interfaces.game.network.server;

import today.opai.api.interfaces.game.network.NetPacket;

public interface SPacket02Chat extends NetPacket {
    /* 
     * area to display the text, 2 for above the action bar, anything else currently for the chat
     */
    byte getType();
    void setType(byte b);
    String getMessage();
    void setMessage(String message);
}

package today.opai.api.interfaces.game.network.client;

import today.opai.api.interfaces.game.network.NetPacket;

public interface CPacket09SlotChange extends NetPacket {
    int getSlot();

    void setSlot(int slot);
}
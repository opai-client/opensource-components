package today.opai.api.interfaces.game.network.server;

import today.opai.api.interfaces.game.item.ItemStack;
import today.opai.api.interfaces.game.network.NetPacket;

public interface SPacket2FSetSlot extends NetPacket {
    int getWindowId();
    int getSlot();
    ItemStack getItemStack();
    void setWindowId(int windowId);
    void setSlot(int slot);
    void setItemStack(ItemStack itemStack);
}

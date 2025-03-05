package today.opai.api.interfaces.game.network.server;

import today.opai.api.interfaces.game.item.ItemStack;
import today.opai.api.interfaces.game.network.NetPacket;

public interface SPacket04Equipment extends NetPacket {
    int getEntityId();
    int getSlot();
    ItemStack getItemStack();
    void setItemStack(ItemStack itemStack);
    void setSlot(int slot);
}

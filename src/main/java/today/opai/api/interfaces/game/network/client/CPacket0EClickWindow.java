package today.opai.api.interfaces.game.network.client;

import today.opai.api.interfaces.game.item.ItemStack;
import today.opai.api.interfaces.game.network.NetPacket;

public interface CPacket0EClickWindow extends NetPacket {
    int getWindowId();

    int getSlotId();

    int getUsedButton();

    int getActionNumber();

    ItemStack getItem();

    int getMode();
}

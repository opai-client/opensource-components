package today.opai.api.interfaces.game.network.client;

import today.opai.api.interfaces.dataset.Vector3i;
import today.opai.api.interfaces.game.item.ItemStack;
import today.opai.api.interfaces.game.network.NetPacket;

public interface CPacket08Placement extends NetPacket {
    ItemStack getItemStack();

    Vector3i getPosition();

    int getPlaceDirection();

    float getOffsetX();

    float getOffsetY();

    float getOffsetZ();
}

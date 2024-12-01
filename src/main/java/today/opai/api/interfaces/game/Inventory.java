package today.opai.api.interfaces.game;

import today.opai.api.interfaces.game.item.ItemStack;

import java.util.List;

public interface Inventory {
    ItemStack getStackInSlot(int slot);
    List<ItemStack> getMainInventory();
    int getSize();
}

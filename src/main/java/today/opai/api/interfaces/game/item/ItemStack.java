package today.opai.api.interfaces.game.item;

import java.util.List;

public interface ItemStack {
    String getType();

    String getName();

    String getDisplayName();

    int getStackSize();

    int getMaxStackSize();

    int getDurability();

    int getMaxDurability();

    int getMetadata();

    List<String> getLore();

    List<ItemEnchantment> getEnchantments();
}

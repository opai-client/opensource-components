package today.opai.api.interfaces.game.item;

import java.util.List;

/**
 * Interface of an item stack in the game.
 *
 * @author cubk
 * @since 1.0
 */
public interface ItemStack {

    /**
     * Retrieves the untranslated name of the item.
     * Example: "tile.cloth"
     *
     * @return The name of the item.
     */
    String getName();

    /**
     * Retrieves the display name of the item.
     * Example: "White Wool", "白色羊毛"
     *
     * @return The display name of the item.
     */
    String getDisplayName();

    /**
     * Retrieves the current stack size of the item.
     *
     * @return The current stack size.
     */
    int getStackSize();

    /**
     * Retrieves the maximum stack size of the item.
     *
     * @return The maximum stack size.
     */
    int getMaxStackSize();

    /**
     * Retrieves the current durability of the item.
     *
     * @return The current durability.
     */
    int getDurability();

    /**
     * Retrieves the maximum durability of the item.
     *
     * @return The maximum durability.
     */
    int getMaxDurability();

    /**
     * Retrieves the metadata of the item.
     *
     * @return The metadata of the item.
     */
    int getMetadata();

    /**
     * Retrieves the lore (description) of the item.
     *
     * @return A list of strings representing the lore of the item.
     */
    List<String> getLore();

    /**
     * Retrieves the enchantments applied to the item.
     *
     * @return A list of {@link ItemEnchantment} objects representing the enchantments.
     */
    List<ItemEnchantment> getEnchantments();
}

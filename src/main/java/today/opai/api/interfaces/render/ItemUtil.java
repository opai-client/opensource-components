package today.opai.api.interfaces.render;

import today.opai.api.interfaces.game.item.ItemStack;

public interface ItemUtil {
    ItemStack fromName(String name);
    ItemStack fromData(String name,int count,int meta);
    ItemStack fromData(String name,int count,int meta,String nbt);
}

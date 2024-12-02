package today.opai.api.interfaces.game.entity;

import today.opai.api.enums.EnumResource;
import today.opai.api.enums.EnumShopItem;
import today.opai.api.interfaces.dataset.Vector3d;
import today.opai.api.interfaces.game.Inventory;

public interface LocalPlayer extends Player {
    Inventory getInventory();
    void sendChatMessage(String message);
    void attack(Entity target);
    void jump();
    void swingItem();
    void setSpeed(double speed);
    int getItemSlot();
    void setItemSlot(int slotId);
    /**
     * Clicks the specified slot in the window.
     * <a href="https://wiki.vg/Protocol#Click_Container">See this wiki page</a> for more information about parameters.
     */
    void clickWindow(int slot, int button, int mode);
    void clickMouse();
    void rightClickMouse();
    void useItem();
    Vector3d getViewPosition();

    float getPlayerViewY();

    double getBaseMoveSpeed();
    /**
     * Checks if the local player is on the Bed Wars shop screen.
     *
     * @return {@code true} if on the Bed Wars shop screen, {@code false} otherwise.
     */
    boolean isBedWarsShopScreen();

    /**
     * Counts the number of a specific resource in the local player's inventory.
     *
     * @param resource The resource to count.
     * @return The count of the specified resource.
     */
    int countResource(EnumResource resource);

    /**
     * Purchases a shop item.
     * Only works in Hypxiel Bed Wars.
     *
     * @param item The shop item to purchase.
     */
    void purchase(EnumShopItem item);
}

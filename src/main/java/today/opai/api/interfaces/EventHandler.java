package today.opai.api.interfaces;

import today.opai.api.dataset.RotationData;
import today.opai.api.events.*;

/**
 * Interface for handling game events.
 * Implementing methods to listening special events.
 *
 * @author cubk
 * @since 1.0
 */
public interface EventHandler {

    /**
     * Called on each tick of the game loop.
     */
    default void onTick() {}

    /**
     * Called when a player update occurs.
     * Set rotation in this event via {@link today.opai.api.interfaces.managers.RotationManager#applyRotation(RotationData, int, boolean)}.
     */
    default void onPlayerUpdate() {}

    /**
     * Called on each loop iteration.
     */
    default void onLoop() {}

    /**
     * Called when a key is pressed.
     * Also, available in any container gui (e.g. inventory, chest).
     *
     * @param keyCode The code of the key that was pressed.
     */
    default void onKey(int keyCode) {}

    /**
     * Called when a slowdown by using items.
     * Cancel this event for no slowdown effect.
     *
     * @param event The slowdown event.
     */
    default void onSlowdown(EventSlowdown event) {}

    /**
     * Called when a jump occurs.
     * Cancel this event for prevent jump.
     *
     * @param event The jump event.
     */
    default void onJump(EventJump event) {}

    /**
     * Called when a chat message is received.
     * Cancel this event for prevent chat message appears in chat.
     *
     * @param event The chat received event.
     */
    default void onChat(EventChatReceived event) {}

    /**
     * Called when a packet is sent.
     * Cancel this event for block packet sending.
     * Supported packets see {@link today.opai.api.interfaces.game.network.client}
     *
     * @param event The packet send event.
     */
    default void onPacketSend(EventPacketSend event) {}

    /**
     * Called when a packet is received.
     * Cancel this event for block packet receiving.
     * Supported packets see {@link today.opai.api.interfaces.game.network.server}
     *
     * @param event The packet receive event.
     */
    default void onPacketReceive(EventPacketReceive event) {}

    /**
     * Called when rendering in 2D.
     *
     * @param event The 2D render event.
     */
    default void onRender2D(EventRender2D event) {}

    /**
     * Called when rendering in 3D.
     *
     * @param event The 3D render event.
     */
    default void onRender3D(EventRender3D event) {}
}
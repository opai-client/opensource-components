package today.opai.api.interfaces.game.network;

import today.opai.api.enums.EnumDiggingAction;
import today.opai.api.enums.EnumDirection;
import today.opai.api.enums.EnumEntityAction;
import today.opai.api.interfaces.dataset.Vector2f;
import today.opai.api.interfaces.dataset.Vector3d;
import today.opai.api.interfaces.dataset.Vector3i;
import today.opai.api.interfaces.game.network.client.*;
import today.opai.api.interfaces.game.item.ItemStack;

public interface PacketUtil {
    CPacket00KeepAlive createKeepAlive(int key);

    CPacket0ASwing createSwing();

    CPacket0BEntityAction createEntityAction(EnumEntityAction action);

    CPacket0DCloseWindow createCloseWindow(int windowsId);

    CPacket0FTransaction createTransaction(int windowId, short uid, boolean accepted);

    /**
     * Creates a click window packet.
     * This method is deprecated due to it will trigger anti cheat.
     * See a safe method in {@link today.opai.api.interfaces.game.entity.LocalPlayer#clickWindow(int, int, int)}
     */
    @Deprecated
    CPacket0EClickWindow createClickWindow(int windowId, int slotId, int usedButton, int mode, ItemStack clickedItem, short actionNumber);

    CPacket01Chat createChat(CharSequence message);

    CPacket03Player createPlayer(boolean onGround);

    CPacket04Position createPlayerPosition(Vector3d positionData, boolean onGround);

    CPacket04Position createPlayerPosition(double x, double y, double z, boolean onGround);

    CPacket05Rotation createPlayerRotation(Vector2f rotationData, boolean onGround);

    CPacket05Rotation createPlayerRotation(float yaw, float pitch, boolean onGround);

    CPacket06PositionRotation createPlayerPositionRotation(Vector3d positionData, Vector2f rotationData, boolean onGround);

    CPacket06PositionRotation createPlayerPositionRotation(double x, double y, double z, float yaw, float pitch, boolean onGround);

    CPacket07Digging createDigging(Vector3i position, EnumDiggingAction action, EnumDirection direction);

    CPacket08Placement createUseItem(ItemStack stack);

    CPacket09SlotChange createSwitchItem(int slot);
}

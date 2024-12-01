package today.opai.api.interfaces.game.network.client;

import today.opai.api.enums.EnumDiggingAction;
import today.opai.api.enums.EnumDirection;
import today.opai.api.interfaces.dataset.Vector3i;
import today.opai.api.interfaces.game.network.NetPacket;

public interface CPacket07Digging extends NetPacket {
    Vector3i getPosition();

    EnumDiggingAction getAction();

    EnumDirection getDirection();
}

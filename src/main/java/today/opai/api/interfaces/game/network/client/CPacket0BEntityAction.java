package today.opai.api.interfaces.game.network.client;

import today.opai.api.enums.EnumEntityAction;
import today.opai.api.interfaces.game.network.NetPacket;

public interface CPacket0BEntityAction extends NetPacket {
    EnumEntityAction getAction();

    void setAction(EnumEntityAction action);
}

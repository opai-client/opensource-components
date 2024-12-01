package today.opai.api.interfaces.game.network.client;

import today.opai.api.enums.EnumUseEntityAction;
import today.opai.api.interfaces.dataset.Vector3d;
import today.opai.api.interfaces.game.network.NetPacket;

public interface CPacket02UseEntity extends NetPacket {
    EnumUseEntityAction getAction();

    int getEntityId();

    Vector3d getHitVec();
}

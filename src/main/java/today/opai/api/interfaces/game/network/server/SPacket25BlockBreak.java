package today.opai.api.interfaces.game.network.server;

import today.opai.api.interfaces.game.network.NetPacket;
import today.opai.api.interfaces.game.world.Block;

public interface SPacket25BlockBreak extends NetPacket {
    int getEntityId();
    Block getBlock();
    int getProgress();
}

package today.opai.api.interfaces.game.network.server;

import today.opai.api.dataset.Vec3Data;
import today.opai.api.interfaces.game.network.NetPacket;
import today.opai.api.interfaces.game.world.Block;

public interface SPacket23BlockChange extends NetPacket {
    Vec3Data getPosition();
    Block getBlock();
}

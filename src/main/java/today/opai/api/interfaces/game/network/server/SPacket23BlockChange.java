package today.opai.api.interfaces.game.network.server;

import today.opai.api.dataset.Vec3Data;
import today.opai.api.interfaces.game.world.Block;

public interface SPacket23BlockChange {
    Vec3Data getPosition();
    Block getBlock();
    void setPosition(Vec3Data position);
    void setBlock(Block block);
}

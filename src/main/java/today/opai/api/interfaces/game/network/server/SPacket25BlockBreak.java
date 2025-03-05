package today.opai.api.interfaces.game.network.server;

import today.opai.api.interfaces.game.world.Block;

public interface SPacket25BlockBreak {
    int getEntityId();
    Block getBlock();
    int getProgress();
    void setEntityId(int entityId);
    void setBlock(Block block);
    void setProgress(int progress);
}

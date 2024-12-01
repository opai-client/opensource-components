package today.opai.api.interfaces.game.world;

import today.opai.api.dataset.BlockPosition;
import today.opai.api.interfaces.game.entity.Entity;
import today.opai.api.interfaces.game.entity.Player;

import java.util.List;

public interface World {
    Entity getEntityByID(int id);
    List<Entity> getLoadedEntities();
    List<Player> getLoadedPlayerEntities();
    void removeEntity(Entity entity);
    int getBlock(BlockPosition position);
    boolean isLiquid(BlockPosition position);
    boolean isSolid(BlockPosition position);
    boolean isOpaque(BlockPosition position);
    boolean isTranslucent(BlockPosition position);
}

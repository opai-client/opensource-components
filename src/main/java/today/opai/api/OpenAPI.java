package today.opai.api;

import today.opai.api.interfaces.EventHandler;
import today.opai.api.interfaces.Registerable;
import today.opai.api.interfaces.game.Options;
import today.opai.api.interfaces.game.entity.LocalPlayer;
import today.opai.api.interfaces.game.network.NetPacket;
import today.opai.api.interfaces.game.world.World;
import today.opai.api.interfaces.managers.GameStateManager;
import today.opai.api.interfaces.managers.ModuleManager;
import today.opai.api.interfaces.managers.RotationManager;
import today.opai.api.interfaces.managers.ValueManager;
import today.opai.api.interfaces.render.FontUtil;

public interface OpenAPI {
    void registerFeature(Registerable registerable);
    void registerEvent(EventHandler eventHandler);
    void unregisterEvent(EventHandler eventHandler);
    LocalPlayer getLocalPlayer();
    World getWorld();
    Options getOptions();
    ValueManager getValueManager();
    ModuleManager getModuleManager();
    RotationManager getRotationManager();
    GameStateManager getGameStateManager();
    FontUtil getFontUtil();
}

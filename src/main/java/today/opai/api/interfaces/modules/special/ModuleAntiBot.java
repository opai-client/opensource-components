package today.opai.api.interfaces.modules.special;

import today.opai.api.interfaces.game.entity.Player;
import today.opai.api.interfaces.modules.PresetModule;

public interface ModuleAntiBot extends PresetModule {
    boolean isBot(Player entity);
}

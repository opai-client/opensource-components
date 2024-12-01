package today.opai.api.interfaces.modules.special;

import today.opai.api.interfaces.game.entity.LivingEntity;
import today.opai.api.interfaces.modules.PresetModule;

import java.util.List;

public interface ModuleKillAura extends PresetModule {
    List<LivingEntity> getTargets();
    LivingEntity getTarget();
    LivingEntity getBlockTarget();
}

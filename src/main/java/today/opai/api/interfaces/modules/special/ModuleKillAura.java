package today.opai.api.interfaces.modules.special;

import today.opai.api.interfaces.game.entity.LivingEntity;

public interface ModuleKillAura {
    LivingEntity getTarget();
    LivingEntity getBlockTarget();
}

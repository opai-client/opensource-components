package today.opai.api.interfaces.game.entity;

import today.opai.api.interfaces.game.item.ItemStack;
import today.opai.api.interfaces.game.item.PotionEffect;

import java.util.List;

public interface LivingEntity extends Entity {
    float getMoveForward();

    float getMoveStrafing();

    void setMoveForward(float forward);

    void setMoveStrafing(float strafing);

    float getHealth();

    float getMaxHealth();

    float getAbsorption();

    boolean isOnLadder();

    int getHurtTime();

    void setJumpMovementFactor(float factor);

    float getJumpMovementFactor();

    ItemStack getArmorSlot(int slot);

    ItemStack getHeldItem();

    float getEyeHeight();

    List<PotionEffect> getPotionEffects();

    float getSwingProgress();
}

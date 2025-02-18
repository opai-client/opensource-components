package today.opai.api.interfaces.game.entity;

public interface Player extends LivingEntity {
    boolean getFlying();

    boolean canFlying();

    boolean isSneaking();

    void setSneaking(boolean sneaking);

    boolean isSprinting();

    void setSprinting(boolean sprinting);

    void setItemInUseCount(int count);

    int getItemInUseCount();

    boolean isBlocking();

    boolean isUsingItem();

    int getFoodLevel();

    String getProfileName();
}

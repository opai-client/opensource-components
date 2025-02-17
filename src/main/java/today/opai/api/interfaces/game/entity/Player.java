package today.opai.api.interfaces.game.entity;

public interface Player extends LivingEntity {
    boolean getFlying();

    boolean canFlying();

    boolean isSneaking();

    void setItemInUseCount(int count);

    int getItemInUseCount();

    boolean isBlocking();

    boolean isUsingItem();

    int getFoodLevel();

    String getProfileName();
}

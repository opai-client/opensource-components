package today.opai.api.interfaces.game.entity;

public interface LocalPlayer extends Entity{
    void sendChatMessage(String message);
    void attack(Entity target);
    void jump();
    void swingItem();
    void setSpeed(double speed);
}

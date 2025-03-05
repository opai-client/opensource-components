package today.opai.api.interfaces.game.network.server;

public interface SPacket0BAnimation {
    int getEntityId();
    /* 
     * 0 for swing, 1 for hurt, 3 for wake up, 4 for critical hit, 5 for magic critical hit
     */
    byte getAnimation();
    void setAnimation(byte animation);
}

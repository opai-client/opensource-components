package today.opai.api.interfaces;

import today.opai.api.events.*;

public interface EventHandler {
    default void onTick(){

    }

    default void onPlayerUpdate(){

    }

    default void onLoop(){

    }

    default void onKey(int keyCode){

    }

    default void onSlowdown(EventSlowdown event){

    }

    default void onJump(EventJump event){

    }

    default void onChat(EventChatReceived event){

    }

    default void onPacketSend(EventPacketSend event){

    }

    default void onPacketReceive(EventPacketReceive event){

    }

    default void onRender2D(EventRender2D event){

    }

    default void onRender3D(EventRender3D event){

    }
}

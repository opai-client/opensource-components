package today.opai.api.interfaces.game.network.server;

import today.opai.api.interfaces.game.network.NetPacket;

import java.util.Collection;

public interface SPacket3ETeams extends NetPacket {
    String getName();
    String getDisplayName();
    String getPrefix();
    String getSuffix();
    String getNametagVisibility();
    Collection<String> getPlayerList();
    int getAction();
    int getFriendlyFlags();
    int getColor();
    void setName(String name);
    void setDisplayName(String displayName);
    void setPrefix(String prefix);
    void setSuffix(String suffix);
    void setNametagVisibility(String nametagVisibility);
    void setPlayerList(Collection<String> playerList);
    void setAction(int action);
    void setFriendlyFlags(int friendlyFlags);
    void setColor(int color);   
}

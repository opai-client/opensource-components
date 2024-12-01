package today.opai.api.interfaces.managers;

import today.opai.api.enums.EnumGame;
import today.opai.api.interfaces.dataset.PartyMember;

import java.util.List;

public interface GameStateManager {
    String getMap();
    String getGameMode();
    EnumGame getGame();
    String getGameName();
    boolean isLobby();
    boolean isHypixel();
    boolean isParty();
    List<PartyMember> getPartyMembers();
    void requeue();
}

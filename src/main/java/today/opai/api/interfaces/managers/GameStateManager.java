package today.opai.api.interfaces.managers;

import today.opai.api.enums.EnumGame;
import today.opai.api.interfaces.dataset.PartyMember;

import java.util.List;

/**
 * Interface for access some game state of Hypixel
 *
 * @author cubk
 * @since 1.0
 */
public interface GameStateManager {

    /**
     * Retrieves the current map name.
     * Only work in Hypixel Server
     *
     * @return The name of the current map.
     */
    String getMap();

    /**
     * Retrieves the current game mode.
     * Only work in Hypixel Server
     *
     * @return The current game mode.
     */
    String getGameMode();

    /**
     * Retrieves the current game enum.
     * Only work in Hypixel Server
     *
     * @return The current game enum.
     */
    EnumGame getGame();

    /**
     * Retrieves the name of the current game.
     * Only work in Hypixel Server
     *
     * @return The name of the current game.
     */
    String getGameName();

    /**
     * Checks if the current state is in the lobby.
     * Only work in Hypixel Server
     *
     * @return {@code true} if in the lobby, {@code false} otherwise.
     */
    boolean isLobby();

    /**
     * Checks if the current game is Hypixel or not.
     * Please check via this method before using any other methods in this class.
     *
     * @return {@code true} if the game is Hypixel, {@code false} otherwise.
     */
    boolean isHypixel();

    /**
     * Checks if the player is in a party.
     *
     * @return {@code true} if at a party, {@code false} otherwise.
     */
    boolean isParty();

    /**
     * Retrieves the list of party members.
     *
     * @return A list of {@link PartyMember} objects representing the party members.
     */
    List<PartyMember> getPartyMembers();

    /**
     * Requeues the player for the current game.
     */
    void requeue();
}

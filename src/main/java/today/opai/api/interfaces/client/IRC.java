package today.opai.api.interfaces.client;

import today.opai.api.interfaces.managers.GameStateManager;

import java.util.Optional;

/**
 * Interface for interacting with an IRC (Internet Relay Chat) client.
 *
 * @author cubk
 * @since 1.0
 */
public interface IRC {

    /**
     * Retrieves the number of online users in the IRC.
     *
     * @return The number of online users.
     */
    int getOnlineUserCount();

    /**
     * Retrieves the username associated with the given in-game name (IGN).
     *
     * @param ign The in-game name of the user.
     * @return An {@link Optional} containing the username if found, or an empty Optional if not found.
     */
    Optional<String> getUsername(String ign);

    /**
     * Sends a message to the IRC channel.
     *
     * @param msg The message to be sent.
     */
    void sendMessage(String msg);

    /**
     * Sends a party message to the IRC channel.
     * Based on parsing chat message (Only supported english and chinese currently)
     * Requires least one client user in party
     * <p>
     * For check player is in party, use {@link GameStateManager#isParty()}
     * For get all party member, use {@link GameStateManager#getPartyMembers()}
     *
     * @param msg The party message to be sent.
     */
    void sendPartyMessage(String msg);
}

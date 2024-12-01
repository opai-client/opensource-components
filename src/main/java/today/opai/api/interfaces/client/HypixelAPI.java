package today.opai.api.interfaces.client;

import today.opai.api.interfaces.client.hypixel.PlayerData;

public interface HypixelAPI {
    /**
     * Retrieves player data for the specified player name.
     *
     * @param name The name of the player whose data is to be retrieved.
     * @return A {@link PlayerData} object containing the player's data.
     * @throws IllegalStateException Reason of the failure.
     */
    PlayerData getPlayerData(String name) throws IllegalStateException;
}

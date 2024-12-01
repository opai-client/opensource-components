package today.opai.api.interfaces.client.hypixel;

import lombok.Data;
import today.opai.api.interfaces.client.hypixel.games.*;

@Data
public class PlayerData {
    private Player player;
    private Arcade arcade;
    private Skywars skywars;
    private Bedwars bedwars;
    private Duels duels;
    private MegaWalls megawalls;
    private UHC uhc;
    private BSG bsg;
    private CAC cac;
}



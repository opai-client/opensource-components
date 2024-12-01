package today.opai.api.interfaces.client.hypixel.games;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class CAC {
    private int coins;
    @SerializedName("total-kills")
    private int totalKills;
    private int headshots;
    private int deaths;
    @SerializedName("game-wins")
    private int gameWins;
    @SerializedName("round-wins")
    private int roundWins;
    @SerializedName("shots-fired")
    private int shotsFired;
    @SerializedName("cop-kills")
    private int copKills;
    @SerializedName("criminal-kills")
    private int criminalKills;
    @SerializedName("deathmatch-kills")
    private int deathmatchKills;
    @SerializedName("bombs-planted")
    private int bombsPlanted;
    @SerializedName("bombs-defused")
    private int bombsDefused;
}

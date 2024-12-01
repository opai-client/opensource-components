package today.opai.api.interfaces.client.hypixel.games;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class BSG {
    private int coins;
    private int kills;
    private int deaths;
    @SerializedName("wins-solo")
    private int winsSolo;
    @SerializedName("wins-team")
    private int winsTeam;
    @SerializedName("kdr")
    private double killDeathRatio;
    @SerializedName("kills-per-game")
    private double killsPerGame;
}

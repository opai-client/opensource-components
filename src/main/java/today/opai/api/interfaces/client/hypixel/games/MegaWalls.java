package today.opai.api.interfaces.client.hypixel.games;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class MegaWalls {
    private int coins;
    private int kills;
    private int assists;
    private int deaths;
    @SerializedName("final-kills")
    private int finalKills;
    @SerializedName("final-assists")
    private int finalAssists;
    @SerializedName("final-deaths")
    private int finalDeaths;
    private int wins;
    private int losses;
    @SerializedName("kdr")
    private double killDeathRatio;
    @SerializedName("fkdr")
    private double finalKillDeathRatio;
    @SerializedName("wlr")
    private double winLoseRatio;
    @SerializedName("wither-damage")
    private int witherDamage;
    @SerializedName("defending-kills")
    private int defendingKills;
}

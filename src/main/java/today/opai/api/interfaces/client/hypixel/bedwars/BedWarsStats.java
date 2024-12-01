package today.opai.api.interfaces.client.hypixel.bedwars;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class BedWarsStats {
    private int kills;
    private int deaths;
    @SerializedName("kdr")
    private double killDeathRatio;
    @SerializedName("final-kills")
    private int finalKills;
    @SerializedName("final-deaths")
    private int finalDeaths;
    @SerializedName("fkdr")
    private double finalKillDeathRatio;
    private int wins;
    private int losses;
    @SerializedName("wlr")
    private double winLoseRatio;
    @SerializedName("beds-broken")
    private int bedsBroken;
}

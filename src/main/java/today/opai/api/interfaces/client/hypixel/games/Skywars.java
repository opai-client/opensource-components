package today.opai.api.interfaces.client.hypixel.games;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Skywars {
    private int level;
    private String prestige;
    private int coins;
    private int tokens;
    private int kills;
    private int assists;
    private int deaths;
    private double kdr;
    private int wins;
    private int losses;
    @SerializedName("wlr")
    private double winLoseRatio;
    @SerializedName("blocks-broken")
    private int blocksBroken;
    @SerializedName("blocks-placed")
    private int blocksPlaced;
    @SerializedName("soul-well-uses")
    private int soulWellUses;
    @SerializedName("soul-well-legendaries")
    private int soulWellLegendaries;
    @SerializedName("soul-well-rares")
    private int soulWellRares;
    @SerializedName("paid-souls")
    private int paidSouls;
    @SerializedName("souls-gathered")
    private int soulsGathered;
    @SerializedName("eggs-thrown")
    private int eggsThrown;
    @SerializedName("enderpearls-thrown")
    private int enderpearlsThrown;
    @SerializedName("arrows-shot")
    private int arrowsShot;
    @SerializedName("arrows-hit")
    private int arrowsHit;
    @SerializedName("arrow-hit-miss-ratio")
    private int arrowHitMissRatio;
}

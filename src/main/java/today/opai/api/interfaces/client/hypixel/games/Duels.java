package today.opai.api.interfaces.client.hypixel.games;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Duels {
    private int tokens;
    private int kills;
    private int deaths;
    private double kdr;
    private int wins;
    private int losses;
    private double wlr;
    @SerializedName("arrows-shot")
    private int arrowsShot;
    @SerializedName("arrows-hit")
    private int arrowsHit;
    @SerializedName("arrow-hit-miss-ratio")
    private double arrowHitMissRatio;
    @SerializedName("melee-swings")
    private int meleeSwings;
    @SerializedName("melee-hits")
    private int meleeHits;
    @SerializedName("melee-hit-miss-ratio")
    private double meleeHitMissRatio;
}

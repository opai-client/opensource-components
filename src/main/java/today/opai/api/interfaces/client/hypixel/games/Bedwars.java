package today.opai.api.interfaces.client.hypixel.games;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import today.opai.api.interfaces.client.hypixel.bedwars.BedWarsStats;

@Data
public class Bedwars {
    private int tokens;
    private int winstreak;
    private String prestige;
    private int level;
    @SerializedName("diamonds-collected")
    private int diamondsCollected;
    @SerializedName("emeralds-collected")
    private int emeraldsCollected;
    @SerializedName("gold-collected")
    private int goldCollected;
    @SerializedName("iron-collected")
    private int ironCollected;
    private BedWarsStats solo;
    private BedWarsStats doubles;
    private BedWarsStats threeV3V3V3;
    private BedWarsStats fourV4V4V4;
    @SerializedName("core-modes")
    private BedWarsStats coreModes;
    private BedWarsStats fourV4;
    @SerializedName("rush-solo")
    private BedWarsStats rushSolo;
    @SerializedName("rush-doubles")
    private BedWarsStats rushDoubles;
    @SerializedName("rush-4v4v4v4")
    private BedWarsStats rushFourV4V4V4;
    @SerializedName("ultimate-solo")
    private BedWarsStats ultimateSolo;
    @SerializedName("ultimate-doubles")
    private BedWarsStats ultimateDoubles;
    @SerializedName("ultimate-4v4v4v4")
    private BedWarsStats ultimateFourV4V4V4;
    @SerializedName("lucky-doubles")
    private BedWarsStats luckyDoubles;
    @SerializedName("lucky-4v4v4v4")
    private BedWarsStats luckyFourV4V4V4;
    private BedWarsStats castle;
    private BedWarsStats capture;
    @SerializedName("swap-doubles")
    private BedWarsStats swapDoubles;
    @SerializedName("swap-4v4v4v4")
    private BedWarsStats swapFourV4V4V4;
    @SerializedName("voidless-4v4v4v4")
    private BedWarsStats voidlessFourV4V4V4;
    private BedWarsStats overall;
}

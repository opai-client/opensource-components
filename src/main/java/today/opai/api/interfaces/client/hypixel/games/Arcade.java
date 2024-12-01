package today.opai.api.interfaces.client.hypixel.games;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import today.opai.api.interfaces.client.hypixel.arcade.Dropper;
import today.opai.api.interfaces.client.hypixel.arcade.HideAndSeek;
import today.opai.api.interfaces.client.hypixel.arcade.Zombies;

@Data
public class Arcade {
    private int coins;
    @SerializedName("kills-blocking-dead")
    private int killsBlockingDead;
    @SerializedName("kills-dragonwars")
    private int killsDragonwars;
    @SerializedName("kills-bounty-hunter")
    private int killsBountyHunter;
    @SerializedName("kills-throw-out")
    private int killsThrowOut;
    @SerializedName("poop-collected")
    private int poopCollected;
    @SerializedName("headshots-blocking-dead")
    private int headshotsBlockingDead;
    @SerializedName("wins-blocking-dead")
    private int winsBlockingDead;
    @SerializedName("wins-dragonwars")
    private int winsDragonwars;
    @SerializedName("wins-enderspleef")
    private int winsEnderspleef;
    @SerializedName("wins-farm-hunt")
    private int winsFarmHunt;
    @SerializedName("wins-bounty-hunter")
    private int winsBountyHunter;
    @SerializedName("wins-party-games")
    private int winsPartyGames;
    @SerializedName("wins-throw-out")
    private int winsThrowOut;
    @SerializedName("wins-hole-in-the-wall")
    private int winsHoleInTheWall;
    @SerializedName("hitw-highest-score-qualifications")
    private int hitwHighestScoreQualifications;
    @SerializedName("hitw-highest-score-finals")
    private int hitwHighestScoreFinals;
    @SerializedName("wins-hypixel-says")
    private int winsHypixelSays;
    @SerializedName("wins-mini-walls")
    private int winsMiniWalls;
    @SerializedName("gw-kills")
    private int gwKills;
    @SerializedName("gw-empire-kills")
    private int gwEmpireKills;
    @SerializedName("gw-rebel-kills")
    private int gwRebelKills;
    @SerializedName("gw-deaths")
    private int gwDeaths;
    @SerializedName("gw-shots-fired")
    private int gwShotsFired;
    private HideAndSeek hideAndSeek;
    private Dropper dropper;
    private Zombies zombies;
}

package today.opai.api.interfaces.client.hypixel.arcade;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Dropper {
    @SerializedName("fastest-game")
    private int fastestGame;
    @SerializedName("games-played")
    private int gamesPlayed;
    private int wins;
    @SerializedName("win-ratio")
    private int winRatio;
    @SerializedName("flawless-game")
    private int flawlessGame;
    private int fails;
}

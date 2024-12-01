package today.opai.api.interfaces.client.hypixel.arcade;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class HideAndSeek {
    @SerializedName("seeker-wins")
    private int seekerWins;
    @SerializedName("hider-wins")
    private int hiderWins;
    @SerializedName("party-pooper-seeker-wins")
    private int partyPooperSeekerWins;
    @SerializedName("party-pooper-hider-wins")
    private int partyPooperHiderWins;
}

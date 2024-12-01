package today.opai.api.interfaces.client.hypixel;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Player {
    private String rank;
    private String guild;
    private double level;
    private int karma;
    @SerializedName("achievement-points")
    private int achievementPoints;
    @SerializedName("completed-quests")
    private int completedQuests;
    @SerializedName("ranks-gifted")
    private int ranksGifted;
}

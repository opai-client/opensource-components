package today.opai.api.interfaces.client.hypixel.arcade;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Zombies {
    private int accuracy;
    @SerializedName("head-shot-accuracy")
    private int headShotAccuracy;
}

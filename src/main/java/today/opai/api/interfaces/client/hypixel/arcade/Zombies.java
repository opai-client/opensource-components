package today.opai.api.interfaces.client.hypixel;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Zombies {
    private int accuracy;
    @SerializedName("head-shot-accuracy")
    private int headShotAccuracy;
}

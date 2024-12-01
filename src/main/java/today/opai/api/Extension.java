package today.opai.api;

import by.radioegor146.nativeobfuscator.Native;
import cn.clientmix.hybrid.Client;

public abstract class Extension {
    public abstract void initialize(OpenAPI openAPI);

    @Native
    public static OpenAPI getAPI(){
        return Client.getInstance().getExtensionsManager().getApi();
    }
}

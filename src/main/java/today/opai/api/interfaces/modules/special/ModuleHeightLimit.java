package today.opai.api.interfaces.modules.special;

import today.opai.api.interfaces.modules.PresetModule;

public interface ModuleHeightLimit extends PresetModule {
    int getDistance();

    int[] getLimit();
}

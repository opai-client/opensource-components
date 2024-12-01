package today.opai.api.interfaces.managers;

import today.opai.api.enums.EnumModuleCategory;
import today.opai.api.interfaces.modules.PresetModule;

import java.util.Collection;

public interface ModuleManager {
    PresetModule getModule(String name);
    Collection<PresetModule> getModulesInCategory(EnumModuleCategory category);
    Collection<PresetModule> getModules();
}

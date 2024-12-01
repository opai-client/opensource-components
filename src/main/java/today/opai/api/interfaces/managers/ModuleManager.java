package today.opai.api.interfaces.managers;

import today.opai.api.enums.EnumModuleCategory;
import today.opai.api.interfaces.modules.PresetModule;

import java.util.Collection;

public interface ModuleManager {
    /**
     * Retrieves a module by its name.
     * Some modules have special methods, see {@link today.opai.api.interfaces.modules.special}
     *
     * @param name The name of the module to retrieve.
     * @return The {@link PresetModule}, or {@code null} if not found.
     */
    PresetModule getModule(String name);

    /**
     * Retrieves a collection of modules in the specified category.
     *
     * @param category The category of modules to retrieve.
     * @return A collection of {@link PresetModule} objects in the specified category.
     */
    Collection<PresetModule> getModulesInCategory(EnumModuleCategory category);

    /**
     * Retrieves all modules.
     *
     * @return A collection of all {@link PresetModule} objects.
     */
    Collection<PresetModule> getModules();
}

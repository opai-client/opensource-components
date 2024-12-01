package today.opai.api.features;

import lombok.Getter;
import lombok.Setter;
import today.opai.api.enums.EnumModuleCategory;
import today.opai.api.interfaces.EventHandler;
import today.opai.api.interfaces.modules.PresetModule;
import today.opai.api.interfaces.Registerable;
import today.opai.api.interfaces.modules.Value;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Getter
@Setter
public abstract class ExtensionModule implements PresetModule, Registerable {
    private final String name;
    private final String description;
    private String suffix;
    private final EnumModuleCategory category;
    private int key;
    private boolean enabled, hidden;
    private EventHandler eventHandler;
    private final List<Value<?>> values = new ArrayList<>();

    public ExtensionModule(String name, String description, EnumModuleCategory category) {
        this.name = name;
        this.category = category;
        this.description = description;
    }

    public void addValues(Value<?>... values) {
        for (Value<?> value : values) {
            if (!this.values.contains(value)) this.values.add(value);
        }
    }

    public void onEnabled() {
    }

    public void onDisabled() {
    }

    public void setEnabled(boolean enabled) {
        if (this.enabled != enabled) {
            this.enabled = enabled;
            if (enabled) {
                onEnabled();
            } else onDisabled();
        }
        this.enabled = enabled;
    }
}

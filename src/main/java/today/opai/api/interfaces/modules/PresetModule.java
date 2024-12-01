package today.opai.api.interfaces.modules;

import java.util.Collection;

public interface PresetModule {
    void setEnabled(boolean enabled);

    boolean isEnabled();

    String getName();

    String getDescription();

    int getKey();

    void setKey(int key);

    boolean isHidden();

    void setHidden(boolean hidden);

    Collection<Value<?>> getValues();
}

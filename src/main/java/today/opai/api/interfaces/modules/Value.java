package today.opai.api.interfaces.modules;

import java.util.function.BooleanSupplier;
import java.util.function.Consumer;

public interface Value<T> {
    T getValue();
    void setValue(T value);
    String getName();
    String getDescription();
    void setHiddenPredicate(BooleanSupplier supplier);
    void setValueCallback(Consumer<T> consumer);
}

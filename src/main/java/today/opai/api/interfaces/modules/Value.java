package today.opai.api.interfaces.modules;

import java.util.function.BooleanSupplier;
import java.util.function.Consumer;

public interface Value<T> {
    T getValue();

    void setValue(T value);

    String getName();

    String getDescription();

    /**
     * Set a predicate for hide this value in click gui
     *
     * @param supplier predicate to check if the value should be hidden
     */
    void setHiddenPredicate(BooleanSupplier supplier);

    /**
     * Set a callback call when the value changed
     *
     * @param consumer call back when the value changed
     */
    void setValueCallback(Consumer<T> consumer);
}

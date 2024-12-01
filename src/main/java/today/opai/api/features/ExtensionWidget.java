package today.opai.api.features;

import lombok.Getter;
import lombok.Setter;
import today.opai.api.interfaces.Registerable;

@Getter
@Setter
public abstract class ExtensionWidget implements Registerable {
    private final String name;
    private float x;
    private float y;
    private float width;
    private float height;

    protected ExtensionWidget(String name) {
        this.name = name;
    }

    public abstract void render();

    /**
     * Determines whether the widget should be rendered.
     * By default, it always returns {@code true}, meaning the widget will always be rendered.
     * Override this method to provide custom rendering conditions.
     *
     * @return {@code true} if the widget should be rendered, {@code false} otherwise.
     */
    public boolean renderPredicate() {
        return true;
    }
}

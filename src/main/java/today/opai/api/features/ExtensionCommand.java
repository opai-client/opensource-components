package today.opai.api.features;

import lombok.AllArgsConstructor;
import lombok.Getter;
import today.opai.api.interfaces.Registerable;

@AllArgsConstructor
@Getter
public abstract class ExtensionCommand implements Registerable {
    private final String[] names;
    private final String description;
    private final String usage;


    /**
     * Call when the command with the provided parameters.
     * The first params is the command name used.
     * If additional parameters are required, please start from index 1
     *
     * @param params The parameters passed to the command.
     */
    public abstract void onExecute(String[] params);
}

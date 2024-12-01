package today.opai.api.features;

import today.opai.api.interfaces.Registerable;

public abstract class ExtensionCommand implements Registerable {
    private final String[] names;
    private final String description;
    private final String usage;

    protected ExtensionCommand(String[] names, String description, String usage) {
        this.names = names;
        this.description = description;
        this.usage = usage;
    }

    public abstract void onExecute(String[] params);

    public String[] getNames() {
        return names;
    }

    public String getDescription() {
        return description;
    }

    public String getUsage() {
        return usage;
    }
}

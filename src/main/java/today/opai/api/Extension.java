package today.opai.api;

/**
 * This class serves as the entry point for an extension.
 * 
 * @author cubk
 * @since 1.0
 */
public abstract class Extension {
    /**
     * Initializes method
     * Override this method to initialize your extension.
     * 
     * @param openAPI OpenAPI instance
     */
    public abstract void initialize(OpenAPI openAPI);

    /**
     * Called when the extension is unloaded.
     * <p>
     * Override this method to release resources (such as textures) when the extension is unloaded.
     * This method is optional and has a default empty implementation.
     * </p>
     */
    public void onUnload() {
        // Optional override for extension cleanup
    }

     /**
     * Retrieves the OpenAPI instance.
     * 
     * <p>
      *     Note: This method may impact performance and is not recommended for frequent use. recommended to store to a field or variable.
     * </p>
     * 
     * @return the OpenAPI instance
     */
    public static native OpenAPI getAPI();
}

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

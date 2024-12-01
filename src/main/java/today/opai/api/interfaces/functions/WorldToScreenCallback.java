package today.opai.api.interfaces.functions;

public interface WorldToScreenCallback {

    /**
     * Implement this for rending 3D objects bounding in 2D event.
     */
    void render(double x, double y, double width, double height);
}

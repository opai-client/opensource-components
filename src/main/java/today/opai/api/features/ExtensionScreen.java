package today.opai.api.features;

public abstract class ExtensionScreen {
    protected void keyTyped(char chr, int key) {
    }

    protected void mouseClicked(int mouseX, int mouseY, int button) {
    }

    protected void mouseMovedOrUp(int mouseX, int mouseY, int button) {
    }

    public void drawScreen(int mouseX, int mouseY) {
    }

    public void initGui() {
    }

    public void updateScreen() {
    }

    public void onGuiClosed() {
    }
}

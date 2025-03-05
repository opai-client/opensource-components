package today.opai.api;

import today.opai.api.enums.EnumNotificationType;
import today.opai.api.features.ExtensionCommand;
import today.opai.api.features.ExtensionModule;
import today.opai.api.features.ExtensionScreen;
import today.opai.api.features.ExtensionWidget;
import today.opai.api.interfaces.EventHandler;
import today.opai.api.interfaces.Registerable;
import today.opai.api.interfaces.client.HypixelAPI;
import today.opai.api.interfaces.client.IRC;
import today.opai.api.interfaces.game.Options;
import today.opai.api.interfaces.game.entity.LocalPlayer;
import today.opai.api.interfaces.game.network.PacketUtil;
import today.opai.api.interfaces.game.world.World;
import today.opai.api.interfaces.managers.GameStateManager;
import today.opai.api.interfaces.managers.ModuleManager;
import today.opai.api.interfaces.managers.RotationManager;
import today.opai.api.interfaces.managers.ValueManager;
import today.opai.api.interfaces.render.*;

/**
 * The OpenAPI interface provides methods for registering features, handling events,
 * and accessing various game-related components.
 * 
 * @author cubk
 * @since 1.0
 */
public interface OpenAPI {
    /**
     * Registers a feature with the OpenAPI.
     * {@link ExtensionModule}
     * {@link ExtensionCommand}
     * {@link ExtensionWidget}
     *
     * @param registerable the feature to register
     */
    void registerFeature(Registerable registerable);

    /**
     * Registers an event handler with the OpenAPI.
     * Implement methods in {@link EventHandler} for listening events.
     * 
     * @param eventHandler the event handler to register
     */
    void registerEvent(EventHandler eventHandler);

    /**
     * Unregisters an event handler from the OpenAPI.
     * 
     * @param eventHandler the event handler to unregister
     */
    void unregisterEvent(EventHandler eventHandler);

    /**
     * Executes a command on the client.
     * 
     * @param clientCommand the command to execute without "." suffix
     */
    void runCommand(String clientCommand);

    /**
     * Loads a configuration file.
     * 
     * @param config the configuration file to load (without file format suffix)
     */
    void loadConfig(String config);

    /**
     * Prints a message to the chat.
     * 
     * @param message the message to print
     */
    void printMessage(String message);

    void printChatComponent(String json);

    void displayScreen(ExtensionScreen extensionScreen);

    /**
     * Pops a notification to the user.
     *
     * @param type      the type of notification
     * @param title     the title of the notification
     * @param message   the message of the notification
     * @param shownTime the duration the notification is shown (MS)
     */
    void popNotification(EnumNotificationType type, String title, String message, long shownTime);

    /**
     * @param ign in game name
     * @return boolean
     */
    boolean isFriend(String ign);

    /**
     * @param ign in game name
     * @return boolean
     */
    boolean isTarget(String ign);

    /**
     * @param ign in game name
     */
    void addFriend(String ign);

    /**
     * @param ign in game name
     */
    void addTarget(String ign);

    /**
     * @param ign in game name
     */
    void removeFriend(String ign);

    /**
     * @param ign in game name
     */
    void removeTarget(String ign);

    /**
     * @return is world or player is null
     */
    boolean isNull();

    /**
     * Retrieves the username of the client.
     *
     * @return the client username
     */
    String getClientUsername();
    /**
     * Retrieves the version of the client.
     * 
     * @return the client version
     */
    String getClientVersion();

    /**
     * Retrieves the current game frame rate per second (FPS).
     * 
     * @return the frame rate
     */
    int getFrameRate();

    /**
     * Retrieves the IRC interface.
     * 
     * @return the IRC interface
     */
    IRC getIRC();

    /**
     * Retrieves the Hypixel API interface.
     * 
     * @return the Hypixel API interface
     */
    HypixelAPI getHypixelAPI();

    /**
     * Retrieves the local player instance.
     * 
     * @return the local player
     */
    LocalPlayer getLocalPlayer();

    /**
     * Retrieves the game world instance.
     * 
     * @return the game world
     */
    World getWorld();

    /**
     * Retrieves the game options.
     * 
     * @return the game options
     */
    Options getOptions();

    /**
     * Retrieves the value manager.
     * 
     * @return the value manager
     */
    ValueManager getValueManager();

    /**
     * Retrieves the module manager.
     * 
     * @return the module manager
     */
    ModuleManager getModuleManager();

    /**
     * Retrieves the rotation manager.
     * 
     * @return the rotation manager
     */
    RotationManager getRotationManager();

    /**
     * Retrieves the game state manager.
     * 
     * @return the game state manager
     */
    GameStateManager getGameStateManager();

    /**
     * Retrieves the render utility.
     * 
     * @return the render utility
     */
    RenderUtil getRenderUtil();

    /**
     * Retrieves the shader utility.
     *
     * @return the shader utility
     */
    ShaderUtil getShaderUtil();

    /**
     * Retrieves the font utility.
     *
     * @return the font utility
     */
    FontUtil getFontUtil();

    GLStateManager getGLStateManager();

    PacketUtil getPacketUtil();

    ItemUtil getItemUtil();
}

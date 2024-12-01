package today.opai.api.events;

public class EventChatReceived {
    private final String message;

    public EventChatReceived(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

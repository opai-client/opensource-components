package today.opai.api.events;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class EventChatSend extends EventCancelable {
    private final String message;
}

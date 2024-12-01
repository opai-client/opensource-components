package today.opai.api.interfaces.dataset;

import today.opai.api.enums.EnumPartyPermission;

import java.util.UUID;

public interface PartyMember {
    String getName();

    String getClientUsername();

    UUID getUUID();

    EnumPartyPermission getPermission();
}

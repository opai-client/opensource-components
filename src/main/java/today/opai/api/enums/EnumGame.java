package today.opai.api.enums;

public enum EnumGame {
    QUAKECRAFT("Quakecraft"),
    WALLS("Walls"),
    PAINTBALL("Paintball"),
    SURVIVAL_GAMES("Blitz Survival Games"),
    TNTGAMES("The TNT Games"),
    VAMPIREZ("VampireZ"),
    WALLS3("Mega Walls"),
    ARCADE("Arcade"),
    ARENA("Arena Brawl"),
    MCGO("Cops and Crims"),
    UHC("UHC Champions"),
    BATTLEGROUND("Warlords"),
    SUPER_SMASH("Smash Heroes"),
    GINGERBREAD("Turbo Kart Racers"),
    HOUSING("Housing"),
    SKYWARS("SkyWars"),
    TRUE_COMBAT("Crazy Walls"),
    SPEED_UHC("Speed UHC"),
    SKYCLASH("SkyClash"),
    LEGACY("Classic Games"),
    PROTOTYPE("Prototype"),
    BEDWARS("Bed Wars"),
    MURDER_MYSTERY("Murder Mystery"),
    BUILD_BATTLE("Build Battle"),
    DUELS("Duels"),
    SKYBLOCK("SkyBlock"),
    PIT("Pit"),
    REPLAY("Replay"),
    SMP("SMP"),
    WOOL_GAMES("Wool Wars"),
    LOBBY("Lobby"),
    UNKNOWN("Unknown");

    private String name;

    EnumGame(String s) {
        this.name = s;
    }

    public String getName() {
        return name;
    }

    public static EnumGame getEnumByName(String name) {
        for (EnumGame mode : EnumGame.values()) {
            if (mode.getName().equalsIgnoreCase(name)) {
                return mode;
            }
        }
        throw new IllegalArgumentException("No suck game name " + name);
    }
}

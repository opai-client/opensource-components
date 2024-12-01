package today.opai.api.interfaces.client.hypixel;

import com.google.gson.annotations.SerializedName;

public class Data {
    private Player player;
    private Arcade arcade;
    private Skywars skywars;
    private Bedwars bedwars;
    private Duels duels;
    private MegaWalls megawalls;
    private UHC uhc;
    private BSG bsg;
    private CAC cac;
}

class Player {
    private String rank;
    private String guild;
    private double level;
    private int karma;
    @SerializedName("achievement-points")
    private int achievementPoints;
    @SerializedName("completed-quests")
    private int completedQuests;
    @SerializedName("ranks-gifted")
    private int ranksGifted;

    // Getters and Setters
}

class HideAndSeek {
    @SerializedName("seeker-wins")
    private int seekerWins;
    @SerializedName("hider-wins")
    private int hiderWins;
    @SerializedName("party-pooper-seeker-wins")
    private int partyPooperSeekerWins;
    @SerializedName("party-pooper-hider-wins")
    private int partyPooperHiderWins;

    // Getters and Setters
}

class Dropper {
    @SerializedName("fastest-game")
    private int fastestGame;
    @SerializedName("games-played")
    private int gamesPlayed;
    private int wins;
    @SerializedName("win-ratio")
    private int winRatio;
    @SerializedName("flawless-game")
    private int flawlessGame;
    private int fails;

    // Getters and Setters
}

class Zombies {
    private int accuracy;
    @SerializedName("head-shot-accuracy")
    private int headShotAccuracy;

    // Getters and Setters
}

class Arcade {
    private int coins;
    @SerializedName("kills-blocking-dead")
    private int killsBlockingDead;
    @SerializedName("kills-dragonwars")
    private int killsDragonwars;
    @SerializedName("kills-bounty-hunter")
    private int killsBountyHunter;
    @SerializedName("kills-throw-out")
    private int killsThrowOut;
    @SerializedName("poop-collected")
    private int poopCollected;
    @SerializedName("headshots-blocking-dead")
    private int headshotsBlockingDead;
    @SerializedName("wins-blocking-dead")
    private int winsBlockingDead;
    @SerializedName("wins-dragonwars")
    private int winsDragonwars;
    @SerializedName("wins-enderspleef")
    private int winsEnderspleef;
    @SerializedName("wins-farm-hunt")
    private int winsFarmHunt;
    @SerializedName("wins-bounty-hunter")
    private int winsBountyHunter;
    @SerializedName("wins-party-games")
    private int winsPartyGames;
    @SerializedName("wins-throw-out")
    private int winsThrowOut;
    @SerializedName("wins-hole-in-the-wall")
    private int winsHoleInTheWall;
    @SerializedName("hitw-highest-score-qualifications")
    private int hitwHighestScoreQualifications;
    @SerializedName("hitw-highest-score-finals")
    private int hitwHighestScoreFinals;
    @SerializedName("wins-hypixel-says")
    private int winsHypixelSays;
    @SerializedName("wins-mini-walls")
    private int winsMiniWalls;
    @SerializedName("gw-kills")
    private int gwKills;
    @SerializedName("gw-empire-kills")
    private int gwEmpireKills;
    @SerializedName("gw-rebel-kills")
    private int gwRebelKills;
    @SerializedName("gw-deaths")
    private int gwDeaths;
    @SerializedName("gw-shots-fired")
    private int gwShotsFired;
    private HideAndSeek hideAndSeek;
    private Dropper dropper;
    private Zombies zombies;

    // Getters and Setters
}

class Skywars {
    private int level;
    private String prestige;
    private int coins;
    private int tokens;
    private int kills;
    private int assists;
    private int deaths;
    private double kdr;
    private int wins;
    private int losses;
    private double wlr;
    @SerializedName("blocks-broken")
    private int blocksBroken;
    @SerializedName("blocks-placed")
    private int blocksPlaced;
    @SerializedName("soul-well-uses")
    private int soulWellUses;
    @SerializedName("soul-well-legendaries")
    private int soulWellLegendaries;
    @SerializedName("soul-well-rares")
    private int soulWellRares;
    @SerializedName("paid-souls")
    private int paidSouls;
    @SerializedName("souls-gathered")
    private int soulsGathered;
    @SerializedName("eggs-thrown")
    private int eggsThrown;
    @SerializedName("enderpearls-thrown")
    private int enderpearlsThrown;
    @SerializedName("arrows-shot")
    private int arrowsShot;
    @SerializedName("arrows-hit")
    private int arrowsHit;
    @SerializedName("arrow-hit-miss-ratio")
    private int arrowHitMissRatio;

    // Getters and Setters
}

class BedwarsStats {
    private int kills;
    private int deaths;
    private double kdr;
    @SerializedName("final-kills")
    private int finalKills;
    @SerializedName("final-deaths")
    private int finalDeaths;
    private double fkdr;
    private int wins;
    private int losses;
    private double wlr;
    @SerializedName("beds-broken")
    private int bedsBroken;

    // Getters and Setters
}

class Bedwars {
    private int tokens;
    private int winstreak;
    private String prestige;
    private int level;
    @SerializedName("diamonds-collected")
    private int diamondsCollected;
    @SerializedName("emeralds-collected")
    private int emeraldsCollected;
    @SerializedName("gold-collected")
    private int goldCollected;
    @SerializedName("iron-collected")
    private int ironCollected;
    private BedwarsStats solo;
    private BedwarsStats doubles;
    private BedwarsStats threeV3V3V3;
    private BedwarsStats fourV4V4V4;
    @SerializedName("core-modes")
    private BedwarsStats coreModes;
    private BedwarsStats fourV4;
    @SerializedName("rush-solo")
    private BedwarsStats rushSolo;
    @SerializedName("rush-doubles")
    private BedwarsStats rushDoubles;
    @SerializedName("rush-4v4v4v4")
    private BedwarsStats rushFourV4V4V4;
    @SerializedName("ultimate-solo")
    private BedwarsStats ultimateSolo;
    @SerializedName("ultimate-doubles")
    private BedwarsStats ultimateDoubles;
    @SerializedName("ultimate-4v4v4v4")
    private BedwarsStats ultimateFourV4V4V4;
    @SerializedName("lucky-doubles")
    private BedwarsStats luckyDoubles;
    @SerializedName("lucky-4v4v4v4")
    private BedwarsStats luckyFourV4V4V4;
    private BedwarsStats castle;
    private BedwarsStats capture;
    @SerializedName("swap-doubles")
    private BedwarsStats swapDoubles;
    @SerializedName("swap-4v4v4v4")
    private BedwarsStats swapFourV4V4V4;
    @SerializedName("voidless-4v4v4v4")
    private BedwarsStats voidlessFourV4V4V4;
    private BedwarsStats overall;

    // Getters and Setters
}

class Duels {
    private int tokens;
    private int kills;
    private int deaths;
    private double kdr;
    private int wins;
    private int losses;
    private double wlr;
    @SerializedName("arrows-shot")
    private int arrowsShot;
    @SerializedName("arrows-hit")
    private int arrowsHit;
    @SerializedName("arrow-hit-miss-ratio")
    private double arrowHitMissRatio;
    @SerializedName("melee-swings")
    private int meleeSwings;
    @SerializedName("melee-hits")
    private int meleeHits;
    @SerializedName("melee-hit-miss-ratio")
    private double meleeHitMissRatio;

    // Getters and Setters
}

class MegaWalls {
    private int coins;
    private int kills;
    private int assists;
    private int deaths;
    @SerializedName("final-kills")
    private int finalKills;
    @SerializedName("final-assists")
    private int finalAssists;
    @SerializedName("final-deaths")
    private int finalDeaths;
    private int wins;
    private int losses;
    private double kdr;
    private double fkdr;
    private double wlr;
    @SerializedName("wither-damage")
    private int witherDamage;
    @SerializedName("defending-kills")
    private int defendingKills;

    // Getters and Setters
}

class UHC {
    private int coins;
    private int score;

    // Getters and Setters
}

class BSG {
    private int coins;
    private int kills;
    private int deaths;
    @SerializedName("wins-solo")
    private int winsSolo;
    @SerializedName("wins-team")
    private int winsTeam;
    private double kdr;
    @SerializedName("kills-per-game")
    private double killsPerGame;

    // Getters and Setters
}

class CAC {
    private int coins;
    @SerializedName("total-kills")
    private int totalKills;
    private int headshots;
    private int deaths;
    @SerializedName("game-wins")
    private int gameWins;
    @SerializedName("round-wins")
    private int roundWins;
    @SerializedName("shots-fired")
    private int shotsFired;
    @SerializedName("cop-kills")
    private int copKills;
    @SerializedName("criminal-kills")
    private int criminalKills;
    @SerializedName("deathmatch-kills")
    private int deathmatchKills;
    @SerializedName("bombs-planted")
    private int bombsPlanted;
    @SerializedName("bombs-defused")
    private int bombsDefused;

    // Getters and Setters
}

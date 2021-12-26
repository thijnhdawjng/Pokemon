package com.cdpt.pokemon.pokemon;

import java.util.Map;
import java.util.TreeMap;

public enum Species {
	BULBASAUR(Pokemon.BULBASAUR),
    IVYSAUR(Pokemon.IVYSAUR),
    VENUSAUR(Pokemon.VENUSAUR),
    CHARMANDER(Pokemon.CHARMANDER),
    CHARMELEON(Pokemon.CHARMELEON),
    CHARIZARD(Pokemon.CHARIZARD),
    SQUIRTLE(Pokemon.SQUIRTLE),
    WARTORTLE(Pokemon.WARTORTLE),
    BLASTOISE(Pokemon.BLASTOISE),
    CATERPIE(Pokemon.CATERPIE),
    METAPOD(Pokemon.METAPOD),
    BUTTERFREE(Pokemon.BUTTERFREE),
    WEEDLE(Pokemon.WEEDLE),
    KAKUNA(Pokemon.KAKUNA),
    BEEDRILL(Pokemon.BEEDRILL),
    PIDGEY(Pokemon.PIDGEY),
    PIDGEOTTO(Pokemon.PIDGEOTTO),
    PIDGEOT(Pokemon.PIDGEOT),
    RATTATA(Pokemon.RATTATA),
    RATICATE(Pokemon.RATICATE),
    SPEAROW(Pokemon.SPEAROW),
    FEAROW(Pokemon.FEAROW),
    EKANS(Pokemon.EKANS),
    ARBOK(Pokemon.ARBOK),
    PIKACHU(Pokemon.PIKACHU),
    RAICHU(Pokemon.RAICHU),
    SANDSHREW(Pokemon.SANDSHREW),
    SANDSLASH(Pokemon.SANDSLASH),
    NIDORAN_FEMALE(Pokemon.NIDORAN_FEMALE),
    NIDORINA(Pokemon.NIDORINA),
    NIDOQUEEN(Pokemon.NIDOQUEEN),
    NIDORAN_MALE(Pokemon.NIDORAN_MALE),
    NIDORINO(Pokemon.NIDORINO),
    NIDOKING(Pokemon.NIDOKING),
    CLEFAIRY(Pokemon.CLEFAIRY),
    CLEFABLE(Pokemon.CLEFABLE),
    VULPIX(Pokemon.VULPIX),
    NINETALES(Pokemon.NINETALES),
    JIGGLYPUFF(Pokemon.JIGGLYPUFF),
    WIGGLYTUFF(Pokemon.WIGGLYTUFF),
    ZUBAT(Pokemon.ZUBAT),
    GOLBAT(Pokemon.GOLBAT),
    ODDISH(Pokemon.ODDISH),
    GLOOM(Pokemon.GLOOM),
    VILEPLUME(Pokemon.VILEPLUME),
    PARAS(Pokemon.PARAS),
    PARASECT(Pokemon.PARASECT),
    VENONAT(Pokemon.VENONAT),
    VENOMOTH(Pokemon.VENOMOTH),
    DIGLETT(Pokemon.DIGLETT),
    DUGTRIO(Pokemon.DUGTRIO),
    MEOWTH(Pokemon.MEOWTH),
    PERSIAN(Pokemon.PERSIAN),
    PSYDUCK(Pokemon.PSYDUCK),
    GOLDUCK(Pokemon.GOLDUCK),
    MANKEY(Pokemon.MANKEY),
    PRIMEAPE(Pokemon.PRIMEAPE),
    GROWLITHE(Pokemon.GROWLITHE),
    ARCANINE(Pokemon.ARCANINE),
    POLIWAG(Pokemon.POLIWAG),
    POLIWHIRL(Pokemon.POLIWHIRL),
    POLIWRATH(Pokemon.POLIWRATH),
    ABRA(Pokemon.ABRA),
    KADABRA(Pokemon.KADABRA),
    ALAKAZAM(Pokemon.ALAKAZAM),
    MACHOP(Pokemon.MACHOP),
    MACHOKE(Pokemon.MACHOKE),
    MACHAMP(Pokemon.MACHAMP),
    BELLSPROUT(Pokemon.BELLSPROUT),
    WEEPINBELL(Pokemon.WEEPINBELL),
    VICTREEBEL(Pokemon.VICTREEBEL),
    TENTACOOL(Pokemon.TENTACOOL),
    TENTACRUEL(Pokemon.TENTACRUEL),
    GEODUDE(Pokemon.GEODUDE),
    GRAVELER(Pokemon.GRAVELER),
    GOLEM(Pokemon.GOLEM),
    PONYTA(Pokemon.PONYTA),
    RAPIDASH(Pokemon.RAPIDASH),
    SLOWPOKE(Pokemon.SLOWPOKE),
    SLOWBRO(Pokemon.SLOWBRO),
    MAGNEMITE(Pokemon.MAGNEMITE),
    MAGNETON(Pokemon.MAGNETON),
    FARFETCH_D(Pokemon.FARFETCH_D),
    DODUO(Pokemon.DODUO),
    DODRIO(Pokemon.DODRIO),
    SEEL(Pokemon.SEEL),
    DEWGONG(Pokemon.DEWGONG),
    GRIMER(Pokemon.GRIMER),
    MUK(Pokemon.MUK),
    SHELLDER(Pokemon.SHELLDER),
    CLOYSTER(Pokemon.CLOYSTER),
    GASTLY(Pokemon.GASTLY),
    HAUNTER(Pokemon.HAUNTER),
    GENGAR(Pokemon.GENGAR),
    ONIX(Pokemon.ONIX),
    DROWZEE(Pokemon.DROWZEE),
    HYPNO(Pokemon.HYPNO),
    KRABBY(Pokemon.KRABBY),
    KINGLER(Pokemon.KINGLER),
    VOLTORB(Pokemon.VOLTORB),
    ELECTRODE(Pokemon.ELECTRODE),
    EXEGGCUTE(Pokemon.EXEGGCUTE),
    EXEGGUTOR(Pokemon.EXEGGUTOR),
    CUBONE(Pokemon.CUBONE),
    MAROWAK(Pokemon.MAROWAK),
    HITMONLEE(Pokemon.HITMONLEE),
    HITMONCHAN(Pokemon.HITMONCHAN),
    LICKITUNG(Pokemon.LICKITUNG),
    KOFFING(Pokemon.KOFFING),
    WEEZING(Pokemon.WEEZING),
    RHYHORN(Pokemon.RHYHORN),
    RHYDON(Pokemon.RHYDON),
    CHANSEY(Pokemon.CHANSEY),
    TANGELA(Pokemon.TANGELA),
    KANGASKHAN(Pokemon.KANGASKHAN),
    HORSEA(Pokemon.HORSEA),
    SEADRA(Pokemon.SEADRA),
    GOLDEEN(Pokemon.GOLDEEN),
    SEAKING(Pokemon.SEAKING),
    STARYU(Pokemon.STARYU),
    STARMIE(Pokemon.STARMIE),
    MR_MIME(Pokemon.MR_MIME),
    SCYTHER(Pokemon.SCYTHER),
    JYNX(Pokemon.JYNX),
    ELECTABUZZ(Pokemon.ELECTABUZZ),
    MAGMAR(Pokemon.MAGMAR),
    PINSIR(Pokemon.PINSIR),
    TAUROS(Pokemon.TAUROS),
    MAGIKARP(Pokemon.MAGIKARP),
    GYARADOS(Pokemon.GYARADOS),
    LAPRAS(Pokemon.LAPRAS),
    DITTO(Pokemon.DITTO),
    EEVEE(Pokemon.EEVEE),
    VAPOREON(Pokemon.VAPOREON),
    JOLTEON(Pokemon.JOLTEON),
    FLAREON(Pokemon.FLAREON),
    PORYGON(Pokemon.PORYGON),
    OMANYTE(Pokemon.OMANYTE),
    OMASTAR(Pokemon.OMASTAR),
    KABUTO(Pokemon.KABUTO),
    KABUTOPS(Pokemon.KABUTOPS),
    AERODACTYL(Pokemon.AERODACTYL),
    SNORLAX(Pokemon.SNORLAX),
    ARTICUNO(Pokemon.ARTICUNO),
    ZAPDOS(Pokemon.ZAPDOS),
    MOLTRES(Pokemon.MOLTRES),
    DRATINI(Pokemon.DRATINI),
    DRAGONAIR(Pokemon.DRAGONAIR),
    DRAGONITE(Pokemon.DRAGONITE),
    MEWTWO(Pokemon.MEWTWO),
    MEW(Pokemon.MEW);

	private enum Pokemon
    {
        BULBASAUR("Bulbasaur", "001", (short)45, new short[] {45, 49, 65, 45}, (short)64, new byte[] {0, 1, 0, 0}, convertToMap(new int[] {0, 3, 7, 9, 13, 13, 15, 19, 21, 25, 27, 31, 33, 37}, new Move[] {Move.TACKLE, Move.GROWL, Move.LEECH_SEED, Move.VINE_WHIP, Move.POISON_POWDER, Move.SLEEP_POWDER, Move.TAKE_DOWN, Move.RAZOR_LEAF, Move.SWEET_SCENT, Move.GROWTH, Move.DOUBLE_EDGE, Move.WORRY_SEED, Move.SYNTHESIS, Move.SEED_BOMB}), Type.GRASS, Type.POISON),
        IVYSAUR("Ivysaur", "002", (short)45, new short[] {60, 62, 63, 80, 80, 60}, (short)142, new byte[] {0, 0, 0, 1, 1, 0},convertToMap(new int[] {0, 0, 0, 3, 7, 9, 13, 13, 15, 20, 23, 28, 31, 36, 39, 44}, new Move[] {Move.TACKLE, Move.GROWL, Move.LEECH_SEED, Move.GROWL, Move.LEECH_SEED, Move.VINE_WHIP, Move.POISONPOWDER, Move.SLEEP_POWDER, Move.TAKE_DOWN, Move.RAZOR_LEAF, Move.SWEET_SCENT, Move.GROWTH, Move.DOUBLE_EDGE, Move.WORRY_SEED, Move.SYNTHESIS, Move.SOLARBEAM}), Type.GRASS, Type.POISON),
        VENUSAUR("Venusaur", "003", (short)45, new short[] {80, 82, 83, 100, 100, 80}, (short)236, new byte[] {0, 0, 0, 2, 1, 0},convertToMap(new int[] {0, 0, 0, 0, 3, 7, 9, 13, 13, 15, 20, 23, 28, 31, 32, 39, 45, 53}, new Move[] {Move.TACKLE, Move.GROWL, Move.LEECH_SEED, Move.VINE_WHIP, Move.GROWL, Move.LEECH_SEED, Move.VINE_WHIP, Move.POISONPOWDER, Move.SLEEP_POWDER, Move.TAKE_DOWN, Move.RAZOR_LEAF, Move.SWEET_SCENT, Move.GROWTH, Move.DOUBLE_EDGE, Move.PETAL_DANCE, Move.WORRY_SEED, Move.SYNTHESIS, Move.SOLARBEAM}), Type.GRASS, Type.POISON),
        CHARMANDER("Charmander", "004", (short)45, new short[] {39, 52, 43, 60, 50, 65}, (short)62, new byte[] {0, 0, 0, 0, 0, 1},convertToMap(new int[] {0, 0, 7, 10, 16, 19, 25, 28, 34, 37, 43, 46}, new Move[] {Move.SCRATCH, Move.GROWL, Move.EMBER, Move.SMOKESCREEN, Move.DRAGON_RAGE, Move.SCARY_FACE, Move.FIRE_FANG, Move.FLAME_BURST, Move.SLASH, Move.FLAMETHROWER, Move.FIRE_SPIN, Move.INFERNO}), Type.FIRE),
        CHARMELEON("Charmeleon", "005", (short)45, new short[] {58, 64, 58, 80, 65, 80}, (short)142, new byte[] {0, 0, 0, 1, 0, 1},convertToMap(new int[] {0, 0, 0, 7, 10, 17, 21, 28, 32, 39, 43, 50, 54}, new Move[] {Move.SCRATCH, Move.GROWL, Move.EMBER, Move.EMBER, Move.SMOKESCREEN, Move.DRAGON_RAGE, Move.SCARY_FACE, Move.FIRE_FANG, Move.FLAME_BURST, Move.SLASH, Move.FLAMETHROWER, Move.FIRE_SPIN, Move.INFERNO}), Type.FIRE),
        CHARIZARD("Charizard", "006", (short)45, new short[] {78, 84, 78, 109, 85, 100}, (short)240, new byte[] {0, 0, 0, 3, 0, 0}, convertToMap(new int[] {0, 0, 0, 0, 0, 0, 0, 7, 10, 17, 21, 28, 32, 36, 41, 47, 56, 62, 71, 77}, new Move[] {Move.DRAGON_CLAW, Move.SHADOW_CLAW, Move.AIR_SLASH, Move.SCRATCH, Move.GROWL, Move.EMBER, Move.SMOKESCREEN, Move.EMBER, Move.SMOKESCREEN, Move.DRAGON_RAGE, Move.SCARY_FACE, Move.FIRE_FANG, Move.FLAME_BURST, Move.WING_ATTACK, Move.SLASH, Move.FLAMETHROWER, Move.FIRE_SPIN, Move.INFERNO, Move.HEAT_WAVE, Move.FLARE_BLITZ}), Type.FIRE, Type.FLYING),
        SQUIRTLE("Squirtle", "007", (short)45, new short[] {44, 48, 65, 50, 64, 43}, (short)63, new byte[] {0, 0, 1, 0, 0, 0},convertToMap(new int[] {0, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34, 37, 40}, new Move[] {Move.TACKLE, Move.TAIL_WHIP, Move.BUBBLE, Move.WITHDRAW, Move.WATER_GUN, Move.BITE, Move.RAPID_SPIN, Move.PROTECT, Move.WATER_PULSE, Move.AQUA_TAIL, Move.SKULL_BASH, Move.IRON_DEFENSE, Move.RAIN_DANCE, Move.HYDRO_PUMP}), Type.WATER),
        WARTORTLE("Wartortle", "008", (short)45, new short[] {59, 63, 80, 65, 80, 58}, (short)142, new byte[] {0, 0, 1, 0, 1, 0},convertToMap(new int[] {0, 0, 0, 4, 7, 10, 13, 16, 20, 24, 28, 32, 36, 40, 44, 48}, new Move[] {Move.TACKLE, Move.TAIL_WHIP, Move.BUBBLE, Move.TAIL_WHIP, Move.BUBBLE, Move.WITHDRAW, Move.WATER_GUN, Move.BITE, Move.RAPID_SPIN, Move.PROTECT, Move.WATER_PULSE, Move.AQUA_TAIL, Move.SKULL_BASH, Move.IRON_DEFENSE, Move.RAIN_DANCE, Move.HYDRO_PUMP}), Type.WATER),
        BLASTOISE("Blastoise", "009", (short)45, new short[] {79, 83, 100, 85, 105, 78}, (short)239, new byte[] {0, 0, 0, 0, 3, 0},convertToMap(new int[] {0, 0, 0, 0, 0, 4, 7, 10, 13, 16, 20, 24, 28, 32, 39, 46, 53, 60}, new Move[] {Move.FLASH_CANNON, Move.TACKLE, Move.TAIL_WHIP, Move.BUBBLE, Move.WITHDRAW, Move.TAIL_WHIP, Move.BUBBLE, Move.WITHDRAW, Move.WATER_GUN, Move.BITE, Move.RAPID_SPIN, Move.PROTECT, Move.WATER_PULSE, Move.AQUA_TAIL, Move.SKULL_BASH, Move.IRON_DEFENSE, Move.RAIN_DANCE, Move.HYDRO_PUMP}), Type.WATER),
        CATERPIE("Caterpie", "010", (short)255, new short[] {45, 30, 35, 20, 20, 45}, (short)39, new byte[] {1, 0, 0, 0, 0, 0},convertToMap(new int[] {0, 0, 15}, new Move[] {Move.TACKLE, Move.STRING_SHOT, Move.BUG_BITE}), Type.BUG),
        METAPOD("Metapod", "011", (short)120, new short[] {50, 20, 55, 25, 25, 30}, (short)72, new byte[] {0, 0, 2, 0, 0, 0},convertToMap(new int[] {0, 7}, new Move[] {Move.HARDEN, Move.HARDEN}), Type.BUG),
        BUTTERFREE("Butterfree", "012", (short)45, new short[] {60, 45, 50, 80, 80, 70}, (short)173, new byte[] {0, 0, 0, 2, 1, 0},convertToMap(new int[] {0, 10, 12, 12, 12, 16, 18, 22, 24, 28, 30, 34, 36, 40, 42, 46}, new Move[] {Move.CONFUSION, Move.CONFUSION, Move.POISONPOWDER, Move.STUN_SPORE, Move.SLEEP_POWDER, Move.GUST, Move.SUPERSONIC, Move.WHIRLWIND, Move.PSYBEAM, Move.SILVER_WIND, Move.TAILWIND, Move.RAGE_POWDER, Move.SAFEGUARD, Move.CAPTIVATE, Move.BUG_BUZZ, Move.QUIVER_DANCE}), Type.BUG, Type.FLYING),
        WEEDLE("Weedle", "013", (short)255, new short[] {40, 35, 30, 20, 20, 50}, (short)39, new byte[] {0, 0, 0, 0, 0, 1},convertToMap(new int[] {0, 0, 15}, new Move[] {Move.POISON_STING, Move.STRING_SHOT, Move.BUG_BITE}), Type.BUG, Type.POISON),
        KAKUNA("Kakuna", "014", (short)120, new short[] {45, 25, 50, 25, 25, 35}, (short)72, new byte[] {0, 0, 2, 0, 0, 0},convertToMap(new int[] {0, 7}, new Move[] {Move.HARDEN, Move.HARDEN}), Type.BUG, Type.POISON),
        BEEDRILL("Beedrill", "015", (short)45, new short[] {65, 80, 40, 45, 80, 75}, (short)173, new byte[] {0, 2, 0, 0, 1, 0},convertToMap(new int[] {0, 10, 13, 16, 19, 22, 25, 28, 31, 34, 37, 40}, new Move[] {Move.FURY_ATTACK, Move.FURY_ATTACK, Move.FOCUS_ENERGY, Move.TWINEEDLE, Move.RAGE, Move.PURSUIT, Move.TOXIC_SPIKES, Move.PIN_MISSILE, Move.AGILITY, Move.ASSURANCE, Move.POISON_JAB, Move.ENDEAVOR}), Type.BUG, Type.POISON),
        PIDGEY("Pidgey", "016", (short)255, new short[] {40, 45, 40, 35, 35, 56}, (short)50, new byte[] {0, 0, 0, 0, 0, 1},convertToMap(new int[] {0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49, 53}, new Move[] {Move.TACKLE, Move.SAND_ATTACK, Move.GUST, Move.QUICK_ATTACK, Move.WHIRLWIND, Move.TWISTER, Move.FEATHERDANCE, Move.AGILITY, Move.WING_ATTACK, Move.ROOST, Move.TAILWIND, Move.MIRROR_MOVE, Move.AIR_SLASH, Move.HURRICANE}), Type.NORMAL, Type.FLYING),
        PIDGEOTTO("Pidgeotto", "017", (short)120, new short[] {63, 60, 55, 50, 50, 71}, (short)113, new byte[] {0, 0, 0, 0, 0, 2},convertToMap(new int[] {0, 0, 0, 5, 9, 13, 17, 22, 27, 32, 37, 42, 47, 52, 57, 62}, new Move[] {Move.TACKLE, Move.SAND_ATTACK, Move.GUST, Move.SAND_ATTACK, Move.GUST, Move.QUICK_ATTACK, Move.WHIRLWIND, Move.TWISTER, Move.FEATHERDANCE, Move.AGILITY, Move.WING_ATTACK, Move.ROOST, Move.TAILWIND, Move.MIRROR_MOVE, Move.AIR_SLASH, Move.HURRICANE}), Type.NORMAL, Type.FLYING),
        PIDGEOT("Pidgeot", "018", (short)45, new short[] {83, 80, 75, 70, 70, 91}, (short)172, new byte[] {0, 0, 0, 0, 0, 3},convertToMap(new int[] {0, 0, 0, 0, 5, 9, 13, 17, 22, 27, 32, 38, 44, 50, 56, 62, 68}, new Move[] {Move.TACKLE, Move.SAND_ATTACK, Move.GUST, Move.QUICK_ATTACK, Move.SAND_ATTACK, Move.GUST, Move.QUICK_ATTACK, Move.WHIRLWIND, Move.TWISTER, Move.FEATHERDANCE, Move.AGILITY, Move.WING_ATTACK, Move.ROOST, Move.TAILWIND, Move.MIRROR_MOVE, Move.AIR_SLASH, Move.HURRICANE}), Type.NORMAL, Type.FLYING),
        RATTATA("Rattata", "019", (short)255, new short[] {30, 56, 35, 25, 35, 72}, (short)57, new byte[] {0, 0, 0, 0, 0, 1},convertToMap(new int[] {0, 0, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34}, new Move[] {Move.TACKLE, Move.TAIL_WHIP, Move.QUICK_ATTACK, Move.FOCUS_ENERGY, Move.BITE, Move.PURSUIT, Move.HYPER_FANG, Move.SUCKER_PUNCH, Move.CRUNCH, Move.ASSURANCE, Move.SUPER_FANG, Move.DOUBLE_EDGE, Move.ENDEAVOR}), Type.NORMAL),
        RATICATE("Raticate", "020", (short)127, new short[] {55, 81, 60, 50, 70, 97}, (short)116, new byte[] {0, 0, 0, 0, 0, 2},convertToMap(new int[] {0, 0, 0, 0, 0, 4, 7, 10, 13, 16, 19, 20, 24, 29, 34, 39, 44}, new Move[] {Move.SWORDS_DANCE, Move.TACKLE, Move.TAIL_WHIP, Move.QUICK_ATTACK, Move.FOCUS_ENERGY, Move.QUICK_ATTACK, Move.FOCUS_ENERGY, Move.BITE, Move.PURSUIT, Move.HYPER_FANG, Move.SUCKER_PUNCH, Move.SCARY_FACE, Move.CRUNCH, Move.ASSURANCE, Move.SUPER_FANG, Move.DOUBLE_EDGE, Move.ENDEAVOR}), Type.NORMAL),
        SPEAROW("Spearow", "021", (short)255, new short[] {40, 60, 30, 31, 31, 70}, (short)58, new byte[] {0, 0, 0, 0, 0, 1},convertToMap(new int[] {0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 37}, new Move[] {Move.PECK, Move.GROWL, Move.LEER, Move.FURY_ATTACK, Move.PURSUIT, Move.AERIAL_ACE, Move.MIRROR_MOVE, Move.AGILITY, Move.ASSURANCE, Move.ROOST, Move.DRILL_PECK}), Type.NORMAL, Type.FLYING),
        FEAROW("Fearow", "022", (short)90, new short[] {65, 90, 65, 61, 61, 100}, (short)162, new byte[] {0, 0, 0, 0, 0, 2},convertToMap(new int[] {0, 0, 0, 0, 0, 5, 9, 13, 17, 23, 29, 35, 41, 47, 53}, new Move[] {Move.PLUCK, Move.PECK, Move.GROWL, Move.LEER, Move.FURY_ATTACK, Move.LEER, Move.FURY_ATTACK, Move.PURSUIT, Move.AERIAL_ACE, Move.MIRROR_MOVE, Move.AGILITY, Move.ASSURANCE, Move.ROOST, Move.DRILL_PECK, Move.DRILL_RUN}), Type.NORMAL, Type.FLYING),
        EKANS("Ekans", "023", (short)255, new short[] {35, 60, 44, 40, 54, 55}, (short)62, new byte[] {0, 1, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 4, 9, 12, 17, 20, 25, 25, 25, 28, 33, 36, 41, 44, 49}, new Move[] {Move.WRAP, Move.LEER, Move.POISON_STING, Move.BITE, Move.GLARE, Move.SCREECH, Move.ACID, Move.STOCKPILE, Move.SWALLOW, Move.SPIT_UP, Move.ACID_SPRAY, Move.MUD_BOMB, Move.GASTRO_ACID, Move.HAZE, Move.COIL, Move.GUNK_SHOT}), Type.POISON),
        ARBOK("Arbok", "024", (short)90, new short[] {60, 85, 69, 65, 79, 80}, (short)147, new byte[] {0, 2, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 0, 0, 0, 0, 0, 4, 9, 12, 17, 20, 22, 27, 27, 27, 32, 39, 44, 51, 56, 63}, new Move[] {Move.ICE_FANG, Move.THUNDER_FANG, Move.FIRE_FANG, Move.WRAP, Move.LEER, Move.POISON_STING, Move.BITE, Move.POISON_STING, Move.BITE, Move.GLARE, Move.SCREECH, Move.ACID, Move.CRUNCH, Move.STOCKPILE, Move.SWALLOW, Move.SPIT_UP, Move.ACID_SPRAY, Move.MUD_BOMB, Move.GASTRO_ACID, Move.HAZE, Move.COIL, Move.GUNK_SHOT}), Type.POISON),
        PIKACHU("Pikachu", "025", (short)190, new short[] {35, 55, 30, 50, 40, 90}, (short)82, new byte[] {0, 0, 0, 0, 0, 2}, convertToMap(new int[] {0, 0, 5, 10, 13, 18, 21, 26, 29, 34, 37, 42, 45, 50}, new Move[] {Move.GROWL, Move.THUNDERSHOCK, Move.TAIL_WHIP, Move.THUNDER_WAVE, Move.QUICK_ATTACK, Move.ELECTRO_BALL, Move.DOUBLE_TEAM, Move.SLAM, Move.THUNDERBOLT, Move.FEINT, Move.AGILITY, Move.DISCHARGE, Move.LIGHT_SCREEN, Move.THUNDER}), Type.ELECTRIC),
        RAICHU("Raichu", "026", (short)75, new short[] {60, 90, 55, 90, 80, 100}, (short)122, new byte[] {0, 0, 0, 0, 0, 3}, convertToMap(new int[] {0, 0, 0, 0}, new Move[] {Move.THUNDERSHOCK, Move.TAIL_WHIP, Move.QUICK_ATTACK, Move.THUNDERBOLT}), Type.ELECTRIC),
        SANDSHREW("Sandshrew", "027", (short)255, new short[] {50, 75, 85, 20, 30, 40}, (short)93, new byte[] {0, 0, 1, 0, 0, 0}, convertToMap(new int[] {0, 0, 3, 5, 7, 9, 11, 14, 17, 20, 23, 26, 30, 34, 38, 42, 46}, new Move[] {Move.SCRATCH, Move.DEFENSE_CURL, Move.SAND_ATTACK, Move.POISON_STING, Move.ROLLOUT, Move.RAPID_SPIN, Move.SWIFT, Move.FURY_CUTTER, Move.MAGNITUDE, Move.FURY_SWIPES, Move.SAND_TOMB, Move.SLASH, Move.DIG, Move.GYRO_BALL, Move.SWORDS_DANCE, Move.SANDSTORM, Move.EARTHQUAKE}), Type.GROUND),
        SANDSLASH("Sandslash", "028", (short)90, new short[] {75, 100, 110, 45, 55, 65}, (short)163, new byte[] {0, 0, 2, 0, 0, 0}, convertToMap(new int[] {0, 0, 0, 0, 3, 5, 7, 9, 11, 14, 17, 20, 22, 23, 26, 30, 34, 38, 42, 46, -1}, new Move[] {Move.SCRATCH, Move.DEFENSE_CURL, Move.SAND_ATTACK, Move.POISON_STING, Move.SAND_ATTACK, Move.POISON_STING, Move.ROLLOUT, Move.RAPID_SPIN, Move.SWIFT, Move.FURY_CUTTER, Move.MAGNITUDE, Move.FURY_SWIPES, Move.CRUSH_CLAW, Move.SAND_TOMB, Move.SLASH, Move.DIG, Move.GYRO_BALL, Move.SWORDS_DANCE, Move.SANDSTORM, Move.EARTHQUAKE, Move.DEFENSE_CURL}), Type.GROUND),
        NIDORAN_FEMALE("Nidoran%E2%99%80", "029", (short)235, new short[] {55, 47, 52, 40, 40, 41}, (short)59, new byte[] {1, 0, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 7, 9, 13, 19, 21, 25, 31, 33, 37, 43, 45}, new Move[] {Move.GROWL, Move.SCRATCH, Move.TAIL_WHIP, Move.DOUBLE_KICK, Move.POISON_STING, Move.FURY_SWIPES, Move.BITE, Move.HELPING_HAND, Move.TOXIC_SPIKES, Move.FLATTER, Move.CRUNCH, Move.CAPTIVATE, Move.POISON_FANG}), Type.POISON),
        NIDORINA("Nidorina", "030", (short)120, new short[] {70, 62, 67, 55, 55, 56}, (short)117, new byte[] {2, 0, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 7, 9, 13, 20, 23, 28, 35, 38, 43, 50, 58}, new Move[] {Move.GROWL, Move.SCRATCH, Move.TAIL_WHIP, Move.DOUBLE_KICK, Move.POISON_STING, Move.FURY_SWIPES, Move.BITE, Move.HELPING_HAND, Move.TOXIC_SPIKES, Move.FLATTER, Move.CRUNCH, Move.CAPTIVATE, Move.POISON_FANG}), Type.POISON),
        NIDOQUEEN("Nidoqueen", "031", (short)45, new short[] {90, 82, 87, 75, 85, 76}, (short)194, new byte[] {3, 0, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 0, 0, 23, 35, 43, 58}, new Move[] {Move.SCRATCH, Move.TAIL_WHIP, Move.DOUBLE_KICK, Move.POISON_STING, Move.CHIP_AWAY, Move.BODY_SLAM, Move.EARTH_POWER, Move.SUPERPOWER}), Type.POISON, Type.GROUND),
        NIDORAN_MALE("Nidoran%E2%99%82", "032", (short)235, new short[] {46, 57, 40, 40, 40, 50}, (short)60, new byte[] {0, 1, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 7, 9, 13, 19, 21, 25, 31, 33, 37, 43, 45}, new Move[] {Move.LEER, Move.PECK, Move.FOCUS_ENERGY, Move.DOUBLE_KICK, Move.POISON_STING, Move.FURY_ATTACK, Move.HORN_ATTACK, Move.HELPING_HAND, Move.TOXIC_SPIKES, Move.FLATTER, Move.POISON_JAB, Move.CAPTIVATE, Move.HORN_DRILL}), Type.POISON),
        NIDORINO("Nidorino", "033", (short)120, new short[] {61, 72, 57, 55, 55, 65}, (short)118, new byte[] {0, 2, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 7, 9, 13, 20, 23, 28, 35, 38, 43, 50, 58}, new Move[] {Move.LEER, Move.PECK, Move.FOCUS_ENERGY, Move.DOUBLE_KICK, Move.POISON_STING, Move.FURY_ATTACK, Move.HORN_ATTACK, Move.HELPING_HAND, Move.TOXIC_SPIKES, Move.FLATTER, Move.POISON_JAB, Move.CAPTIVATE, Move.HORN_DRILL}), Type.POISON),
        NIDOKING("Nidoking", "034", (short)45, new short[] {81, 92, 77, 85, 75, 85}, (short)195, new byte[] {0, 3, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 0, 0, 23, 35, 43, 58}, new Move[] {Move.PECK, Move.FOCUS_ENERGY, Move.DOUBLE_KICK, Move.POISON_STING, Move.CHIP_AWAY, Move.THRASH, Move.EARTH_POWER, Move.MEGAHORN}), Type.POISON, Type.GROUND),
        CLEFAIRY("Clefairy", "035", (short)150, new short[] {70, 45, 48, 60, 65, 35}, (short)68, new byte[] {2, 0, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34, 37, 40, 43, 46, 49, 52, 55, 58}, new Move[] {Move.POUND, Move.GROWL, Move.ENCORE, Move.SING, Move.DOUBLESLAP, Move.DEFENSE_CURL, Move.FOLLOW_ME, Move.BESTOW, Move.WAKE_UP_SLAP, Move.MINIMIZE, Move.STORED_POWER, Move.METRONOME, Move.COSMIC_POWER, Move.LUCKY_CHANT, Move.BODY_SLAM, Move.MOONLIGHT, Move.LIGHT_SCREEN, Move.GRAVITY, Move.METEOR_MASH, Move.HEALING_WISH, Move.AFTER_YOU}), Type.NORMAL),
        CLEFABLE("Clefable", "036", (short)25, new short[] {95, 70, 73, 85, 90, 60}, (short)129, new byte[] {3, 0, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 0, 0}, new Move[] {Move.SING, Move.DOUBLESLAP, Move.MINIMIZE, Move.METRONOME}), Type.NORMAL),
        VULPIX("Vulpix", "037", (short)190, new short[] {38, 41, 40, 50, 65, 65}, (short)63, new byte[] {0, 0, 0, 0, 0, 1}, ,convertToMap(new int[] {0, 4, 7, 10, 12, 15, 18, 20, 23, 26, 28, 31, 34, 36, 39, 42, 44, 47, 50}, new Move[] {Move.EMBER, Move.TAIL_WHIP, Move.ROAR, Move.QUICK_ATTACK, Move.FIRE_SPIN, Move.CONFUSE_RAY, Move.IMPRISON, Move.FAINT_ATTACK, Move.FLAME_BURST, Move.WILL_O_WISP, Move.HEX, Move.PAYBACK, Move.FLAMETHROWER, Move.SAFEGUARD, Move.EXTRASENSORY, Move.FIRE_BLAST, Move.GRUDGE, Move.CAPTIVATE, Move.INFERNO}), Type.FIRE),
        NINETALES("Ninetales", "038", (short)75, new short[] {73, 76, 75, 81, 100, 100}, (short)178, new byte[] {0, 0, 0, 0, 1, 1}, ,convertToMap(new int[] {0, 0, 0, 0, 0}, new Move[] {Move.NASTY_PLOT, Move.EMBER, Move.QUICK_ATTACK, Move.CONFUSE_RAY, Move.SAFEGUARD}), Type.FIRE),
        JIGGLYPUFF("Jigglypuff", "039", (short)170, new short[] {115, 45, 20, 45, 25, 20}, (short)76, new byte[] {2, 0, 0, 0, 0, 0}, convertToMap(new int[] {0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49, 53}, new Move[] {Move.SING, Move.DEFENSE_CURL, Move.POUND, Move.DISABLE, Move.ROUND, Move.ROLLOUT, Move.DOUBLESLAP, Move.REST, Move.BODY_SLAM, Move.GYRO_BALL, Move.WAKE_UP_SLAP, Move.MIMIC, Move.HYPER_VOICE, Move.DOUBLE_EDGE}), Type.NORMAL),
        WIGGLYTUFF("Wigglytuff", "040", (short)50, new short[] {140, 70, 45, 75, 50, 45}, (short)109, new byte[] {3, 0, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 0, 0}, new Move[] {Move.SING, Move.DISABLE, Move.DEFENSE_CURL, Move.DOUBLESLAP}), Type.NORMAL),
        ZUBAT("Zubat", "041", (short)255, new short[] {40, 45, 35, 30, 40, 55}, (short)54, new byte[] {0, 0, 0, 0, 0, 1}, convertToMap(new int[] {0, 4, 8, 12, 15, 19, 23, 26, 30, 34, 37, 41, 45}, new Move[] {Move.LEECH_LIFE, Move.SUPERSONIC, Move.ASTONISH, Move.BITE, Move.WING_ATTACK, Move.CONFUSE_RAY, Move.SWIFT, Move.AIR_CUTTER, Move.ACROBATICS, Move.MEAN_LOOK, Move.POISON_FANG, Move.HAZE, Move.AIR_SLASH}), Type.POISON, Type.FLYING),
        GOLBAT("Golbat", "042", (short)90, new short[] {75, 80, 70, 65, 75, 90}, (short)171, new byte[] {0, 0, 0, 0, 0, 2}, convertToMap(new int[] {0, 0, 0, 0, 4, 8, 12, 15, 19, 24, 28, 33, 38, 42, 47, 52}, new Move[] {Move.SCREECH, Move.LEECH_LIFE, Move.SUPERSONIC, Move.ASTONISH, Move.SUPERSONIC, Move.ASTONISH, Move.BITE, Move.WING_ATTACK, Move.CONFUSE_RAY, Move.SWIFT, Move.AIR_CUTTER, Move.ACROBATICS, Move.MEAN_LOOK, Move.POISON_FANG, Move.HAZE, Move.AIR_SLASH}), Type.POISON, Type.FLYING),
        ODDISH("Oddish", "043", (short)255, new short[] {45, 50, 55, 75, 65, 30}, (short)78, new byte[] {0, 0, 0, 1, 0, 0}, convertToMap(new int[] {0, 5, 9, 13, 15, 17, 21, 25, 29, 33, 37, 41}, new Move[] {Move.ABSORB, Move.SWEET_SCENT, Move.ACID, Move.POISONPOWDER, Move.STUN_SPORE, Move.SLEEP_POWDER, Move.MEGA_DRAIN, Move.LUCKY_CHANT, Move.NATURAL_GIFT, Move.MOONLIGHT, Move.GIGA_DRAIN, Move.PETAL_DANCE}), Type.GRASS, Type.POISON),
        GLOOM("Gloom", "044", (short)120, new short[] {60, 65, 70, 85, 75, 40}, (short)132, new byte[] {0, 0, 0, 2, 0, 0}, convertToMap(new int[] {0, 0, 0, 5, 9, 13, 15, 17, 23, 29, 35, 41, 47, 53}, new Move[] {Move.ABSORB, Move.SWEET_SCENT, Move.ACID, Move.SWEET_SCENT, Move.ACID, Move.POISONPOWDER, Move.STUN_SPORE, Move.SLEEP_POWDER, Move.MEGA_DRAIN, Move.LUCKY_CHANT, Move.NATURAL_GIFT, Move.MOONLIGHT, Move.GIGA_DRAIN, Move.PETAL_DANCE}), Type.GRASS, Type.POISON),
        VILEPLUME("Vileplume", "045", (short)45, new short[] {75, 80, 85, 100, 90, 50}, (short)184, new byte[] {0, 0, 0, 3, 0, 0}, convertToMap(new int[] {0, 0, 0, 0, 53, 65}, new Move[] {Move.MEGA_DRAIN, Move.AROMATHERAPY, Move.STUN_SPORE, Move.POISONPOWDER, Move.PETAL_DANCE, Move.SOLARBEAM}), Type.GRASS, Type.POISON),
        PARAS("Paras", "046", (short)190, new short[] {35, 70, 55, 45, 55, 25}, (short)70, new byte[] {0, 1, 0, 0, 0, 0}, convertToMap(new int[] {0, 6, 6, 11, 17, 22, 27, 33, 38, 43, 49, 54}, new Move[] {Move.SCRATCH, Move.STUN_SPORE, Move.POISONPOWDER, Move.LEECH_LIFE, Move.FURY_CUTTER, Move.SPORE, Move.SLASH, Move.GROWTH, Move.GIGA_DRAIN, Move.AROMATHERAPY, Move.RAGE_POWDER, Move.X_SCISSOR}), Type.BUG, Type.GRASS),
        PARASECT("Parasect", "047", (short)75, new short[] {60, 95, 80, 60, 80, 30}, (short)128, new byte[] {0, 2, 1, 0, 0, 0}, convertToMap(new int[] {0, 0, 0, 0, 0, 6, 6, 11, 17, 22, 29, 37, 44, 51, 59, 66}, new Move[] {Move.CROSS_POISON, Move.SCRATCH, Move.STUN_SPORE, Move.POISONPOWDER, Move.LEECH_LIFE, Move.STUN_SPORE, Move.POISONPOWDER, Move.LEECH_LIFE, Move.FURY_CUTTER, Move.SPORE, Move.SLASH, Move.GROWTH, Move.GIGA_DRAIN, Move.AROMATHERAPY, Move.RAGE_POWDER, Move.X_SCISSOR}), Type.BUG, Type.GRASS),
        VENONAT("Venonat", "048", (short)190, new short[] {60, 55, 50, 40, 55, 45}, (short)75, new byte[] {0, 0, 0, 0, 1, 0}, convertToMap(new int[] {0, 0, 0, 5, 11, 13, 17, 23, 25, 29, 35, 37, 41, 47}, new Move[] {Move.TACKLE, Move.DISABLE, Move.FORESIGHT, Move.SUPERSONIC, Move.CONFUSION, Move.POISONPOWDER, Move.LEECH_LIFE, Move.STUN_SPORE, Move.PSYBEAM, Move.SLEEP_POWDER, Move.SIGNAL_BEAM, Move.ZEN_HEADBUTT, Move.POISON_FANG, Move.PSYCHIC}), Type.BUG, Type.POISON),
        VENOMOTH("Venomoth", "049", (short)75, new short[] {70, 65, 60, 90, 75, 90}, (short)138, new byte[] {0, 0, 0, 1, 0, 1}, convertToMap(new int[] {0, 0, 0, 0, 0, 5, 11, 13, 17, 23, 25, 29, 31, 37, 41, 47, 55, 59, 63}, new Move[] {Move.SILVER_WIND, Move.TACKLE, Move.DISABLE, Move.FORESIGHT, Move.SUPERSONIC, Move.SUPERSONIC, Move.CONFUSION, Move.POISONPOWDER, Move.LEECH_LIFE, Move.STUN_SPORE, Move.PSYBEAM, Move.SLEEP_POWDER, Move.GUST, Move.SIGNAL_BEAM, Move.ZEN_HEADBUTT, Move.POISON_FANG, Move.PSYCHIC, Move.BUG_BUZZ, Move.QUIVER_DANCE}), Type.BUG, Type.POISON),
        DIGLETT("Diglett", "050", (short)255, new short[] {10, 55, 25, 35, 45, 95}, (short)81, new byte[] {0, 0, 0, 0, 0, 1}, convertToMap(new int[] {0, 0, 4, 7, 12, 15, 18, 23, 26, 29, 34, 37, 40, 45}, new Move[] {Move.SCRATCH, Move.SAND_ATTACK, Move.GROWL, Move.ASTONISH, Move.MUD_SLAP, Move.MAGNITUDE, Move.BULLDOZE, Move.SUCKER_PUNCH, Move.MUD_BOMB, Move.EARTH_POWER, Move.DIG, Move.SLASH, Move.EARTHQUAKE, Move.FISSURE}), Type.GROUND),
        DUGTRIO("Dugtrio", "051", (short)50, new short[] {35, 80, 50, 50, 70, 120}, (short)153, new byte[] {0, 0, 0, 0, 0, 2}, convertToMap(new int[] {0, 0, 0, 0, 0, 4, 7, 12, 15, 18, 23, 26, 28, 33, 40, 45, 50, 57}, new Move[] {Move.NIGHT_SLASH, Move.TRI_ATTACK, Move.SCRATCH, Move.SAND_ATTACK, Move.GROWL, Move.GROWL, Move.ASTONISH, Move.MUD_SLAP, Move.MAGNITUDE, Move.BULLDOZE, Move.SUCKER_PUNCH, Move.SAND_TOMB, Move.MUD_BOMB, Move.EARTH_POWER, Move.DIG, Move.SLASH, Move.EARTHQUAKE, Move.FISSURE}), Type.GROUND),
        MEOWTH("Meowth", "052", (short)255, new short[] {40, 45, 35, 40, 40, 90}, (short)69, new byte[] {0, 0, 0, 0, 0, 1}, convertToMap(new int[] {0, 0, 6, 9, 14, 17, 22, 25, 30, 33, 38, 41, 46, 49, 54}, new Move[] {Move.SCRATCH, Move.GROWL, Move.BITE, Move.FAKE_OUT, Move.FURY_SWIPES, Move.SCREECH, Move.FAINT_ATTACK, Move.TAUNT, Move.PAY_DAY, Move.SLASH, Move.NASTY_PLOT, Move.ASSURANCE, Move.CAPTIVATE, Move.NIGHT_SLASH, Move.FEINT}), Type.NORMAL),
        PERSIAN("Persian", "053", (short)90, new short[] {65, 70, 60, 65, 65, 115}, (short)154, new byte[] {0, 0, 0, 0, 0, 2}, convertToMap(new int[] {0, 0, 0, 0, 0, 6, 9, 14, 17, 22, 25, 28, 32, 37, 44, 49, 56, 61, 68}, new Move[] {Move.SWITCHEROO, Move.SCRATCH, Move.GROWL, Move.BITE, Move.FAKE_OUT, Move.BITE, Move.FAKE_OUT, Move.FURY_SWIPES, Move.SCREECH, Move.FAINT_ATTACK, Move.TAUNT, Move.SWIFT, Move.POWER_GEM, Move.SLASH, Move.NASTY_PLOT, Move.ASSURANCE, Move.CAPTIVATE, Move.NIGHT_SLASH, Move.FEINT}), Type.NORMAL),
        PSYDUCK("Psyduck", "054", (short)190, new short[] {50, 52, 48, 65, 50, 55}, (short)64, new byte[] {0, 0, 0, 1, 0, 0}, convertToMap(new int[] {0, 0, 4, 8, 11, 15, 18, 22, 25, 29, 32, 36, 39, 43, 46, 50}, new Move[] {Move.WATER_SPORT, Move.SCRATCH, Move.TAIL_WHIP, Move.WATER_GUN, Move.DISABLE, Move.CONFUSION, Move.WATER_PULSE, Move.FURY_SWIPES, Move.SCREECH, Move.ZEN_HEADBUTT, Move.AQUA_TAIL, Move.SOAK, Move.PSYCH_UP, Move.AMNESIA, Move.HYDRO_PUMP, Move.WONDER_ROOM}), Type.WATER),
        GOLDUCK("Golduck", "055", (short)75, new short[] {80, 82, 78, 95, 80, 85}, (short)175, new byte[] {0, 0, 0, 2, 0, 0}, convertToMap(new int[] {0, 0, 0, 0, 0, 4, 8, 11, 15, 18, 22, 25, 29, 32, 38, 43, 49, 54, 60}, new Move[] {Move.AQUA_JET, Move.WATER_SPORT, Move.SCRATCH, Move.TAIL_WHIP, Move.WATER_GUN, Move.TAIL_WHIP, Move.WATER_GUN, Move.DISABLE, Move.CONFUSION, Move.WATER_PULSE, Move.FURY_SWIPES, Move.SCREECH, Move.ZEN_HEADBUTT, Move.AQUA_TAIL, Move.SOAK, Move.PSYCH_UP, Move.AMNESIA, Move.HYDRO_PUMP, Move.WONDER_ROOM}), Type.WATER),
        MANKEY("Mankey", "056", (short)190, new short[] {40, 80, 35, 35, 45, 70}, (short)61, new byte[] {0, 1, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 0, 0, 0, 9, 13, 17, 21, 25, 33, 37, 41, 45, 49, 53}, new Move[] {Move.COVET, Move.SCRATCH, Move.LOW_KICK, Move.LEER, Move.FOCUS_ENERGY, Move.FURY_SWIPES, Move.KARATE_CHOP, Move.SEISMIC_TOSS, Move.SCREECH, Move.ASSURANCE, Move.SWAGGER, Move.CROSS_CHOP, Move.THRASH, Move.PUNISHMENT, Move.CLOSE_COMBAT, Move.FINAL_GAMBIT}), Type.FIGHTING),
        PRIMEAPE("Primeape", "057", (short)75, new short[] {65, 105, 60, 60, 70, 95}, (short)159, new byte[] {0, 2, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 0, 0, 0, 9, 13, 17, 21, 25, 28, 35, 41, 47, 53, 59, 63}, new Move[] {Move.FLING, Move.SCRATCH, Move.LOW_KICK, Move.LEER, Move.FOCUS_ENERGY, Move.FURY_SWIPES, Move.KARATE_CHOP, Move.SEISMIC_TOSS, Move.SCREECH, Move.ASSURANCE, Move.RAGE, Move.SWAGGER, Move.CROSS_CHOP, Move.THRASH, Move.PUNISHMENT, Move.CLOSE_COMBAT, Move.FINAL_GAMBIT}), Type.FIGHTING),
        GROWLITHE("Growlithe", "058", (short)190, new short[] {55, 70, 45, 70, 50, 60}, (short)70, new byte[] {0, 1, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 6, 8, 10, 12, 17, 19, 21, 23, 28, 30, 32, 34, 39, 41, 43, 45}, new Move[] {Move.BITE, Move.ROAR, Move.EMBER, Move.LEER, Move.ODOR_SLEUTH, Move.HELPING_HAND, Move.FLAME_WHEEL, Move.REVERSAL, Move.FIRE_FANG, Move.TAKE_DOWN, Move.FLAME_BURST, Move.AGILITY, Move.RETALIATE, Move.FLAMETHROWER, Move.CRUNCH, Move.HEAT_WAVE, Move.OUTRAGE, Move.FLARE_BLITZ}), Type.FIRE),
        ARCANINE("Arcanine", "059", (short)75, new short[] {90, 110, 80, 100, 80, 95}, (short)194, new byte[] {0, 2, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 0, 0, 0, 34}, new Move[] {Move.THUNDER_FANG, Move.BITE, Move.ROAR, Move.FIRE_FANG, Move.ODOR_SLEUTH, Move.EXTREMESPEED}), Type.FIRE),
        POLIWAG("Poliwag", "060", (short)255, new short[] {40, 50, 40, 40, 40, 90}, (short)60, new byte[] {0, 0, 0, 0, 0, 1}, convertToMap(new int[] {0, 5, 8, 11, 15, 18, 21, 25, 28, 31, 35, 38, 41}, new Move[] {Move.WATER_SPORT, Move.BUBBLE, Move.HYPNOSIS, Move.WATER_GUN, Move.DOUBLESLAP, Move.RAIN_DANCE, Move.BODY_SLAM, Move.BUBBLEBEAM, Move.MUD_SHOT, Move.BELLY_DRUM, Move.WAKE_UP_SLAP, Move.HYDRO_PUMP, Move.MUD_BOMB}), Type.WATER),
        POLIWHIRL("Poliwhirl", "061", (short)120, new short[] {65, 65, 65, 50, 50, 90}, (short)135, new byte[] {0, 0, 0, 0, 0, 2}, convertToMap(new int[] {0, 0, 0, 5, 8, 11, 15, 18, 21, 27, 32, 37, 43, 48, 53}, new Move[] {Move.WATER_SPORT, Move.BUBBLE, Move.HYPNOSIS, Move.BUBBLE, Move.HYPNOSIS, Move.WATER_GUN, Move.DOUBLESLAP, Move.RAIN_DANCE, Move.BODY_SLAM, Move.BUBBLEBEAM, Move.MUD_SHOT, Move.BELLY_DRUM, Move.WAKE_UP_SLAP, Move.HYDRO_PUMP, Move.MUD_BOMB}), Type.WATER),
        POLIWRATH("Poliwrath", "062", (short)45, new short[] {90, 85, 95, 70, 90, 70}, (short)225, new byte[] {0, 0, 3, 0, 0, 0}, convertToMap(new int[] {0, 0, 0, 0, 32, 43, 53}, new Move[] {Move.BUBBLEBEAM, Move.HYPNOSIS, Move.DOUBLESLAP, Move.SUBMISSION, Move.DYNAMICPUNCH, Move.MIND_READER, Move.CIRCLE_THROW}), Type.WATER, Type.FIGHTING),
        ABRA("Abra", "063", (short)200, new short[] {25, 20, 15, 105, 55, 90}, (short)62, new byte[] {0, 0, 0, 1, 0, 0}, convertToMap(new int[] {0}, new Move[] {Move.TELEPORT}), Type.PSYCHIC),
        KADABRA("Kadabra", "064", (short)100, new short[] {40, 35, 30, 120, 70, 105}, (short)140, new byte[] {0, 0, 0, 2, 0, 0}, convertToMap(new int[] {0, 0, 0, 16, 18, 22, 24, 28, 30, 34, 36, 40, 42, 46, 48, 52}, new Move[] {Move.TELEPORT, Move.KINESIS, Move.CONFUSION, Move.CONFUSION, Move.DISABLE, Move.MIRACLE_EYE, Move.ALLY_SWITCH, Move.PSYBEAM, Move.REFLECT, Move.TELEKINESIS, Move.RECOVER, Move.PSYCHO_CUT, Move.ROLE_PLAY, Move.PSYCHIC, Move.FUTURE_SIGHT, Move.TRICK}), Type.PSYCHIC),
        ALAKAZAM("Alakazam", "065", (short)50, new short[] {55, 50, 45, 135, 85, 120}, (short)221, new byte[] {0, 0, 0, 3, 0, 0}, convertToMap(new int[] {0, 0, 0, 16, 18, 22, 24, 28, 30, 34, 36, 40, 42, 46, 48, 52}, new Move[] {Move.TELEPORT, Move.KINESIS, Move.CONFUSION, Move.CONFUSION, Move.DISABLE, Move.MIRACLE_EYE, Move.ALLY_SWITCH, Move.PSYBEAM, Move.REFLECT, Move.TELEKINESIS, Move.RECOVER, Move.PSYCHO_CUT, Move.CALM_MIND, Move.PSYCHIC, Move.FUTURE_SIGHT, Move.TRICK}), Type.PSYCHIC),
        MACHOP("Machop", "066", (short)180, new short[] {70, 80, 50, 35, 35, 35}, (short)61, new byte[] {0, 1, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 7, 10, 13, 19, 22, 25, 31, 34, 37, 43, 46, 49}, new Move[] {Move.LOW_KICK, Move.LEER, Move.FOCUS_ENERGY, Move.KARATE_CHOP, Move.LOW_SWEEP, Move.FORESIGHT, Move.SEISMIC_TOSS, Move.REVENGE, Move.VITAL_THROW, Move.SUBMISSION, Move.WAKE_UP_SLAP, Move.CROSS_CHOP, Move.SCARY_FACE, Move.DYNAMICPUNCH}), Type.FIGHTING),
        MACHOKE("Machoke", "067", (short)90, new short[] {80, 100, 70, 50, 60, 45}, (short)142, new byte[] {0, 2, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 0, 0, 7, 10, 13, 19, 22, 25, 32, 36, 40, 44, 51, 55}, new Move[] {Move.LOW_KICK, Move.LEER, Move.FOCUS_ENERGY, Move.KARATE_CHOP, Move.FOCUS_ENERGY, Move.KARATE_CHOP, Move.LOW_SWEEP, Move.FORESIGHT, Move.SEISMIC_TOSS, Move.REVENGE, Move.VITAL_THROW, Move.SUBMISSION, Move.WAKE_UP_SLAP, Move.CROSS_CHOP, Move.SCARY_FACE, Move.DYNAMICPUNCH}), Type.FIGHTING),
        MACHAMP("Machamp", "068", (short)45, new short[] {90, 130, 80, 65, 85, 55}, (short)227, new byte[] {0, 3, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 0, 0, 0, 7, 10, 13, 19, 22, 25, 32, 36, 40, 44, 51, 55}, new Move[] {Move.WIDE_GUARD, Move.LOW_KICK, Move.LEER, Move.FOCUS_ENERGY, Move.KARATE_CHOP, Move.FOCUS_ENERGY, Move.KARATE_CHOP, Move.LOW_SWEEP, Move.FORESIGHT, Move.SEISMIC_TOSS, Move.REVENGE, Move.VITAL_THROW, Move.SUBMISSION, Move.WAKE_UP_SLAP, Move.CROSS_CHOP, Move.SCARY_FACE, Move.DYNAMICPUNCH}), Type.FIGHTING),
        BELLSPROUT("Bellsprout", "069", (short)255, new short[] {50, 75, 35, 70, 30, 40}, (short)60, new byte[] {0, 1, 0, 0, 0, 0}, convertToMap(new int[] {0, 7, 11, 13, 15, 17, 23, 27, 29, 35, 39, 41, 47}, new Move[] {Move.VINE_WHIP, Move.GROWTH, Move.WRAP, Move.SLEEP_POWDER, Move.POISONPOWDER, Move.STUN_SPORE, Move.ACID, Move.KNOCK_OFF, Move.SWEET_SCENT, Move.GASTRO_ACID, Move.RAZOR_LEAF, Move.SLAM, Move.WRING_OUT}), Type.GRASS, Type.POISON),
        WEEPINBELL("Weepinbell", "070", (short)120, new short[] {65, 90, 50, 85, 45, 55}, (short)137, new byte[] {0, 2, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 0, 7, 11, 13, 15, 17, 23, 27, 29, 35, 39, 41, 47}, new Move[] {Move.VINE_WHIP, Move.GROWTH, Move.WRAP, Move.GROWTH, Move.WRAP, Move.SLEEP_POWDER, Move.POISONPOWDER, Move.STUN_SPORE, Move.ACID, Move.KNOCK_OFF, Move.SWEET_SCENT, Move.GASTRO_ACID, Move.RAZOR_LEAF, Move.SLAM, Move.WRING_OUT}), Type.GRASS, Type.POISON),
        VICTREEBEL("Victreebel", "071", (short)45, new short[] {80, 105, 65, 100, 60, 70}, (short)216, new byte[] {0, 3, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 0, 0, 0, 0, 0, 27, 47, 47}, new Move[] {Move.STOCKPILE, Move.SWALLOW, Move.SPIT_UP, Move.VINE_WHIP, Move.SLEEP_POWDER, Move.SWEET_SCENT, Move.RAZOR_LEAF, Move.LEAF_TORNADO, Move.LEAF_STORM, Move.LEAF_BLADE}), Type.GRASS, Type.POISON),
        TENTACOOL("Tentacool", "072", (short)190, new short[] {40, 40, 35, 50, 100, 70}, (short)67, new byte[] {0, 0, 0, 0, 1, 0}, convertToMap(new int[] {0, 5, 8, 12, 15, 19, 22, 26, 29, 33, 36, 40, 43, 47, 50, 54}, new Move[] {Move.POISON_STING, Move.SUPERSONIC, Move.CONSTRICT, Move.ACID, Move.TOXIC_SPIKES, Move.BUBBLEBEAM, Move.WRAP, Move.ACID_SPRAY, Move.BARRIER, Move.WATER_PULSE, Move.POISON_JAB, Move.SCREECH, Move.HEX, Move.HYDRO_PUMP, Move.SLUDGE_WAVE, Move.WRING_OUT}), Type.WATER, Type.POISON),
        TENTACRUEL("Tentacruel", "073", (short)60, new short[] {80, 70, 65, 80, 120, 100}, (short)180, new byte[] {0, 0, 0, 0, 2, 0}, convertToMap(new int[] {0, 0, 0, 5, 8, 12, 15, 19, 22, 26, 29, 34, 38, 43, 47, 52, 56, 61}, new Move[] {Move.POISON_STING, Move.SUPERSONIC, Move.CONSTRICT, Move.SUPERSONIC, Move.CONSTRICT, Move.ACID, Move.TOXIC_SPIKES, Move.BUBBLEBEAM, Move.WRAP, Move.ACID_SPRAY, Move.BARRIER, Move.WATER_PULSE, Move.POISON_JAB, Move.SCREECH, Move.HEX, Move.HYDRO_PUMP, Move.SLUDGE_WAVE, Move.WRING_OUT}), Type.WATER, Type.POISON),
        GEODUDE("Geodude", "074", (short)255, new short[] {40, 80, 100, 30, 30, 20}, (short)73, new byte[] {0, 0, 1, 0, 0, 0}, convertToMap(new int[] {0, 0, 4, 8, 11, 15, 18, 22, 25, 29, 32, 36, 39, 43, 46, 50}, new Move[] {Move.TACKLE, Move.DEFENSE_CURL, Move.MUD_SPORT, Move.ROCK_POLISH, Move.ROCK_THROW, Move.MAGNITUDE, Move.ROLLOUT, Move.ROCK_BLAST, Move.SMACK_DOWN, Move.SELFDESTRUCT, Move.BULLDOZE, Move.STEALTH_ROCK, Move.EARTHQUAKE, Move.EXPLOSION, Move.DOUBLE_EDGE, Move.STONE_EDGE}), Type.ROCK, Type.GROUND),
        GRAVELER("Graveler", "075", (short)120, new short[] {55, 95, 115, 45, 45, 35}, (short)134, new byte[] {0, 0, 2, 0, 0, 0}, convertToMap(new int[] {0, 0, 0, 0, 4, 8, 11, 15, 18, 22, 27, 31, 36, 42, 47, 53, 58, 64}, new Move[] {Move.TACKLE, Move.DEFENSE_CURL, Move.MUD_SPORT, Move.ROCK_POLISH, Move.MUD_SPORT, Move.ROCK_POLISH, Move.ROCK_THROW, Move.MAGNITUDE, Move.ROLLOUT, Move.ROCK_BLAST, Move.SMACK_DOWN, Move.SELFDESTRUCT, Move.BULLDOZE, Move.STEALTH_ROCK, Move.EARTHQUAKE, Move.EXPLOSION, Move.DOUBLE_EDGE, Move.STONE_EDGE}), Type.ROCK, Type.GROUND),
        GOLEM("Golem", "076", (short)45, new short[] {80, 110, 130, 55, 65, 45}, (short)218, new byte[] {0, 0, 3, 0, 0, 0}, convertToMap(new int[] {0, 0, 0, 0, 4, 8, 11, 15, 18, 22, 27, 31, 36, 42, 47, 53, 58, 64, 69}, new Move[] {Move.TACKLE, Move.DEFENSE_CURL, Move.MUD_SPORT, Move.ROCK_POLISH, Move.MUD_SPORT, Move.ROCK_POLISH, Move.ROCK_THROW, Move.MAGNITUDE, Move.STEAMROLLER, Move.ROCK_BLAST, Move.SMACK_DOWN, Move.SELFDESTRUCT, Move.BULLDOZE, Move.STEALTH_ROCK, Move.EARTHQUAKE, Move.EXPLOSION, Move.DOUBLE_EDGE, Move.STONE_EDGE, Move.HEAVY_SLAM}), Type.ROCK, Type.GROUND),
        PONYTA("Ponyta", "077", (short)190, new short[] {50, 85, 55, 65, 65, 90}, (short)82, new byte[] {0, 0, 0, 0, 0, 1}, convertToMap(new int[] {0, 0, 4, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49}, new Move[] {Move.GROWL, Move.TACKLE, Move.TAIL_WHIP, Move.EMBER, Move.FLAME_WHEEL, Move.STOMP, Move.FLAME_CHARGE, Move.FIRE_SPIN, Move.TAKE_DOWN, Move.INFERNO, Move.AGILITY, Move.FIRE_BLAST, Move.BOUNCE, Move.FLARE_BLITZ}), Type.FIRE),
        RAPIDASH("Rapidash", "078", (short)60, new short[] {65, 100, 70, 80, 80, 105}, (short)175, new byte[] {0, 0, 0, 0, 0, 2}, convertToMap(new int[] {0, 0, 0, 0, 0, 0, 4, 9, 13, 17, 21, 25, 29, 33, 37, 40, 41, 45, 49}, new Move[] {Move.POISON_JAB, Move.MEGAHORN, Move.GROWL, Move.QUICK_ATTACK, Move.TAIL_WHIP, Move.EMBER, Move.TAIL_WHIP, Move.EMBER, Move.FLAME_WHEEL, Move.STOMP, Move.FLAME_CHARGE, Move.FIRE_SPIN, Move.TAKE_DOWN, Move.INFERNO, Move.AGILITY, Move.FURY_ATTACK, Move.FIRE_BLAST, Move.BOUNCE, Move.FLARE_BLITZ}), Type.FIRE),
        SLOWPOKE("Slowpoke", "079", (short)190, new short[] {90, 65, 65, 40, 40, 15}, (short)63, new byte[] {1, 0, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 0, 5, 9, 14, 19, 23, 28, 32, 36, 41, 45, 49, 54, 58}, new Move[] {Move.CURSE, Move.YAWN, Move.TACKLE, Move.GROWL, Move.WATER_GUN, Move.CONFUSION, Move.DISABLE, Move.HEADBUTT, Move.WATER_PULSE, Move.ZEN_HEADBUTT, Move.SLACK_OFF, Move.AMNESIA, Move.PSYCHIC, Move.RAIN_DANCE, Move.PSYCH_UP, Move.HEAL_PULSE}), Type.WATER, Type.PSYCHIC),
        SLOWBRO("Slowbro", "080", (short)75, new short[] {95, 75, 110, 100, 80, 30}, (short)172, new byte[] {0, 0, 2, 0, 0, 0}, convertToMap(new int[] {0, 0, 0, 0, 5, 9, 14, 19, 23, 28, 32, 36, 37, 43, 49, 55, 62, 68}, new Move[] {Move.CURSE, Move.YAWN, Move.TACKLE, Move.GROWL, Move.GROWL, Move.WATER_GUN, Move.CONFUSION, Move.DISABLE, Move.HEADBUTT, Move.WATER_PULSE, Move.ZEN_HEADBUTT, Move.SLACK_OFF, Move.WITHDRAW, Move.AMNESIA, Move.PSYCHIC, Move.RAIN_DANCE, Move.PSYCH_UP, Move.HEAL_PULSE}), Type.WATER, Type.PSYCHIC),
        MAGNEMITE("Magnemite", "081", (short)190, new short[] {25, 35, 70, 95, 55, 45}, (short)65, new byte[] {0, 0, 0, 1, 0, 0}, convertToMap(new int[] {0, 4, 7, 11, 15, 18, 21, 25, 29, 32, 35, 39, 43, 46, 49, 53, 57}, new Move[] {Move.TACKLE, Move.SUPERSONIC, Move.THUNDERSHOCK, Move.SONICBOOM, Move.THUNDER_WAVE, Move.MAGNET_BOMB, Move.SPARK, Move.MIRROR_SHOT, Move.METAL_SOUND, Move.ELECTRO_BALL, Move.FLASH_CANNON, Move.SCREECH, Move.DISCHARGE, Move.LOCK_ON, Move.MAGNET_RISE, Move.GYRO_BALL, Move.ZAP_CANNON}), Type.ELECTRIC, Type.STEEL),
        MAGNETON("Magneton", "082", (short)60, new short[] {50, 60, 95, 120, 70, 70}, (short)163, new byte[] {0, 0, 0, 2, 0, 0}, convertToMap(new int[] {0, 0, 0, 0, 0, 4, 7, 11, 15, 18, 21, 25, 29, 34, 39, 45, 51, 56, 62, 67, 73}, new Move[] {Move.TRI_ATTACK, Move.TACKLE, Move.THUNDERSHOCK, Move.SUPERSONIC, Move.SONICBOOM, Move.SUPERSONIC, Move.THUNDERSHOCK, Move.SONICBOOM, Move.THUNDER_WAVE, Move.MAGNET_BOMB, Move.SPARK, Move.MIRROR_SHOT, Move.METAL_SOUND, Move.ELECTRO_BALL, Move.FLASH_CANNON, Move.SCREECH, Move.DISCHARGE, Move.LOCK_ON, Move.MAGNET_RISE, Move.GYRO_BALL, Move.ZAP_CANNON}), Type.ELECTRIC, Type.STEEL),
        FARFETCH_D("Farfetch%27d", "083", (short)45, new short[] {52, 65, 55, 58, 62, 60}, (short)123, new byte[] {0, 1, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 0, 0, 0, 7, 9, 13, 19, 21, 25, 31, 33, 37, 43, 45, 49, 55}, new Move[] {Move.POISON_JAB, Move.PECK, Move.SAND_ATTACK, Move.LEER, Move.FURY_CUTTER, Move.FURY_ATTACK, Move.KNOCK_OFF, Move.AERIAL_ACE, Move.SLASH, Move.AIR_CUTTER, Move.SWORDS_DANCE, Move.AGILITY, Move.NIGHT_SLASH, Move.ACROBATICS, Move.FEINT, Move.FALSE_SWIPE, Move.AIR_SLASH, Move.BRAVE_BIRD}), Type.NORMAL, Type.FLYING),
        DODUO("Doduo", "084", (short)190, new short[] {35, 85, 45, 35, 35, 75}, (short)62, new byte[] {0, 1, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 5, 10, 14, 19, 23, 28, 32, 37, 41, 46, 50}, new Move[] {Move.PECK, Move.GROWL, Move.QUICK_ATTACK, Move.RAGE, Move.FURY_ATTACK, Move.PURSUIT, Move.UPROAR, Move.ACUPRESSURE, Move.DOUBLE_HIT, Move.AGILITY, Move.DRILL_PECK, Move.ENDEAVOR, Move.THRASH}), Type.NORMAL, Type.FLYING),
        DODRIO("Dodrio", "085", (short)45, new short[] {60, 110, 70, 60, 60, 100}, (short)161, new byte[] {0, 2, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 0, 0, 0, 5, 10, 14, 19, 23, 28, 34, 41, 47, 54, 60}, new Move[] {Move.PLUCK, Move.PECK, Move.GROWL, Move.QUICK_ATTACK, Move.RAGE, Move.QUICK_ATTACK, Move.RAGE, Move.FURY_ATTACK, Move.PURSUIT, Move.UPROAR, Move.ACUPRESSURE, Move.TRI_ATTACK, Move.AGILITY, Move.DRILL_PECK, Move.ENDEAVOR, Move.THRASH}), Type.NORMAL, Type.FLYING),
        SEEL("Seel", "086", (short)190, new short[] {65, 45, 55, 45, 70, 45}, (short)65, new byte[] {0, 0, 0, 0, 1, 0}, convertToMap(new int[] {0, 3, 7, 11, 13, 17, 21, 23, 27, 31, 33, 37, 41, 43, 47, 51, 53}, new Move[] {Move.HEADBUTT, Move.GROWL, Move.WATER_SPORT, Move.ICY_WIND, Move.ENCORE, Move.ICE_SHARD, Move.REST, Move.AQUA_RING, Move.AURORA_BEAM, Move.AQUA_JET, Move.BRINE, Move.TAKE_DOWN, Move.DIVE, Move.AQUA_TAIL, Move.ICE_BEAM, Move.SAFEGUARD, Move.HAIL}), Type.WATER),
        DEWGONG("Dewgong", "087", (short)75, new short[] {90, 70, 80, 70, 95, 70}, (short)166, new byte[] {0, 0, 0, 0, 2, 0}, convertToMap(new int[] {0, 0, 0, 0, 3, 7, 11, 13, 17, 21, 23, 27, 31, 33, 34, 39, 45, 49, 55, 61, 65}, new Move[] {Move.HEADBUTT, Move.GROWL, Move.SIGNAL_BEAM, Move.ICY_WIND, Move.GROWL, Move.SIGNAL_BEAM, Move.ICY_WIND, Move.ENCORE, Move.ICE_SHARD, Move.REST, Move.AQUA_RING, Move.AURORA_BEAM, Move.AQUA_JET, Move.BRINE, Move.SHEER_COLD, Move.TAKE_DOWN, Move.DIVE, Move.AQUA_TAIL, Move.ICE_BEAM, Move.SAFEGUARD, Move.HAIL}), Type.WATER, Type.ICE),
        GRIMER("Grimer", "088", (short)190, new short[] {80, 80, 50, 40, 50, 25}, (short)65, new byte[] {1, 0, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 4, 7, 12, 15, 18, 21, 26, 29, 32, 37, 40, 43, 48}, new Move[] {Move.POISON_GAS, Move.POUND, Move.HARDEN, Move.MUD_SLAP, Move.DISABLE, Move.SLUDGE, Move.MINIMIZE, Move.MUD_BOMB, Move.SLUDGE_BOMB, Move.FLING, Move.SCREECH, Move.SLUDGE_WAVE, Move.ACID_ARMOR, Move.GUNK_SHOT, Move.MEMENTO}), Type.POISON),
        MUK("Muk", "089", (short)75, new short[] {105, 105, 75, 65, 100, 50}, (short)175, new byte[] {1, 1, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 0, 0, 4, 7, 12, 15, 18, 21, 26, 29, 32, 37, 43, 49, 57}, new Move[] {Move.POISON_GAS, Move.POUND, Move.HARDEN, Move.MUD_SLAP, Move.HARDEN, Move.MUD_SLAP, Move.DISABLE, Move.SLUDGE, Move.MINIMIZE, Move.MUD_BOMB, Move.SLUDGE_BOMB, Move.FLING, Move.SCREECH, Move.SLUDGE_WAVE, Move.ACID_ARMOR, Move.GUNK_SHOT, Move.MEMENTO}), Type.POISON),
        SHELLDER("Shellder", "090", (short)190, new short[] {30, 65, 100, 45, 25, 40}, (short)61, new byte[] {0, 0, 1, 0, 0, 0}, convertToMap(new int[] {0, 4, 8, 13, 16, 20, 25, 28, 32, 37, 40, 44, 49, 52, 56, 61}, new Move[] {Move.TACKLE, Move.WITHDRAW, Move.SUPERSONIC, Move.ICICLE_SPEAR, Move.PROTECT, Move.LEER, Move.CLAMP, Move.ICE_SHARD, Move.RAZOR_SHELL, Move.AURORA_BEAM, Move.WHIRLPOOL, Move.BRINE, Move.IRON_DEFENSE, Move.ICE_BEAM, Move.SHELL_SMASH, Move.HYDRO_PUMP}), Type.WATER),
        CLOYSTER("Cloyster", "091", (short)60, new short[] {50, 95, 180, 85, 45, 70}, (short)184, new byte[] {0, 0, 2, 0, 0, 0}, convertToMap(new int[] {0, 0, 0, 0, 0, 13, 28, 52}, new Move[] {Move.TOXIC_SPIKES, Move.WITHDRAW, Move.SUPERSONIC, Move.PROTECT, Move.AURORA_BEAM, Move.SPIKE_CANNON, Move.SPIKES, Move.ICICLE_CRASH}), Type.WATER, Type.ICE),
        GASTLY("Gastly", "092", (short)190, new short[] {30, 35, 30, 100, 35, 80}, (short)62, new byte[] {0, 0, 0, 1, 0, 0}, convertToMap(new int[] {0, 0, 5, 8, 12, 15, 19, 22, 26, 29, 33, 36, 40, 43, 47}, new Move[] {Move.HYPNOSIS, Move.LICK, Move.SPITE, Move.MEAN_LOOK, Move.CURSE, Move.NIGHT_SHADE, Move.CONFUSE_RAY, Move.SUCKER_PUNCH, Move.PAYBACK, Move.SHADOW_BALL, Move.DREAM_EATER, Move.DARK_PULSE, Move.DESTINY_BOND, Move.HEX, Move.NIGHTMARE}), Type.GHOST, Type.POISON),
        HAUNTER("Haunter", "093", (short)90, new short[] {45, 50, 45, 115, 55, 95}, (short)142, new byte[] {0, 0, 0, 2, 0, 0}, convertToMap(new int[] {0, 0, 0, 5, 8, 12, 15, 19, 22, 25, 28, 33, 39, 44, 50, 55, 61}, new Move[] {Move.HYPNOSIS, Move.LICK, Move.SPITE, Move.SPITE, Move.MEAN_LOOK, Move.CURSE, Move.NIGHT_SHADE, Move.CONFUSE_RAY, Move.SUCKER_PUNCH, Move.SHADOW_PUNCH, Move.PAYBACK, Move.SHADOW_BALL, Move.DREAM_EATER, Move.DARK_PULSE, Move.DESTINY_BOND, Move.HEX, Move.NIGHTMARE}), Type.GHOST, Type.POISON),
        GENGAR("Gengar", "094", (short)45, new short[] {60, 65, 60, 130, 75, 110}, (short)225, new byte[] {0, 0, 0, 3, 0, 0}, convertToMap(new int[] {0, 0, 0, 5, 8, 12, 15, 19, 22, 25, 28, 33, 39, 44, 50, 55, 61}, new Move[] {Move.HYPNOSIS, Move.LICK, Move.SPITE, Move.SPITE, Move.MEAN_LOOK, Move.CURSE, Move.NIGHT_SHADE, Move.CONFUSE_RAY, Move.SUCKER_PUNCH, Move.SHADOW_PUNCH, Move.PAYBACK, Move.SHADOW_BALL, Move.DREAM_EATER, Move.DARK_PULSE, Move.DESTINY_BOND, Move.HEX, Move.NIGHTMARE}), Type.GHOST, Type.POISON),
        ONIX("Onix", "095", (short)45, new short[] {35, 45, 160, 30, 45, 70}, (short)108, new byte[] {0, 0, 1, 0, 0, 0}, convertToMap(new int[] {0, 0, 0, 0, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34, 37, 40, 43, 46, 49, 52}, new Move[] {Move.MUD_SPORT, Move.TACKLE, Move.HARDEN, Move.BIND, Move.CURSE, Move.ROCK_THROW, Move.RAGE, Move.ROCK_TOMB, Move.STEALTH_ROCK, Move.ROCK_POLISH, Move.SMACK_DOWN, Move.DRAGONBREATH, Move.SLAM, Move.SCREECH, Move.ROCK_SLIDE, Move.SAND_TOMB, Move.IRON_TAIL, Move.DIG, Move.STONE_EDGE, Move.DOUBLE_EDGE, Move.SANDSTORM}), Type.ROCK, Type.GROUND),
        DROWZEE("Drowzee", "096", (short)190, new short[] {60, 48, 45, 43, 90, 42}, (short)66, new byte[] {0, 0, 0, 0, 1, 0}, convertToMap(new int[] {0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49, 53, 57, 61}, new Move[] {Move.POUND, Move.HYPNOSIS, Move.DISABLE, Move.CONFUSION, Move.HEADBUTT, Move.POISON_GAS, Move.MEDITATE, Move.PSYBEAM, Move.HEADBUTT, Move.PSYCH_UP, Move.SYNCHRONOISE, Move.ZEN_HEADBUTT, Move.SWAGGER, Move.PSYCHIC, Move.NASTY_PLOT, Move.PSYSHOCK, Move.FUTURE_SIGHT}), Type.PSYCHIC),
        HYPNO("Hypno", "097", (short)75, new short[] {85, 73, 70, 73, 115, 67}, (short)169, new byte[] {0, 0, 0, 0, 2, 0}, convertToMap(new int[] {0, 0, 0, 0, 0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49, 53, 57, 61}, new Move[] {Move.NIGHTMARE, Move.SWITCHEROO, Move.POUND, Move.HYPNOSIS, Move.DISABLE, Move.CONFUSION, Move.DISABLE, Move.CONFUSION, Move.HEADBUTT, Move.POISON_GAS, Move.MEDITATE, Move.PSYBEAM, Move.HEADBUTT, Move.PSYCH_UP, Move.SYNCHRONOISE, Move.ZEN_HEADBUTT, Move.SWAGGER, Move.PSYCHIC, Move.NASTY_PLOT, Move.PSYSHOCK, Move.FUTURE_SIGHT}), Type.PSYCHIC),
        KRABBY("Krabby", "098", (short)225, new short[] {30, 105, 90, 25, 25, 50}, (short)65, new byte[] {0, 1, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 5, 9, 11, 15, 19, 21, 25, 29, 31, 35, 39, 41, 45}, new Move[] {Move.MUD_SPORT, Move.BUBBLE, Move.VICEGRIP, Move.LEER, Move.HARDEN, Move.BUBBLEBEAM, Move.MUD_SHOT, Move.METAL_CLAW, Move.STOMP, Move.PROTECT, Move.GUILLOTINE, Move.SLAM, Move.BRINE, Move.CRABHAMMER, Move.FLAIL}), Type.WATER),
        KINGLER("Kingler", "099", (short)60, new short[] {55, 130, 115, 50, 50, 75}, (short)166, new byte[] {0, 2, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 0, 0, 0, 5, 9, 11, 15, 19, 21, 25, 32, 37, 44, 51, 56, 63}, new Move[] {Move.WIDE_GUARD, Move.MUD_SPORT, Move.BUBBLE, Move.VICEGRIP, Move.LEER, Move.VICEGRIP, Move.LEER, Move.HARDEN, Move.BUBBLEBEAM, Move.MUD_SHOT, Move.METAL_CLAW, Move.STOMP, Move.PROTECT, Move.GUILLOTINE, Move.SLAM, Move.BRINE, Move.CRABHAMMER, Move.FLAIL}), Type.WATER),
        VOLTORB("Voltorb", "100", (short)190, new short[] {40, 30, 50, 55, 55, 100}, (short)66, new byte[] {0, 0, 0, 0, 0, 1}, convertToMap(new int[] {0, 5, 8, 12, 15, 19, 22, 26, 29, 33, 36, 40, 43, 47, 50}, new Move[] {Move.CHARGE, Move.TACKLE, Move.SONICBOOM, Move.SPARK, Move.ROLLOUT, Move.SCREECH, Move.CHARGE_BEAM, Move.LIGHT_SCREEN, Move.ELECTRO_BALL, Move.SELFDESTRUCT, Move.SWIFT, Move.MAGNET_RISE, Move.GYRO_BALL, Move.EXPLOSION, Move.MIRROR_COAT}), Type.ELECTRIC),
        ELECTRODE("Electrode", "101", (short)60, new short[] {60, 50, 70, 80, 80, 140}, (short)168, new byte[] {0, 0, 0, 0, 0, 2}, convertToMap(new int[] {0, 0, 0, 0, 5, 8, 12, 15, 19, 22, 26, 29, 35, 40, 46, 51, 57, 62}, new Move[] {Move.CHARGE, Move.TACKLE, Move.SONICBOOM, Move.SPARK, Move.TACKLE, Move.SONICBOOM, Move.SPARK, Move.ROLLOUT, Move.SCREECH, Move.CHARGE_BEAM, Move.LIGHT_SCREEN, Move.ELECTRO_BALL, Move.SELFDESTRUCT, Move.SWIFT, Move.MAGNET_RISE, Move.GYRO_BALL, Move.EXPLOSION, Move.MIRROR_COAT}), Type.ELECTRIC),
        EXEGGCUTE("Exeggcute", "102", (short)90, new short[] {60, 40, 80, 60, 45, 40}, (short)65, new byte[] {0, 0, 1, 0, 0, 0}, convertToMap(new int[] {0, 0, 0, 7, 11, 17, 19, 21, 23, 27, 33, 37, 43, 47, 53, -1}, new Move[] {Move.BARRAGE, Move.UPROAR, Move.HYPNOSIS, Move.REFLECT, Move.LEECH_SEED, Move.BULLET_SEED, Move.STUN_SPORE, Move.POISONPOWDER, Move.SLEEP_POWDER, Move.CONFUSION, Move.WORRY_SEED, Move.NATURAL_GIFT, Move.SOLARBEAM, Move.EXTRASENSORY, Move.BESTOW, Move.PSYCHIC}), Type.GRASS, Type.PSYCHIC),
        EXEGGUTOR("Exeggutor", "103", (short)45, new short[] {95, 95, 85, 125, 65, 55}, (short)182, new byte[] {0, 0, 0, 2, 0, 0}, convertToMap(new int[] {0, 0, 0, 0, 0, 17, 27, 37, 47}, new Move[] {Move.SEED_BOMB, Move.BARRAGE, Move.HYPNOSIS, Move.CONFUSION, Move.STOMP, Move.PSYSHOCK, Move.EGG_BOMB, Move.WOOD_HAMMER, Move.LEAF_STORM}), Type.GRASS, Type.PSYCHIC),
        CUBONE("Cubone", "104", (short)190, new short[] {50, 50, 95, 40, 50, 35}, (short)64, new byte[] {0, 0, 1, 0, 0, 0}, convertToMap(new int[] {0, 3, 7, 11, 13, 17, 21, 23, 27, 31, 33, 37, 41, 43, 47}, new Move[] {Move.GROWL, Move.TAIL_WHIP, Move.BONE_CLUB, Move.HEADBUTT, Move.LEER, Move.FOCUS_ENERGY, Move.BONEMERANG, Move.RAGE, Move.FALSE_SWIPE, Move.THRASH, Move.FLING, Move.BONE_RUSH, Move.ENDEAVOR, Move.DOUBLE_EDGE, Move.RETALIATE}), Type.GROUND),
        MAROWAK("Marowak", "105", (short)75, new short[] {60, 80, 110, 50, 80, 45}, (short)149, new byte[] {0, 0, 2, 0, 0, 0}, convertToMap(new int[] {0, 0, 0, 0, 3, 7, 11, 13, 17, 21, 23, 27, 33, 37, 43, 49, 53, 59}, new Move[] {Move.GROWL, Move.TAIL_WHIP, Move.BONE_CLUB, Move.HEADBUTT, Move.TAIL_WHIP, Move.BONE_CLUB, Move.HEADBUTT, Move.LEER, Move.FOCUS_ENERGY, Move.BONEMERANG, Move.RAGE, Move.FALSE_SWIPE, Move.THRASH, Move.FLING, Move.BONE_RUSH, Move.ENDEAVOR, Move.DOUBLE_EDGE, Move.RETALIATE}), Type.GROUND),
        HITMONLEE("Hitmonlee", "106", (short)45, new short[] {50, 120, 53, 35, 110, 87}, (short)159, new byte[] {0, 2, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49, 53, 57, 61}, new Move[] {Move.REVENGE, Move.DOUBLE_KICK, Move.MEDITATE, Move.ROLLING_KICK, Move.JUMP_KICK, Move.BRICK_BREAK, Move.FOCUS_ENERGY, Move.FEINT, Move.HI_JUMP_KICK, Move.MIND_READER, Move.FORESIGHT, Move.WIDE_GUARD, Move.BLAZE_KICK, Move.ENDURE, Move.MEGA_KICK, Move.CLOSE_COMBAT, Move.REVERSAL}), Type.FIGHTING),
        HITMONCHAN("Hitmonchan", "107", (short)45, new short[] {50, 105, 79, 35, 110, 76}, (short)159, new byte[] {0, 0, 0, 0, 2, 0}, convertToMap(new int[] {0, 0, 6, 11, 16, 16, 21, 26, 31, 36, 36, 36, 41, 46, 51, 56, 61, 66}, new Move[] {Move.REVENGE, Move.COMET_PUNCH, Move.AGILITY, Move.PURSUIT, Move.MACH_PUNCH, Move.BULLET_PUNCH, Move.FEINT, Move.VACUUM_WAVE, Move.QUICK_GUARD, Move.THUNDERPUNCH, Move.ICE_PUNCH, Move.FIRE_PUNCH, Move.SKY_UPPERCUT, Move.MEGA_PUNCH, Move.DETECT, Move.FOCUS_PUNCH, Move.COUNTER, Move.CLOSE_COMBAT}), Type.FIGHTING),
        LICKITUNG("Lickitung", "108", (short)45, new short[] {90, 55, 75, 60, 75, 30}, (short)77, new byte[] {2, 0, 0, 0, 0, 0}, convertToMap(new int[] {0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49, 53, 57}, new Move[] {Move.LICK, Move.SUPERSONIC, Move.DEFENSE_CURL, Move.KNOCK_OFF, Move.WRAP, Move.STOMP, Move.DISABLE, Move.SLAM, Move.ROLLOUT, Move.CHIP_AWAY, Move.ME_FIRST, Move.REFRESH, Move.SCREECH, Move.POWER_WHIP, Move.WRING_OUT}), Type.NORMAL),
        KOFFING("Koffing", "109", (short)190, new short[] {40, 65, 95, 60, 45, 35}, (short)68, new byte[] {0, 0, 1, 0, 0, 0}, convertToMap(new int[] {0, 0, 4, 7, 12, 15, 18, 23, 26, 29, 34, 37, 40, 45}, new Move[] {Move.POISON_GAS, Move.TACKLE, Move.SMOG, Move.SMOKESCREEN, Move.ASSURANCE, Move.CLEAR_SMOG, Move.SLUDGE, Move.SELFDESTRUCT, Move.HAZE, Move.GYRO_BALL, Move.SLUDGE_BOMB, Move.EXPLOSION, Move.DESTINY_BOND, Move.MEMENTO}), Type.POISON),
        WEEZING("Weezing", "110", (short)60, new short[] {65, 90, 120, 85, 70, 60}, (short)172, new byte[] {0, 0, 2, 0, 0, 0}, convertToMap(new int[] {0, 0, 0, 0, 4, 7, 12, 15, 18, 23, 26, 29, 34, 40, 46, 54}, new Move[] {Move.POISON_GAS, Move.TACKLE, Move.SMOG, Move.SMOKESCREEN, Move.SMOG, Move.SMOKESCREEN, Move.ASSURANCE, Move.CLEAR_SMOG, Move.SLUDGE, Move.SELFDESTRUCT, Move.HAZE, Move.DOUBLE_HIT, Move.SLUDGE_BOMB, Move.EXPLOSION, Move.DESTINY_BOND, Move.MEMENTO}), Type.POISON),
        RHYHORN("Rhyhorn", "111", (short)120, new short[] {80, 85, 95, 30, 30, 25}, (short)69, new byte[] {0, 0, 1, 0, 0, 0}, convertToMap(new int[] {0, 0, 8, 12, 19, 23, 30, 34, 41, 45, 52, 56, 63, 67}, new Move[] {Move.HORN_ATTACK, Move.TAIL_WHIP, Move.STOMP, Move.FURY_ATTACK, Move.SCARY_FACE, Move.ROCK_BLAST, Move.BULLDOZE, Move.CHIP_AWAY, Move.TAKE_DOWN, Move.DRILL_RUN, Move.STONE_EDGE, Move.EARTHQUAKE, Move.HORN_DRILL, Move.MEGAHORN}), Type.GROUND, Type.ROCK),
        RHYDON("Rhydon", "112", (short)60, new short[] {105, 130, 120, 45, 45, 40}, (short)170, new byte[] {0, 2, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 0, 0, 9, 12, 19, 23, 30, 34, 41, 42, 47, 56, 62, 71, 77}, new Move[] {Move.HORN_ATTACK, Move.TAIL_WHIP, Move.STOMP, Move.FURY_ATTACK, Move.STOMP, Move.FURY_ATTACK, Move.SCARY_FACE, Move.ROCK_BLAST, Move.BULLDOZE, Move.CHIP_AWAY, Move.TAKE_DOWN, Move.HAMMER_ARM, Move.DRILL_RUN, Move.STONE_EDGE, Move.EARTHQUAKE, Move.HORN_DRILL, Move.MEGAHORN}), Type.GROUND, Type.ROCK),
        CHANSEY("Chansey", "113", (short)30, new short[] {250, 5, 5, 35, 105, 50}, (short)395, new byte[] {2, 0, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 0, 5, 9, 12, 16, 20, 23, 27, 31, 34, 38, 42, 46, 50, 54}, new Move[] {Move.DEFENSE_CURL, Move.POUND, Move.GROWL, Move.TAIL_WHIP, Move.REFRESH, Move.DOUBLESLAP, Move.SOFTBOILED, Move.BESTOW, Move.MINIMIZE, Move.TAKE_DOWN, Move.SING, Move.FLING, Move.HEAL_PULSE, Move.EGG_BOMB, Move.LIGHT_SCREEN, Move.HEALING_WISH, Move.DOUBLE_EDGE}), Type.NORMAL),
        TANGELA("Tangela", "114", (short)45, new short[] {65, 55, 115, 100, 40, 60}, (short)87, new byte[] {0, 0, 1, 0, 0, 0}, convertToMap(new int[] {0, 0, 4, 7, 10, 14, 17, 20, 23, 27, 30, 33, 36, 40, 43, 46, 49, 53}, new Move[] {Move.INGRAIN, Move.CONSTRICT, Move.SLEEP_POWDER, Move.VINE_WHIP, Move.ABSORB, Move.POISONPOWDER, Move.BIND, Move.GROWTH, Move.MEGA_DRAIN, Move.KNOCK_OFF, Move.STUN_SPORE, Move.NATURAL_GIFT, Move.GIGA_DRAIN, Move.ANCIENTPOWER, Move.SLAM, Move.TICKLE, Move.WRING_OUT, Move.POWER_WHIP}), Type.GRASS),
        KANGASKHAN("Kangaskhan", "115", (short)45, new short[] {105, 95, 80, 40, 80, 90}, (short)172, new byte[] {2, 0, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 7, 10, 13, 19, 22, 25, 31, 34, 37, 43, 46, 49, 55}, new Move[] {Move.COMET_PUNCH, Move.LEER, Move.FAKE_OUT, Move.TAIL_WHIP, Move.BITE, Move.DOUBLE_HIT, Move.RAGE, Move.MEGA_PUNCH, Move.CHIP_AWAY, Move.DIZZY_PUNCH, Move.CRUNCH, Move.ENDURE, Move.OUTRAGE, Move.SUCKER_PUNCH, Move.REVERSAL}), Type.NORMAL),
        HORSEA("Horsea", "116", (short)225, new short[] {30, 40, 70, 70, 25, 60}, (short)59, new byte[] {0, 0, 0, 1, 0, 0}, convertToMap(new int[] {0, 4, 8, 11, 14, 18, 23, 26, 30, 35, 38, 42}, new Move[] {Move.BUBBLE, Move.SMOKESCREEN, Move.LEER, Move.WATER_GUN, Move.FOCUS_ENERGY, Move.BUBBLEBEAM, Move.AGILITY, Move.TWISTER, Move.BRINE, Move.HYDRO_PUMP, Move.DRAGON_DANCE, Move.DRAGON_PULSE}), Type.WATER),
        SEADRA("Seadra", "117", (short)75, new short[] {55, 65, 95, 95, 45, 85}, (short)154, new byte[] {0, 0, 1, 1, 0, 0}, convertToMap(new int[] {0, 0, 0, 0, 4, 8, 11, 14, 18, 23, 26, 30, 40, 48, 57}, new Move[] {Move.BUBBLE, Move.SMOKESCREEN, Move.LEER, Move.WATER_GUN, Move.SMOKESCREEN, Move.LEER, Move.WATER_GUN, Move.FOCUS_ENERGY, Move.BUBBLEBEAM, Move.AGILITY, Move.TWISTER, Move.BRINE, Move.HYDRO_PUMP, Move.DRAGON_DANCE, Move.DRAGON_PULSE}), Type.WATER),
        GOLDEEN("Goldeen", "118", (short)225, new short[] {45, 67, 60, 35, 50, 63}, (short)64, new byte[] {0, 1, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 0, 7, 11, 17, 21, 27, 31, 37, 41, 47, 51, 57}, new Move[] {Move.PECK, Move.TAIL_WHIP, Move.WATER_SPORT, Move.SUPERSONIC, Move.HORN_ATTACK, Move.WATER_PULSE, Move.FLAIL, Move.AQUA_RING, Move.FURY_ATTACK, Move.WATERFALL, Move.HORN_DRILL, Move.AGILITY, Move.SOAK, Move.MEGAHORN}), Type.WATER),
        SEAKING("Seaking", "119", (short)60, new short[] {80, 92, 65, 65, 80, 68}, (short)158, new byte[] {0, 2, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 0, 0, 0, 7, 11, 17, 21, 27, 31, 40, 47, 56, 63, 72}, new Move[] {Move.POISON_JAB, Move.PECK, Move.TAIL_WHIP, Move.WATER_SPORT, Move.SUPERSONIC, Move.SUPERSONIC, Move.HORN_ATTACK, Move.WATER_PULSE, Move.FLAIL, Move.AQUA_RING, Move.FURY_ATTACK, Move.WATERFALL, Move.HORN_DRILL, Move.AGILITY, Move.SOAK, Move.MEGAHORN}), Type.WATER),
        STARYU("Staryu", "120", (short)225, new short[] {30, 45, 55, 70, 55, 85}, (short)68, new byte[] {0, 0, 0, 0, 0, 1}, convertToMap(new int[] {0, 0, 6, 10, 12, 15, 18, 22, 25, 30, 33, 36, 40, 43, 48, 52}, new Move[] {Move.TACKLE, Move.HARDEN, Move.WATER_GUN, Move.RAPID_SPIN, Move.RECOVER, Move.CAMOUFLAGE, Move.SWIFT, Move.BUBBLEBEAM, Move.MINIMIZE, Move.GYRO_BALL, Move.LIGHT_SCREEN, Move.BRINE, Move.REFLECT_TYPE, Move.POWER_GEM, Move.COSMIC_POWER, Move.HYDRO_PUMP}), Type.WATER),
        STARMIE("Starmie", "121", (short)60, new short[] {60, 75, 85, 100, 85, 115}, (short)182, new byte[] {0, 0, 0, 0, 0, 2}, convertToMap(new int[] {0, 0, 0, 0, 22}, new Move[] {Move.WATER_GUN, Move.RAPID_SPIN, Move.RECOVER, Move.SWIFT, Move.CONFUSE_RAY}), Type.WATER, Type.PSYCHIC),
        MR_MIME("Mr. Mime", "122", (short)45, new short[] {40, 45, 65, 100, 120, 90}, (short)161, new byte[] {0, 0, 0, 0, 2, 0}, convertToMap(new int[] {0, 0, 0, 0, 0, 0, 0, 4, 8, 11, 15, 15, 18, 22, 22, 25, 29, 32, 36, 39, 43, 46, 50}, new Move[] {Move.MAGICAL_LEAF, Move.QUICK_GUARD, Move.WIDE_GUARD, Move.POWER_SWAP, Move.GUARD_SWAP, Move.BARRIER, Move.CONFUSION, Move.COPYCAT, Move.MEDITATE, Move.DOUBLESLAP, Move.MIMIC, Move.PSYWAVE, Move.ENCORE, Move.LIGHT_SCREEN, Move.REFLECT, Move.PSYBEAM, Move.SUBSTITUTE, Move.RECYCLE, Move.TRICK, Move.PSYCHIC, Move.ROLE_PLAY, Move.BATON_PASS, Move.SAFEGUARD}), Type.PSYCHIC),
        SCYTHER("Scyther", "123", (short)45, new short[] {70, 110, 80, 55, 80, 105}, (short)100, new byte[] {0, 1, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49, 53, 57, 61}, new Move[] {Move.VACUUM_WAVE, Move.QUICK_ATTACK, Move.LEER, Move.FOCUS_ENERGY, Move.PURSUIT, Move.FALSE_SWIPE, Move.AGILITY, Move.WING_ATTACK, Move.FURY_CUTTER, Move.SLASH, Move.RAZOR_WIND, Move.DOUBLE_TEAM, Move.X_SCISSOR, Move.NIGHT_SLASH, Move.DOUBLE_HIT, Move.AIR_SLASH, Move.SWORDS_DANCE, Move.FEINT}), Type.BUG, Type.FLYING),
        JYNX("Jynx", "124", (short)45, new short[] {65, 50, 35, 115, 95, 95}, (short)159, new byte[] {0, 0, 0, 2, 0, 0}, convertToMap(new int[] {0, 0, 0, 0, 5, 8, 11, 15, 18, 21, 25, 28, 33, 39, 44, 49, 55, 60}, new Move[] {Move.POUND, Move.LICK, Move.LOVELY_KISS, Move.POWDER_SNOW, Move.LICK, Move.LOVELY_KISS, Move.POWDER_SNOW, Move.DOUBLESLAP, Move.ICE_PUNCH, Move.HEART_STAMP, Move.MEAN_LOOK, Move.FAKE_TEARS, Move.WAKE_UP_SLAP, Move.AVALANCHE, Move.BODY_SLAM, Move.WRING_OUT, Move.PERISH_SONG, Move.BLIZZARD}), Type.ICE, Type.PSYCHIC),
        ELECTABUZZ("Electabuzz", "125", (short)45, new short[] {65, 83, 57, 95, 85, 105}, (short)172, new byte[] {0, 0, 0, 0, 0, 2}, convertToMap(new int[] {0, 0, 0, 5, 8, 12, 15, 19, 22, 26, 29, 36, 42, 49, 55}, new Move[] {Move.QUICK_ATTACK, Move.LEER, Move.THUNDERSHOCK, Move.THUNDERSHOCK, Move.LOW_KICK, Move.SWIFT, Move.SHOCK_WAVE, Move.THUNDER_WAVE, Move.ELECTRO_BALL, Move.LIGHT_SCREEN, Move.THUNDERPUNCH, Move.DISCHARGE, Move.SCREECH, Move.THUNDERBOLT, Move.THUNDER}), Type.ELECTRIC),
        MAGMAR("Magmar", "126", (short)45, new short[] {65, 95, 57, 100, 85, 93}, (short)173, new byte[] {0, 0, 0, 2, 0, 0}, convertToMap(new int[] {0, 0, 0, 5, 8, 12, 15, 19, 22, 26, 29, 36, 42, 49, 55}, new Move[] {Move.SMOG, Move.LEER, Move.EMBER, Move.EMBER, Move.SMOKESCREEN, Move.FAINT_ATTACK, Move.FIRE_SPIN, Move.CLEAR_SMOG, Move.FLAME_BURST, Move.CONFUSE_RAY, Move.FIRE_PUNCH, Move.LAVA_PLUME, Move.SUNNY_DAY, Move.FLAMETHROWER, Move.FIRE_BLAST}), Type.FIRE),
        PINSIR("Pinsir", "127", (short)45, new short[] {65, 125, 100, 55, 70, 85}, (short)175, new byte[] {0, 2, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 4, 8, 11, 15, 18, 22, 26, 29, 33, 36, 40, 43, 47}, new Move[] {Move.VICEGRIP, Move.FOCUS_ENERGY, Move.BIND, Move.SEISMIC_TOSS, Move.HARDEN, Move.REVENGE, Move.BRICK_BREAK, Move.VITAL_THROW, Move.SUBMISSION, Move.X_SCISSOR, Move.STORM_THROW, Move.THRASH, Move.SWORDS_DANCE, Move.SUPERPOWER, Move.GUILLOTINE}), Type.BUG),
        TAUROS("Tauros", "128", (short)45, new short[] {75, 100, 95, 40, 70, 110}, (short)211, new byte[] {0, 1, 0, 0, 0, 1}, convertToMap(new int[] {0, 3, 5, 8, 11, 15, 19, 24, 29, 35, 41, 48, 55, 63}, new Move[] {Move.TACKLE, Move.TAIL_WHIP, Move.RAGE, Move.HORN_ATTACK, Move.SCARY_FACE, Move.PURSUIT, Move.REST, Move.PAYBACK, Move.WORK_UP, Move.ZEN_HEADBUTT, Move.TAKE_DOWN, Move.SWAGGER, Move.THRASH, Move.GIGA_IMPACT}), Type.NORMAL),
        MAGIKARP("Magikarp", "129", (short)255, new short[] {20, 10, 55, 15, 20, 80}, (short)40, new byte[] {0, 0, 0, 0, 0, 1}, convertToMap(new int[] {0, 15, 30}, new Move[] {Move.SPLASH, Move.TACKLE, Move.FLAIL}), Type.WATER),
        GYARADOS("Gyarados", "130", (short)45, new short[] {95, 125, 79, 60, 100, 81}, (short)189, new byte[] {0, 2, 0, 0, 0, 0}, convertToMap(new int[] {0, 20, 23, 26, 29, 32, 35, 38, 41, 44, 47}, new Move[] {Move.THRASH, Move.BITE, Move.DRAGON_RAGE, Move.LEER, Move.TWISTER, Move.ICE_FANG, Move.AQUA_TAIL, Move.RAIN_DANCE, Move.HYDRO_PUMP, Move.DRAGON_DANCE, Move.HYPER_BEAM}), Type.WATER, Type.FLYING),
        LAPRAS("Lapras", "131", (short)45, new short[] {130, 85, 80, 85, 95, 60}, (short)187, new byte[] {2, 0, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 0, 4, 7, 10, 14, 18, 22, 27, 32, 37, 43, 49, 55}, new Move[] {Move.SING, Move.GROWL, Move.WATER_GUN, Move.MIST, Move.CONFUSE_RAY, Move.ICE_SHARD, Move.WATER_PULSE, Move.BODY_SLAM, Move.RAIN_DANCE, Move.PERISH_SONG, Move.ICE_BEAM, Move.BRINE, Move.SAFEGUARD, Move.HYDRO_PUMP, Move.SHEER_COLD}), Type.WATER, Type.ICE),
        DITTO("Ditto", "132", (short)35, new short[] {48, 48, 48, 48, 48, 48}, (short)101, new byte[] {1, 0, 0, 0, 0, 0}, convertToMap(new int[] {0}, new Move[] {Move.TRANSFORM}), Type.NORMAL),
        EEVEE("Eevee", "133", (short)45, new short[] {55, 55, 50, 45, 65, 55}, (short)65, new byte[] {0, 0, 0, 0, 1, 0}, convertToMap(new int[] {0, 0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45}, new Move[] {Move.HELPING_HAND, Move.TACKLE, Move.TAIL_WHIP, Move.SAND_ATTACK, Move.GROWL, Move.QUICK_ATTACK, Move.BITE, Move.COVET, Move.TAKE_DOWN, Move.CHARM, Move.BATON_PASS, Move.DOUBLE_EDGE, Move.LAST_RESORT, Move.TRUMP_CARD}), Type.NORMAL),
        VAPOREON("Vaporeon", "134", (short)45, new short[] {130, 65, 60, 110, 95, 65}, (short)184, new byte[] {2, 0, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, -1}, new Move[] {Move.HELPING_HAND, Move.TACKLE, Move.TAIL_WHIP, Move.SAND_ATTACK, Move.WATER_GUN, Move.QUICK_ATTACK, Move.WATER_PULSE, Move.AURORA_BEAM, Move.AQUA_RING, Move.ACID_ARMOR, Move.HAZE, Move.MUDDY_WATER, Move.LAST_RESORT, Move.HYDRO_PUMP, Move.BITE}), Type.WATER),
        JOLTEON("Jolteon", "135", (short)45, new short[] {65, 65, 60, 110, 95, 130}, (short)184, new byte[] {0, 0, 0, 0, 0, 2}, convertToMap(new int[] {0, 0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45}, new Move[] {Move.HELPING_HAND, Move.TACKLE, Move.TAIL_WHIP, Move.SAND_ATTACK, Move.THUNDERSHOCK, Move.QUICK_ATTACK, Move.DOUBLE_KICK, Move.THUNDER_FANG, Move.PIN_MISSILE, Move.AGILITY, Move.THUNDER_WAVE, Move.DISCHARGE, Move.LAST_RESORT, Move.THUNDER}), Type.ELECTRIC),
        FLAREON("Flareon", "136", (short)45, new short[] {65, 130, 60, 95, 110, 65}, (short)184, new byte[] {0, 2, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45}, new Move[] {Move.HELPING_HAND, Move.TACKLE, Move.TAIL_WHIP, Move.SAND_ATTACK, Move.EMBER, Move.QUICK_ATTACK, Move.BITE, Move.FIRE_FANG, Move.FIRE_SPIN, Move.SCARY_FACE, Move.SMOG, Move.LAVA_PLUME, Move.LAST_RESORT, Move.FIRE_BLAST}), Type.FIRE),
        PORYGON("Porygon", "137", (short)45, new short[] {65, 60, 70, 85, 75, 40}, (short)79, new byte[] {0, 0, 0, 1, 0, 0}, convertToMap(new int[] {0, 0, 0, 0, 7, 12, 18, 23, 29, 34, 40, 45, 51, 56, 62}, new Move[] {Move.CONVERSION_2, Move.TACKLE, Move.CONVERSION, Move.SHARPEN, Move.PSYBEAM, Move.AGILITY, Move.RECOVER, Move.MAGNET_RISE, Move.SIGNAL_BEAM, Move.RECYCLE, Move.DISCHARGE, Move.LOCK_ON, Move.TRI_ATTACK, Move.MAGIC_COAT, Move.ZAP_CANNON}), Type.NORMAL),
        OMANYTE("Omanyte", "138", (short)45, new short[] {35, 40, 100, 90, 55, 35}, (short)71, new byte[] {0, 0, 1, 0, 0, 0}, convertToMap(new int[] {0, 0, 7, 10, 16, 19, 25, 28, 34, 37, 43, 46, 52, 55}, new Move[] {Move.CONSTRICT, Move.WITHDRAW, Move.BITE, Move.WATER_GUN, Move.ROLLOUT, Move.LEER, Move.MUD_SHOT, Move.BRINE, Move.PROTECT, Move.ANCIENTPOWER, Move.TICKLE, Move.ROCK_BLAST, Move.SHELL_SMASH, Move.HYDRO_PUMP}), Type.ROCK, Type.WATER),
        OMASTAR("Omastar", "139", (short)45, new short[] {70, 60, 125, 115, 70, 55}, (short)173, new byte[] {0, 0, 2, 0, 0, 0}, convertToMap(new int[] {0, 0, 0, 7, 10, 16, 19, 25, 28, 34, 37, 40, 48, 56, 67, 75}, new Move[] {Move.CONSTRICT, Move.WITHDRAW, Move.BITE, Move.BITE, Move.WATER_GUN, Move.ROLLOUT, Move.LEER, Move.MUD_SHOT, Move.BRINE, Move.PROTECT, Move.ANCIENTPOWER, Move.SPIKE_CANNON, Move.TICKLE, Move.ROCK_BLAST, Move.SHELL_SMASH, Move.HYDRO_PUMP}), Type.ROCK, Type.WATER),
        KABUTO("Kabuto", "140", (short)45, new short[] {30, 80, 90, 55, 45, 55}, (short)71, new byte[] {0, 0, 1, 0, 0, 0}, convertToMap(new int[] {0, 0, 6, 11, 16, 21, 26, 31, 36, 41, 46, 51}, new Move[] {Move.SCRATCH, Move.HARDEN, Move.ABSORB, Move.LEER, Move.MUD_SHOT, Move.SAND_ATTACK, Move.ENDURE, Move.AQUA_JET, Move.MEGA_DRAIN, Move.METAL_SOUND, Move.ANCIENTPOWER, Move.WRING_OUT}), Type.ROCK, Type.WATER),
        KABUTOPS("Kabutops", "141", (short)45, new short[] {60, 115, 105, 65, 70, 80}, (short)173, new byte[] {0, 2, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 0, 0, 0, 6, 11, 16, 21, 26, 31, 36, 40, 45, 54, 63, 72}, new Move[] {Move.FEINT, Move.SCRATCH, Move.HARDEN, Move.ABSORB, Move.LEER, Move.ABSORB, Move.LEER, Move.MUD_SHOT, Move.SAND_ATTACK, Move.ENDURE, Move.AQUA_JET, Move.MEGA_DRAIN, Move.SLASH, Move.METAL_SOUND, Move.ANCIENTPOWER, Move.WRING_OUT, Move.NIGHT_SLASH}), Type.ROCK, Type.WATER),
        AERODACTYL("Aerodactyl", "142", (short)45, new short[] {80, 105, 65, 60, 75, 130}, (short)180, new byte[] {0, 0, 0, 0, 0, 2}, convertToMap(new int[] {0, 0, 0, 0, 0, 0, 0, 9, 17, 25, 33, 41, 49, 57, 65, 73, 81}, new Move[] {Move.ICE_FANG, Move.FIRE_FANG, Move.THUNDER_FANG, Move.WING_ATTACK, Move.SUPERSONIC, Move.BITE, Move.SCARY_FACE, Move.ROAR, Move.AGILITY, Move.ANCIENTPOWER, Move.CRUNCH, Move.TAKE_DOWN, Move.SKY_DROP, Move.IRON_HEAD, Move.HYPER_BEAM, Move.ROCK_SLIDE, Move.GIGA_IMPACT}), Type.ROCK, Type.FLYING),
        SNORLAX("Snorlax", "143", (short)25, new short[] {160, 110, 65, 65, 110, 30}, (short)189, new byte[] {2, 0, 0, 0, 0, 0}, convertToMap(new int[] {0, 4, 9, 12, 17, 20, 25, 28, 28, 33, 36, 41, 44, 49, 52, 57}, new Move[] {Move.TACKLE, Move.DEFENSE_CURL, Move.AMNESIA, Move.LICK, Move.BELLY_DRUM, Move.YAWN, Move.CHIP_AWAY, Move.REST, Move.SNORE, Move.SLEEP_TALK, Move.BODY_SLAM, Move.BLOCK, Move.ROLLOUT, Move.CRUNCH, Move.HEAVY_SLAM, Move.GIGA_IMPACT}), Type.NORMAL),
        ARTICUNO("Articuno", "144", (short)3, new short[] {90, 85, 100, 95, 125, 85}, (short)261, new byte[] {0, 0, 0, 0, 3, 0}, convertToMap(new int[] {0, 0, 8, 15, 22, 29, 36, 43, 50, 57, 64, 71, 78, 85, 92}, new Move[] {Move.GUST, Move.POWDER_SNOW, Move.MIST, Move.ICE_SHARD, Move.MIND_READER, Move.ANCIENTPOWER, Move.AGILITY, Move.ICE_BEAM, Move.REFLECT, Move.ROOST, Move.TAILWIND, Move.BLIZZARD, Move.SHEER_COLD, Move.HAIL, Move.HURRICANE}), Type.ICE, Type.FLYING),
        ZAPDOS("Zapdos", "145", (short)3, new short[] {90, 90, 85, 125, 90, 100}, (short)261, new byte[] {0, 0, 0, 3, 0, 0}, convertToMap(new int[] {0, 0, 8, 15, 22, 29, 36, 43, 50, 57, 64, 71, 78, 85, 92}, new Move[] {Move.PECK, Move.THUNDERSHOCK, Move.THUNDER_WAVE, Move.DETECT, Move.PLUCK, Move.ANCIENTPOWER, Move.CHARGE, Move.AGILITY, Move.DISCHARGE, Move.ROOST, Move.LIGHT_SCREEN, Move.DRILL_PECK, Move.THUNDER, Move.RAIN_DANCE, Move.ZAP_CANNON}), Type.ELECTRIC, Type.FLYING),
        MOLTRES("Moltres", "146", (short)3, new short[] {90, 100, 90, 125, 85, 90}, (short)261, new byte[] {0, 0, 0, 3, 0, 0}, convertToMap(new int[] {0, 0, 8, 15, 22, 29, 36, 43, 50, 57, 64, 71, 78, 85, 92}, new Move[] {Move.WING_ATTACK, Move.EMBER, Move.FIRE_SPIN, Move.AGILITY, Move.ENDURE, Move.ANCIENTPOWER, Move.FLAMETHROWER, Move.SAFEGUARD, Move.AIR_SLASH, Move.ROOST, Move.HEAT_WAVE, Move.SOLARBEAM, Move.SKY_ATTACK, Move.SUNNY_DAY, Move.HURRICANE}), Type.FIRE, Type.FLYING),
        DRATINI("Dratini", "147", (short)45, new short[] {41, 64, 45, 50, 50, 50}, (short)60, new byte[] {0, 1, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 5, 11, 15, 21, 25, 31, 35, 41, 45, 51, 55, 61}, new Move[] {Move.WRAP, Move.LEER, Move.THUNDER_WAVE, Move.TWISTER, Move.DRAGON_RAGE, Move.SLAM, Move.AGILITY, Move.DRAGON_TAIL, Move.AQUA_TAIL, Move.DRAGON_RUSH, Move.SAFEGUARD, Move.DRAGON_DANCE, Move.OUTRAGE, Move.HYPER_BEAM}), Type.DRAGON),
        DRAGONAIR("Dragonair", "148", (short)45, new short[] {61, 84, 65, 70, 70, 70}, (short)147, new byte[] {0, 2, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 0, 0, 5, 11, 15, 21, 25, 33, 39, 47, 53, 61, 67, 75}, new Move[] {Move.WRAP, Move.LEER, Move.THUNDER_WAVE, Move.TWISTER, Move.THUNDER_WAVE, Move.TWISTER, Move.DRAGON_RAGE, Move.SLAM, Move.AGILITY, Move.DRAGON_TAIL, Move.AQUA_TAIL, Move.DRAGON_RUSH, Move.SAFEGUARD, Move.DRAGON_DANCE, Move.OUTRAGE, Move.HYPER_BEAM}), Type.DRAGON),
        DRAGONITE("Dragonite", "149", (short)45, new short[] {91, 134, 95, 100, 100, 80}, (short)270, new byte[] {0, 3, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 0, 0, 0, 0, 0, 5, 11, 15, 21, 25, 33, 39, 47, 53, 55, 61, 67, 75, 81}, new Move[] {Move.FIRE_PUNCH, Move.THUNDERPUNCH, Move.ROOST, Move.WRAP, Move.LEER, Move.THUNDER_WAVE, Move.TWISTER, Move.THUNDER_WAVE, Move.TWISTER, Move.DRAGON_RAGE, Move.SLAM, Move.AGILITY, Move.DRAGON_TAIL, Move.AQUA_TAIL, Move.DRAGON_RUSH, Move.SAFEGUARD, Move.WING_ATTACK, Move.DRAGON_DANCE, Move.OUTRAGE, Move.HYPER_BEAM, Move.HURRICANE}), Type.DRAGON, Type.FLYING),
        MEWTWO("Mewtwo", "150", (short)3, new short[] {106, 110, 90, 154, 90, 130}, (short)306, new byte[] {0, 0, 0, 3, 0, 0}, convertToMap(new int[] {0, 0, 0, 8, 15, 22, 29, 36, 43, 50, 57, 57, 64, 71, 79, 86, 93, 100}, new Move[] {Move.CONFUSION, Move.DISABLE, Move.BARRIER, Move.SWIFT, Move.FUTURE_SIGHT, Move.PSYCH_UP, Move.MIRACLE_EYE, Move.MIST, Move.PSYCHO_CUT, Move.AMNESIA, Move.POWER_SWAP, Move.GUARD_SWAP, Move.PSYCHIC, Move.ME_FIRST, Move.RECOVER, Move.SAFEGUARD, Move.AURA_SPHERE, Move.PSYSTRIKE}), Type.PSYCHIC),
        MEW("Mew", "151", (short)45, new short[] {100, 100, 100, 100, 100, 100}, (short)270, new byte[] {3, 0, 0, 0, 0, 0}, convertToMap(new int[] {0, 0, 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100}, new Move[] {Move.POUND, Move.REFLECT_TYPE, Move.TRANSFORM, Move.MEGA_PUNCH, Move.METRONOME, Move.PSYCHIC, Move.BARRIER, Move.ANCIENTPOWER, Move.AMNESIA, Move.ME_FIRST, Move.BATON_PASS, Move.NASTY_PLOT, Move.AURA_SPHERE}), Type.PSYCHIC);
        
        private final Map<Move, Integer> skillSet;
        private final short[] stats;
        private final Type[] type;
        private final byte[] EVs;
        private final String name, index;
        private final short catchRate, baseEXP;

        Pokemon(final String name, final String index, final short catchRate, final short[] stats, short baseEXP, byte[] EVs, Map<Move, Integer> skillSet, final Type... type) {
            this.baseEXP = baseEXP;
            this.skillSet = new TreeMap<>(skillSet);
            this.stats = stats;
            this.EVs = EVs;
            this.catchRate = catchRate;
            this.index = index;
            this.name = name;
            this.type = type;
        }
	}
    
    public int calculateExp(int level) {
        return (int)Math.pow(level, 3);
    }
	
    private final Map<Move, Integer> skillSet;
    private final short[] stats;
    private final Type[] type;
    private final byte[] EVs;
    private final String name, index;
    private final short catchRate, baseEXP;

    Species(Pokemon g) {
        this.skillSet = g.skillSet;
        this.baseEXP = g.baseEXP;
        this.stats = g.stats;
        this.type = g.type;
        this.EVs = g.EVs;
        this.name = g.name;
        this.index = g.index;
        this.catchRate = g.catchRate;
    }
    
    public Map<Move, Integer> getSkillSet() {
        return skillSet;
    }

    private static Map<Move, Integer> convertToMap(int[] a, Move[] b) {
        Map<Move, Integer> m = new TreeMap<>();

        for(int i = 0; i < a.length; i++) {
            if(a[i] != -1) {
                m.put(b[i], a[i]);
            }
        }

        return m;
    }

    public short getCatchRate() {
        return catchRate;
    }
    
    public byte[] getEVs() {
        return EVs;
    }
    
    public byte getYield(byte stat)
    {
        return EVs[stat];
    }

    public short getBaseEXP() {
        return baseEXP;
    }
    
    public String getIndex() {
        return index;
    }

    public short getStat(int stat) {
        return stats[stat];
    }

    public String getName() {
        return name;
    }

    public Type[] getType() {
        return type;
    }
}

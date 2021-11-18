package com.cdpt.pokemon.pokemon;

import java.util.Map;
import java.util.TreeMap;

public enum Species {
	BULBASAUR(Pokemon.BULBASAUR);

	private enum Pokemon
    {
        BULBASAUR("Bulbasaur", "001", (short)45, new short[] {45, 49, 65, 45}, (short)64, new byte[] {0, 1, 0, 0}, convertToMap(new int[] {0, 3, 7, 9, 13, 13, 15, 19, 21, 25, 27, 31, 33, 37}, new Move[] {Move.TACKLE, Move.GROWL, Move.LEECH_SEED, Move.VINE_WHIP, Move.POISON_POWDER, Move.SLEEP_POWDER, Move.TAKE_DOWN, Move.RAZOR_LEAF, Move.SWEET_SCENT, Move.GROWTH, Move.DOUBLE_EDGE, Move.WORRY_SEED, Move.SYNTHESIS, Move.SEED_BOMB}), Type.GRASS, Type.POISON);
        
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

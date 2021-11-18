package com.cdpt.pokemon.pokemon;

import java.awt.Image;
import java.util.Arrays;

public class Pokemon {
    private Species species;
    private int level;
    private int ExpForNextLevel, totalExp;
    private int[] stats;
    private int inBattleHP;
    private byte[] EVs;
    private Move[] moveSet;

//    private Image fromBackImage,
//                  fromFrontImage;
   
    public Pokemon(Species s) {
        this(s, 5);
    }

    public Pokemon(Species species, int level) {
        this.species = species;
        moveSet = new Move[4];
        EVs = species.getEVs();
        this.level = level;

        stats = new int[]{
                calculateStat(Stat.HP),
                calculateStat(Stat.ATTACK),
                calculateStat(Stat.DEFENSE),
                calculateStat(Stat.SPEED)};
        inBattleHP = stats[Stat.HP.ordinal()];
        ExpForNextLevel = species.calculateExp(level + 1);
        totalExp = species.calculateExp(level);
        initializeMoves();
    }

    public void takeDamage(int damage) {
        inBattleHP -= damage;

        if(inBattleHP < 0) {
            inBattleHP = 0;
        }
    }

    public short getBaseEXP() {
        return species.getBaseEXP();
    }

    public boolean isFainted() {
        return inBattleHP <= 0;
    }

    public boolean canLearnNewMove() {
        return species.getSkillSet().containsKey(level);
    }

    private void initializeMoves() {
        for(Move m : species.getSkillSet().keySet()) {
            if(species.getSkillSet().get(m) <= level) {
                for(int j = 0; j < moveSet.length; j++) {
                    if(moveSet[j] == null) {
                        moveSet[j] = m;
                        break;
                    }
                }
            }
        }
    }

    public Move[] getMoveSet() {
        byte count = (byte)moveSet.length;
        for(Move m : moveSet) {
            if(m == null) {
                count--;
            }
        }
        return Arrays.copyOfRange(moveSet, 0, count);
    }

    public String getName() {
        return species.getName();
    }

    public Type[] getType() {
        return species.getType();
    }

    public void setLevel(int level) {
        this.level = (byte)level;
        recalStats();
        ExpForNextLevel = level < 100 ? species.calculateExp(level + 1) : species.calculateExp(level + 1);
    }

    public int getLevel() {
        return level;
    }

    private void recalStats() {
        for(int i = 0; i < stats.length; i++) {
            stats[i] = calculateStat(Stat.values()[i]);
            inBattleHP = stats[Stat.HP.ordinal()];
        }
    }

    private int calculateStat(Stat stat) {
        return (stat == Stat.HP ? (((16 + (2 * species.getStat(Stat.HP.ordinal())) + (EVs[Stat.HP.ordinal()] / 4) + 100) * level) / 100) + 10 :
                (((16 + (2 * species.getStat(stat.ordinal())) + (EVs[stat.ordinal()] / 4)) * level) / 100) + 5);
    }

    public int getCurrentStat(Stat stat) {
        return stats[stat.ordinal()];
    }
    
    public int[] getCurrentStat() {
    	return stats;
    }

    public int getInBattleHp() {
        return inBattleHP;
    }

    public void addExp(int newExp) {
        totalExp += newExp;
    }

    public void levelUp() {
        if(totalExp >= ExpForNextLevel) {
            level++;
            ExpForNextLevel = species.calculateExp(level + 1);

            stats = new int[]{
                    calculateStat(Stat.HP),
                    calculateStat(Stat.ATTACK),
                    calculateStat(Stat.DEFENSE),
                    calculateStat(Stat.SPEED)};
            
            for(Move m : getMoveSet()) {
                m.resetPP();
            }

            inBattleHP = stats[Stat.HP.ordinal()];;
        }  
    }

    @Override
    public String toString() {
        return getName() + ": Level "+ level + ", HP(" + getInBattleHp() + "/" + getCurrentStat(Stat.HP) + ")";
    }
}

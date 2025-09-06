/*
 * Purpose: Class that stores values of the player's stats: kills, time survived in the game, and damage done to enemies in the game. Contains a method to write these stats to a file.
 * Author: Johnson Yep
 */

import java.io.FileWriter;
import java.io.IOException;

public class Stats {
    private int kills, timeSurvived, damageDone;

    /**
     * Empty constructor to use methods in this class
     */
    public Stats() {}

    /**
     * Constructor that allows the user to set the stats that this class will take
     * @param kills
     * @param timeSurvived
     * @param damageDone
     */
    public Stats(int kills, int timeSurvived, int damageDone) {
        this.kills = kills;
        this.timeSurvived = timeSurvived;
        this.damageDone = damageDone;
    }

    /**
     * Secondary constructor that casts the stats from strings into ints so the split strings can be passed through
     * @param kills
     * @param timeSurvived
     * @param damageDone
     */
    public Stats(String kills, String timeSurvived, String damageDone) {
        try {
            this.kills = Integer.parseInt(kills);
            this.timeSurvived = Integer.parseInt(timeSurvived);
            this.damageDone = Integer.parseInt(damageDone);
        }
        catch(NumberFormatException e) {
             System.out.println("Error: A parameter casted was not an integer");
        }
        
    }

    /**
     * Method that writes the current game's scores down into a file
     */
    public void saveStats() {
        try {
            FileWriter file = new FileWriter("stats.txt", true); // Set to true to append text to file instead of overriding
            
            file.write(String.format("%d %d %d", kills, timeSurvived, damageDone));
            file.write(System.lineSeparator());

            file.close();
        }
        catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }

    /**
     * Returns kills
     * @return
     */
    public int getKills() {
        return kills;
    }

    /**
     * Sets kills
     * @param score
     */
    public void setKills(int score) {
        this.kills = score;
    }

    /**
     * Returns time survived
     * @return
     */
    public int getTimeSurvived() {
        return timeSurvived;
    }

    /**
     * Sets time survived
     * @param timeSurvived
     */
    public void setTimeSurvived(int timeSurvived) {
        this.timeSurvived = timeSurvived;
    }

    /**
     * Returns damage done
     * @return
     */
    public int getDamageDone() {
        return damageDone;
    }

    /**
     * Sets damage done
     * @param damageDone
     */
    public void setDamageDone(int damageDone) {
        this.damageDone = damageDone;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CFBsimPack;

import java.util.ArrayList;
import java.util.Vector;

/**
 * Class for the WR player.
 * @author Achi
 */
public class PlayerWR extends Player {
    
    //public String name;
    //Overall rating, combination of other ratings
    //public int ratOvr;
    //Potential, affects how much he gets better in offseason
    //public int ratPot;
    //FootIQ, affects how smart he plays
    //public int ratFootIQ;
    //RecCat affects how good he is at catching
    public int ratCatch;
    //RecSpd affects how long his passes are
    public int ratSpeed;
    //RecEva affects how easily he can dodge tackles
    public int ratEvasion;
    public int ratJump;
    
    //public Vector ratingsVector;
    
    //Stats
    public int statsTargets;
    public int statsReceptions;
    public int statsRecYards;
    public int statsTD;
    public int statsDrops;
    public int statsFumbles;

    public int careerTargets;
    public int careerReceptions;
    public int careerRecYards;
    public int careerTD;
    public int careerDrops;
    public int careerFumbles;
    
    public PlayerWR( String nm, Team t, int yr, int pot, int iq, int cat, int spd, int eva, boolean rs, int dur ) {
        team = t;
        name = nm;
        year = yr;
        gamesPlayed = 0;
        isInjured = false;
        ratOvr = (cat*2 + spd + eva)/4;
        ratPot = pot;
        ratFootIQ = iq;
        ratDur = dur;
        ratCatch = cat;
        ratSpeed = spd;
        ratEvasion = eva;
        isRedshirt = rs;
        if (isRedshirt) year = 0;

        cost = (int)(Math.pow((float)ratOvr - 55,2)/3.5) + 80 + (int)(Math.random()*100) - 50;
        
        ratingsVector = new Vector();
        ratingsVector.addElement(name+" ("+getYrStr()+")");
        ratingsVector.addElement(ratOvr+" (+"+ratImprovement+")");
        ratingsVector.addElement(ratPot);
        ratingsVector.addElement(ratFootIQ);
        ratingsVector.addElement(ratCatch);
        ratingsVector.addElement(ratSpeed);
        ratingsVector.addElement(ratEvasion);
        
        statsTargets = 0;
        statsReceptions = 0;
        statsRecYards = 0;
        statsTD = 0;
        statsDrops = 0;
        statsFumbles = 0;
        wonHeisman = false;
        wonAllAmerican = false;
        wonAllConference = false;
        statsWins = 0;

        careerTargets = 0;
        careerReceptions = 0;
        careerRecYards = 0;
        careerTD = 0;
        careerDrops = 0;
        careerFumbles = 0;
        careerGamesPlayed = 0;
        careerHeismans = 0;
        careerAllAmerican = 0;
        careerAllConference = 0;
        careerWins = 0;

        position = "WR";
    }

    public PlayerWR( String nm, Team t, int yr, int pot, int iq, int cat, int spd, int eva, boolean rs, int dur,
                     int cGamesPlayed, int cTargets, int cReceptions, int cRecYards, int cTD, int cDrops, int cFumbles,
                     int cHeismans, int cAA, int cAC, int cWins) {
        team = t;
        name = nm;
        year = yr;
        gamesPlayed = 0;
        isInjured = false;
        ratOvr = (cat*2 + spd + eva)/4;
        ratPot = pot;
        ratFootIQ = iq;
        ratDur = dur;
        ratCatch = cat;
        ratSpeed = spd;
        ratEvasion = eva;
        isRedshirt = rs;
        if (isRedshirt) year = 0;

        cost = (int)(Math.pow((float)ratOvr - 55,2)/3.5) + 80 + (int)(Math.random()*100) - 50;

        ratingsVector = new Vector();
        ratingsVector.addElement(name+" ("+getYrStr()+")");
        ratingsVector.addElement(ratOvr+" (+"+ratImprovement+")");
        ratingsVector.addElement(ratPot);
        ratingsVector.addElement(ratFootIQ);
        ratingsVector.addElement(ratCatch);
        ratingsVector.addElement(ratSpeed);
        ratingsVector.addElement(ratEvasion);

        statsTargets = 0;
        statsReceptions = 0;
        statsRecYards = 0;
        statsTD = 0;
        statsDrops = 0;
        statsFumbles = 0;
        wonHeisman = false;
        wonAllAmerican = false;
        wonAllConference = false;
        statsWins = 0;

        careerTargets = cTargets;
        careerReceptions = cReceptions;
        careerRecYards = cRecYards;
        careerTD = cTD;
        careerDrops = cDrops;
        careerFumbles = cFumbles;
        careerGamesPlayed = cGamesPlayed;
        careerHeismans = cHeismans;
        careerAllAmerican = cAA;
        careerAllConference = cAC;
        careerWins = cWins;

        position = "WR";
    }
    
    public PlayerWR( String nm, int yr, int stars, Team t ) {
        name = nm;
        year = yr;
        team = t;
        gamesPlayed = 0;
        isInjured = false;
        ratPot = (int) (50 + 50*Math.random());
        ratFootIQ = (int) (50 + 50*Math.random());
        ratDur = (int) (50 + 50*Math.random());
        ratCatch = (int) (60 + year*5 + stars*5 - 25*Math.random());
        ratSpeed = (int) (60 + year*5 + stars*5 - 25*Math.random());
        ratEvasion = (int) (60 + year*5 + stars*5 - 25*Math.random());
        ratOvr = (ratCatch *2 + ratSpeed + ratEvasion)/4;

        cost = (int)(Math.pow((float)ratOvr - 55,2)/3.5) + 80 + (int)(Math.random()*100) - 50;
        
        ratingsVector = new Vector();
        ratingsVector.addElement(name+" ("+getYrStr()+")");
        ratingsVector.addElement(ratOvr+" (+"+ratImprovement+")");
        ratingsVector.addElement(ratPot);
        ratingsVector.addElement(ratFootIQ);
        ratingsVector.addElement(ratCatch);
        ratingsVector.addElement(ratSpeed);
        ratingsVector.addElement(ratEvasion);

        statsTargets = 0;
        statsReceptions = 0;
        statsRecYards = 0;
        statsTD = 0;
        statsDrops = 0;
        statsFumbles = 0;
        wonHeisman = false;
        wonAllAmerican = false;
        wonAllConference = false;
        statsWins = 0;

        careerTargets = 0;
        careerReceptions = 0;
        careerRecYards = 0;
        careerTD = 0;
        careerDrops = 0;
        careerFumbles = 0;
        careerGamesPlayed = 0;
        careerHeismans = 0;
        careerAllAmerican = 0;
        careerAllConference = 0;
        careerWins = 0;

        position = "WR";
    }
    
    public Vector getStatsVector() {
        Vector v = new Vector(7);
        v.add(statsReceptions);
        v.add(statsTargets);
        v.add(statsRecYards);
        v.add(statsTD);
        v.add(statsFumbles);
        v.add(statsDrops);
        v.add((float)((int)((float)statsRecYards/statsReceptions*100))/100);
        return v;
    }
    
    public Vector getRatingsVector() {
        ratingsVector = new Vector();
        ratingsVector.addElement(name + " (" + getYrStr() + ")");
        ratingsVector.addElement(ratOvr + " (+" + ratImprovement + ")");
        ratingsVector.addElement(ratPot);
        ratingsVector.addElement(ratFootIQ);
        ratingsVector.addElement(ratCatch);
        ratingsVector.addElement(ratSpeed);
        ratingsVector.addElement(ratEvasion);
        return ratingsVector;
    }
    
    @Override
    public void advanceSeason() {
        year++;
        int oldOvr = ratOvr;
        if (wonAllConference) ratPot++;
        if (wonAllAmerican) ratPot++;
        if (year > 2 && gamesPlayed < 4) ratPot -= (int)Math.random()*15;

        ratFootIQ += (int)(Math.random()*(ratPot + gamesPlayed - 35))/10;
        ratCatch += (int)(Math.random()*(ratPot + gamesPlayed - 35))/10;
        ratSpeed += (int)(Math.random()*(ratPot + gamesPlayed - 35))/10;
        ratEvasion += (int)(Math.random()*(ratPot + gamesPlayed - 35))/10;
        if ( Math.random()*100 < ratPot ) {
            //breakthrough
            ratCatch += (int)(Math.random()*(ratPot + gamesPlayed - 40))/10;
            ratSpeed += (int)(Math.random()*(ratPot + gamesPlayed - 40))/10;
            ratEvasion += (int)(Math.random()*(ratPot + gamesPlayed - 40))/10;
        }
        ratOvr = (ratCatch *2 + ratSpeed + ratEvasion)/4;
        ratImprovement = ratOvr - oldOvr;
        //reset stats (keep career stats?)
        careerTargets += statsTargets;
        careerReceptions += statsReceptions;
        careerRecYards += statsRecYards;
        careerTD += statsTD;
        careerDrops += statsDrops;
        careerFumbles += statsFumbles;
        careerGamesPlayed += gamesPlayed;
        careerWins += statsWins;

        if (wonHeisman) careerHeismans++;
        if (wonAllAmerican) careerAllAmerican++;
        if (wonAllConference) careerAllConference++;

        statsTargets = 0;
        statsReceptions = 0;
        statsRecYards = 0;
        statsTD = 0;
        statsDrops = 0;
        statsFumbles = 0;
    }
    
    @Override
    public int getHeismanScore() {
        return statsTD * 140 - statsFumbles * 100 - statsDrops * 50 + (int)(statsRecYards*2.5);
    }

    @Override
    public ArrayList<String> getDetailStatsList(int games) {
        ArrayList<String> pStats = new ArrayList<>();
        pStats.add("TDs: " + statsTD + ">Fumbles: " + statsFumbles);
        pStats.add("Rec Yards: " + statsRecYards + " yds>Receptions: " + statsReceptions);
        pStats.add("Catch Percent: " + (100*statsReceptions/(statsTargets+1))+ ">Yards/Tgt: " + ((double)(10*statsRecYards/(statsTargets+1))/10) + " yds");
        pStats.add("Yds/Game: " + (statsRecYards/getGamesPlayed()) + " yds/g>Drops: " + statsDrops);
        pStats.add("Games: " + gamesPlayed + " (" + statsWins + "-" + (gamesPlayed-statsWins) + ")" + ">Durability: " + getLetterGrade(ratDur));
        pStats.add("Football IQ: " + getLetterGrade(ratFootIQ) + ">Catching: " + getLetterGrade(ratCatch));
        pStats.add("Rec Speed: " + getLetterGrade(ratSpeed) + ">Evasion: " + getLetterGrade(ratEvasion));
        pStats.add(" > ");
        return pStats;
    }

    @Override
    public ArrayList<String> getDetailAllStatsList(int games) {
        ArrayList<String> pStats = new ArrayList<>();
        pStats.add("TDs: " + statsTD + ">Fumbles: " + statsFumbles);
        pStats.add("Rec Yards: " + statsRecYards + " yds>Receptions: " + statsReceptions);
        pStats.add("Catch Percent: " + (100*statsReceptions/(statsTargets+1))+ ">Yards/Tgt: " + ((double)(10*statsRecYards/(statsTargets+1))/10) + " yds");
        pStats.add("Yds/Game: " + (statsRecYards/getGamesPlayed()) + " yds/g>Drops: " + statsDrops);
        pStats.add("Games: " + gamesPlayed + " (" + statsWins + "-" + (gamesPlayed-statsWins) + ")" + ">Durability: " + getLetterGrade(ratDur));
        pStats.add("Football IQ: " + getLetterGrade(ratFootIQ) + ">Catching: " + getLetterGrade(ratCatch));
        pStats.add("Rec Speed: " + getLetterGrade(ratSpeed) + ">Evasion: " + getLetterGrade(ratEvasion));
        pStats.add("[B]CAREER STATS:");
        pStats.addAll(getCareerStatsList());
        return pStats;
    }

    @Override
    public ArrayList<String> getCareerStatsList() {
        ArrayList<String> pStats = new ArrayList<>();
        pStats.add("TDs: " + statsTD + ">Fumbles: " + statsFumbles);
        pStats.add("Rec Yards: " + statsRecYards + " yds>Receptions: " + statsReceptions);
        pStats.add("Catch Percent: " + (100*statsReceptions/(statsTargets+1))+ ">Yards/Tgt: " + ((double)(10*statsRecYards/(statsTargets+1))/10) + " yds");
        pStats.add("Yds/Game: " + ((statsRecYards+careerRecYards)/(getGamesPlayed()+careerGamesPlayed)) + " yds/g>Drops: " + (statsDrops+careerDrops));
        pStats.addAll(super.getCareerStatsList());
        return pStats;
    }

    @Override
    public String getInfoForLineup() {
        if (injury != null) return getInitialName() + " [" + getYrStr() + "] " + ratOvr + "/" + getLetterGrade(ratPot) + " " + injury.toString();
        return getInitialName() + " [" + getYrStr() + "] " + ratOvr + "/" + getLetterGrade(ratPot) + " (" +
                getLetterGrade(ratCatch) + ", " + getLetterGrade(ratSpeed) + ", " + getLetterGrade(ratEvasion) + ")";
    }
}

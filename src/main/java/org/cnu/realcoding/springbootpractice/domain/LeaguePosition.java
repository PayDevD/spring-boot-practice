package org.cnu.realcoding.springbootpractice.domain;

import lombok.Data;

@Data
public class LeaguePosition {
    private String queueType;
    private String summonerName;
    private boolean hotStreak;
    private MiniSeries miniSeries;
    private int wins;
    private boolean veteran;
    private int losses;
    private String rank;
    private String leagueId;
    private boolean inactive;
    private boolean freshBlood;
    private String leagueName;
    private String position;
    private String tier;
    private String summonerId;
    private int leaguePoints;

    @Data
    public static class MiniSeries {
        private String progress;
        private int losses;
        private int target;
        private int wins;
    }
}

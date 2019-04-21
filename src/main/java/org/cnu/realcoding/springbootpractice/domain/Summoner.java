package org.cnu.realcoding.springbootpractice.domain;

import lombok.Data;

@Data
public class Summoner {
    private int profileIconId;
    private String name;
    private String puuid;
    private long summonerLevel;
    private String accountId;
    private String id;
    private long revisionDate;

}

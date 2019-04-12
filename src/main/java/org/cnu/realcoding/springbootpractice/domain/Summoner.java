package org.cnu.realcoding.springbootpractice.domain;

import lombok.Data;

import java.math.BigInteger;

@Data
public class Summoner {
    private int profileIconId;
    private String name;
    private String puuid;
    private int summonerLevel;
    private String id;
    private BigInteger revisionDate;

}

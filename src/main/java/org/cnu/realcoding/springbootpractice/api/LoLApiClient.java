package org.cnu.realcoding.springbootpractice.api;


import org.cnu.realcoding.springbootpractice.domain.LeaguePosition;
import org.cnu.realcoding.springbootpractice.domain.Summoner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LoLApiClient {
    @Autowired
    private RestTemplate restTemplate;

    private String requestUrlByName = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/{SummonerName}?api_key={ApiKey}";

    private String requestUrlByEncryptedSummerId = "https://kr.api.riotgames.com/lol/league/v4/positions/by-summoner/{encryptedSummonerId}?api_key={ApiKey}";
    public Summoner getSummonerByName(String SummonerName){
        return restTemplate.exchange(requestUrlByName, HttpMethod.GET, null, Summoner.class, SummonerName, "RGAPI-1b9188d0-d32e-4716-8dff-1cceff282361")
                .getBody();
    }
    public LeaguePosition[] getLeaguePositionByEncryptedSummonerId(String encryptedSummonerId){
        return restTemplate.exchange(requestUrlByEncryptedSummerId, HttpMethod.GET, null, LeaguePosition[].class, encryptedSummonerId, "RGAPI-1b9188d0-d32e-4716-8dff-1cceff282361")
                .getBody();
    }

}

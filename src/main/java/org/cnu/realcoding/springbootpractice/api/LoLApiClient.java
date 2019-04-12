package org.cnu.realcoding.springbootpractice.api;


import org.cnu.realcoding.springbootpractice.domain.Summoner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LoLApiClient {
    @Autowired
    private RestTemplate restTemplate;

    private String requestUrlByName = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/{SummonerName}api_key={ApiKey}";

    private String requestUrlByEncryptedSummerId = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/{EncryptedSummonerId}api_key={ApiKey}";
    public Summoner getSummonerByName(String SummonerName){
        return restTemplate.exchange(requestUrlByName, HttpMethod.GET, null, Summoner.class, SummonerName, "RGAPI-f84556fe-074b-4217-9b64-57822d544d8a")
                .getBody();
    }
    public Summoner getSummonerByEncryptedSummonerId(String encryptedSummonerId){
        return restTemplate.exchange(requestUrlByEncryptedSummerId, HttpMethod.GET, null, Summoner.class, encryptedSummonerId, "RGAPI-f84556fe-074b-4217-9b64-57822d544d8a")
                .getBody();
    }

}

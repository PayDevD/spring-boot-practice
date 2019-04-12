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

    private String requestUrl = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/{SummonerName}api_key={ApiKey}";

    public Summoner getSummoner(String SummonerName){
        return restTemplate.exchange(requestUrl, HttpMethod.GET, null, Summoner.class, SummonerName, "RGAPI-f84556fe-074b-4217-9b64-57822d544d8a")
                .getBody();
    }

}

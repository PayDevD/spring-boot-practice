package org.cnu.realcoding.springbootpractice.controller;


import org.cnu.realcoding.springbootpractice.api.LoLApiClient;
import org.cnu.realcoding.springbootpractice.domain.LeaguePosition;
import org.cnu.realcoding.springbootpractice.repository.SpringBootPracticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SummonerController {

    @Autowired
    private LoLApiClient loLApiClient;
    @Autowired
    private SpringBootPracticeRepository springBootPracticeRepository;

    @GetMapping("/lol/summoner/Id/by-name")
    public String getSummonerId(@RequestParam String summonerName) {
        return loLApiClient.getSummonerByName(summonerName).getId();
    }
    @GetMapping("/lol/league/positions/by-id")
    public LeaguePosition[] getLeaguePosition(@RequestParam String id){
        return loLApiClient.getLeaguePositionByEncryptedSummonerId(id);
    }
    @GetMapping("/lol/league/insertPositions/by-id")
    public void insertSummonerInformation(@RequestParam String id){
        springBootPracticeRepository.insertLeaguePosition(getLeaguePosition(id));
    }



}

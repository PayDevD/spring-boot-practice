package org.cnu.realcoding.springbootpractice.repository;

import org.cnu.realcoding.springbootpractice.domain.LeaguePosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SpringBootPracticeRepository {
    @Autowired
    private MongoTemplate mongoTemplate;

    public void insertLeaguePosition(LeaguePosition[] position){
        mongoTemplate.insert(position);
    }
}

package ee.mihkel.kumnevoistlus.controller;

import ee.mihkel.kumnevoistlus.entity.Competitors;
import ee.mihkel.kumnevoistlus.repository.CompetitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CompetitorController {


    @Autowired
    CompetitorRepository competitorRepository;

    @GetMapping("competitors")
    public List<Competitors> getCompetitors() {
//        List<Competitors> competitor = new ArrayList<>();
//        competitor.add(new Competitors("Mike", "UK", 25));
//        competitor.add(new Competitors());
//        return competitor;
        return competitorRepository.findAll();
    }

    @PostMapping("competitors")
    public List<Competitors> addCompetitor(@RequestBody Competitors competitor) {
        competitorRepository.save(competitor);
        return competitorRepository.findAll();
    }
}

package ee.mihkel.kumnevoistlus.controller;

import ee.mihkel.kumnevoistlus.entity.Competitor;
import ee.mihkel.kumnevoistlus.repository.CompetitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class CompetitorController {


    @Autowired
    CompetitorRepository competitorRepository;

    @GetMapping("competitors")
    public List<Competitor> getCompetitors() {
        return competitorRepository.findAll();
    }

    @PostMapping("competitors")
    public List<Competitor> addCompetitor(@RequestBody Competitor competitor) {
        competitorRepository.save(competitor);
        return competitorRepository.findAll();
    }

    @PutMapping("competitors")
    public List<Competitor> updateCompetitor(@RequestBody Competitor competitor) {
        competitorRepository.save(competitor);
        return competitorRepository.findAll();
    }
}

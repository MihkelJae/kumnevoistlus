package ee.mihkel.kumnevoistlus.controller;

import ee.mihkel.kumnevoistlus.entity.Competitors;
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
    public List<Competitors> getCompetitors() {
        return competitorRepository.findAll();
    }

    @PostMapping("competitors")
    public List<Competitors> addCompetitor(@RequestBody Competitors competitor) {
        competitorRepository.save(competitor);
        return competitorRepository.findAll();
    }
}

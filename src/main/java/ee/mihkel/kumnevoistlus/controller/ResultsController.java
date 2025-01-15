package ee.mihkel.kumnevoistlus.controller;

import ee.mihkel.kumnevoistlus.entity.Results;
import ee.mihkel.kumnevoistlus.repository.ResultsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class ResultsController {

    @Autowired
    ResultsRepository resultsRepository;

    @GetMapping("results")
    public List<Results> getResults() {
        return resultsRepository.findAll();
    }

    @GetMapping("results/{id}")
    public Optional<Results> getResults(@PathVariable Long id) {
        return resultsRepository.findById(id);
    }


    @PostMapping("results")
    public List<Results> addResults(@RequestBody Results results) {
        resultsRepository.save(results);
        return resultsRepository.findAll();
    }

    @PatchMapping("hundredMeters")
    public List<Results> addHundredMeters(@RequestParam Long id, @RequestParam Double hundredMeters) {
        Results results = resultsRepository.findById(id).orElseThrow();
        results.setLongJump(hundredMeters);
        resultsRepository.save(results);
        return resultsRepository.findAll();
    }

    @PatchMapping("longJump")
    public List<Results> addLongJump(@RequestParam Long id, @RequestParam Double longJump) {
        Results results = resultsRepository.findById(id).orElseThrow();
        results.setLongJump(longJump);
        resultsRepository.save(results);
        return resultsRepository.findAll();
    }

    @PatchMapping("shotPut")
    public List<Results> addShotPut(@RequestParam Long id, @RequestParam Double shotPut) {
        Results results = resultsRepository.findById(id).orElseThrow();
        results.setLongJump(shotPut);
        resultsRepository.save(results);
        return resultsRepository.findAll();
    }

    @PatchMapping("highJump")
    public List<Results> addHighJump(@RequestParam Long id, @RequestParam Double highJump) {
        Results results = resultsRepository.findById(id).orElseThrow();
        results.setLongJump(highJump);
        resultsRepository.save(results);
        return resultsRepository.findAll();
    }

    @PatchMapping("fourHundredMeters")
    public List<Results> addFourHundredMeters(@RequestParam Long id, @RequestParam Double fourHundredMeters) {
        Results results = resultsRepository.findById(id).orElseThrow();
        results.setLongJump(fourHundredMeters);
        resultsRepository.save(results);
        return resultsRepository.findAll();
    }

    @PatchMapping("hunrdles")
    public List<Results> addHunrdles(@RequestParam Long id, @RequestParam Double hunrdles) {
        Results results = resultsRepository.findById(id).orElseThrow();
        results.setLongJump(hunrdles);
        resultsRepository.save(results);
        return resultsRepository.findAll();
    }


    @PatchMapping("discusThrow")
    public List<Results> addDiscusThrow(@RequestParam Long id, @RequestParam Double discusThrow) {
        Results results = resultsRepository.findById(id).orElseThrow();
        results.setLongJump(discusThrow);
        resultsRepository.save(results);
        return resultsRepository.findAll();
    }


    @PatchMapping("poleVault")
    public List<Results> addPoleVault(@RequestParam Long id, @RequestParam Double poleVault) {
        Results results = resultsRepository.findById(id).orElseThrow();
        results.setLongJump(poleVault);
        resultsRepository.save(results);
        return resultsRepository.findAll();
    }

    @PatchMapping("javelinThrow")
    public List<Results> addJavelinThrow(@RequestParam Long id, @RequestParam Double javelinThrow) {
        Results results = resultsRepository.findById(id).orElseThrow();
        results.setLongJump(javelinThrow);
        resultsRepository.save(results);
        return resultsRepository.findAll();
    }

    @PatchMapping("longfifteenHundredMetersJump")
    public List<Results> addFifteenHundredMeters(@RequestParam Long id, @RequestParam Double fifteenHundredMeters) {
        Results results = resultsRepository.findById(id).orElseThrow();
        results.setLongJump(fifteenHundredMeters);
        resultsRepository.save(results);
        return resultsRepository.findAll();
    }


    @GetMapping("score/{id}")
    public Optional<Results> getScore(@PathVariable Long id) {
        Optional<Results> calculateResults = resultsRepository.findById(id);

        calculateResults.ifPresent(r -> r.setHundredMeters(r.getHundredMeters() * 1.3));
        calculateResults.ifPresent(r -> r.setLongJump(r.getLongJump() * 1.3));
        calculateResults.ifPresent(r -> r.setShotPut(r.getShotPut() * 1.3));
        calculateResults.ifPresent(r -> r.setHighJump(r.getHighJump() * 1.3));
        calculateResults.ifPresent(r -> r.setFourHundredMeters(r.getFourHundredMeters() * 1.3));
        calculateResults.ifPresent(r -> r.setHurdles(r.getHurdles() * 1.3));
        calculateResults.ifPresent(r -> r.setDiscusThrow(r.getDiscusThrow() * 1.3));
        calculateResults.ifPresent(r -> r.setPoleVault(r.getPoleVault() * 1.3));
        calculateResults.ifPresent(r -> r.setJavelinThrow(r.getJavelinThrow() * 1.3));
        calculateResults.ifPresent(r -> r.setFifteenHundredMeters(r.getFifteenHundredMeters() * 1.3));

        return calculateResults;
    }

}

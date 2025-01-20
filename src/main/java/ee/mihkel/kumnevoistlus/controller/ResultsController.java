package ee.mihkel.kumnevoistlus.controller;

import ee.mihkel.kumnevoistlus.entity.Results;
import ee.mihkel.kumnevoistlus.repository.ResultsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

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

//    @PatchMapping("hundredMeters")
//    public List<Results> addHundredMeters(@RequestParam Long id, @RequestParam Double hundredMeters) {
//        Results results = resultsRepository.findById(id).orElseThrow();
//        results.setLongJump(hundredMeters);
//        resultsRepository.save(results);
//        return resultsRepository.findAll();
//    }
//
//    @PatchMapping("longJump")
//    public List<Results> addLongJump(@RequestParam Long id, @RequestParam Double longJump) {
//        Results results = resultsRepository.findById(id).orElseThrow();
//        results.setLongJump(longJump);
//        resultsRepository.save(results);
//        return resultsRepository.findAll();
//    }
//
//    @PatchMapping("shotPut")
//    public List<Results> addShotPut(@RequestParam Long id, @RequestParam Double shotPut) {
//        Results results = resultsRepository.findById(id).orElseThrow();
//        results.setLongJump(shotPut);
//        resultsRepository.save(results);
//        return resultsRepository.findAll();
//    }
//
//    @PatchMapping("highJump")
//    public List<Results> addHighJump(@RequestParam Long id, @RequestParam Double highJump) {
//        Results results = resultsRepository.findById(id).orElseThrow();
//        results.setLongJump(highJump);
//        resultsRepository.save(results);
//        return resultsRepository.findAll();
//    }
//
//    @PatchMapping("fourHundredMeters")
//    public List<Results> addFourHundredMeters(@RequestParam Long id, @RequestParam Double fourHundredMeters) {
//        Results results = resultsRepository.findById(id).orElseThrow();
//        results.setLongJump(fourHundredMeters);
//        resultsRepository.save(results);
//        return resultsRepository.findAll();
//    }
//
//    @PatchMapping("hurdles")
//    public List<Results> addHurdles(@RequestParam Long id, @RequestParam Double hunrdles) {
//        Results results = resultsRepository.findById(id).orElseThrow();
//        results.setLongJump(hunrdles);
//        resultsRepository.save(results);
//        return resultsRepository.findAll();
//    }
//
//
//    @PatchMapping("discusThrow")
//    public List<Results> addDiscusThrow(@RequestParam Long id, @RequestParam Double discusThrow) {
//        Results results = resultsRepository.findById(id).orElseThrow();
//        results.setLongJump(discusThrow);
//        resultsRepository.save(results);
//        return resultsRepository.findAll();
//    }
//
//
//    @PatchMapping("poleVault")
//    public List<Results> addPoleVault(@RequestParam Long id, @RequestParam Double poleVault) {
//        Results results = resultsRepository.findById(id).orElseThrow();
//        results.setLongJump(poleVault);
//        resultsRepository.save(results);
//        return resultsRepository.findAll();
//    }
//
//    @PatchMapping("javelinThrow")
//    public List<Results> addJavelinThrow(@RequestParam Long id, @RequestParam Double javelinThrow) {
//        Results results = resultsRepository.findById(id).orElseThrow();
//        results.setLongJump(javelinThrow);
//        resultsRepository.save(results);
//        return resultsRepository.findAll();
//    }
//
//    @PatchMapping("fifteenHundredMetersJump")
//    public List<Results> addFifteenHundredMeters(@RequestParam Long id, @RequestParam Double fifteenHundredMeters) {
//        Results results = resultsRepository.findById(id).orElseThrow();
//        results.setLongJump(fifteenHundredMeters);
//        resultsRepository.save(results);
//        return resultsRepository.findAll();
//    }

    @PatchMapping("result/{event}")
    public List<Results> updateResult(@RequestParam Long id, @RequestParam Double value, @PathVariable String event) {
        Results results = resultsRepository.findById(id).orElseThrow();

        switch (event) {
            case "hundredMeters":
                results.setHundredMeters(value);
                break;
            case "longJump":
                results.setLongJump(value);
                break;
            case "shotPut":
                results.setShotPut(value);
                break;
            case "highJump":
                results.setHighJump(value);
                break;
            case "fourHundredMeters":
                results.setFourHundredMeters(value);
                break;
            case "hurdles":
                results.setHurdles(value);
                break;
            case "discusThrow":
                results.setDiscusThrow(value);
                break;
            case "poleVault":
                results.setPoleVault(value);
                break;
            case "javelinThrow":
                results.setJavelinThrow(value);
                break;
            case "fifteenHundredMetersJump":
                results.setFifteenHundredMeters(value);
                break;
            default:
                throw new IllegalArgumentException("Unknown event: " + event);
        }

        resultsRepository.save(results);
        return resultsRepository.findAll();
    }

    @GetMapping("score/{id}")
    public Optional<Results> getScore(@PathVariable Long id) {
        Optional<Results> calculateResults = resultsRepository.findById(id);

//        calculateResults.ifPresent(r -> r.setHundredMeters(r.getHundredMeters() * 1.3));
//        calculateResults.ifPresent(r -> r.setLongJump(r.getLongJump() * 1.3));
//        calculateResults.ifPresent(r -> r.setShotPut(r.getShotPut() * 1.3));
//        calculateResults.ifPresent(r -> r.setHighJump(r.getHighJump() * 1.3));
//        calculateResults.ifPresent(r -> r.setFourHundredMeters(r.getFourHundredMeters() * 1.3));
//        calculateResults.ifPresent(r -> r.setHurdles(r.getHurdles() * 1.3));
//        calculateResults.ifPresent(r -> r.setDiscusThrow(r.getDiscusThrow() * 1.3));
//        calculateResults.ifPresent(r -> r.setPoleVault(r.getPoleVault() * 1.3));
//        calculateResults.ifPresent(r -> r.setJavelinThrow(r.getJavelinThrow() * 1.3));
//        calculateResults.ifPresent(r -> r.setFifteenHundredMeters(r.getFifteenHundredMeters() * 1.3));

        calculateResults.ifPresent(r -> {
            if (r.getHundredMeters() != 0) {
                r.setHundredMeters(r.getHundredMeters() * 1.3);
            }
            if (r.getLongJump() != 0) {
                r.setLongJump(r.getLongJump() * 1.3);
            }
            if (r.getShotPut() != 0) {
                r.setShotPut(r.getShotPut() * 1.3);
            }
            if (r.getHighJump() != 0) {
                r.setHighJump(r.getHighJump() * 1.3);
            }
            if (r.getFourHundredMeters() != 0) {
                r.setFourHundredMeters(r.getFourHundredMeters() * 1.3);
            }
            if (r.getHurdles() != 0) {
                r.setHurdles(r.getHurdles() * 1.3);
            }
            if (r.getDiscusThrow() != 0) {
                r.setDiscusThrow(r.getDiscusThrow() * 1.3);
            }
            if (r.getPoleVault() != 0) {
                r.setPoleVault(r.getPoleVault() * 1.3);
            }
            if (r.getJavelinThrow() != 0) {
                r.setJavelinThrow(r.getJavelinThrow() * 1.3);
            }
            if (r.getFifteenHundredMeters() != 0) {
                r.setFifteenHundredMeters(r.getFifteenHundredMeters() * 1.3);
            }
        });


        return calculateResults;
    }

    @GetMapping("total/{id}")
    public double  getTotalScore(@PathVariable Long id) {
        Optional<Results> calculateResults = resultsRepository.findById(id);
        AtomicReference<Double> totalScore = new AtomicReference<>((double) 0);

        calculateResults.ifPresent(r -> {
            if (r.getHundredMeters() != 0) {
                r.setHundredMeters(r.getHundredMeters() * 1.3);
            }
            if (r.getLongJump() != 0) {
                r.setLongJump(r.getLongJump() * 1.3);
            }
            if (r.getShotPut() != 0) {
                r.setShotPut(r.getShotPut() * 1.3);
            }
            if (r.getHighJump() != 0) {
                r.setHighJump(r.getHighJump() * 1.3);
            }
            if (r.getFourHundredMeters() != 0) {
                r.setFourHundredMeters(r.getFourHundredMeters() * 1.3);
            }
            if (r.getHurdles() != 0) {
                r.setHurdles(r.getHurdles() * 1.3);
            }
            if (r.getDiscusThrow() != 0) {
                r.setDiscusThrow(r.getDiscusThrow() * 1.3);
            }
            if (r.getPoleVault() != 0) {
                r.setPoleVault(r.getPoleVault() * 1.3);
            }
            if (r.getJavelinThrow() != 0) {
                r.setJavelinThrow(r.getJavelinThrow() * 1.3);
            }
            if (r.getFifteenHundredMeters() != 0) {
                r.setFifteenHundredMeters(r.getFifteenHundredMeters() * 1.3);
            }
            totalScore.set(r.getHundredMeters() + r.getLongJump() + r.getShotPut()
                    + r.getHighJump() + r.getFourHundredMeters() + r.getHurdles()
                    + r.getDiscusThrow() + r.getPoleVault() + r.getJavelinThrow()
                    + r.getFifteenHundredMeters());
        });
        return totalScore.get();
    }

}

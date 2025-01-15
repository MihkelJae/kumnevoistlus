package ee.mihkel.kumnevoistlus.repository;

import ee.mihkel.kumnevoistlus.entity.Results;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResultsRepository extends JpaRepository<Results, Long> {
}

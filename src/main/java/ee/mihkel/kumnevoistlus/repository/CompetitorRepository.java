package ee.mihkel.kumnevoistlus.repository;


import ee.mihkel.kumnevoistlus.entity.Competitor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompetitorRepository extends JpaRepository<Competitor, Long> {
}

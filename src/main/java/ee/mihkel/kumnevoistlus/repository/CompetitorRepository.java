package ee.mihkel.kumnevoistlus.repository;


import ee.mihkel.kumnevoistlus.entity.Competitors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompetitorRepository extends JpaRepository<Competitors, Long> {
}

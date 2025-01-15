package ee.mihkel.kumnevoistlus.entity;

//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Results {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double hundredMeters;
    private double longJump;
    private double shotPut;
    private double highJump;
    private double fourHundredMeters;
    private double hurdles;
    private double discusThrow;
    private double poleVault;
    private double javelinThrow;
    private double fifteenHundredMeters;
}

package si.um.feri.vao;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import si.um.feri.dto.ProduktDTO;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class Produkt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private LocalDateTime created = LocalDateTime.now();
    private double maxMeasure;
    private double minMeasure;

    public Produkt(ProduktDTO dto) {
        setName(dto.name());
        setMaxMeasure(dto.maxMeasure());
        setMinMeasure(dto.minMeasure());
    }

    public void updateFrom(ProduktDTO dto) {
        setName(dto.name());
        setMaxMeasure(dto.maxMeasure());
        setMinMeasure(dto.minMeasure());
    }

    public ProduktDTO toDto() {
        return new ProduktDTO(id, name, maxMeasure, minMeasure);
    }
}
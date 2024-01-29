package si.um.feri.dto;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(value = JsonInclude.Include.NON_NULL)
public record ProduktDTO (
        Long id,
        String name,
        double maxMeasure,
        double minMeasure
) {}

package si.um.feri.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(value = JsonInclude.Include.NON_NULL)
public record OsebaDTO(Long id, String ime, String priimek, int starost) {
}
package si.um.feri.dao;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import si.um.feri.vao.Oseba;

@ApplicationScoped
public class OsebaRepository implements PanacheRepository<Oseba> {

}

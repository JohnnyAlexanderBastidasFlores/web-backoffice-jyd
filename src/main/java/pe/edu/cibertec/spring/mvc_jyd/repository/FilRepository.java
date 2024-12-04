package pe.edu.cibertec.spring.mvc_jyd.repository;

import org.springframework.data.repository.CrudRepository;
import pe.edu.cibertec.spring.mvc_jyd.entity.Film;

public interface FilRepository extends CrudRepository<Film, Integer> {
}

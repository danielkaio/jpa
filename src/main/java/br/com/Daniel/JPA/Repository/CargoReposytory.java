package br.com.Daniel.JPA.Repository;

import br.com.Daniel.JPA.orm.Cargo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargoReposytory extends CrudRepository <Cargo, Integer>{
}

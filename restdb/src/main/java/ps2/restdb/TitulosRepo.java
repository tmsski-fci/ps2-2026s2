package ps2.restdb;

import org.springframework.data.repository.CrudRepository;

public interface TitulosRepo 
    extends CrudRepository<Titulo, Long> {
   
}

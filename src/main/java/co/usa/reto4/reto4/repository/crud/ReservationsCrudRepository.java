package co.usa.reto4.reto4.repository.crud;

import org.springframework.data.repository.CrudRepository;
import co.usa.reto4.reto4.model.Reservations;

public interface ReservationsCrudRepository extends CrudRepository <Reservations, Integer> {
    
}

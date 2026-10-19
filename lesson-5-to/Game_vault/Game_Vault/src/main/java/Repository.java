import Items.Indefinable;

import java.util.List;
import java.util.Optional;

public interface Repository <K, E extends Indefinable<K>>{
    void save (E entity);
    Optional<E> findById (K id);
    List<E> findAll();
}

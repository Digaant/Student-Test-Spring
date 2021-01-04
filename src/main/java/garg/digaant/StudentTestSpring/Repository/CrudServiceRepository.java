package garg.digaant.StudentTestSpring.Repository;

import java.util.Set;

public interface CrudServiceRepository<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}

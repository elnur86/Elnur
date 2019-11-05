package Day191105.dao_;

import java.util.List;

public interface DAO<T> {
    void put(T object);
    T get(int id);
    void delete(int id);
    List<T> getAll();
}

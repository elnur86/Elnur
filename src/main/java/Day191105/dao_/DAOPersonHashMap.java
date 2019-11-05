package Day191105.dao_;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DAOPersonHashMap implements DAO<Person> {

  // for HashMap implementation
  private Map<Integer, Person> storage = new HashMap<>();
  // for ArrayList implementation
  private List<Person> storage2 = new ArrayList<>();

  @Override
  public void put(Person object) {
    storage.put(object.getId(), object);
  }

  @Override
  public Person get(int id) {
    if (storage.containsKey(id))
  return storage.get(id);
    else throw new IllegalArgumentException("Requested id does not exist");
  }

  @Override
  public void delete(int id) {
    storage.remove(id);
   }

  @Override
  public List<Person> getAll() {
    storage2 = new ArrayList<>(storage.values());
    return storage2;
       // throw new IllegalArgumentException("DAOPersonHashMap:getAll:not yet");
  }
}

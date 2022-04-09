package proyecto01;

import java.util.List;

public interface Interface_operadores <T> {
    
    public int create (T t);
    public int delete (int key);
    public List<T> read(int key);
    public List<T> readAll();
}

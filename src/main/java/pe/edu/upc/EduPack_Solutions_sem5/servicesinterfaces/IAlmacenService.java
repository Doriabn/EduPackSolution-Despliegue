package pe.edu.upc.EduPack_Solutions_sem5.servicesinterfaces;

import pe.edu.upc.EduPack_Solutions_sem5.entities.Almacen;

import java.util.List;

public interface IAlmacenService {
    public void insert(Almacen Almacen);
    public List<Almacen> list();
    public void delete(int id);
    public Almacen listId(int id);
    List<String[]> capacidadOcupadaPorAlmacen();
}

package ModelEliments;

import java.util.List;

import Stuff.Type;

public class Scena {
    public int id;
    public List<PoligonalModel> Models;
    public List<Flash> Flashes;
    public List<Camera> cameras;

    public Scena(int id, List<PoligonalModel> models,
            List<Flash> flashes,
            List<Camera> cameras) throws Exception {
 
        this.id = id;

        if (models.size() > 0) {
            Models = models;
        } else {
            throw new Exception("Должна быть одна модель");
        }

        Flashes = flashes;

        if (cameras.size() > 0) {
            this.cameras = cameras;
        } else {
            throw new Exception("Должна быть одна камера");
        }
    }

    // public <T> T method1(T flash) {
    //     return flash;
    // }

    // public <T, E> T method2(T Model, E Flash) {
    //     return Model;
    // }

    /**
    * заглушка
    */
    public Type method1(Type t) {
    return null;
    }

    /**
    * заглушка
    */
    public Type method2(Type t1, Type t2) {
    return null;
    }

}

package ModelEliments;

import java.util.ArrayList;
import java.util.List;

import Stuff.Point3D;

public class PoligonalModel {
    public List<Texture> Textures;
    public List<Poligon> Poligons;

    public PoligonalModel(List<Texture> textures) {
        this.Textures = textures;
        this.Poligons = new ArrayList<>();

        this.Poligons.add(new Poligon(new Point3D()));
    }

}

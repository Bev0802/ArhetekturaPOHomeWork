package InMemoryModel;

import java.util.ArrayList;
import java.util.List;

import ModelEliments.Camera;
import ModelEliments.Flash;
import ModelEliments.PoligonalModel;
import ModelEliments.Scena;
import ModelEliments.Texture;

public class ModelStore implements IModelChanger{
    public List<PoligonalModel> Models;
    public List<Scena> Scenes;
    public List<Flash> Flashes;
    public List<Camera> Cameras;
    private IModelChangeObserver[] changeObservers;

    public ModelStore(IModelChangeObserver[] changeObservers) throws Exception {
        this.changeObservers = changeObservers;
        this.Models = new ArrayList<>();
        this.Scenes = new ArrayList<>();
        this.Flashes = new ArrayList<>();
        this.Cameras = new ArrayList<>();

        List<Texture> Textures = new ArrayList<>();
        this.Models.add(new PoligonalModel(Textures));

        this.Flashes.add(new Flash());
        this.Cameras.add(new Camera());

        this.Scenes.add(new Scena(0, Models, Flashes, Cameras));

    }

    public Scena GetScena(int id){
        return Scenes.get(id);
    }

    @Override
    public void NotifyChange(IModelChanger sender) {
       
    }

    
     
}



from typing import List
from model_store import Flash, Camera, Scene, PolygonalModel

class IModelChangedObserver:
    def apply_update_model(self):
        pass

class IModelChanger:
    def notify_change(self, sender: IModelChanger):
        pass

class ModelStore(IModelChanger):

    def __init__(self, changedObserver: List[IModelChangedObserver]) -> None:
        # super().__init__()
        self.models = []
        self.scenas = []
        self.flashes = []
        self.cameras = []
        self.changeObservers = changedObserver

        textures = []
        self.models.append(PolygonalModel(textures))
        self.cameras.append(Camera())
        self.flashes.append(Flash())
        self.scenas.append(Scene(0,self.models,self.flashes, self.cameras))



    def get_scena(self, id):
        for scene in self.Scenas:
            if scene.id == id:
                return scene
            
    def notify_change(self, sender: IModelChanger):
        pass


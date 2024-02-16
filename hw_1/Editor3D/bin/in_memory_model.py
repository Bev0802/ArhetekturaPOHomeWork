

from typing import List


class IModelChangedObserver:
    def apply_update_model(self):
        pass

class IModelChanger:
    def notify_change(self, sender: IModelChanger):
        pass

class ModelStore(IModelChanger):

    def __init__(self, changedObserver: List[IModelChangedObserver]) -> None:
        # super().__init__()
        self.Models = []
        self.Scenas = []
        self.Flashes = []
        self.Cameras = []
        self.ChangeObservers = changedObserver


    def get_scena(self, id):
        for scene in self.Scenas:
            if scene.id == id:
                return scene
            
    def notify_change(self, sender: IModelChanger):
        pass


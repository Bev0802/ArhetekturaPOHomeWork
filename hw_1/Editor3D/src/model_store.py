from service import Point3D


class Scene:
    def __init__(self, identificator, models, flashes, cameras):
        self.identificator = identificator

        if len(models) > 0:
            self.Models = models
        else:
            raise Exception("Должна быть одна модель")
        
        self.Flashes = flashes

        if len(cameras) > 0:
            self.cameras = cameras
        else:
            raise Exception("Должна быть одна камера")
        
    def method1(self, type):
        return None

    def method2(self, type1, type2):
        return None
    

class Texture:
    pass

class Poligon:
    def __init__(self, point):
        self.points = [point]

class PoligonalModel:
    def __init__(self, textures):
        self.Poligons = []
        self.Textures = textures
        self.Poligons.append(Poligon(Point3D()))

class Flash:
    def __init__(self):
        self.Location = None
        self.Angle = None
        self.color = None
        self.Power = None

    def Rotate(self, angleAction):
        pass

    def Move(self, pointAction):
        pass

class Camera:
    def __init__(self):
        self.Location = None
        self.Angle = None

    def Rotate(self, angleAction):
        pass

    def Move(self, pointAction):
        pass
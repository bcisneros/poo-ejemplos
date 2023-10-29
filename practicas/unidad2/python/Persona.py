class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad
        self.vive = True

    # Se usa la palabra self para hacer referencia al objeto actual
    def es_mayor_que(self, otra_persona):
        return self.edad > otra_persona.edad

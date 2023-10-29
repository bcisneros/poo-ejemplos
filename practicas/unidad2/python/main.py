from Persona import Persona

# Ejemplo de uso
juan = Persona("Juan", 20)
pedro = Persona("Pedro", 15)

if juan.es_mayor_que(pedro):
    print("Juan es mayor que Pedro")
elif pedro.es_mayor_que(juan):
    print("Pedro es mayor que Juan")
else:
    print("Ambos tienen la misma edad")
class Persona
    # otro código
  
    # se usa la palabra self para hacer referencia al objeto actual
    def es_mayor_que(otra_persona)
      return self.edad > otra_persona.edad
    end
  
    # es posible acceder a los atributos utilizando un @ antes del nombre del atributo
    def es_mayor_de_edad
      @edad > 18 # la palabra return es opcional
    end
  
end
package viewModels


case class Avion(
    tamano : Int,
    ultimoMantenimiento : String,
    capacidad : Int,
    referencia : String,  
    listaViajes : List[Viaje]
)
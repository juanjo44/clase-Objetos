package  requests

import viewModels._
import play.api.data._
import play.api.data.Forms._
import play.api.data.validation.Constraints._

object formAvion{
    var avion : Form[Avion] = Form(
    mapping(
        "tamano" -> number,
        "ultimoMantenimiento" -> text,
        "capacidad" -> number,
        "referencia" -> text,
        "listaViajes" -> list(
            mapping(
                "origen" -> text,
                "destino" -> text
            )(Viaje.apply)(Viaje.unapply)
        )   
    ) (Avion.apply)(Avion.unapply)
    )

}
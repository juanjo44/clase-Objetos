package models

import io.ebean._
import com.typesafe.config.Config
import javax.persistence.Entity
import javax.persistence.Column
import javax.persistence.Id


@Entity
class Usuario extends Model{
    @Id
    @Column(name = "idUser")
    private var _id : Long = 0

    @Column(name = "nombre", length = 50, nullable = false)
    private var _nombre : String = ""

    def id = _id
    def nombre = _nombre

    def id_(id : Long) = _id = id
    def nombre_(nombre : String) =  _nombre = nombre
}
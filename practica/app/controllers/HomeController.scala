package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import requests._
import models._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok("Hola")
  }

  def recibirAvion () = Action {
    implicit request: Request[AnyContent] => 
    Ok("Recibir Avion")
  }

  def login() = Action {
    Ok(views.html.login())
  }

  def postAvion() = Action{
    implicit request:Request[AnyContent] =>
      formAvion.avion.bindFromRequest.fold(
        formWithErrors => {
          BadRequest("no")
        },
        avion => {
          Ok("Si")
        }
      )
  }

  def crearUsuario() = Action{
  implicit request:Request[AnyContent] =>
    var usr = new Usuario
    usr.nombre_("JUAN")
    usr.save()
    Ok("Hola Juan")
  }
}



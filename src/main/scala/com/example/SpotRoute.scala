package com.example

import akka.actor.Actor
import spray.routing._
import spray.http._
import MediaTypes._
import org.json4s._
import org.json4s.jackson.JsonMethods._

class SpotActor extends Actor with SpotRoute {
  def actorRefFactory = context

  def receive = runRoute(spotRoute)
}

trait SpotRoute extends HttpService {

  val spotRoute =
    path("spots") {

      get {
        respondWithMediaType(`application/json`) {
          complete {
            "toto"
          }
        }
      }
    }
}
package com.pulse0930.scalatrain

import play.api.libs.json.{JsValue, Json}

import scala.util.Try

case class Time(hours : Int = 0, minutes: Int = 0) extends Ordered[Time]{
  require( hours >= 0 && hours <=23,"Hours is within 0 and 23") // Verify that Hours is within 0 and 23
  require( minutes >= 0 && minutes <=59,"Minutes is within 0 and 59") // Verify that Minutes is within 0 and 59
  val asMinutes : Int = (hours * 60 ) + minutes
  def minus(that : Time): Int = asMinutes - that.asMinutes
  def -(that : Time): Int = this.minus(that)

  override lazy val toString: String = f"$hours%02d : $minutes%02" //Override toString

  override def compare(that: Time): Int = ???

  def toJson: JsValue =
    Json.obj("hours" -> hours, "minutes" -> minutes)
}

object Time{
  def fromMinutes(minutes : Int) : Time = {
    new Time(minutes / 60, minutes % 60) //normalized values for hours and minutes
  }
  //  method inside object Time so calling    > Time.fromJson(jsonValue)
  def fromJson(json: JsValue):Option[Time] = {
    val tryTime = for {
      hrs <- Try((json \ "hours").as[Int])
      mins <- Try((json \ "minutes").as[Int]).recover({case _ : Exception => 0})
      //      if parsing minutes fails then the default value for minutes will be 0
    } yield Time(hrs, mins)
    tryTime.toOption
    //    if success - wrap Time in Some
    //    if failure - return None
  }

}



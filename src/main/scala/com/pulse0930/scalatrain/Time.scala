package com.pulse0930.scalatrain

case class Time (val hours : Int = 0, val minutes : Int = 0){
  require( hours >= 0 && hours <=23,"Hours is within 0 and 23") // Verify that Hours is within 0 and 23
  require( minutes >= 0 && minutes <=59,"Minutes is within 0 and 59") // Verify that Minutes is within 0 and 59
  val asMinutes : Int = (hours * 60 ) + minutes
  def minus(that : Time): Int = asMinutes - that.asMinutes
  def -(that : Time): Int = this.minus(that)
}

object Time{
  def fromMinutes(minutes : Int) : Time = {
    new Time(minutes / 60, minutes % 60) //normalized values for hours and minutes
  }
}

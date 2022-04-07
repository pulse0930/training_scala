package com.pulse0930.scalatrain

class Time (val hours : Int = 0, val minutes : Int = 0){
  // TODO Verify that Hours is within 0 and 23
  // TODO Verify that Minutes is within 0 and 59
  val asMinutes : Int = (hours * 60 ) + minutes
  def minus(that : Time): Int = asMinutes - that.asMinutes
  def -(that : Time): Int = this.minus(that)
}

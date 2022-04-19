package com.pulse0930.scalatrain

case class Train (info: TrainInfo, schedule : Seq[(Time,Station)]) {
  //TODO: Verify that schedule is strictly increasing in time
  val stations : Seq[Station] = schedule.map(sc=>sc._2) // initialized station variable with all the stations from schedule variable

  def timeAt(station: Station): Option[Time] =
  // Could also be expressed in notation: schedule find (_._2 == station) map (_._1)
    schedule.find(stop => stop._2 == station).map(found => found._1)
}

case class Station(name : String)

abstract class TrainInfo{
  def number: Int
}

case class InterCityExpress(number: Int) extends TrainInfo {

}
case class RegionalExpress(number: Int) extends TrainInfo {

}
case class BavarianRegional(number: Int) extends TrainInfo{

}
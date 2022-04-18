package com.pulse0930.scalatrain

class JourneyPlanner (trains : Set[Train]){
  val stations: Set[Station] = trains.flatMap(tr=>tr.stations)
  //Return all Trains that contain the given station in their stations field
  def trainsAt(station: Station): Set[Train] = trains.filter(tr => tr.stations.contains(station))

  def stopsAt(station: Station) : Set[(Time,Train)] = {
    for{
      train <-trains
      time <- train.timeAt(station)
    }yield (time,train)
  }

  //  method to find the time and train which stops at the given station
  def isShortTrip(from: Station, to: Station): Boolean = {
    trains.exists(
      train => train.stations.dropWhile(statn => statn != from) match{
        case `from` +: `to` +: _      => true
        case `from` +: _ +: `to` +: _ => true
        case _                        => false
      }
    )
  }
}

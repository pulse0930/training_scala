
class TrainSpecKoan extends KoanSuite{
  koan("Train nfr724 stop in Dibru, not in Ghy"){
    nfr724.timeAt(dibru) shouldEqual Some(nfr724DibruTime)
    nfr724.timeAt(ghy) shouldEqual None
  }
  koan("Train nfr726 stop in Tinsukia, not in Jorhat"){
    nfr726.timeAt(tinsukia) shouldEqual Some(nfr726TinsukiaTime)
    nfr726.timeAt(jorhat) shouldEqual None
  }
  koan("Train nfr750 stop in Dibru, not in Tinsukia"){
    nfr750.timeAt(dibru) shouldEqual Some(nfr750DibruTime)
    nfr750.timeAt(tinsukia) shouldEqual None
  }

  koan("Creating a Train must throw IAE for 'schedule' with 0 or 1 element"){
    an[IllegalArgumentException] should be thrownBy Train(InterCityExpress(724), Vector())
    an[IllegalArgumentException] should be thrownBy Train(InterCityExpress(724), Vector(nfr724TinsukiaTime -> tinsukia))
  }

  koan("stations must be initialized correctly"){
    nfr724.stations shouldEqual Vector(tinsukia, dibru, moran, jorhat)
    nfr750.stations shouldEqual Vector(dibru, moran, jorhat, __)//ghy
  }
}
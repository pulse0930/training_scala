import com.pulse0930.scalatrain.Time

val time1 = new Time(30,30)
val time2 = new Time(10,30)

//
println(time1.minus(time2))
//infix operation
println(time1 - time2)
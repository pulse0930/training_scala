import com.pulse0930.scalatrain.Time
//instantiating two time objects
val time1 = new Time(20,30)
val time2 = new Time(10,30)

//calling a method from Time
println(time1.minus(time2))

//infix operation
println(time1 - time2)

//Accessing companion objects method
val time3 = Time.fromMinutes(20)
println(time3.hours +" : "+ time3.minutes)

//Creating new instances without new keyword, added case keyword in Time
val time4 = Time(10,30)


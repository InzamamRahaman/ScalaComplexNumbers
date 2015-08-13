import Complex._

/**
 * @author inzamamrahaman
 */
object ComplexMain extends App{
  
  val complex1 = Complex(2.0, 3.0)
  val complex2 = Complex(4.5, 6.7)
  val complex3 : Complex = 2 // implicit conversion from Double
  val complex4 = 4.4.i
  
  
  println(complex1 + complex2) // will print 6.5 + 9.7i
  
  println(complex3) // will print 2.0 + 0.0i
  
  println(complex1 - complex3) // will print 0.0 + 3.0i
  
  println(complex4) // will print 0.0 + 4.4i
  
  println(5.6 + 7.81.i) // will print 5.6 + 7.81i
  
  
}



  
  //println(complex3 + 4.4.i)
  
  //println(23.78 + 34.i)
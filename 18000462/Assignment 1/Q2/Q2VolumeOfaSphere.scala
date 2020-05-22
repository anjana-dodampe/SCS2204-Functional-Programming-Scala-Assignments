object VolSphere extends App{

  //calculates the Volume of a sphere
  def calVol(r:Double)=4.0/3.0*math.Pi*r*r*r;
  
  println("Volume of the Sphere = " + calVol(3));

}
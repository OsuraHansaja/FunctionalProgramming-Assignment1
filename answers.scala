object answers extends App{
//q1
def tempConv(x:Double):Double = x*1.8 + 32
println(tempConv(35))

//q2
def volumeSphere(r:Double):Double = (1.333)*3.14*r*r*r
println(volumeSphere(5))


//q3
def wholesalecost(x:Double):Double = x*24.95*0.6 + 3*50 + (x-50)*0.75;
println(wholesalecost(60));
}

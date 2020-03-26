package Figures

class Circulo (
    override var Name:String = "Circulo",
     var Pi:Double = 3.1416,
     var Radio:Double = 0.0) : Figure  {

    override fun perimeter() : Double {
        return (2*Pi*Radio)
    }

    override fun surface() : String {
        return (Pi*Radio)
    }

}
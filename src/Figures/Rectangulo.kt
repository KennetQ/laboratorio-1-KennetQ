package Figures

class Rectangulo (
    override var Name:String = "Rectangulo",
    var Base:Double = 0.0,
    var Altura:Double = 0.0) : Figure{

    override fun perimeter() : String {
        return (2*Base +  2 * Altura)
    }

    override fun surface() : String {
        return (Base * Altura)
    }

}
package Figures

class Cuadrado (
    override var Name : String = "Cuadrado",
    var Lado1:Double = 0.0,
    var Lado2:Double = 0.0) : Figure {

    override fun perimeter() : Double {
        return 4 * lado1
    }

    override fun surface() : Double {
        return Lado1 * Lado2
    }

}
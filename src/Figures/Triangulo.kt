package Figures

class Triangulo (
    override var Name: String = "Triangulo",
    var Base:Double=0.0,
    var Altura:Double=0.0),
    var Lado1:Double=0.0,
    var Lado2:Double=0.0 : Figure {

    override fun perimeter(): String {
        return Base + Lado1 + Lado2
    }

    override fun surface(): String {
        return (Base*Altura/2)
    }

}
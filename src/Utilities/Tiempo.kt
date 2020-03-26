package Utilities

class Tiempo (
    override var Hora : Int = 0,
    var Minutos : Int = 0,
    var Segundos : Int = 0
) {

    val EE.UU: String = "USA"
    val Alemania: String = "Al"
    val Inglaterra: String = "UK"

    fun CambioH( Diferenciador : Int) : Int {
        var Hour : Int = Hora + Diferenciador
        if(Hour>24){
            Hour-=24
        }
        return Hour
    }

    fun Horario(ZonaH:String) : String{
        when(ZonaH){
            "USA" -> return "Son las ${CH(8).toString()}:${Minutos}:${Segundos}  en EE.UU "
            "AL" -> return "Son las ${CH(5).toString()}:${Minutos}:${Segundos}  en Alemania "
            "UK" -> return " Son las ${CH(9).toString()}:${Minutos}:${Segundos}  en Inglaterra "
            else -> return "Error: zona no valida"
        }
    }
}
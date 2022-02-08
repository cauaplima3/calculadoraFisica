import kotlin.math.pow

class Fisica {

    fun forcaPeso(massa: Float, gravidade: Float): Float {
        return massa * gravidade
    }

    fun focaCentripeta(massa: Float, velocidade: Float, raio: Float): Float {
        return massa * (velocidade.pow(2) / raio)
    }

    fun impulso(f: Float, deltaT: Float): Float {
        return f * deltaT
    }

    fun forcaElastica(k: Float, X: Float): Float {
        return k * X
    }

    fun velocidadeMedia(pontoinicial: Float, pontofinal: Float, tempoinicial: Float, tempofinal: Float): Float {
        return (pontoinicial - pontofinal) / (tempoinicial - tempofinal)
    }

    fun mru(so: Float, v: Float, t: Float): Float {
        return (so + v) * t
    }

    fun mruv(vo: Float, a: Float, t: Float): Float {
        return (vo + a) * t
    }

}
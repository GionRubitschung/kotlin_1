package topic_3

class Car(consumption: Double, tankSize: Double = 30.0) {
    private var _consumption = consumption

    private val _tankSize = tankSize
    var gasLevel = 0.0
        private set(value) {
            if (value <= _tankSize) field = value
            else throw Error("Tank ${_tankSize}L cannot be overfilled with ${field + value}L")
        }

    fun fill(amount: Double) {
        gasLevel = amount
    }

    fun drive(distance: Double) {
        gasLevel -= (_consumption / 100) * distance
    }

}

fun main() {
    val car1 = Car(5.0, 50.0)
    car1.fill(50.0)
    car1.drive(100.0)
    println(car1.gasLevel)

    val car2 = Car(3.0)
    car2.fill(20.0)
    car2.drive(150.0)
    println(car2.gasLevel)
}
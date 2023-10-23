package topic_3

class PhoneKeyboard() {
    private var _digits = ""

    fun press(digit: String) {
        _digits += digit
    }

    fun backspace() {
        _digits.dropLast(1)
    }

    fun clear() {
        _digits = ""
    }

    fun dial() {
        if (_digits.length < 10) println("Cannot dial invalid phone number")
        else println("Calling $_digits")
    }

    fun print() {
        println(this.toString())
    }

    override fun toString(): String = _digits
}

fun main() {
    val phone = PhoneKeyboard()
    phone.print()
    phone.press("0123456789")
    phone.dial()
}
package no.kristiania.my_application_with_multiple_applications.sqLite

class ReModel {

    var number: Int = 0
    var fruit: String? = null

    fun getNumbers(): Int {
        return number
    }

    fun setNumbers(number: Int) {
        this.number = number
    }

    fun getFruits(): String {
        return fruit.toString()
    }

    fun setFruits(fruit: String) {
        this.fruit = fruit
    }
}
fun lbs_kg() {
    print("Weight in Pounds (lbs): ")
    val lbs = readln().toDouble()
    val kg = lbs * 0.4535
    println("Weight converted to Kilograms (kg): $kg")
    println("=================================")
}

fun mi_km() {
    print("Length in Miles (mi): ")
    val mi = readln().toDouble()
    val km = mi * 1.609
    println("Length in Kilometers (km): $km")
    println("=================================")
}

fun fah_cel() {
    print("Temperature in Fahrenheit (°F): ")
    val f = readln().toDouble()
    val c = (f - 32) * 5/9
    println("Temperature in Fahrenheit (°C): $c.round")
}

fun main() {
    lbs_kg()
    mi_km()
    fah_cel()
}
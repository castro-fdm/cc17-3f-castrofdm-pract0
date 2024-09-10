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
    println("Temperature in Fahrenheit (°C): $c")
    println("=================================")
}

fun students() {
    var totalAge = 0
    for (i in 1..10) {
        print("Age of Student $i: ")
        val age = readln().toInt()
        totalAge += age
    }
    val averageAge = totalAge / 10.0
    println("The average age of the students: $averageAge")
    println("=================================")
}

fun story() {
    val heroName = "Tarnished"
    val witchName = "Ranni"
    val demiGod = "Malenia"
    val weap1 = "Hand of Malenia"
    val weap2 = "Sword of Night and Flame"

    val multilineString = """
        In the shadowy depths of an ancient realm, there lurked a tale of ~$witchName~ the Witch, a young Demigoddess marked by destiny to ascend as the new goddess. 
        But ~$witchName~, consumed by a dark defiance, refused to be a mere puppet of fate. Her rebellion against the omnipotent Goddess Marika was a chilling act of defiance. 
        She unearthed a forbidden ritual to slay a god, and in a nightmarish twist, she murdered Queen Marika’s cherished offspring, the Demi-God Godwyn, leaving his body a hollow, soulless shell. 
        As a final act of macabre defiance, she took her own life, transforming herself into a wandering, huskless soul. Years later, ~$witchName~, now a spectral figure of dread and wisdom, maneuvers through the shadows, her eyes set on the throne. 
        
        Her ambition is to reign over The Lands Between, ushering in an era of eerie tranquility, where peace is but a fragile veil over the lurking horrors of her past.
        In this darkened world, a hero known only as the ~$heroName~ emerges, wielding the <$weap2>, a weapon of immense power. 
        Driven by an unyielding will to restore balance, the ~$heroName~ is equipped with the Erdtree’s Favor, a talisman that grants extraordinary resilience. 
        Alongside the ~$heroName~ stands Radahn, a fearsome Demigod whose strength is matched only by his madness, and ~$demiGod~, a warrior of unparalleled skill, cursed with a rot that devours all. 
        ~$demiGod~ wields the <$weap1>, a blade that mirrors her deadly grace. Bound by fate, they seek to challenge the malevolent forces that threaten their world. 
        Miquella, the enigmatic and eternally youthful Demigod, weaves through this tale, his motives shrouded in mystery. 
        He possesses the Unalloyed Gold Needle, an artifact of great significance.

        Together, these figures navigate a landscape of treachery and despair, their paths converging in a climactic struggle against the darkness that ~$witchName~ has both embraced and sought to control. 
        The ~$heroName~ calls upon the Flame of Frenzy, an ability that engulfs enemies in a chaotic blaze. 
        The fate of The Lands Between hangs in the balance, as heroes and demigods clash in a battle that will determine the future of this haunted realm.
    """.trimIndent()

    println(multilineString)
}

fun main() {
    lbs_kg()
    mi_km()
    fah_cel()
    students()
    story()
}
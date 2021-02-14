package music

// i.e. pitch class
class Note(private val chromaticValue: Int, private val name: String) {
    override fun toString(): String {
        return name
    }
}

class Interval(private val distance: Int)

val notes12tone = listOf(
    Note(0, "A"),
    Note(1, "Bb"),
    Note(2, "B"),
    Note(3, "C"),
    Note(4, "Db"),
    Note(5, "D"),
    Note(6, "Eb"),
    Note(7, "E"),
    Note(8, "F"),
    Note(9, "Gb/F#"),
    Note(10, "G"),
    Note(11, "Ab")
)
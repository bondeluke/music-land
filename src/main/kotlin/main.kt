import math.graphs.Relationship
import math.graphs.Graph
import math.graphs.MutableNode
import music.Note
import music.notes12tone

fun createCircleOf5ths(): Graph<Note, String> {
    val nodes = (0..11).map { MutableNode<Note, String>(notes12tone[it]) }

    nodes.mapIndexed { i, node ->
        node.edges.add(Relationship("4th", nodes[(i + 5) % 12]))
        node.edges.add(Relationship("5th", nodes[(i + 7) % 12]))
    }

    return Graph(nodes.map { it.toImmutableNode() })
}

fun main() {
    val cof = createCircleOf5ths()

    val pattern = "WWHWWWH"
}



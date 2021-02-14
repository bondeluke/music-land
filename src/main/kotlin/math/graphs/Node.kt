package math.graphs

interface Node<TNode, TEdge> {
    val value: TNode
    val edges: List<Relationship<TNode, TEdge>>
}

class Relationship<TNode,TEdge>(
    val value: TEdge,
    val to: Node<TNode, TEdge>
)
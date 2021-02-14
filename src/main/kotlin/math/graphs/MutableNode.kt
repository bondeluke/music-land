package math.graphs

class MutableNode<TNode, TEdge>(
    override val value: TNode,
    override val edges: MutableList<Relationship<TNode, TEdge>> = mutableListOf()
) : Node<TNode, TEdge> {
    fun toImmutableNode(): ImmutableNode<TNode, TEdge> {
        return ImmutableNode(value, edges.toList())
    }
}

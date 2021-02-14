package math.graphs

class ImmutableNode<TNode, TEdge>(
    override val value: TNode,
    override val edges: List<Relationship<TNode, TEdge>>
) : Node<TNode, TEdge>

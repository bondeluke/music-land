package music

import math.graphs.Graph

data class Scale(val notes: Graph<Note, Interval>, val root: Note)
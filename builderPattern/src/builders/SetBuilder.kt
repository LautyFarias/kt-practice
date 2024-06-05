package builders

import datastructures.set.StaticSet

class SetBuilder : CollectionBuilder() {
    override fun add(obj: Int) {
        if (count == max) throw RuntimeException("Limite de elementos alcanzado")

        for (i in 0..<count) {
            if (array[i] == obj) return
        }

        array[count] = obj
        this.count++
    }

    override fun build() = StaticSet(this)
}

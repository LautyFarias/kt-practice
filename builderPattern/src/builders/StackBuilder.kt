package builders

import datastructures.stack.Stack

class StackBuilder : CollectionBuilder() {
    override fun add(obj: Int) {
        if (this.count >= max) throw RuntimeException("Limite excedido")
        array[count++] = obj
    }

    override fun build() = Stack(this)
}
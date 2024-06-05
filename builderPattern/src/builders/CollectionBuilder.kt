package builders

import datastructures.set.ISet
import utils.SetUtil

abstract class CollectionBuilder {
    val max = 10000

    var array = IntArray(max)
    var count = 0

    abstract fun add(obj: Int)
    abstract fun build(): Any

    fun addAll(objs: ISet) {
        val setCopy = SetUtil.copy(objs)

        while (!setCopy.isEmpty()) {
            val obj = setCopy.choose()
            setCopy.remove(obj)

            this.add(obj)
        }
    }

    fun clear() {
        array = IntArray(max)
        count = 0
    }
}
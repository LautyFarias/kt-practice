package utils

import builders.SetBuilder
import datastructures.set.ISet

class SetUtil {
    companion object {
        fun copy(set: ISet): ISet {
            val auxBuilder = SetBuilder()
            val setCopyBuilder = SetBuilder()

            while (!set.isEmpty()) {
                val value: Int = set.choose()
                auxBuilder.add(value)

                setCopyBuilder.add(value)
                set.remove(value)
            }

            val aux = auxBuilder.build()

            while (!aux.isEmpty) {
                val value: Int = aux.choose()

                set.add(value)
                aux.remove(value)
            }

            return setCopyBuilder.build()
        }
    }
}

import builders.CollectionBuilder
import builders.SetBuilder

class Director {
    companion object {
        fun createCollectionUsingBuilderAdd(builder: CollectionBuilder): Any {
            builder.add(1)
            builder.add(2)
            builder.add(3)

            val collection = builder.build()

            builder.clear()
            return collection
        }

        fun createCollectionUsingBuilderAddAll(builder: CollectionBuilder): Any {
            val setBuilder = SetBuilder()

            setBuilder.add(3)
            setBuilder.add(4)
            setBuilder.add(5)

            builder.addAll(setBuilder.build())

            val collection = builder.build()

            builder.clear()
            return collection
        }
    }
}
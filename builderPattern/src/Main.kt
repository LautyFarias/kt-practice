import builders.SetBuilder
import builders.StackBuilder
import datastructures.queue.Queue

//TIP Modifique la estructura Set y la estructura Stack para que tengan un
// metodo add por medio de este patron. Escriba otro metodo addAll que pertenezca
// al mismo builder, que reciba una instancia de Set y agregue todos sus elementos
// sin modificar la instancia de Set.

//TIP Modifique la estructura Queue para que tenga un constructor con cantidad de parametros
// variables, de tal forma que instancie la estructura con parametros dentro.
fun main() {
    val setBuilder = SetBuilder()

    val set1 = Director.createCollectionUsingBuilderAdd(setBuilder)
    println(set1)

    val set2 = Director.createCollectionUsingBuilderAddAll(setBuilder)
    println(set2)

    val stackBuilder = StackBuilder()

    val stack1 = Director.createCollectionUsingBuilderAdd(stackBuilder)
    println(stack1)

    val stack2 = Director.createCollectionUsingBuilderAddAll(stackBuilder)
    println(stack2)

    val queue = Queue(1, 2, 3)
    println(queue)
}
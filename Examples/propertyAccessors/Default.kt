// PropertyAccessors/Default.kt
import atomictest.*

class Default {
  var i: Int = 0
    get() {              // [1]
      trace("get() called")
      return field       // [2]
    }
    set(value) {         // [3]
      trace("set($value)")
      field = value      // [4]
    }
}

fun main(args: Array<String>) {
  val d = Default()
  d.i = 2
  d.i eq 2
  trace eq """
set(2)
get() called
"""
}

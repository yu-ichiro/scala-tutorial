object Basics {
  def main(args: Array[String]): Unit = {
    {
      println("--- Expression ---")
      println(1) // 1
      println(1 + 1) // 2
      println("Hello!") // Hello!
      println("Hello," + " world!") // Hello, world!
      println()
    }

    {
      println("--- Value ---")
      val x = 1 + 1
      println(x) // 2
      println()
    }

    {
      println("--- Variable ---")
      var y = 1 + 1
      y = 3 // "y" is declared with "var" keyword, so this compiles
      println(y * y) // 9
      println()
    }

    {
      println("--- Block ---")
      println({
        val x = 1 + 1
        x + 1
      }) // 3
      println()
    }

    {
      println("--- Function ---")
      val addOne = (x: Int) => x + 1
      println(addOne(1)) // 2
      val add = (x: Int, y: Int) => x + y
      println(add(1, 2)) // 3
      val getTheAnswer = () => 42
      println(getTheAnswer()) // 42
      println()
    }

    {
      println("--- Method ---")
      def addMethod(x: Int, y: Int): Int = x + y
      println(addMethod(1, 2)) // 3

      def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x + y) * multiplier
      println(addThenMultiply(1, 2)(3)) // 9

      def name: String = System.getProperty("user.name")
      println("Hello, " + name + "!")

      def getSquareString(input: Double): String = {
        val square = input * input
        square.toString
      }
      println(getSquareString(2.5)) // 6.25
      println()
    }

    {
      println("--- Class ---")
      class Greeter(prefix: String, suffix: String) {
        def greet(name: String): Unit =
          println(prefix + name + suffix)
      }
      val greeter = new Greeter("Hello, ", "!")
      greeter.greet("Scala developer") // Hello, Scala developer!
      println()
    }

    {
      println("--- Case Class ---")
      case class Point(x: Int, y: Int)
      val point = Point(1, 2)
      val anotherPoint = Point(1, 2)
      val yetAnotherPoint = Point(2, 2)

      if (point == anotherPoint) {
        println(point.toString() + " and " + anotherPoint.toString() + " are the same.")
      } else {
        println(point.toString() + " and " + anotherPoint.toString() + " are different.")
      } // Point(1,2) and Point(1,2) are the same.

      if (point == yetAnotherPoint) {
        println(point.toString() + " and " + yetAnotherPoint.toString() + " are the same.")
      } else {
        println(point.toString() + " and " + yetAnotherPoint.toString() + " are different.")
      } // Point(1,2) and Point(2,2) are different.
      println()
    }

    {
      println("--- Object ---")
      object IdFactory {
        private var counter = 0

        def create(): Int = {
          counter += 1
          counter
        }
      }
      val newId: Int = IdFactory.create()
      println(newId) // 1
      val newerId: Int = IdFactory.create()
      println(newerId) // 2
      println()
    }

    {
      println("--- Trait ---")
      trait Greeter {
        def greet(name: String): Unit =
          println("Hello, " + name + "!")
      }

      class DefaultGreeter extends Greeter

      class CustomizableGreeter(prefix: String, postfix: String) extends Greeter {
        override def greet(name: String): Unit = {
          println(prefix + name + postfix)
        }
      }

      val greeter = new DefaultGreeter()
      greeter.greet("Scala developer") // Hello, Scala developer!

      val customGreeter = new CustomizableGreeter("How are you, ", "?")
      customGreeter.greet("Scala developer") // How are you, Scala developer?
      println()
    }
  }
}
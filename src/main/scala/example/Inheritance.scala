package example

import example.level2.Documentation

abstract class DocumentationInheritance[T, A <: Int, B >: String, -X, +Y] extends Documentation[T, A, B, X, Y] {}

class DocumentationInheritanceMethod:
    def wierdMethod[T, A <: Int, B >: String](t: T, a: A): B = ???
    def threOtherWay[A <: Nothing, B >: Any](a: A, c: B): Unit = ???

class C
class A:
    type I = Int
    given Unit = ()
    extension (u: Unit) def foo = "foo"
    object X
    class B extends C:
        class D extends C

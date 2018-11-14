package category

object ApplicativeFunctorExample {

}

trait ApplicativeFunctor[AF[_]] extends Functor[AF] {

  def pure[A](a: A): AF[A]

  def <*>[A,B](af: AF[A => B], fun: AF[A]): AF[B]
}

package category

object FunctorExample {


}

trait Functor[F[_]] {

  def fmap[A, B](f: A => B)(fun: F[A]): F[B]

}

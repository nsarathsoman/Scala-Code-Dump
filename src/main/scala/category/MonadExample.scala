package category

object MonadExample {

}

trait Monad[M[_]] extends ApplicativeFunctor[M] {

  def >>=[A, B](m: M[A])(f: A => M[B]): M[B]
}

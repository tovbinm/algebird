package com.twitter.algebird

import com.twitter.algebird.Monoid._
import com.twitter.algebird.Operators._
import org.scalatest._


class TuplesTest extends FlatSpec with Matchers {

  // implicit val tupSg = new Tuple2Semigroup[Long, Long]()
  // implicit val arrTupSg = new Tuple2Semigroup[Array[Long], Array[Long]]()

  "(Long, Long)" should "sum" in  {
    (1L -> 1L) + (1L -> 1L) shouldBe (2L -> 2L)
  }

  "(Array[Long], Array[Long])" should "sum" in {
    (Array(1L, 2L) -> Array(1L, 2L)) + (Array(1L) -> Array(1L, 2L)) shouldBe (Array(2L) -> Array(2L, 4L))
  }

}

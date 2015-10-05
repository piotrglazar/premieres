package com.piotrglazar.premieres

import org.scalatest.{FlatSpec, Matchers}

class PremieresTest extends FlatSpec with Matchers  {

  val premieres: Premieres = new Premieres(new Readme)

  "Premieres" should "print info" in {
    // when
    val info = premieres.info()

    // then
    info shouldBe "Premieres: This app fetches info about movie premieres"
  }
}

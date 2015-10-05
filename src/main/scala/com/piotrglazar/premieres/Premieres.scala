package com.piotrglazar.premieres

import com.google.inject.{Guice, Inject, Injector}

class Premieres @Inject() (val readme: Readme) {

  def info(): String = {
    "Premieres: " + readme.readme()
  }
}

object Premieres {

  def main(args: Array[String]) {
    val injector: Injector = Guice.createInjector(new PremieresModule())

    import net.codingwell.scalaguice.InjectorExtensions._

    val premieres: Premieres = injector.instance[Premieres]

    println(premieres.info())
  }
}

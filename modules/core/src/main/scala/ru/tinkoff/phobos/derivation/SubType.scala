package ru.tinkoff.phobos.derivation

import ru.tinkoff.phobos.encoding.ElementEncoder

trait SubType[Base] {
  type Sub
  def isSuccessorOf(base: Base): Boolean
  def narrow(base: Base): Sub
  val typeclass: ElementEncoder[Sub]
}

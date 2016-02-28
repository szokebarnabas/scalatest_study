package teststyles

import org.scalatest.FunSuite

class SetFunSuite extends FunSuite {

  test("empty set should have size 0") {
    assert(Set.empty.size == 0)
  }

  test("invoking the head on an empty set should throw exception") {
    intercept[NoSuchElementException] {
      Set.empty.head
    }
  }

}

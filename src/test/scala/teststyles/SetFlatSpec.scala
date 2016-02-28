package teststyles

import org.scalatest.FlatSpec

class SetFlatSpec extends FlatSpec {

  "an empty set" should "have size 0" in {
    assert(Set.empty.size == 0)
  }

  it should "throw exception when the head is invoked on an empty set" in {
    intercept[NoSuchElementException] {
      Set.empty.head
    }
  }
}

package teststyles

import org.scalatest.FreeSpec

class SetFreeSpec extends FreeSpec {

  "a set" - {
    "when empty" - {
      "should have size 0" in {
        assert(Set.empty.size == 0)
      }
    }

    "should throw exception when the head is called" in {
      intercept[NoSuchElementException] {
        Set.empty.head
      }
    }
  }


}

package teststyles

import org.scalatest.WordSpec

class SetWordSpec extends WordSpec {

  "A set" when {
    "empty" should {
      "have size 0" in {
        assert(Set.empty.size == 0)
      }

      "throw exception when the head is called" in {
        intercept[NoSuchElementException] {
          Set.empty.head
        }
      }
    }
  }

}

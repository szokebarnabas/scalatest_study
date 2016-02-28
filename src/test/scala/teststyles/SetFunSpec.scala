package teststyles

import org.scalatest.FunSpec

class SetFunSpec extends FunSpec {

  describe("when a set") {
    describe("is empty") {

      it("should have size 0") {
        assert(Set.empty.size == 0)
      }

      it("should throw exception when the head is invoked") {
        intercept[NoSuchElementException] {
          Set.empty.head
        }
      }

    }

  }

}

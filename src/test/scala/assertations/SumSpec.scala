package assertations

import org.scalatest.{FunSuite, GivenWhenThen, FlatSpec}

class SumSpec extends FunSuite with GivenWhenThen {

  test("adding two numbers") {

    Given("There are two numbers")
    def first = 1
    def second = 2

    When("I sum them")
    def result = first + second

    Then("I get the following result")
    assert(result == 3)
  }

  test("multiplying two numbers returns a wrong result") {
    def first = 2
    def second = 3

    def result = first * second

    assert(result == 5, "this is an optional error message")
  }

  test("using assert result") {
    def first = 2
    def second = 3

    assertResult(4) {
      first + second

    }

  }

  test("assumptions") {
    def foo = false
    assume(foo)
  }

  test("using clue 1") {
    assert(1 === 2, "this is odd dude")
  }

  test("using clue 2") {
    assertResult(3, "this is a clue") {
      1 + 1
    }
  }

  test("using clue 3") {
    withClue("this is a clue") {
      intercept[IndexOutOfBoundsException] {
        "hi".charAt(1)
      }
    }
  }
}

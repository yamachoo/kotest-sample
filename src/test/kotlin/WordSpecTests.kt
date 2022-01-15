import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

class WordSpecTests : WordSpec({
    "String.length" should {
        "return the length of the string" {
            "sammy".length shouldBe 5
            "".length shouldBe 0
        }
    }

    "Hello" When {
        "asked for length" should {
            "return 5" {
                "Hello".length shouldBe 5
            }
        }

        "appended to Bob" xshould {
            "return Hello Bob" {
                "Hello " + "Bob" shouldBe "Hello Bob"
            }
        }
    }
})

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class StringSpecTests : StringSpec({
    "strings.length should return size of string" {
        "hello".length shouldBe 5
    }

    "this test is disabled".config(enabled = false) {
        // test here
    }

    "!this test is disabled 2" {
        // test here
    }
})

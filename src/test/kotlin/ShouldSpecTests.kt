import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class ShouldSpecTests : ShouldSpec({
    context("Test 1") {
        context("Test 1-1") {
            should("String length should return the length of the string") {
                "sammy".length shouldBe 5
            }
        }

        should("String length should return the length of the string") {
            "".length shouldBe 0
        }

        xshould("this test is disabled") {
            // test here
        }
    }

    xcontext("Test 2") {
        should("String length should return the length of the string") {
            // test here
        }
    }
})

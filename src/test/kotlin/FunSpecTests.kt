import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class FunSpecTests : FunSpec({
    context("Test 1") {
        context("Test 1-1") {
            test("String length should return the length of the string") {
                "sammy".length shouldBe 5
            }
        }

        test("String length should return the length of the string") {
            "".length shouldBe 0
        }

        xtest("this test is disabled") {
            // test here
        }
    }

    xcontext("Test 2") {
        test("String length should return the length of the string") {
            // test here
        }
    }
})

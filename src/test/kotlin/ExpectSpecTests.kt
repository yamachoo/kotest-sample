import io.kotest.core.spec.style.ExpectSpec
import io.kotest.matchers.shouldBe

class ExpectSpecTests : ExpectSpec({
    context("Test 1") {
        context("Test 1-1") {
            expect("String length should return the length of the string") {
                "sammy".length shouldBe 5
            }
        }

        expect("String length should return the length of the string") {
            "".length shouldBe 0
        }

        xexpect("this test is disabled") {
            // test here
        }
    }

    xcontext("Test 2") {
        expect("String length should return the length of the string") {
            // test here
        }
    }
})

import io.kotest.core.spec.style.DescribeSpec

class DescribeSpecTest : DescribeSpec({
    describe("score") {
        it("start as zero") {
            // test here
        }

        describe("with a strike") {
            it("adds ten") {
                // test here
            }

            it("carries strike to the next frame") {
                // test here
            }
        }

        describe("for the opposite team") {
            it("Should negate one score") {
                // test here
            }
        }
    }

    describe("this outer block is enabled") {
        xit("this test is disabled") {
            // test here
        }
    }

    xdescribe("this block is disabled") {
        it("disabled by inheritance from the parent") {
            // test here
        }
    }
})

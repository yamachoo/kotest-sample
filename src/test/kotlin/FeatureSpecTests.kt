import io.kotest.core.spec.style.FeatureSpec

class FeatureSpecTests : FeatureSpec({
    feature("Test 1") {
        feature("the can of coke") {
            scenario("should be fizzy when I shake it") {
                // test here
            }

            scenario("and should be tasty") {
                // test here
            }
        }
    }

    feature("this outer block is enabled") {
        xscenario("this test is disabled") {
            // test here
        }
    }

    xfeature("this block is disabled") {
        scenario("disabled by inheritance from the parent") {
            // test here
        }
    }
})

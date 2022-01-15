import io.kotest.core.spec.style.BehaviorSpec

class BehaviorSpecTests : BehaviorSpec({
    given("a broomstick") {
        `when`("I sit on it") {
            then("I should be able to fly") {
                // test code
            }
        }
        `when`("I throw it away") {
            then("it should come back") {
                // test code
            }
        }
    }

    given("a broomstick 2") {
        and("a witch") {
            `when`("The witch sits on it") {
                and("she laughs hysterically") {
                    then("She should be able to fly") {
                        // test code
                    }
                }
            }
        }
    }

    xgiven("this is disabled") {
        When("disabled by inheritance from the parent") {
            then("disabled by inheritance from its grandparent") {
                // disabled test
            }
        }
    }

    given("this is active") {
        When("this is active too") {
            xthen("this is disabled") {
                // disabled test
            }
        }
    }
})

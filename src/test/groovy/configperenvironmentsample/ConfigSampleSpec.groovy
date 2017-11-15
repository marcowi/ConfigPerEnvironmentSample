package configperenvironmentsample

import org.grails.testing.GrailsUnitTest
import spock.lang.Specification

class ConfigSampleSpec extends Specification implements GrailsUnitTest {

    def setup() {
    }

    def cleanup() {
    }

    void "configuraton override"() {
        expect:"overridden"
            grailsApplication.config.overrideme == "done"
    }
}
package demo

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ApplicationKtTest {

    @Test
    fun testResultIsTrue() {
        assertTrue(checkIsTrue())
    }

    @Test
    fun testUserInfo() {
        assertEquals("qmm is 18 years old", getPersonDetail())
    }
}
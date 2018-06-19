package dobrowins.com.randomproviderlibrary

import org.junit.Assert.assertNotEquals
import org.junit.Before
import org.junit.Test

class RandomNumberProviderImplTest {

    companion object {
        private const val TEST_BOUND = 1024
    }

    private lateinit var randomNumberProvider: RandomNumberProvider

    @Before
    fun init() {
        randomNumberProvider = RandomNumberProviderImpl()
    }

    @Test
    fun provideRandomNumberTest() {
        val numberOne = randomNumberProvider.provideRandomNumber(TEST_BOUND)
        val numberTwo = randomNumberProvider.provideRandomNumber(TEST_BOUND)
        assertNotEquals(numberOne, numberTwo)
    }
}
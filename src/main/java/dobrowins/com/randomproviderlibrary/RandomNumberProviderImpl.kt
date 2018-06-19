package dobrowins.com.randomproviderlibrary

import java.util.*

/**
 * тест субмодуля: добавление комментария
 */
class RandomNumberProviderImpl : RandomNumberProvider {

    private val random by lazy { Random() }

    override fun provideRandomNumber(bound: Int): Int =
        random.nextInt(bound)

}
package dobrowins.com.randomproviderlibrary

interface RandomNumberProvider {
    fun provideRandomNumber(bound: Int): Int
}
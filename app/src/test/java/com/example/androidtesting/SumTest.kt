package com.example.androidtesting

import junit.framework.TestCase.assertEquals
import org.junit.Test


// Im Unit Test kann nur eine Klasse getestet werden, in diesem Beispiel die Klasse Sum()
class SumTest {
    //System under(sut) test or fixture (Um den Namen der zu testenden Klasse in einem Unit-Test zu beschreiben)
    val sut = Sum()



    @Test
    fun add() {
        //Given
        val numberA = 2
        val numberB = 5
        val expectation = 7
        //When
        val result = sut.add(numberA, numberB)
        //Then
        assertEquals(expectation, result)
    }
}

//Arrange = Given
//Act = When
//Assert = Then
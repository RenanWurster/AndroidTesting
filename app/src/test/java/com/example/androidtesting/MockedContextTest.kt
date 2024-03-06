package com.example.androidtesting

import android.content.Context
import org.junit.Test

import org.junit.Assert.assertEquals
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner
import org.mockito.kotlin.mock
import org.mockito.kotlin.doReturn

private const val FAKE_STRING = "HELLO WORLD"

@RunWith(MockitoJUnitRunner::class)
class MockedContextTest {
    //Mock wird verwendet, um die Dependecies zu mocken (was im Parameter der getesteten Klasse gegeben wird).
    @Mock
    private lateinit var mockContext: Context

    @Test
    fun readStringFromContext_LocalizedString() {
        // Given a mocked Context injected into the object under test...
        mockContext = mock<Context> {
            on { getString(R.string.hello_world) } doReturn FAKE_STRING
        }


        val myObjectUnderTest = ContextWrapper(mockContext)

        // ...when the string is returned from the object under test...
        val result: String = myObjectUnderTest.getTitle()

        // ...then the result should be the expected one.
        assertEquals(result, FAKE_STRING)
    }
}
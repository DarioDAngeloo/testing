package com.study.testingbeforetechnicalinterview

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class ResourceComparerTest {
    private lateinit var resourceComparer: ResourceComparer

    @Before
    fun initSetup(){
        resourceComparer = ResourceComparer()
    }

    @Test
    fun ifTheResID_isEqual_to_String__assertTrue() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context,R.string.app_name,"TestingBeforeTechnicalInterview")
        assertThat(result).isTrue()
    }

    @Test
    fun ifTheResID_isDifferent_to_String__assertFalse() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context,R.string.app_name,"Hola")
        assertThat(result).isFalse()
    }

}
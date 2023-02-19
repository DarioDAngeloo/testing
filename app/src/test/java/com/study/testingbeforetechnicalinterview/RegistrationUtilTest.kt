package com.study.testingbeforetechnicalinterview

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `if the user name is empty returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123456",
            "123456"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `if the username is not Empty and correctly repeated password, returns true`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Menta",
            "123456",
            "123456"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `if the username is already taken, returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Leslie",
            "123456",
            "123456"
        )
        assertThat(result).isFalse()
    }


    @Test
    fun `if the username is valid but the repeated password is not the same as the original , returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Leslie",
            "123456",
            "1234567"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `if the password contains less than 6 characters, return false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Leslie",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `if the password is empty, returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Leslie",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

}
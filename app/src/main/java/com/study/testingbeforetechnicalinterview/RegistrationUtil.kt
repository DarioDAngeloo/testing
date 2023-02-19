package com.study.testingbeforetechnicalinterview

object RegistrationUtil {

    private val existingUsers = listOf("Dario","Diego","Leslie")

    /**
     * The input is not valid if..
     * ....the username/password is empty
     * ....the username is already taken
     * ....the confirmed password is not the same as the real password
     * ...the password contains less than 6 digits
     */


    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ) : Boolean {
        if (username.isEmpty() || password.isEmpty()) return false

        if (username in existingUsers) return false

        if (confirmedPassword !== password) return false

        if (password.count { it.isDigit() } < 6) return false

        return true
    }

}
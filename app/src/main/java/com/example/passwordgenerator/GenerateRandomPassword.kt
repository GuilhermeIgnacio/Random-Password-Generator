package com.example.passwordgenerator

import kotlin.random.Random

class GenerateRandomPassword {

    fun generateRandomPassword(length: Int) : String {
        val charPool : List<Char> = ('a'..'z') + ('A'..'Z')+ ('0'..'9') + ('!'..'/')
        return (1..length)
            .map { Random.nextInt(0, charPool.size) }
            .map ( charPool::get )
            .joinToString("")

    }

    fun generateRandomPasswordUppercase(length: Int) : String {
        val charPool : List<Char> = ('A'..'Z').toList()
        return (1..length)
            .map { Random.nextInt(0, charPool.size) }
            .map ( charPool::get )
            .joinToString("")
    }

    fun generateRandomPasswordLowerCase(length: Int) : String{
        val charPool : List<Char> = ('a'..'z').toList()
        return (1..length)
            .map { Random.nextInt(0, charPool.size) }
            .map ( charPool::get )
            .joinToString("")
    }

    fun generateRandomPasswordSymbols(length: Int) : String{
        val charPool : List<Char> = ('!'..'/').toList()
        return (1..length)
            .map { Random.nextInt(0, charPool.size) }
            .map ( charPool::get )
            .joinToString("")
    }
    fun generateRandomPasswordNumbers(length: Int) : String{
        val charPool : List<Char> = ('0'..'9').toList()
        return (1..length)
            .map { Random.nextInt(0, charPool.size) }
            .map ( charPool::get )
            .joinToString("")
    }

    fun generateRandomPasswordUppercaseLowercaseNumbers(length: Int) : String {
        val charPool : List<Char> = ('a'..'z') + ('A'..'Z')+ ('0'..'9')
        return (1..length)
            .map { Random.nextInt(0, charPool.size) }
            .map ( charPool::get )
            .joinToString("")
    }

    fun generateRandomPasswordUppercaseLowercaseSymbols(length: Int) : String {
        val charPool : List<Char> = ('a'..'z') + ('A'..'Z') + ('!'..'/')
        return (1..length)
            .map { Random.nextInt(0, charPool.size) }
            .map ( charPool::get )
            .joinToString("")
    }

    fun generateRandomPasswordUppercaseLowercase(length: Int) : String {
        val charPool : List<Char> = ('a'..'z') + ('A'..'Z')
        return (1..length)
            .map { Random.nextInt(0, charPool.size) }
            .map ( charPool::get )
            .joinToString("")
    }

    fun generateRandomPasswordUppercaseNumbers(length: Int) : String{
        val charPool : List<Char> = ('A'..'Z') + ('0'..'9')
        return (1..length)
            .map { Random.nextInt(0, charPool.size) }
            .map ( charPool::get )
            .joinToString("")
    }

    fun generateRandomPasswordUppercaseSymbols(length: Int) : String{
        val charPool : List<Char> = ('A'..'Z') + ('!'..'/')
        return (1..length)
            .map { Random.nextInt(0, charPool.size) }
            .map ( charPool::get )
            .joinToString("")
    }

    fun generateRandomPasswordUppercaseNumberSymbols(length: Int) : String{
        val charPool : List<Char> = ('A'..'Z') + ('0'..'9') + ('!'..'/')
        return (1..length)
            .map { Random.nextInt(0, charPool.size) }
            .map ( charPool::get )
            .joinToString("")
    }

    fun generateRandomPasswordLowercaseNumbersSymbols(length: Int) : String{
        val charPool : List<Char> = ('a'..'z') + ('0'..'9') + ('!'..'/')
        return (1..length)
            .map { Random.nextInt(0, charPool.size) }
            .map ( charPool::get )
            .joinToString("")
    }

    fun generateRandomPasswordLowercaseNumbers(length: Int) : String{
        val charPool : List<Char> = ('a'..'z') + ('0'..'9')
        return (1..length)
            .map { Random.nextInt(0, charPool.size) }
            .map ( charPool::get )
            .joinToString("")
    }

    fun generateRandomPasswordLowercaseSymbols(length: Int) : String {
        val charPool : List<Char> = ('a'..'z') + ('!'..'/')
        return (1..length)
            .map { Random.nextInt(0, charPool.size) }
            .map ( charPool::get )
            .joinToString("")
    }

    fun generateRandomPasswordNumbersSymbols(length: Int) : String {
        val charPool : List<Char> = ('0'..'9') + ('!'..'/')
        return (1..length)
            .map { Random.nextInt(0, charPool.size) }
            .map ( charPool::get )
            .joinToString("")
    }

}
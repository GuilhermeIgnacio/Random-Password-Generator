package com.example.passwordgenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.passwordgenerator.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    fun generateRandomPassword(length: Int) : String {
        val charPool : List<Char> = ('a'..'z') + ('A'..'Z') + ('!'..'/')
        return (1..length)
            .map { Random.nextInt(0, charPool.size) }
            .map ( charPool::get )
            .joinToString("")

    }

    fun generatePassword() {
        val password = generateRandomPassword(12)
        viewBinding.password.text = password
    }

    private lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = viewBinding.root
        setContentView(view)

        viewBinding.generatePasswordBtn.setOnClickListener{
            generatePassword()
        }

    }
}
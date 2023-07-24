package com.example.passwordgenerator

import android.os.Bundle
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import com.example.passwordgenerator.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

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

    val grp = GenerateRandomPassword()


     fun generatePassword() {
        //val password = grp.generateRandomPassword(viewBinding.seekBar.progress)
         val allBoxesChecked =
             viewBinding.lowLetters.isChecked
                     && viewBinding.upLetters.isChecked
                     && viewBinding.numbers.isChecked
                     && viewBinding.symbols.isChecked

         val uppercaseLowercaseNumberBoxesChecked = viewBinding.upLetters.isChecked && viewBinding.lowLetters.isChecked && viewBinding.numbers.isChecked
         val uppercaseLowecaseBoxesChecked = viewBinding.upLetters.isChecked && viewBinding.lowLetters.isChecked
         val uppercaseNumberBoxesChecked = viewBinding.upLetters.isChecked && viewBinding.numbers.isChecked
         val uppercaseSymbolsBoxesChecked = viewBinding.upLetters.isChecked && viewBinding.symbols.isChecked
         val uppercaseLowercaseSymbolsBoxesChecked = viewBinding.upLetters.isChecked && viewBinding.lowLetters.isChecked && viewBinding.symbols.isChecked
         val lowercaseNumbersSymbolsCheckedBoxes = viewBinding.lowLetters.isChecked && viewBinding.numbers.isChecked && viewBinding.symbols.isChecked
         val lowercaseNumbersCheckedBoxes = viewBinding.lowLetters.isChecked && viewBinding.numbers.isChecked
         val lowercaseSymbolsBoxesChecked = viewBinding.lowLetters.isChecked && viewBinding.symbols.isChecked
         val uppercaseNumbersSymbolsBoxesChecked = viewBinding.upLetters.isChecked && viewBinding.numbers.isChecked && viewBinding.symbols.isChecked
         val numbersSymbolsBoxesCheckeds = viewBinding.numbers.isChecked && viewBinding.symbols.isChecked

         //Single Boxes values:

         val uppercaseBoxChecked = viewBinding.upLetters.isChecked
         val lowercaseBoxChecked = viewBinding.lowLetters.isChecked
         val numberBoxChecked = viewBinding.numbers.isChecked
         val symbolBoxChecked = viewBinding.symbols.isChecked

         val password = when {
             allBoxesChecked -> grp.generateRandomPassword(viewBinding.seekBar.progress)
             uppercaseLowercaseSymbolsBoxesChecked -> grp.generateRandomPasswordUppercaseLowercaseSymbols(viewBinding.seekBar.progress)
             uppercaseNumbersSymbolsBoxesChecked -> grp.generateRandomPasswordUppercaseNumberSymbols(viewBinding.seekBar.progress)
             uppercaseLowercaseNumberBoxesChecked -> grp.generateRandomPasswordUppercaseLowercaseNumbers(viewBinding.seekBar.progress)
             uppercaseLowecaseBoxesChecked -> grp.generateRandomPasswordUppercaseLowercase(viewBinding.seekBar.progress)
             uppercaseNumberBoxesChecked -> grp.generateRandomPasswordUppercaseNumbers(viewBinding.seekBar.progress)
             uppercaseSymbolsBoxesChecked -> grp.generateRandomPasswordUppercaseSymbols(viewBinding.seekBar.progress)
             lowercaseNumbersSymbolsCheckedBoxes -> grp.generateRandomPasswordLowercaseNumbersSymbols(viewBinding.seekBar.progress)
             lowercaseNumbersCheckedBoxes -> grp.generateRandomPasswordLowercaseNumbers(viewBinding.seekBar.progress)
             lowercaseSymbolsBoxesChecked -> grp.generateRandomPasswordLowercaseSymbols(viewBinding.seekBar.progress)
             numbersSymbolsBoxesCheckeds -> grp.generateRandomPasswordNumbersSymbols(viewBinding.seekBar.progress)

             //Single Boxes

             uppercaseBoxChecked -> grp.generateRandomPasswordUppercase(viewBinding.seekBar.progress)
             lowercaseBoxChecked -> grp.generateRandomPasswordLowerCase(viewBinding.seekBar.progress)
             numberBoxChecked -> grp.generateRandomPasswordNumbers(viewBinding.seekBar.progress)
             symbolBoxChecked -> grp.generateRandomPasswordSymbols(viewBinding.seekBar.progress)

             else -> return
         }
        viewBinding.password.text = password
    }



    private lateinit var viewBinding: ActivityMainBinding
    private lateinit var seekBar: SeekBar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = viewBinding.root
        setContentView(view)

        seekBar = viewBinding.seekBar

        viewBinding.generatePasswordBtn.setOnClickListener{
            generatePassword()
        }



        seekBar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, user: Boolean) {
                viewBinding.passwordLength.text = "$progress"
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                return
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                return
            }

        })

    }
}




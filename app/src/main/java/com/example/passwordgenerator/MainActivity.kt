package com.example.passwordgenerator

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.os.Bundle
import android.widget.SeekBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.passwordgenerator.databinding.ActivityMainBinding
import kotlinx.coroutines.delay
import java.time.Duration
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private val grp = GenerateRandomPassword()

    private fun generatePassword() {
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

    private fun copyToClipboard() {

            val textToCopy = viewBinding.password.text

            val clipboardManager = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            val clipdata = ClipData.newPlainText("text", textToCopy)
            clipboardManager.setPrimaryClip(clipdata)

            Toast.makeText(this, R.string.toast_text_copied_to_clipboard, Toast.LENGTH_LONG).show()

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

            val uppercaseBox = viewBinding.upLetters.isChecked
            val lowercaseBox = viewBinding.lowLetters.isChecked
            val numbersBox = viewBinding.numbers.isChecked
            val symbolsBox = viewBinding.symbols.isChecked

            if (uppercaseBox || lowercaseBox || numbersBox || symbolsBox) {
                generatePassword()
                //Toast.makeText(this, viewBinding.password.text, Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, R.string.toast_text, Toast.LENGTH_SHORT).show()
            }

        }

        seekBar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, user: Boolean) {
                viewBinding.passwordLengthSize.text = "$progress"
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                return
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                return
            }

        })

        viewBinding.floatingActionButton.setOnClickListener{

            val text = "Generated Password Here"
            val passwordText = (viewBinding.password.text).toString()


            if ( passwordText == text) {
                Toast.makeText(this, R.string.toast_text_failed_to_copy_to_clipboard, Toast.LENGTH_LONG).show()
            } else {
                copyToClipboard()
            }
        }

    }
}




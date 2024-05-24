package jorgeandaurrios.myapplication.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import jorgeandaurrios.myapplication.R
import jorgeandaurrios.myapplication.databinding.ActivityOchoSendMoneyBinding

class Ocho_SendMoneyActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOchoSendMoneyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityOchoSendMoneyBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}
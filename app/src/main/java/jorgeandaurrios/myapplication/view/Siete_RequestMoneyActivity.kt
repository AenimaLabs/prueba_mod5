package jorgeandaurrios.myapplication.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import jorgeandaurrios.myapplication.R
import jorgeandaurrios.myapplication.databinding.ActivitySieteRequestMoneyBinding

class Siete_RequestMoneyActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySieteRequestMoneyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySieteRequestMoneyBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}
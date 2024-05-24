package jorgeandaurrios.myapplication.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import jorgeandaurrios.myapplication.R
import jorgeandaurrios.myapplication.databinding.ActivityNueveProfilePageBinding

class Nueve_ProfilePageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNueveProfilePageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityNueveProfilePageBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}
package jorgeandaurrios.myapplication.view

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import jorgeandaurrios.myapplication.R
import jorgeandaurrios.myapplication.databinding.ActivitySeisHpemptyCaseBinding
import jorgeandaurrios.myapplication.model.UserData

class Seis_HPEmptyCaseActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeisHpemptyCaseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeisHpemptyCaseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val registerResponse = UserData.registerResponse

        if (registerResponse != null) {

            val nombre = registerResponse.first_name
            binding.saludopg6.text = "Hola, $nombre"

            }


        }
    }

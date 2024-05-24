package jorgeandaurrios.myapplication.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import jorgeandaurrios.myapplication.R
import jorgeandaurrios.myapplication.databinding.ActivityDosLoginSingunpPageBinding

class Dos_LoginSingunpPageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDosLoginSingunpPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflar el diseño de la actividad y establecerlo como contenido de la vista
        binding = ActivityDosLoginSingunpPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurar el OnClickListener para el botón de registro
        binding.btnPg2.setOnClickListener {

            // Abrir la pantalla de registro (Cuatro_SignupPageActivity)
            val abrirPantallaCuatro = Intent(this, Cuatro_SignupPageActivity::class.java)
            startActivity(abrirPantallaCuatro)
        }
        // Configurar el OnClickListener para el texto de "Ya tienes una cuenta? Iniciar sesión"
        binding.txt2Pg2.setOnClickListener {

            // Abrir la pantalla de inicio de sesión (Tres_LoginPageActivity)
            val abrirPantallaTres = Intent(this, Tres_LoginPageActivity::class.java)
            startActivity(abrirPantallaTres)
            finish() // Finalizar esta actividad después de abrir la pantalla de inicio de sesión
        }

        //Rescatando los valores de la pantalla anterior
//        val nombre = intent.getStringExtra("nombre")
//        val apellido = intent.getStringExtra("apellido")
//        val tyc = intent.getBooleanExtra("acepto_tyC", false)
        //Vamos a mostrar el dato en toast
//        Toast.makeText(this,
//            "Hola $nombre $apellido -- Acepto los tyc $tyc",
//            Toast.LENGTH_SHORT)
//            .show()


    }
}
package jorgeandaurrios.myapplication.view

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import jorge.andaur.rios.evaluacion5.model.RegisterRequest
import jorgeandaurrios.myapplication.databinding.ActivityCuatroSignupPageBinding
import jorgeandaurrios.myapplication.model.UserData
import jorgeandaurrios.myapplication.viewmodel.RegisterViewModel

class Cuatro_SignupPageActivity : AppCompatActivity() {

    lateinit var binding: ActivityCuatroSignupPageBinding
    private lateinit var viewModel: RegisterViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflar el diseño de la actividad y establecerlo como contenido de la vista
        binding = ActivityCuatroSignupPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Inicializar el ViewModel
        viewModel = ViewModelProvider(this).get(RegisterViewModel::class.java)



        binding.txtPg4.setOnClickListener {
            val abrirpantallaDos = Intent(this, Tres_LoginPageActivity::class.java)
            startActivity(abrirpantallaDos)
            finish()
        }

        // Configurar el OnClickListener para el botón de registro
        binding.btnPg4.setOnClickListener {
            val firstName = binding.labelnombrepg4.text.toString()
            val lastName = binding.labelApellido.text.toString()
            val email = binding.labelEmail.text.toString()
            val password = binding.labelPass.text.toString()
            val reEnteredPassword = binding.labelReingresapass.text.toString()

            // Verificar si las contraseñas coinciden
            if (password == reEnteredPassword) {
                val registerRequest = RegisterRequest(firstName, lastName, email, password)
                viewModel.register(registerRequest)
            } else {
                Toast.makeText(this, "El campo de las contraseñas no coinciden", Toast.LENGTH_SHORT).show()
            }

        }

        // Observar la respuesta del registro desde el ViewModel
        viewModel.registerResponse.observe(this, Observer { response ->
            if (response.status?.toInt() == 200) {
                // Registro exitoso
                Toast.makeText(this, "Registro Exitoso", Toast.LENGTH_SHORT).show()

                // Almacenar la respuesta en el objeto UserData
                UserData.registerResponse = response

                // Navegar a la pantalla de inicio de sesión
                val abrirpantallaTres = Intent(this, Tres_LoginPageActivity::class.java)
                startActivity(abrirpantallaTres)
                finish()
            } else {
                // Registro fallido
                Toast.makeText(this, "Registro Fallido", Toast.LENGTH_SHORT).show()
                // Puedes mostrar el mensaje de error si lo deseas: response.error
            }
        })


    }
}
package jorgeandaurrios.myapplication.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import jorgeandaurrios.myapplication.R
import jorgeandaurrios.myapplication.databinding.ActivityTresLoginPageBinding
import jorgeandaurrios.myapplication.model.UserData
import jorgeandaurrios.myapplication.viewmodel.LoginViewModel

class Tres_LoginPageActivity : AppCompatActivity() {

    // Variable de enlace para acceder a los elementos de la interfaz de usuario
    private lateinit var binding: ActivityTresLoginPageBinding

    // ViewModel para manejar la lógica de inicio de sesión
    private lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflar el diseño de la actividad y establecerlo como contenido de la vista
        binding = ActivityTresLoginPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Inicializar el ViewModel
        loginViewModel = ViewModelProvider(this).get(LoginViewModel::class.java)

        binding.txtCreaNuevaCuentaPg3.setOnClickListener {
            val intent = Intent(this, Cuatro_SignupPageActivity::class.java)
            startActivity(intent)
        }

        // Configurar el OnClickListener para el botón de inicio de sesión
        binding.btnPg3.setOnClickListener {

            // Obtener el correo electrónico y la contraseña ingresados por el usuario
            val email = binding.emailPg3Txt.text.toString()
            val password = binding.passPg3.text.toString()

            // Iniciar sesión llamando al método login del ViewModel
            loginViewModel.login(email, password)
        }

        // Observar el resultado del inicio de sesión desde el ViewModel
        loginViewModel.loginResultLiveData.observe(this, Observer { loginResult ->
            if (loginResult) {

                // Si el inicio de sesión es exitoso, abrir la pantalla de acuerdo al correo ingresado
                val email = binding.emailPg3Txt.text.toString()
                val intent = if (email == "admin@test.cl") {
                    Intent(this, Cinco_HomePageActivity::class.java)
                } else {
                    Intent(this, Seis_HPEmptyCaseActivity::class.java)
                }

                startActivity(intent)
                finish() // Finalizar esta actividad después de abrir la pantalla de inicio

            } else {
                // Si el inicio de sesión falla, mostrar un mensaje de error
                Toast.makeText(this, "Inicio de sesión fallido", Toast.LENGTH_SHORT).show()
            }
        })
    }
}
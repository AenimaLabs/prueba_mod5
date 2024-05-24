package jorgeandaurrios.myapplication.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import jorgeandaurrios.myapplication.R
import jorgeandaurrios.myapplication.databinding.ActivityCincoHomePageBinding
import jorgeandaurrios.myapplication.model.ImageItem
import jorgeandaurrios.myapplication.model.ImageRepository
import jorgeandaurrios.myapplication.model.UserData
import jorgeandaurrios.myapplication.view.adapter.ImageAdapter

class Cinco_HomePageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCincoHomePageBinding
    private lateinit var imageAdapter: ImageAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflar el diseño de la actividad y establecerlo como contenido de la vista
        binding = ActivityCincoHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtener los datos de registro del usuario desde UserData
        val registerResponse = UserData.registerResponse

        // Verificar si hay datos de registro del usuario
        if (registerResponse != null) {

            // Obtener el nombre del usuario desde la respuesta del registro
            val nombre = registerResponse.first_name

            // Mostrar un saludo utilizando el nombre del usuario
            binding.saludopg5.text = "Hola, $nombre"

        }else{

            // Si no hay datos de registro, mostrar un saludo genérico
            binding.saludopg5.text = "Hola, Usuario de prueba"
        }

        // Inicializar el RecyclerView con una lista de imágenes
        val imageList = listOf(
            ImageItem(R.drawable.grp2),
            ImageItem(R.drawable.grp1),
            ImageItem(R.drawable.grp3),
            ImageItem(R.drawable.grp4),
            ImageItem(R.drawable.grp5),
            ImageItem(R.drawable.grp2),
            ImageItem(R.drawable.grp1),
            ImageItem(R.drawable.grp3),
            ImageItem(R.drawable.grp4),
            ImageItem(R.drawable.grp5)

        )

        // Obtener la lista de imágenes desde el repositorio
        val imageList2 = ImageRepository.getImageList()

       // imageAdapter = ImageAdapter(imageList)
        imageAdapter = ImageAdapter(imageList2)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = imageAdapter
    }
}
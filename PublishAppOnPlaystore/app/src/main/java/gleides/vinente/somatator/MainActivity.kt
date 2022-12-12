package gleides.vinente.somatator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCalcular.setOnClickListener {
            val peso = edtPeso.text.toString().toDouble()
            val altura = edtAltura.text.toString().toDouble()
            var resultado = peso / (altura * altura)

            tvResultado.text = "Seu IMC é $resultado"
        }
    }
}
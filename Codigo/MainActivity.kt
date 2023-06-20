package co.ovidiooswaldo.projeto.porah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val button: Button = findViewById(R.id.botao_com_id)
    button.setOnClickListener {
      Toast.makeText(this, "Projeto da ORganização da Alimentação Humana", Toast.LENGTH_SHORT).show()
      openNextActivity()
    }
  }
  private fun openNextActivity() {
    val intent = Intent(this, SecondActivity::class.java)
    startActivity(intent)
  }
}

package co.ovidiooswaldo.projeto.porah

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val button1 = findViewById<Button>(R.id.instagram)
        button1.setOnClickListener {
            val url = "https://www.instagram.com/blueguyinspace/" // Substitua com o URL desejado
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        val textToCopy = "----- .---- ----- ----- .---- ----- ----- ----- / ----- .---- .---- ----- ----- .---- ----- .---- / ----- .---- .---- ----- .---- .---- ----- ----- / ----- .---- .---- ----- .---- .---- .---- .---- / ----- .---- .---- ----- .---- ----- ----- .---- / ----- .---- .---- .---- ----- ----- .---- .---- / ----- .---- .---- ----- ----- ----- ----- .---- / ----- ----- .---- ----- .---- .---- ----- ----- / ----- ----- .---- ----- ----- ----- ----- ----- / ----- .---- .---- .---- ----- .---- .---- ----- / ----- .---- .---- ----- .---- .---- .---- .---- / ----- .---- .---- ----- ----- ----- .---- .---- / ----- .---- .---- ----- ----- .---- ----- .---- / ----- ----- .---- ----- ----- ----- ----- ----- / ----- .---- .---- ----- ----- ----- ----- .---- / ----- .---- .---- ----- ----- ----- .---- .---- / ----- .---- .---- ----- ----- .---- ----- .---- / ----- .---- .---- ----- .---- ----- ----- .---- / ----- .---- .---- .---- ----- .---- ----- ----- / ----- .---- .---- ----- ----- ----- ----- .---- / ----- ----- .---- ----- ----- ----- ----- ----- / ----- .---- .---- ----- .---- .---- .---- ----- / ----- .---- .---- ----- ----- ----- ----- .---- / ----- .---- .---- ----- .---- .---- ----- .---- / ----- .---- .---- ----- .---- .---- .---- .---- / ----- .---- .---- .---- ----- ----- .---- ----- / ----- .---- .---- ----- ----- ----- ----- .---- / ----- .---- .---- .---- ----- ----- .---- ----- / ----- ----- .---- ----- ----- ----- ----- ----- / ----- .---- .---- ----- ----- ----- .---- .---- / ----- .---- .---- ----- .---- .---- .---- .---- / ----- .---- .---- ----- .---- .---- ----- .---- / ----- .---- .---- ----- .---- ----- ----- .---- / ----- .---- .---- ----- ----- .---- .---- .---- / ----- .---- .---- ----- .---- .---- .---- .---- / ----- ----- .---- .---- .---- .---- .---- .---- /"

        val button = findViewById<Button>(R.id.btnCopy)
        button.setOnClickListener {
            val clipboard = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            val clip = ClipData.newPlainText("Texto Copiado", textToCopy)
            clipboard.setPrimaryClip(clip)
            Toast.makeText(this, "Easter Egg copiado!", Toast.LENGTH_SHORT).show()
        }

    }
}

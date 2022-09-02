package dk.easj.anbo.snackbarexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import dk.easj.anbo.snackbarexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)

        binding.showToastButton.setOnClickListener {
            // https://developer.android.com/guide/topics/ui/notifiers/toasts
            Toast.makeText(this, "This is a Toast", Toast.LENGTH_LONG).show()
        }

        binding.showSnackbar.setOnClickListener {
            binding.messageTextView.text = ""  
            // https://www.tutorialkart.com/kotlin-android/android-snackbar-example/
            val snack = Snackbar.make(it, "This is a simple Snackbar", Snackbar.LENGTH_LONG)
            snack.setAction("Undo") { binding.messageTextView.text = "Undone ..." }
            snack.show()
        }
    }
}
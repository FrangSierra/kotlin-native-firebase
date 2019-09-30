package sample

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.*
import android.os.Looper

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val email = UUID.randomUUID().toString() + "@gmail.com"
        GlobalScope.launch(Dispatchers.IO) {
            FirebaseAuth().signInWithEmailAndPassword(email, "123456") { user ->
                Handler(Looper.getMainLooper()).post(Runnable { hello.text = user?.id.toString()})
            }
        }
    }
}
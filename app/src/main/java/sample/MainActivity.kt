package sample

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import android.os.Looper

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val email = "frangsierra@gmail.com"
        print("Current email = $email")
        GlobalScope.launch(Dispatchers.IO) {
            FirebaseAuth().createUserWithEmailAndPassword(email, "123456", onComplete = { user ->
                Handler(Looper.getMainLooper()).post { hello.text = user?.id.toString() }
                print("Current user ID = ${user?.id}")
            }, onError = {
                Handler(Looper.getMainLooper()).post { hello.text = it?.toString() }
                print("Current error = $it")
            })
        }
    }
}
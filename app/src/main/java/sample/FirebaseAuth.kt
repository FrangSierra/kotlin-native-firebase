package sample

import com.google.firebase.auth.FirebaseAuth

actual class FirebaseAuth {
    actual fun signInWithEmailAndPassword(email: String, password: String, onComplete: (FirebaseUser?) -> Unit) {
        FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password).addOnCompleteListener { authResult ->
            if (authResult.isSuccessful) {
                val user = authResult.result!!.user!!
                onComplete(FirebaseUser(user.uid, user.displayName))
            }
        }
    }
}
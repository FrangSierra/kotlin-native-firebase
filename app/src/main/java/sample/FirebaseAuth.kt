package sample

import com.google.firebase.auth.FirebaseAuth

actual class FirebaseAuth {
    actual fun createUserWithEmailAndPassword(email: String, password: String, onComplete: (FirebaseUser?) -> Unit, onError : (Exception?) -> Unit) {
        FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password).addOnCompleteListener { authResult ->
            if (authResult.isSuccessful) {
                val user = authResult.result!!.user!!
                onComplete(FirebaseUser(user.uid, user.displayName))
            } else {
                onError(authResult.exception)
            }
        }
    }
}
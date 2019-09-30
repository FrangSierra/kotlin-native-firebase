package sample

expect class FirebaseAuth() {
    fun signInWithEmailAndPassword(email : String, password : String, onComplete : (FirebaseUser?) -> Unit)
}

data class FirebaseUser(val id : String, val name : String?)
package sample

expect class FirebaseAuth() {
    fun createUserWithEmailAndPassword(email : String, password : String, onComplete : (FirebaseUser?) -> Unit, onError : (Exception?) -> Unit)
}

data class FirebaseUser(val id : String, val name : String?)
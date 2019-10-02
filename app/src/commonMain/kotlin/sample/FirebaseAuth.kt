package sample

expect class Auth() {
    fun createUserWithEmailAndPassword(email : String, password : String, onComplete : (FirebaseUser?) -> Unit, onError : (Exception?) -> Unit)
}

data class FirebaseUser(val id : String, val name : String?)
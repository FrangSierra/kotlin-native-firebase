package sample

import cocoapods.FirebaseAuth.FIRAuth
import cocoapods.FirebaseAuth.FIRAuthDataResult
import cocoapods.FirebaseAuth.FIRAuthDataResultCallback
import platform.Foundation.NSError

actual class FirebaseAuth {
    actual fun signInWithEmailAndPassword(email: String, password: String, onComplete: (FirebaseUser?) -> Unit) {
        FIRAuth.auth()
            .signInWithEmail(email = email, password = password, completion = object : FIRAuthDataResultCallback {
                override fun invoke(p1: FIRAuthDataResult?, p2: NSError?) {
                    if (p1 != null && p2 == null) {
                        onComplete(FirebaseUser(id = p1.user.uid, name = p1.user.displayName))
                    }
                }
            })
    }
}
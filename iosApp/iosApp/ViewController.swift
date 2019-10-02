import UIKit
import app
import FirebaseAuth
import FirebaseCore
import FirebaseAnalytics
import FirebaseInstanceID
import FirebaseCoreDiagnostics

class ViewController: UIViewController {
    override func viewDidLoad() {
        super.viewDidLoad()
        Auth().createUserWithEmailAndPassword(email: "minuscorp@gmail.com",
                                              password: "password",
                                              onComplete: { (user: FirebaseUser?) -> KotlinUnit in
                                                guard let user = user else { return KotlinUnit() }
                                                print(user.id)
                                                return KotlinUnit()
        },
                                              onError: { (error: KotlinException?) -> KotlinUnit in
                                                guard let error = error else { return KotlinUnit() }
                                                print(error.description)
                                                return KotlinUnit()
        })
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
    }
    @IBOutlet weak var label: UILabel!
}

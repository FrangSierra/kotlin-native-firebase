import UIKit
import app

class ViewController: UIViewController {
    override func viewDidLoad() {
        super.viewDidLoad()
        Auth().createUserWithEmailAndPassword(email: "minuscorp@gmail.com",
                                              password: "password",
                                              onComplete: { (user: FirebaseUser?) -> Void in
                                                guard let user = user else { return }
                                                print(user.id)
        },
                                              onError: { (error: KotlinException?) -> Void in
                                                guard let error = error else { return }
                                                print(error.description)
        })
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
    }
    @IBOutlet weak var label: UILabel!
}

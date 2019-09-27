import UIKit
import app
import AFNetworking

class ViewController: UIViewController {
    override func viewDidLoad() {
        super.viewDidLoad()
        label.text = "asdasd \(Sample().checkMe())"
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
    }
    @IBOutlet weak var label: UILabel!
}

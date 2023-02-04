import UIKit
import shared

@main
class AppDelegate: UIResponder, UIApplicationDelegate {
    
    func application(_: UIApplication,
                     didFinishLaunchingWithOptions _: [UIApplication.LaunchOptionsKey: Any]?) -> Bool
    {

        RunExample.shared.thisCrashesOniOS()
//        RunExample.shared.thisDoesNotCrash()
        return true
    }

    func applicationWillTerminate(_: UIApplication) {
        RunExample.shared.stopServer()
    }
}

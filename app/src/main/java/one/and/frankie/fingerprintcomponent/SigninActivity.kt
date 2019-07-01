package one.and.frankie.fingerprintcomponent

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class SigninActivity: AppCompatActivity() {
    private lateinit var fingerprintFragment: FingerprintFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Remove shadow below action bar.
        supportActionBar?.elevation = 0F
        setContentView(R.layout.activity_signin)
        initFingerprintFragment()
    }

    private fun initFingerprintFragment() {
        fingerprintFragment = FingerprintFragment()
        supportFragmentManager.beginTransaction().add(R.id.fl_container, fingerprintFragment).commit()
    }
}
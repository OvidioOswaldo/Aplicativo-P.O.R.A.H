package co.tiagoaguiar.tutorial.myfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import co.ovidiooswaldo.proejoto.porah.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

  private lateinit var binding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    val button: Button = findViewById(R.id.botao_com_id)
    button.setOnClickListener {
      openNextActivity()
    }

    setupViews()
  }

  private fun openNextActivity() {
    val intent = Intent(this, SecondActivity::class.java)
    startActivity(intent)
  }

  private fun setupViews() {
    val tabLayout = binding.addTab
    val viewPager = binding.addViewpager
    val adapter = TabViewPagerAdapter(this)
    viewPager.adapter = adapter

    TabLayoutMediator(tabLayout, viewPager) { tab, position ->
      tab.text = getString(adapter.tabs[position])
    }.attach()
  }
}

class TabViewPagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {

  val tabs = arrayOf(R.string.Pacientes, R.string.Prato, R.string.Refeicoes)
  val fragments = arrayOf(MarketplaceFragment(), MarketplaceFragment(), MarketplaceFragment())

  override fun getItemCount(): Int = fragments.size

  override fun createFragment(position: Int): Fragment {
    return fragments[position]
  }
}

class MarketplaceFragment : Fragment() {}

package com.example.jajanankekiniansurabaya

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.jajanankekiniansurabaya.R.layout.activity_jajan_detail
import kotlinx.android.synthetic.main.activity_jajan_detail.*

class JajanDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_jajan_detail)

        var intentThatStartedThisActivity = getIntent()

        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            var partFoto = intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_TEXT, 0)
            var partNama = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)
            var partDetail = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            tv_item_foto.setImageResource(partFoto)
            tv_item_name.text = partNama
            tv_item_detail.text = partDetail
        }
    }
}
package com.github.mydianne

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.net.Uri

class QuestionActivity extends Activity {
  override def onCreate(savedInstanceState: Bundle) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.question)
  }

  def answeredYes(view: View) {
    val intent = new Intent(Intent.ACTION_VIEW)
    intent.setClass(this, classOf[AnsweredYesActivity])
    startActivity(intent)
  }

  def answeredNo(view: View) {
    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/watch?v=qS7nqwGt4-I")))
  }
}

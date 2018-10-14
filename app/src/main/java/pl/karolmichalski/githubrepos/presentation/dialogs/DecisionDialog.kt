package pl.karolmichalski.githubrepos.presentation.dialogs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.DialogFragment
import pl.karolmichalski.githubrepos.R
import pl.karolmichalski.githubrepos.databinding.DialogDecisionBinding

class DecisionDialog : DialogFragment() {

	var title: String? = null
	var button1text = ""
	var button2text = ""

	var onButton1Click: () -> Unit = {}
	var onButton2Click: () -> Unit = {}

	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
		val binding = DataBindingUtil.inflate<DialogDecisionBinding>(inflater, R.layout.dialog_decision, container, false).apply {
			setLifecycleOwner(this@DecisionDialog)
			title = this@DecisionDialog.title
			button1text = this@DecisionDialog.button1text
			button2text = this@DecisionDialog.button2text
			onButton1Click = this@DecisionDialog.onButton1Click
			onButton2Click = this@DecisionDialog.onButton2Click
		}
		return binding.root
	}
}
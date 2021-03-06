package pl.karolmichalski.githubrepos.presentation.screens.repos.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import pl.karolmichalski.githubrepos.data.models.Repo
import pl.karolmichalski.githubrepos.databinding.ItemRepoBinding

class RepoViewHolder(private val binding: ItemRepoBinding,
					 private val onItemClick: (Repo) -> Unit)
	: RecyclerView.ViewHolder(binding.root), View.OnClickListener {

	init {
		binding.listener = this
	}

	override fun onClick(v: View?) {
		binding.repo?.apply {
			onItemClick(this)
		}
	}

	fun bind(repo: Repo) {
		binding.repo = repo
	}
}
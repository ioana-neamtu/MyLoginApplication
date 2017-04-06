package com.example.ioana.myloginapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.ioana.myloginapplication.model.Repository;

import java.util.List;

public class RepositoriesActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repositories);

        mRecyclerView = (RecyclerView) findViewById(R.id.list);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        Adapter adapter = new Adapter();
        adapter.setData(Repository.getsMockRepository());
        mRecyclerView.setAdapter(adapter);


    }

    static class Adapter extends RecyclerView.Adapter {

        List<Repository> repositoryList;

        public void setRepositoryList(List<Repository> repositoryList) {
            this.repositoryList = repositoryList;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.view_repository, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            ((ViewHolder) holder).bind(repositoryList.get(position));
        }

        @Override
        public int getItemCount() {
            if(repositoryList != null)
                return repositoryList.size();
            return 0;
        }

        public void setData(List<Repository> repos) {
            repositoryList = repos;
        }

        static class ViewHolder extends RecyclerView.ViewHolder {

            private final TextView mNameAndOwner;
            private final TextView mDescription;
            private final CheckBox mIsPublic;

            public ViewHolder(View itemView) {
                super(itemView);

               // mCountWatcher = (TextView) itemView.findViewById(R.id.Count)
                mNameAndOwner = (TextView) itemView.findViewById(R.id.name);
                mDescription = (TextView) itemView.findViewById(R.id.description);
                mIsPublic = (CheckBox) itemView.findViewById(R.id.is_public);
            }

            public void bind(Repository repository) {
                mNameAndOwner.setText(itemView.getContext()
                        .getString(R.string.repo_name_owner, repository.getmName(), repository.getmOwner()));
                mDescription.setText(repository.getmDescription());
                mIsPublic.setChecked(!repository.getmIsPrivate());
            }
        }


    }
}

package dev.olog.basil.presentation.detail;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import javax.inject.Inject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import dev.olog.basil.R;
import dev.olog.basil.presentation.base.BaseFragment;
import dev.olog.basil.presentation.main.MainFragmentViewModel;

public class DetailFragment extends BaseFragment {

    public static final String TAG = DetailFragment.class.getSimpleName();
    private static final String ARGUMENT_ID = TAG + ".argument.id";

    public static DetailFragment newInstance(long id){
        Bundle bundle = new Bundle();
        bundle.putLong(ARGUMENT_ID, id);
        DetailFragment fragment = new DetailFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Inject ViewModelProvider.Factory viewModelFactory;

    private MainFragmentViewModel viewModel;

    @Override
    protected void onViewBound(@NonNull View view, @Nullable Bundle savedInstanceState) {
        TextView title = view.findViewById(R.id.title);
        TextView description = view.findViewById(R.id.description);

        long recipeId = getArguments().getLong(ARGUMENT_ID);

        viewModel = ViewModelProviders.of(requireActivity(), viewModelFactory).get(MainFragmentViewModel.class);

//        viewModel.observeRecipeById(recipeId)
//                .observe(getViewLifecycleOwner(), recipe -> {
//                    title.setText(recipe.getName());
//                    description.setText(recipe.getDescription());
//                });
    }

    @Override
    protected int provideLayoutId() {
        return R.layout.fragment_detail;
    }
}

package dev.olog.basil.presentation.main.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import dev.olog.basil.presentation.ingredients.IngredientsFragment;
import dev.olog.basil.presentation.main.MainFragment;
import dev.olog.basil.presentation.search.SearchFragment;

@Module
public abstract class FragmentBindings {

    @ContributesAndroidInjector
    abstract MainFragment provideMainFragment();

    @ContributesAndroidInjector
    abstract IngredientsFragment provideIngredientsFragment();

    @ContributesAndroidInjector
    abstract SearchFragment provideSearchFragment();

}

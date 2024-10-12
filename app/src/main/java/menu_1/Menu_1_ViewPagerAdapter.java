package menu_1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import fragment.Menu_1Fragment;
import fragment.Menu_2Fragment;
import fragment.Menu_3Fragment;

public class Menu_1_ViewPagerAdapter extends FragmentStatePagerAdapter {
    public Menu_1_ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new TabFragment();
            case 1:
                return new Tab1Fragment();
            case 2:
                return new Tab2Fragment();
            default:
                return new TabFragment();

        }

    }

    @Override
    public int getCount() {

        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "TAB 1";
            case 1:
                return "TAB 2";
            case 2:
                return "TAB 3";
            default:
                return "TAB 1";


        }
    }
}
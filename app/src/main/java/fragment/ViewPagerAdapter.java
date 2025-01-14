package fragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Menu_1Fragment();
            case 1:
                return new Menu_2Fragment();
            case 2:
                return new Menu_3Fragment();
            default:
                return new Menu_1Fragment();

        }

    }

    @Override
    public int getCount() {
        return 3;
    }
}

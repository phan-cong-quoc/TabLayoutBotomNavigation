package fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tablayoutbotomnavigation.R;
import com.google.android.material.tabs.TabLayout;

import menu_1.Menu_1_ViewPagerAdapter;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Menu_1Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Menu_1Fragment extends Fragment {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private View mView;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Menu_1Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Menu_1Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Menu_1Fragment newInstance(String param1, String param2) {
        Menu_1Fragment fragment = new Menu_1Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_menu_1, container, false);
        tabLayout = mView.findViewById(R.id.tab_layout);
         viewPager= mView.findViewById(R.id.menu_1_viewpager);

        Menu_1_ViewPagerAdapter adapter = new Menu_1_ViewPagerAdapter(getChildFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        return mView;
    }
}
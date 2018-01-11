package co.nano.nanowallet.ui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import co.nano.nanowallet.NanoWallet;
import co.nano.nanowallet.R;
import co.nano.nanowallet.databinding.FragmentHomeBinding;

/**
 * The Intro Screen to the app
 */

public class HomeFragment extends Fragment {
    private FragmentHomeBinding binding;
    public static String TAG = HomeFragment.class.getSimpleName();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // inflate the view
        binding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_home, container, false);
        View view = binding.getRoot();

        // bind data to view
        binding.setWallet(new NanoWallet());
        binding.setHandlers(new ClickHandlers());

        return view;
    }


    public class ClickHandlers {
//        public void onClickNewWallet(View view) {
//
//            Log.d(TAG, "New Wallet");
//        }
//
//        public void onClickHaveWallet(View view) {
//            Log.d(TAG, "Have Wallet");
//        }
    }


}

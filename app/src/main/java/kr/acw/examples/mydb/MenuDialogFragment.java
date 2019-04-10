package kr.acw.examples.mydb;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * Created by hmj on 2019-04-09.
 *
 * @since 0.1
 */
public class MenuDialogFragment extends BottomSheetDialogFragment implements NavigationView.OnNavigationItemSelectedListener {

    NavigationView navigationView;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bottomsheet, container, false);
        navigationView = view.findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);
        return view;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.bottom_sheet_item1:
                Toast.makeText(getContext(), "bottom_sheet_item1", Toast.LENGTH_LONG).show();
                return true;
            case R.id.bottom_sheet_item2:
                Toast.makeText(getContext(), "bottom_sheet_item2", Toast.LENGTH_LONG).show();
                return true;
            case R.id.bottom_sheet_item3:
                Toast.makeText(getContext(), "bottom_sheet_item3", Toast.LENGTH_LONG).show();
                return true;
        }
        return true;
    }


}

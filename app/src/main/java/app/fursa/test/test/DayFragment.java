package app.fursa.test.test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DayFragment extends Fragment {
    private static final String DAY_KEY = "day_key";

    public static Fragment newInstance(int pos) {
        Bundle args = new Bundle();
        args.putInt(DAY_KEY, pos);
        DayFragment dayFragment = new DayFragment();
        dayFragment.setArguments(args);
        return dayFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_day, container, false);
        TextView tv = (TextView) view.findViewById(R.id.textView2);

        if(getArguments() != null) {
            int pos = getArguments().getInt(DAY_KEY);
            if(pos == 0) {
                tv.setText("Понедельник");
            }
            else if(pos == 1) {
                tv.setText("Вторник");
            }
             else if(pos == 2) {
                tv.setText("Среда");
            }
        }

        return view;

    }
}

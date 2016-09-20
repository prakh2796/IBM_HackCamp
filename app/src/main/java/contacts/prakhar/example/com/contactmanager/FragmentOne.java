package contacts.prakhar.example.com.contactmanager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by Pewds on 20-Sep-16.
 */
public class FragmentOne extends Fragment {

    private View rootView;
    private ListView listView;

    public FragmentOne() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment1, container, false);

        listView = (ListView) rootView.findViewById(R.id.contactList);

        return rootView;
    }
}

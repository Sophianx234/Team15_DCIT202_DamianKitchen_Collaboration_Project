// This is the RegisterFragment class in the Kitchen package of the food.app package.

package food.app.Kitchen;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class RegisterFragment extends Fragment {
    public RegisterFragment() {
        // Default constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Called when the fragment is being created.
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Called when the fragment's view is being created.

        // Inflating the layout for the fragment.
        View view = inflater.inflate(R.layout.fragment_register, container, false);

        return view; // Returning the inflated view for the fragment.
    }


}
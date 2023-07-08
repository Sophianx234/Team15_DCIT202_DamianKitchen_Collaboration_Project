// This is the LoginFragment class in the Kitchen package of the food.app package.

package food.app.Kitchen;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class LoginFragment extends Fragment {
    public LoginFragment() {
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
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        // Setting an OnClickListener for the login button.
        view.findViewById(R.id.login_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Creating an intent to start the DashboardActivity.
                Intent intent = new Intent(getActivity().getApplicationContext(), DashboardActivity.class);
                startActivity(intent);
            }
        });

        return view; // Returning the inflated view for the fragment.
    }


}
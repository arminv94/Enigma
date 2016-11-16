package com.group16.enigma;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.google.firebase.auth.FirebaseUser;

/**
 * Created by Hayde on 22-Oct-16.
 */

public class ChatListFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_chatlist, container, false);

        // Get ListView object from xml
        ListView listView = (ListView) v.findViewById(R.id.chatList);

        // Defined Array values to show in ListView
        String[] values = new String[] {
                "h@d.com",
                "Bill Gates",
                "Steve Jobs",
                "Elon Musk",
                "Spongebob Squarepants"
        };

        int[] tempDp = new int[]{
                R.drawable.bat,
                R.drawable.bird,
                R.drawable.fish,
                R.drawable.kangaroo,
                R.drawable.shark

        };

        listView.setAdapter(new ChatListAdapter(getContext(), values, tempDp));

        return v;
    }
}

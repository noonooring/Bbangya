package kr.ac.duksung.bbangya1121.ui.gallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import kr.ac.duksung.bbangya1121.R;
import kr.ac.duksung.bbangya1121.databinding.FragmentHomeBinding;

public class GalleryFragment extends AppCompatActivity {

    private FragmentHomeBinding binding;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    String [] professors = {"바게뜨", "소금빵", "크림빵", "식빵","구움과자"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_gallery);

        ListView professorList = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, professors);

        professorList.setAdapter(adapter);

        professorList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), professors[i], Toast.LENGTH_LONG).show();

            }
        });
    }


}
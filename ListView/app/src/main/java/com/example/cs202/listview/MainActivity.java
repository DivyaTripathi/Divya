package com.example.cs202.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AbsListView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AbsListView.OnScrollListener {

    String name[]={"Alex","Vinc", "Phebe","Charloot", "Jimoddpic", "Parekh Deepa", "Zeus Betaversion", "Porter ","Green Velvet", "Pascal Arbez-Nicolas", "Pharell Williams",
            "Noah", "Liam", "Mason", "Jacob", "William", "Ethan", "James", "Alexander"," Michael","Benjamin","Elijah", "Daniel", "Aiden","Logan"," Matthew ", "Lucas", "Jackson",
            "David","Oliver", "Jayden", "Joseph", "Gabriel", "Samuel", "Carter", "Anthony" ,"John", "Dylan", "Luke", "Henry", "Andrew", "Isaac", "Christopher", "Joshua", "Wyatt",
            "Sebastian", "Owen","Caleb", "Nathan", "Ryan", "Jack", "Hunter", "Levi", "Christian", "Jaxon","Julian", "Landon"};

    Integer image[]={R.drawable.cartoon,R.drawable.man,R.drawable.jimoddpic,R.drawable.person,R.drawable.parekhdeepa,R.drawable.phebe,R.drawable.porter,
            R.drawable.charloot,R.drawable.ask_the_experts_min,R.drawable.buisnessman,R.drawable.images,R.drawable.images,R.drawable.dfdg,R.drawable.download,R.drawable.fdgd
            ,R.drawable.fdrggb,R.drawable.ask_the_experts_min,R.drawable.background,R.drawable.drgdg,R.drawable.fdrggb,R.drawable.fgddddddddb,R.drawable.flower,R.drawable.frgdzf
            ,R.drawable.frxdz,R.drawable.ghfchf,R.drawable.home,R.drawable.imagesd,R.drawable.imagesdf,R.drawable.imagesfch,R.drawable.imagesfyh,R.drawable.imagesh,R.drawable.imageshg
            ,R.drawable.imageshgh,R.drawable.imageshjg,R.drawable.imageshjj,R.drawable.imageshjjgh,R.drawable.imageshjk,R.drawable.imageshuk,R.drawable.imageshyf,R.drawable.imagesil
            ,R.drawable.imagesj,R.drawable.imagesjuk,R.drawable.imageskh,R.drawable.imageski,R.drawable.imagesl,R.drawable.imageso,R.drawable.imagesr,R.drawable.imagesty,R.drawable.imagesu
            ,R.drawable.imagesuhkk,R.drawable.imagesui,R.drawable.imagesuiio,R.drawable.imagesuiuh,R.drawable.imagesukih,R.drawable.imagesy,R.drawable.imagesy7,R.drawable.imagesyjygj,
            R.drawable.sfrsets,R.drawable.walle};

    private ListView mListView;
    private Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView=(ListView)findViewById(R.id.listView);
        mAdapter = new Adapter(MainActivity.this,image,name);
        mListView.setAdapter(mAdapter);

    }

    @Override
    public void onScrollStateChanged(AbsListView view, int scrollState) {

    }

    @Override
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {

    }
}

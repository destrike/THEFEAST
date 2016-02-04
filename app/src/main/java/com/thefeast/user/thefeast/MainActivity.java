package com.thefeast.user.thefeast;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.File;
import java.util.ArrayList;

public class MainActivity extends Activity {
    ListView lv;
    Model[] list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        File root = android.os.Environment.getExternalStorageDirectory();

        File dir = new File (root.getAbsolutePath() + "/The Feast/"); //it is my root directory

        try
        {
            if(dir.exists()==false)
            {
                dir.mkdirs();
            }

        }
        catch(Exception e){
            e.printStackTrace();

        }

//        File[] list=dir.listFiles();


        ListView lv;
        ArrayList<String> FilesInFolder = GetFiles("/sdcard/The Feast");
        lv = (ListView)findViewById(R.id.listView1);

        lv.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, FilesInFolder));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                // Clicking on items
                
            }
        });






//        lv = (ListView) findViewById(R.id.listView1);
//        list = new Model[5];
//
//        CustomAdapter adapter = new CustomAdapter(this, modelItems);
//        lv.setAdapter(adapter);
    }

    public ArrayList<String> GetFiles(String DirectoryPath) {
        ArrayList<String> MyFiles = new ArrayList<String>();
        File f = new File(DirectoryPath);

        f.mkdirs();
        File[] files = f.listFiles(new Filterdip());
        if (files.length == 0)
            return null;
        else {
            for (int i=0; i<files.length; i++)
                MyFiles.add(files[i].getName());
        }

        return MyFiles;
    }




}

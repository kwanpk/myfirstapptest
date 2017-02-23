package comsci.kwan.myfirstapp;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by kwan_raksasook on 23/2/2560.
 */

 // actvity นี้ สร้างเพื่อทำ layout เสมือน เพื่อนำไปแสดงผลบนหน้า main activity
public class MyAdapter extends BaseAdapter {
   // ประกาศตัวแปร(Exlicit)

    private Context context;
    private int[] ints;
    private String[] titleStrings, detailStrings;

    //กด alt+insert เลือก constructor เพื่อสืบทอดเสมือน
    public MyAdapter(Context context, int[] ints, String[] titleStrings, String[] detailStrings) {
        this.context = context;
        this.ints = ints;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
    }

    @Override
    public int getCount() {  //ใช้นับจำนวนข้อมูลว่ามีกี่ข้อมูลและส่งต่อไปยัง getview
        return ints.length;
    }

    @Override
    public Object getItem(int position) {

        return null;
    }

    @Override
    public long getItemId(int position) {

        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) { //รับจำนวนขอมูลและแสดงผลบนหน้า app

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.my_listview, parent, false);

        //Initial view ผูกชื่อไอดีของ viewกับตัวแปร
        ImageView imageView = (ImageView) view.findViewById(R.id.imvIcon);
        TextView titleTextView = (TextView) view.findViewById(R.id.txtTitleLiv);
        TextView detailTextView = (TextView) view.findViewById(R.id.txtDetailLiv);

        //show view นำข้อมูลไปแสดงผลบนหนา app
        imageView.setImageResource(ints [position]);
        titleTextView.setText(titleStrings[position]);
        detailTextView.setText(detailStrings[position]);

        return view;

    }
} //Main Class

package com.webmyne.tisco;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class HomeActivity extends ActionBarActivity {
    private Toolbar toolbar;
//    private ListView listHomeProducts;
    private int icons[] = {R.drawable.one, R.drawable.two, R.drawable.three,
            R.drawable.four, R.drawable.five, R.drawable.six,
            R.drawable.seven, R.drawable.eight, R.drawable.nine,
            R.drawable.ten};
    private String names[] = {"Buffalo & Beaf", "See Food", "Lamb/Mutton", "Chicken & Duck", "Pork & Turkey", "Vegetables & Fruits",
            "Dairy Product", "Rabbit & Hen", "Eggs/Ovos", "Beverage"};
    private String sDescription[] = {"There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        
//        listHomeProducts = (ListView) findViewById(R.id.listHomeProducts);
        fillAndSet();
        
//        listHomeProducts.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent i = new Intent(HomeActivity.this,DetailActivity.class);
//                startActivity(i);
//
//            }
//        });
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            toolbar.setTitle("TiSCO");
//            toolbar.setLogo(R.drawable.logo);
            setSupportActionBar(toolbar);
        }

    }
    private void fillAndSet() {

        List<TiscoProduct> products = new ArrayList<>();

        for (int i = 0; i < names.length; i++) {

            TiscoProduct product = new TiscoProduct();
            product.shortDetail = sDescription[0];
            product.imgRes = icons[i];
            product.name = names[i];
      
            products.add(product);

        }
        
//        MyAppAdapter adapter = new MyAppAdapter(products,HomeActivity.this);
//        listHomeProducts.setAdapter(adapter);

    }


    public class MyAppAdapter extends BaseAdapter {

        public class ViewHolder {
            public TextView text;
            public ImageView image;
            public TextView description;
        }

        public List<TiscoProduct> apps;
        public Context context;

        private MyAppAdapter(List<TiscoProduct> apps, Context context) {
            this.apps = apps;
            this.context = context;
        }

        @Override
        public int getCount() {
            return apps.size();
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View rowView = convertView;

            if (rowView == null) {
                LayoutInflater inflater = getLayoutInflater();
                rowView = inflater.inflate(R.layout.item_product_home, null);
                // configure view holder
                ViewHolder viewHolder = new ViewHolder();
                viewHolder.text = (TextView) rowView.findViewById(R.id.txtNameHomeProduct);
                viewHolder.image = (ImageView) rowView.findViewById(R.id.imgHomeProduct);
                viewHolder.description = (TextView) rowView.findViewById(R.id.txtDetailHomeProduct);
                viewHolder.image.setScaleType(ImageView.ScaleType.FIT_XY);
                rowView.setTag(viewHolder);
            }

            ViewHolder holder = (ViewHolder) rowView.getTag();
            TiscoProduct product = apps.get(position);
            holder.description.setText(product.shortDetail);
            holder.image.setImageResource(product.imgRes);
            holder.text.setText(product.name);

            return rowView;
        }
    }


}

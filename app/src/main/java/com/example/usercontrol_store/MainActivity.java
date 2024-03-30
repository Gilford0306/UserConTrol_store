package com.example.usercontrol_store;
import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.listViewProducts);
        List<Product> products = new ArrayList<>();
        products.add(new Product(R.drawable.product1, "Ноутбук Acer Aspire Go AG15-31P ", 14699));
        products.add(new Product(R.drawable.product2, "Ноутбук ASUS Vivobook S 14 Flip", 36999));
        products.add(new Product(R.drawable.product3, "Apple MacBook Air 15,3  M3 Starlight", 82199 ));
        ProductAdapter adapter = new ProductAdapter(this, R.layout.item_product, products);
        listView.setAdapter(adapter);
    }
}

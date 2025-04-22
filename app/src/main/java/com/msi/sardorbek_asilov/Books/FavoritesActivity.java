package com.msi.sardorbek_asilov.Books;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.msi.sardorbek_asilov.DashboardUserActivity;
import com.msi.sardorbek_asilov.R;
import com.msi.sardorbek_asilov.databinding.ActivityFavoritesBinding;

import java.util.ArrayList;
import java.util.List;

public class FavoritesActivity extends AppCompatActivity {
    private ActivityFavoritesBinding binding;
    private static final String PREFS_NAME = "FAVORITES";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityFavoritesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        LinearLayout favoritesLayout = binding.favoritesLayout;
        List<String> favorites = getFavorites();

        for (String favorite : favorites) {
            ImageView imageView = new ImageView(this);
            if (favorite.equals("book1_image")) {
                imageView.setImageResource(R.drawable.book1);
                imageView.setOnClickListener(v -> openBookActivity("Book1"));
            }
            if (favorite.equals("book2_image")) {
                imageView.setImageResource(R.drawable.book2);
                imageView.setOnClickListener(v -> openBookActivity("Book2"));
            }
            if (favorite.equals("book3_image")) {
                imageView.setImageResource(R.drawable.book3);
                imageView.setOnClickListener(v -> openBookActivity("Book3"));
            }
            if (favorite.equals("book4_image")) {
                imageView.setImageResource(R.drawable.book4);
                imageView.setOnClickListener(v -> openBookActivity("Book4"));
            }
            if (favorite.equals("book5_image")) {
                imageView.setImageResource(R.drawable.book5);
                imageView.setOnClickListener(v -> openBookActivity("Book5"));
            }
            if (favorite.equals("book6_image")) {
                imageView.setImageResource(R.drawable.book6);
                imageView.setOnClickListener(v -> openBookActivity("Book6"));
            }
            if (favorite.equals("book7_image")) {
                imageView.setImageResource(R.drawable.book7);
                imageView.setOnClickListener(v -> openBookActivity("Book7"));
            }
            if (favorite.equals("book8_image")) {
                imageView.setImageResource(R.drawable.book8);
                imageView.setOnClickListener(v -> openBookActivity("Book8"));
            }
            if (favorite.equals("book9_image")) {
                imageView.setImageResource(R.drawable.book9);
                imageView.setOnClickListener(v -> openBookActivity("Book9"));
            }
            if (favorite.equals("book10_image")) {
                imageView.setImageResource(R.drawable.book10);
                imageView.setOnClickListener(v -> openBookActivity("Book10"));
            }
            if (favorite.equals("book11_image")) {
                imageView.setImageResource(R.drawable.book11);
                imageView.setOnClickListener(v -> openBookActivity("Book11"));
            }
            if (favorite.equals("book12_image")) {
                imageView.setImageResource(R.drawable.book12);
                imageView.setOnClickListener(v -> openBookActivity("Book12"));
            }
            if (favorite.equals("book13_image")) {
                imageView.setImageResource(R.drawable.book13);
                imageView.setOnClickListener(v -> openBookActivity("Book13"));
            }
            if (favorite.equals("book14_image")) {
                imageView.setImageResource(R.drawable.book14);
                imageView.setOnClickListener(v -> openBookActivity("Book14"));
            }
            if (favorite.equals("book15_image")) {
                imageView.setImageResource(R.drawable.book15);
                imageView.setOnClickListener(v -> openBookActivity("Book15"));
            }

            // Устанавливаем параметры макета для ImageView
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                    300, // Ширина
                    450 // Высота
            );
            layoutParams.setMargins(16, 16, 16, 16); // Отступы
            imageView.setLayoutParams(layoutParams);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            favoritesLayout.addView(imageView);
        }
    }

    private List<String> getFavorites() {
        List<String> favorites = new ArrayList<>();
        SharedPreferences sharedPreferences = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        if (sharedPreferences.getBoolean("BOOK1_FAVORITE", false)) {
            favorites.add("book1_image");
        }
        if (sharedPreferences.getBoolean("BOOK2_FAVORITE", false)) {
            favorites.add("book2_image");
        }
        if (sharedPreferences.getBoolean("BOOK3_FAVORITE", false)) {
            favorites.add("book3_image");
        }
        if (sharedPreferences.getBoolean("BOOK4_FAVORITE", false)) {
            favorites.add("book4_image");
        }
        if (sharedPreferences.getBoolean("BOOK5_FAVORITE", false)) {
            favorites.add("book5_image");
        }
        if (sharedPreferences.getBoolean("BOOK6_FAVORITE", false)) {
            favorites.add("book6_image");
        }
        if (sharedPreferences.getBoolean("BOOK7_FAVORITE", false)) {
            favorites.add("book7_image");
        }
        if (sharedPreferences.getBoolean("BOOK8_FAVORITE", false)) {
            favorites.add("book8_image");
        }
        if (sharedPreferences.getBoolean("BOOK9_FAVORITE", false)) {
            favorites.add("book9_image");
        }
        if (sharedPreferences.getBoolean("BOOK10_FAVORITE", false)) {
            favorites.add("book10_image");
        }
        if (sharedPreferences.getBoolean("BOOK11_FAVORITE", false)) {
            favorites.add("book11_image");
        }
        if (sharedPreferences.getBoolean("BOOK12_FAVORITE", false)) {
            favorites.add("book12_image");
        }
        if (sharedPreferences.getBoolean("BOOK13_FAVORITE", false)) {
            favorites.add("book13_image");
        }
        if (sharedPreferences.getBoolean("BOOK14_FAVORITE", false)) {
            favorites.add("book14_image");
        }
        if (sharedPreferences.getBoolean("BOOK15_FAVORITE", false)) {
            favorites.add("book15_image");
        }
        return favorites;
    }

    private void openBookActivity(String bookName) {
        Intent intent;
        switch (bookName) {
            case "Book1":
                intent = new Intent(FavoritesActivity.this, Book1Activity.class);
                break;
            case "Book2":
                intent = new Intent(FavoritesActivity.this, Book2Activity.class);
                break;
            case "Book3":
                intent = new Intent(FavoritesActivity.this, Book3Activity.class);
                break;
            case "Book4":
                intent = new Intent(FavoritesActivity.this, Book4Activity.class);
                break;
            case "Book5":
                intent = new Intent(FavoritesActivity.this, Book5Activity.class);
                break;
            case "Book6":
                intent = new Intent(FavoritesActivity.this, Book6Activity.class);
                break;
            case "Book7":
                intent = new Intent(FavoritesActivity.this, Book7Activity.class);
                break;
            case "Book8":
                intent = new Intent(FavoritesActivity.this, Book8Activity.class);
                break;
            case "Book9":
                intent = new Intent(FavoritesActivity.this, Book9Activity.class);
                break;
            case "Book10":
                intent = new Intent(FavoritesActivity.this, Book10Activity.class);
                break;
            case "Book11":
                intent = new Intent(FavoritesActivity.this, Book11Activity.class);
                break;
            case "Book12":
                intent = new Intent(FavoritesActivity.this, Book12Activity.class);
                break;
            case "Book13":
                intent = new Intent(FavoritesActivity.this, Book13Activity.class);
                break;
            case "Book14":
                intent = new Intent(FavoritesActivity.this, Book14Activity.class);
                break;
            case "Book15":
                intent = new Intent(FavoritesActivity.this, Book15Activity.class);
                break;
            default:
                intent = new Intent(FavoritesActivity.this, DashboardUserActivity.class);
                break;
        }
        startActivity(intent);
    }

    public void onClickBackBtn(View v){
        Intent intent = new Intent(FavoritesActivity.this, DashboardUserActivity.class);
        startActivity(intent);
    }
}

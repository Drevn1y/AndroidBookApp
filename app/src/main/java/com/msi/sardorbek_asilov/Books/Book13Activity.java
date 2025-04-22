package com.msi.sardorbek_asilov.Books;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.msi.sardorbek_asilov.DashboardUserActivity;
import com.msi.sardorbek_asilov.R;
import com.msi.sardorbek_asilov.databinding.ActivityBook13Binding;
import com.msi.sardorbek_asilov.databinding.ActivityBook3Binding;
import com.msi.sardorbek_asilov.databinding.ActivityBook9Binding;

public class Book13Activity extends AppCompatActivity {

    private ActivityBook13Binding binding;
    private static final String PREFS_NAME = "FAVORITES";
    private static final String BOOK13_KEY = "BOOK13_FAVORITE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityBook13Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Подключаем обработчики событий
        binding.backBtn.setOnClickListener(this::backBtn);
        binding.readBtn.setOnClickListener(this::readBtn);
        binding.downloadBtn.setOnClickListener(this::downloadBtn);
        binding.favoriteBtn.setOnClickListener(this::favoriteBtn);

        // Проверка на наличие книги в избранном при запуске активности
        checkFavoriteStatus();
    }

    public void backBtn(View v) {
        Intent intent = new Intent(Book13Activity.this, DashboardUserActivity.class);
        startActivity(intent);
    }

    public void readBtn(View v) {
        // Создаем диалоговое окно для подтверждения перехода на сайт
        new AlertDialog.Builder(this)
                .setTitle("Перейти на сайт")
                .setMessage("Вы действительно хотите перейти на сайт?")
                .setPositiveButton("Да", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Переход на сайт
                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://flibusta.su/book/23999-devchonki-ya-priehal/read/"));
                        startActivity(browserIntent);
                    }
                })
                .setNegativeButton("Нет", null)
                .show();
    }


    public void downloadBtn(View v) {
        // Показать сообщение Toast для проверки
        Toast.makeText(this, "Загрузка книги...", Toast.LENGTH_SHORT).show();
        new AlertDialog.Builder(this)
                .setTitle("Перейти на сайт")
                .setMessage("Вы действительно хотите перейти на сайт?")
                .setPositiveButton("Да", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Переход на сайт
                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://flibusta.su/book/23999-devchonki-ya-priehal/d/?f=a4.pdf"));
                        startActivity(browserIntent);
                    }
                })
                .setNegativeButton("Нет", null)
                .show();
    }

    public void favoriteBtn(View v) {
        SharedPreferences sharedPreferences = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        boolean isFavorite = sharedPreferences.getBoolean(BOOK13_KEY, false);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        if (isFavorite) {
            editor.remove(BOOK13_KEY);
            Toast.makeText(this, "Удалено из избранного!", Toast.LENGTH_SHORT).show();
        } else {
            editor.putBoolean(BOOK13_KEY, true);
            Toast.makeText(this, "Добавлено в избранное!", Toast.LENGTH_SHORT).show();
        }

        editor.apply();
        checkFavoriteStatus();
    }

    private void checkFavoriteStatus() {
        SharedPreferences sharedPreferences = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        boolean isFavorite = sharedPreferences.getBoolean(BOOK13_KEY, false);

        if (isFavorite) {
            binding.favoriteBtn.setImageResource(R.drawable.ic_favorite_white);
        } else {
            binding.favoriteBtn.setImageResource(R.drawable.ic_favorite_border_white);
        }
    }
}
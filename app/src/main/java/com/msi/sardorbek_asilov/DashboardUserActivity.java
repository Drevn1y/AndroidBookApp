package com.msi.sardorbek_asilov;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import com.msi.sardorbek_asilov.Books.Book10Activity;
import com.msi.sardorbek_asilov.Books.Book11Activity;
import com.msi.sardorbek_asilov.Books.Book12Activity;
import com.msi.sardorbek_asilov.Books.Book13Activity;
import com.msi.sardorbek_asilov.Books.Book14Activity;
import com.msi.sardorbek_asilov.Books.Book15Activity;
import com.msi.sardorbek_asilov.Books.Book1Activity;
import com.msi.sardorbek_asilov.Books.Book2Activity;
import com.msi.sardorbek_asilov.Books.Book3Activity;
import com.msi.sardorbek_asilov.Books.Book4Activity;
import com.msi.sardorbek_asilov.Books.Book5Activity;
import com.msi.sardorbek_asilov.Books.Book6Activity;
import com.msi.sardorbek_asilov.Books.Book7Activity;
import com.msi.sardorbek_asilov.Books.Book8Activity;
import com.msi.sardorbek_asilov.Books.Book9Activity;
import com.msi.sardorbek_asilov.Books.FavoritesActivity;
import com.msi.sardorbek_asilov.databinding.ActivityDashboardUserBinding;

public class DashboardUserActivity extends AppCompatActivity {

    private ActivityDashboardUserBinding binding;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityDashboardUserBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        firebaseAuth = FirebaseAuth.getInstance();
        checkUser();

        //handle click, logout
        binding.LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firebaseAuth.signOut();
                checkUser();
            }
        });
    }

    private void checkUser() {
        // get current user
        FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();
        if (firebaseUser == null) {
            // not logged in, goto main screen
            startActivity(new Intent(this, MainActivity.class));
            finish();
        } else {
            // logged in, get user info
            String email = firebaseUser.getEmail();
            // set in textview of toolbar
            binding.subTitleTv.setText(email);
        }
    }

    public void onClickFavorites(View v){
        Intent intent = new Intent(DashboardUserActivity.this, FavoritesActivity.class);
        startActivity(intent);
    }
    public void onClickBook1(View v) {
        Intent intent = new Intent(DashboardUserActivity.this, Book1Activity.class);
        Toast toast = Toast.makeText(DashboardUserActivity.this, "Успешно!", Toast.LENGTH_SHORT);
        startActivity(intent);
        toast.show();
    }
    public void onClickBook2(View v) {
        Intent intent = new Intent(DashboardUserActivity.this, Book2Activity.class);
        Toast toast = Toast.makeText(DashboardUserActivity.this, "Успешно!", Toast.LENGTH_SHORT);
        startActivity(intent);
        toast.show();
    }
    public void onClickBook3(View v) {
        Intent intent = new Intent(DashboardUserActivity.this, Book3Activity.class);
        Toast toast = Toast.makeText(DashboardUserActivity.this, "Успешно!", Toast.LENGTH_SHORT);
        startActivity(intent);
        toast.show();
    }
    public void onClickBook4(View v) {
        Intent intent = new Intent(DashboardUserActivity.this, Book4Activity.class);
        Toast toast = Toast.makeText(DashboardUserActivity.this, "Успешно!", Toast.LENGTH_SHORT);
        startActivity(intent);
        toast.show();
    }
    public void onClickBook5(View v) {
        Intent intent = new Intent(DashboardUserActivity.this, Book5Activity.class);
        Toast toast = Toast.makeText(DashboardUserActivity.this, "Успешно!", Toast.LENGTH_SHORT);
        startActivity(intent);
        toast.show();
    }
    public void onClickBook6(View v) {
        Intent intent = new Intent(DashboardUserActivity.this, Book6Activity.class);
        Toast toast = Toast.makeText(DashboardUserActivity.this, "Успешно!", Toast.LENGTH_SHORT);
        startActivity(intent);
        toast.show();
    }
    public void onClickBook7(View v) {
        Intent intent = new Intent(DashboardUserActivity.this, Book7Activity.class);
        Toast toast = Toast.makeText(DashboardUserActivity.this, "Успешно!", Toast.LENGTH_SHORT);
        startActivity(intent);
        toast.show();
    }
    public void onClickBook8(View v) {
        Intent intent = new Intent(DashboardUserActivity.this, Book8Activity.class);
        Toast toast = Toast.makeText(DashboardUserActivity.this, "Успешно!", Toast.LENGTH_SHORT);
        startActivity(intent);
        toast.show();
    }
    public void onClickBook9(View v) {
        Intent intent = new Intent(DashboardUserActivity.this, Book9Activity.class);
        Toast toast = Toast.makeText(DashboardUserActivity.this, "Успешно!", Toast.LENGTH_SHORT);
        startActivity(intent);
        toast.show();
    }
    public void onClickBook10(View v) {
        Intent intent = new Intent(DashboardUserActivity.this, Book10Activity.class);
        Toast toast = Toast.makeText(DashboardUserActivity.this, "Успешно!", Toast.LENGTH_SHORT);
        startActivity(intent);
        toast.show();
    }
    public void onClickBook11(View v) {
        Intent intent = new Intent(DashboardUserActivity.this, Book11Activity.class);
        Toast toast = Toast.makeText(DashboardUserActivity.this, "Успешно!", Toast.LENGTH_SHORT);
        startActivity(intent);
        toast.show();
    }
    public void onClickBook12(View v) {
        Intent intent = new Intent(DashboardUserActivity.this, Book12Activity.class);
        Toast toast = Toast.makeText(DashboardUserActivity.this, "Успешно!", Toast.LENGTH_SHORT);
        startActivity(intent);
        toast.show();
    }
    public void onClickBook13(View v) {
        Intent intent = new Intent(DashboardUserActivity.this, Book13Activity.class);
        Toast toast = Toast.makeText(DashboardUserActivity.this, "Успешно!", Toast.LENGTH_SHORT);
        startActivity(intent);
        toast.show();
    }
    public void onClickBook14(View v) {
        Intent intent = new Intent(DashboardUserActivity.this, Book14Activity.class);
        Toast toast = Toast.makeText(DashboardUserActivity.this, "Успешно!", Toast.LENGTH_SHORT);
        startActivity(intent);
        toast.show();
    }
    public void onClickBook15(View v) {
        Intent intent = new Intent(DashboardUserActivity.this, Book15Activity.class);
        Toast toast = Toast.makeText(DashboardUserActivity.this, "Успешно!", Toast.LENGTH_SHORT);
        startActivity(intent);
        toast.show();
    }
}
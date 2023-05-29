package com.example.a3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    private List<Bird> bird = new ArrayList<Bird>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setInitialData();

        RecyclerView recyclerView = findViewById(R.id.RSV);
        BirdAdapter adapter = new BirdAdapter(bird, this);
        recyclerView.setAdapter(adapter);

    }

    private  void  setInitialData(){
        bird = new ArrayList<>();

        bird.add(new Bird("Воробей", "Воробей – самая известная птичка, живущая по соседству с человеком. Это серо-коричневая пташка маленького размера. Длина тела воробья составляет около 20 см, вес взрослой особи до 35-37г.На Земле практически нет местности, где бы ни обитал воробей.",
                R.drawable.vorobey));
        bird.add(new Bird("Ворон", "Ворон — наиболее крупный представитель отряда воробьинообразных. Длина тела его составляет 60–65 см, длина крыла 43–44 см. Оперение черное с синеватым, зеленоватым или фиолетовым металлическим отливом. Клюв острый и сильный, черного цвета.",
                R.drawable.voron));
        bird.add(new Bird("Ястреб", "Ястреб — это хищная птица, которая относится к подклассу новонёбные, отряду ястребообразные, семейству ястребиные (лат. Precipitate).",
                R.drawable.yastreb));
        bird.add(new Bird("Синица", "Синица – небольшая бойкая птичка, принадлежащая к отряду воробьинообразных. Дружелюбна, доверчива, любит щебетать. Специалисты утверждают, что она способны издавать свыше 40 различных звуковых сочетаний. Весит синица 14-20 граммов, а длина её тела не превышает 15-20 сантиметров.",
                R.drawable.sinitsa));
        bird.add(new Bird("Орёл", "Это крупная хищная птица темного окраса, размах ее крыльев может превышать 1,8 м. Вес – от 1,6 до 2,4 кг. Основная пища орлов – мелкие животные, насекомые и падаль. Они способны видеть добычу на расстоянии 2 км.",
                R.drawable.orel));
        bird.add(new Bird("Кукушка", "Кукушка — птица, по названию которой было образовано семейство «Кукушковые», куда входит более ста разновидностей птиц. Кукушки крайне распространенные пернатые, встречающиеся почти на всех континентах, хотя наибольшее разнообразие видов можно увидеть в тропиках. Птицы наполняют своим пением леса и издавна ассоциируются у людей с предсказаниями судьбы, что отражено в народных приметах.",
                R.drawable.kukushka));
    }

}
package com.cursoandroid.frasedodia;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity{

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;
    private String[] frases =
            {
                    "Felizes são os que ouvem a palavra de Deus e a guardam!",
                    "Não amemos de palavras nem de língua, mas por ações e em verdade.",
                    "Se Cristo vos libertar, verdadeiramente sereis livres.",
                    "Lavo as minhas mãos na inocência; e assim andarei, Senhor, ao redor do teu altar. Para publicar com voz de louvor, e contar todas as tuas maravilhas.\n" + "(Salmos 26:6,7)",
                    "Fica longe das discussões e evitarás o pecado, porque o homem colérico atiça a discussão.",
                    "O meu mandamento é este: amem uns aos outros como eu amo vocês.",
                    "Toda a educação, no momento, não parece motivo de alegria, mas de tristeza. Depois, no entanto, produz naqueles que assim foram exercitados um fruto de paz e de justiça.",
                    "Quem é correto nunca fracassará e será lembrado para sempre.",
                    "Felizes são aqueles que não se deixam levar pelos conselhos dos maus.",
                    "Quem semeia a injustiça colherá a desgraça.",
                    "O ódio provoca dissensão, mas o amor cobre todos os pecados.",
                    "O Senhor é o meu pastor, nada me faltará.",
                    "Mais vale um homem lento à cólera do que um herói, e um homem senhor de si do que o conquistador de uma cidade.",
                    "Deus converte o deserto em lago e a terra seca em fontes.",
                    "A falta de coração despreza o seu próximo.",
                    "Cada qual mente ao seu próximo, falando com lábios fluentes e duplo coração.",
                    "Um corpo corruptível pesa sobre a alma e - tenda de argila - oprime a mente pensativa.",
                    "Tu que estás lá nas alturas, assim mesmo te interesses pelos humildes.",
                    "Fazei justiça ao fraco e ao órfão, procedei retamente para com o aflito e o desamparado.",
                    "Ainda que eu andasse pelo vale da sombra da morte, não temeria mal algum, porque tu estás comigo.",
                    "Porque eu, o SENHOR, teu Deus, te tomo pela tua mão direita e te digo: não temas, que eu te ajudo.",
                    "Quem não se ama não sabe amar os outros.",
                    "Sim, eu amo Deus. Ele é a fonte de minha existência, é meu Salvador. Ele me sustenta a cada dia. Sem Ele eu não sou nada, mas com Ele eu posso todas as coisas através de Jesus Cristo, que me fortalece.",
                    "Deus limpará de seus olhos todas as lágrimas.",
                    "O nome de Deus é, realmente, magnífico! Tu não temerás os terrores noturnos, nem a flecha que voa à luz do dia. Nenhum mal te atingirá."
            };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = findViewById(R.id.textoNovaFraseId);
        botaoNovaFrase = findViewById(R.id.botaoNovaFraseId);

        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomico = new Random();
                int numAleatorio = randomico.nextInt(frases.length);
                textoNovaFrase.setText(frases[numAleatorio]);

            }
        });
    }


}

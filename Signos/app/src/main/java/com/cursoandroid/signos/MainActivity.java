package com.cursoandroid.signos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listaSignos;
    private String[] signos =
            {
              "Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem",
              "Libra", "Escorpião", "Sagitário", "Capricórnio", "Aquário", "Peixes"
            };
    private String[] perfis =
            {
                "Rotina e paciência são duas palavras que não combinam com arianos. Para eles, tudo é possível, menos esperar. A resposta tem que ser sempre imediata. \n" +
                        "Nativos de Áries têm a capacidade de reagir automaticamente e de enfrentar de cara qualquer situação, mesmo que ainda não tenham presenciado o acontecido. São bons em lutas e sempre conseguem conquistar aquilo que desejam. \n" +
                        "Apesar de serem extrovertidos ao extremo, os arianos também conseguem ter seus momentos de seriedade e levam a sério tudo aquilo que sentem.",
                "Taurinos tem o poder do charme. Por serem regidos por Vênus, a deusa do amor, isso é quase automático em suas vidas.\n" +
                        "Mesmo assim, o grande desafio para as pessoas nascidas nesse signo é a auto estima. Para eles, é muito difícil perceber o potencial talentoso que possuem. \n" +
                        "A paciência é um dos dons dos taurinos, que aguentam com força coisas que muitos abandonam pela metade.",
                    "Geminianos são super ativos, têm a necessidade de estarem ligados física, mental e verbalmente o tempo todo. A conexão com o mundo e suas curiosidades os deixam vivos. Por isso, parecem sempre nervosos ou inquietos.\n" +
                            "Eles se interessam por muitas coisas e todas ao mesmo tempo, assim são, frequentemente, acusados de superficialidade e dispersão. E isso pode trazer muitos problemas.",
                    "Cancerianos são instáveis e vivem de acordo com o instinto de proteção, pelos sentimentos e emoções. Eles são típicos sonhadores: tímidos e preocupados com o futuro, mas sempre com um olho no passado.\n" +
                            "Nativos do signo de Câncer são apegados demais à família e tradições que seguem. São cheios de manias e costumes.",
                    "Os nascidos no signo de Leão tem a forte capacidade de liderança. Eles são criativos, entusiasmados e possuem a dose certa de força para estarem no comando das situações.\n" +
                            "Leoninos são egocêntricos e buscam sempre o reconhecimento. Assim, podem acabar agindo com dramaticidade, arrogância e autoritarismo, o que acaba afastando muitas pessoas.\n" +
                            "São vaidosos ao extremo e possuem o ego muito inflado.",
                    "Os virginianos são extremamente detalhistas e compromissados. Eles gostam de analisar as situação em seus mínimos detalhes e só tomam decisões quando estão prontos. \n" +
                            "O grande problema é a busca pela perfeição, que é inexistente. Assim que percebem que possuem falhas e que podem ser criticados também, os virginianos tendem a se fechar em seu mundo.",
                    "Libra é representado pela balança, símbolo do equilíbrio e da justiça. \n" +
                            "Os nascidos desse signo são vaidosos e sabem exatamente o que as pessoas falam ou esperam deles. Eles possuem a capacidade de ler os olhos das outras pessoas. \n" +
                            "Quando bem usados, seus dons os tornam os melhores diplomatas e amigos de todos os signos do Zodíaco.",
                    "Os nativos desse signo tendem a ver o mundo com outros olhos e, como imaginam que todos verão as coisas como eles, tendem a ficar fechados em seu mundo particular.\n" +
                            "Escorpianos são intensos demais. Estão sempre morrendo de ciúmes, de amor, de saudade, de rir, de raiva... Tudo o que sentem beira ao extremo. Isso faz com que criem uma barreira em torno dos seus relacionamentos.",
                    "Sagitarianos geralmente são muito alegres, gentis e amam a vida. O grande problema dos nascidos desse signo é o exagero. Esperam demais das situações e podem acabar se decepcionando se as coisas não saírem como esperavam. Eles não conseguem lidar com as frustrações.\n" +
                            "Apesar disso, são justiceiros, lutam pelos fracos e oprimidos, mas também impõem a lei, gostam de fazer justiça com seu exemplo e seu julgamento.",
                    "Capricornianos são ambiciosos, práticos, determinados, esforçados e ambiciosos o suficiente para vencerem os obstáculos da vida. Mas isso não significa que todos estão destinados à vitória e ao sucesso, mas sim que são movidos por isso. \n" +
                            "São fieis, confiáveis, sérios e responsáveis. Algumas vezes têm suas loucuras, mas o que define sua personalidade são essas características marcantes.",
                    "Os nascidos do signo de Aquário valorizam muito a liberdade, independência, a amizade e a fraternidade. Eles possuem a mente aberta, por isso são capazes de tratar de igual para igual o mais humilde e ao mais importante membro da sociedade humana.\n" +
                            "Possuem também a grande necessidade de participarem de um grupo e de mudarem o mundo, mas querem fazer isso de uma forma independente.",
                    "Quem nasce nesse signo possui o dom de compreender o que as pessoas sentem, sem que as palavras sejam ditas. \n" +
                            "Muitas vezes, os piscianos dão a impressão de que não têm um rumo ou de que não estão prestando atenção ao que está acontecendo em volta. Mas não é nada disso. Eles estão apenas em uma realidade que as pessoas não entendem.\n" +
                            "Eles são sensíveis, instáveis e confusos na maioria das vezes."
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaSignos = findViewById(R.id.listViewId);

        ArrayAdapter<String> adapter =new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_activated_1,
                android.R.id.text1,
                signos
        );

        listaSignos.setAdapter( adapter );
        listaSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int valPosicao = position;

                Toast.makeText(getApplicationContext(), perfis[valPosicao], Toast.LENGTH_LONG).show();
            }
        });
    }
}

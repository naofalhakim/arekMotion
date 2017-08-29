package com.motionlaboratory.rekruitasiapk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class FormInput extends AppCompatActivity {

    EditText et_input;
    Button btn_submti;
    String[][] ar;
    String temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_input);

        ar = new String[][]{

                {"1301154378","Naofal"},
                //RG
                {"1601144077","RG MOBILE"},
                {"1301144005","RG MOBILE"},
                //MP
                {"1301154160","Faishal Rachman"}
                ,{"1301154387","Raya Rahadian"}
                ,{"6706161078","Rhony Septian"}
                ,{"1301154246","Ali Helmut"}
                ,{"6706161060","Kurniawan Yudha Putrama"}
                ,{"1301164400","Muhammad Ferianda Satya"}
                ,{"1301154307","Eldi Rohmanur Ikhsan"}
                ,{"1301154116","Febrio Ibrahim Sebayang"}
                ,{"1301164106","Rahmad Ramadhan"}
                ,{"1301154424","Mohamad Irwan Afandi"}
                ,{"1301160466","Raihan Hamid Suraperwata"}
                ,{"1301153626","Muhammad Husain"}
                ,{"1301164148","Muhammad Hafiz Siregar"}
                ,{"1301140298","Maidarman"}
                ,{"6706164128","Muh Rafli Syam"}
                ,{"1301140371","Febby Febriansyah"}
                ,{"1301154162","Mochammad Farrell"}
                ,{"1301164401","Muhammad Fajar Rizqi"}
                ,{"1202154213","Hakim Rizki "}
                ,{"1301164209","Muhammad Afif Amanullah Fawwaz"}
                ,{"1301164299","Grandhys Setyo Utomo"}
                ,{"6701164163","Muh Alif Al Gibran"}
                //DESIGN
                ,{"6706164114","Ravi Mahfunda"}
                ,{"1202150082","Aprianil Sesti Rangga"}
                ,{"1302150036","Faiz Agustira"}
                ,{"1301153634","Asni Januariski"}
                ,{"1301168492","Ade Iriani Sapitri"}
                ,{"1301150035","Kukuh Rahingga"}
                ,{"1102164007","Tito Naufal Ghifary"}
                ,{"1301164351","Ryo Alif Ramdhan"}
                ,{"1301154468","Gisela Anggita"}
                ,{"1301154553","Ranestari Sastriani"}
                ,{"1301154497","Ivana Azharyani"}
                ,{"1301164244","Fikri Haykal"}
                ,{"1301153681","Haqita Anjar"}
                ,{"1301154524","Rita Ajeng Nugraheni"}
                ,{"1301154360","Arief Budhiman"}
                ,{"1301164550","Amalia Huwaida"}
                ,{"1301154216","Hardo Silalahi"}
                ,{"1301154420","Sopian Putra Pratama"}

                //BA
                ,{"1301154207","Aditia Rafif Khoerullah"}
                ,{"1401161132","RAFI ATHA GANIZA"}
                ,{"1401164512","NUNING KRISTANTI"}
                ,{"1401154216","Faiz Savindra Putra"}
                ,{"1301154202","MUHAMMAD FADHLAN SUPRIADI"}
                ,{"1401164383","Mauthia Nabila P"}
                ,{"1301154327","MUHAMMAD ADNA PRADANA"}
                ,{"1301154496","KHARISMA OKTAVIANING"}
                ,{"1101150014","ALDO TRIPOLYTA"}

        };

        et_input = (EditText) findViewById(R.id.et_input);
        btn_submti = (Button) findViewById(R.id.btn_input);

        btn_submti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et_input.getText().toString().equals("")){
                    Toast t = Toast.makeText(FormInput.this,"Tidak Boleh Kosong",Toast.LENGTH_SHORT);
                    t.show();
                }else{
                    goAnnounc();
                }
            }
        });
    }

    private void goAnnounc() {
        Intent i ;
        int idx = 0;
        temp = "";
        for(int x=0;x<ar.length;x++){
            if(ar[x][0].equals(et_input.getText().toString())){
                temp = et_input.getText().toString();
                idx = x ;
            }
        }

        if(!temp.equals("")){
            i = new Intent(FormInput.this,Announc.class);
            i.putExtra("Nama",ar[idx][1]);
        }else{
            i = new Intent(FormInput.this,Announce_failed.class);
        }
        startActivity(i);
    }
}

package com.applicationull.iubatsolutions;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class FacultyHome extends AppCompatActivity implements TextWatcher {

    EditText e1;
    ListView l1;

    String[] facultyinfo;
    int[] facultyImages={R.drawable.hannan,R.drawable.shohidullah,R.drawable.emdadul,R.drawable.ataurrahman,R.drawable.anilchandra,R.drawable.mujiburrahmankhan,R.drawable.faruk,R.drawable.sayadur,R.drawable.salahuddin,R.drawable.farjana,R.drawable.sarmin,R.drawable.rehan,R.drawable.arif,R.drawable.aziz,R.drawable.lutfar,R.drawable.mannan,R.drawable.khaled,R.drawable.dst,R.drawable.ashequr,R.drawable.yousuf,R.drawable.anika,R.drawable.abdussalam,R.drawable.anwarhossain,R.drawable.ishtique,R.drawable.arifahsan,R.drawable.kamruzzaman,R.drawable.jamee,R.drawable.zahir,R.drawable.fahim,R.drawable.raka,R.drawable.tanjimul,R.drawable.shaikh,R.drawable.mirzaahsanul,R.drawable.mahmuda,R.drawable.laila,R.drawable.alamgir,R.drawable.mohammadali,R.drawable.madhobi,R.drawable.asifur,R.drawable.abdulhaque,R.drawable.utpal,R.drawable.abhijit,R.drawable.alamgirbhuiya,R.drawable.saidur,R.drawable.fourcan,R.drawable.rashedul,R.drawable.fawzia,R.drawable.golam,R.drawable.alomgirhossain,R.drawable.krisnadas,R.drawable.camelia,R.drawable.humayun,R.drawable.rakibul,R.drawable.rubaiya,R.drawable.shahinur,R.drawable.arifa,R.drawable.humayunbissas,R.drawable.riaz,R.drawable.safwana,R.drawable.ayesha,R.drawable.mortuza,R.drawable.rubina,R.drawable.sajid,R.drawable.shariful,R.drawable.bisswajit,R.drawable.abul,R.drawable.azizhuq,R.drawable.bonna,R.drawable.soheli,R.drawable.suman,R.drawable.razin,R.drawable.rezoana,R.drawable.abubkr,R.drawable.turiqul,R.drawable.rezaul,R.drawable.raisul,R.drawable.nipun,R.drawable.monirul,R.drawable.abdulhalim,R.drawable.tarekhrasel,R.drawable.anisurrahman,R.drawable.anisuzzamankhan,R.drawable.sayedajannat,R.drawable.hishamurrahman,R.drawable.asifahmed,R.drawable.mahfuzurrahman,R.drawable.tanvirehsan,R.drawable.enamulquadir,R.drawable.shahrior,R.drawable.sardermuhammad,R.drawable.kamalchowdhury,R.drawable.saifullah,R.drawable.abdulwadid,R.drawable.sarwariqbal,R.drawable.irtezahossain,R.drawable.shariffujjaman,R.drawable.shahed,R.drawable.mofizulhaque,R.drawable.abdulkarim,R.drawable.solaymanhaque,R.drawable.sayeam,R.drawable.muammer,R.drawable.sazzadbin,R.drawable.mahedihasan,R.drawable.zillurrahman,R.drawable.abdulzabber,R.drawable.shahjahan,R.drawable.syedaisrat,R.drawable.tariqulalam,R.drawable.chandankumar,R.drawable.bilkisrahman,R.drawable.saimaalam,R.drawable.momtazurrahman,R.drawable.fazlurrahman,R.drawable.abdulmatin,R.drawable.sarkermahmud,R.drawable.mdabul,R.drawable.sirajulalam,R.drawable.insanemon,R.drawable.bilkisfahmida,R.drawable.jashimuddin,R.drawable.fawziayakub,R.drawable.sadekulislam,R.drawable.forhadhossain,R.drawable.kawsaruddin,R.drawable.lulu,R.drawable.farukhkhan,R.drawable.aminurrashid,R.drawable.jannatulferdous,R.drawable.kamrulhasan,R.drawable.rokonulislam,R.drawable.reedwanhabib,R.drawable.musrifur,R.drawable.abulkhair,R.drawable.sunilbiswas,R.drawable.harunurrashid,R.drawable.nilaykumarday,R.drawable.borhanuddin,R.drawable.kanizkakan,R.drawable.farzanahossain,R.drawable.shamsulhaque,R.drawable.selinanargis,R.drawable.mitamandal,R.drawable.roksanaparvin,R.drawable.mallika,R.drawable.mahbuburrahman,R.drawable.tithi,R.drawable.hafizurrahman,R.drawable.shabbirahmed,R.drawable.imrosejahan,R.drawable.shahadathossain,R.drawable.amanullah,R.drawable.mizanurrahman,R.drawable.dilipkumar,R.drawable.rashidaparvin,R.drawable.rajiblochan,R.drawable.rehanaparvin,R.drawable.sadiya,R.drawable.debzitdatta,R.drawable.moksudislam,R.drawable.saiduzzaman,R.drawable.shafiqullislam,R.drawable.zakiahossain,R.drawable.fatematuj,R.drawable.nayemanima,R.drawable.nazninfiroza,R.drawable.jahiratabassum,R.drawable.mdanwarhossainusa,R.drawable.jonialom,R.drawable.asmaakter,R.drawable.rehanapar,R.drawable.motaherhossain,R.drawable.murshidayasmin,R.drawable.mujiburrahman,R.drawable.horaira,R.drawable.mohammadmusa,R.drawable.ershad,R.drawable.farzanaferdous,R.drawable.mofaserulislam,R.drawable.johurajabin,R.drawable.yousufhossain,R.drawable.masudasa,R.drawable.shamsunnahar,R.drawable.khadizaakter,R.drawable.shuvashis,R.drawable.kanikaislam,R.drawable.ayeshasiddika,R.drawable.abdurrab,R.drawable.rabiulislam,R.drawable.kantibarua,R.drawable.abuhanif,R.drawable.manowara,R.drawable.abulkalamazad,R.drawable.kohinoor,R.drawable.mohsina,R.drawable.mahfuzurrahman,R.drawable.monirhosen,R.drawable.alaminanik,R.drawable.titumiah,R.drawable.rifatsumona,R.drawable.zulfiquer,R.drawable.maximchakma,R.drawable.emtiazahmed,R.drawable.akhlizaakter,R.drawable.sadiksahriar,R.drawable.rakibulhassan,R.drawable.sadiaiffat,R.drawable.riznanahar,R.drawable.akhtertariq,R.drawable.yasminjahan,R.drawable.sukumarmodal,R.drawable.mazadurrahman,R.drawable.abusayed,R.drawable.nazmulhaque,R.drawable.shahanara,R.drawable.siddiqurrahman,R.drawable.jahangiralam,R.drawable.showmitrabarua,R.drawable.jahangiralammba,R.drawable.khayrujamman,R.drawable.munmun,R.drawable.nurunnahar,R.drawable.abdulmumin,R.drawable.afizerrahman,R.drawable.aslamuddin,R.drawable.razibkhan,R.drawable.mdhumayankabir,R.drawable.rajuahmed,R.drawable.mohadabchandra,R.drawable.sanjibdebnath,R.drawable.sultanulaziz,R.drawable.ferdous,R.drawable.hasanuzzaman,R.drawable.hasibul,R.drawable.nayma,R.drawable.mahamudul,R.drawable.ehte,R.drawable.chayon,R.drawable.fardina,R.drawable.sharmila,R.drawable.abdul,R.drawable.toyeer,R.drawable.firuz,R.drawable.parvez,R.drawable.mariom,R.drawable.zahirul,R.drawable.bina,R.drawable.shamsun};

    ArrayList<SingleRow> list;

    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_home);

        facultyinfo=getResources().getStringArray(R.array.faculty_info);

        e1= (EditText) findViewById(R.id.edittextid);

        l1= (ListView) findViewById(R.id.listViewId1);
        e1.addTextChangedListener(this);

        list=new ArrayList<>();
        SingleRow singleRow;

        for(int i=0; i<facultyinfo.length; i++)
        {
            singleRow=new SingleRow(facultyinfo[i],facultyImages[i]);
            list.add(singleRow);
        }

        customAdapter=new CustomAdapter(this,list);
        l1.setAdapter(customAdapter);

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        this.customAdapter.getFilter().filter(s);
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void afterTextChanged(Editable s) {

    }
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}

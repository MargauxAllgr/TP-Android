package BDD;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class EtudiantBDD {
    private static final int VERSION_BDD = 1;
    private static final String NOM_BDD = "exemple.db";
    private static final String TABLE = "etudiants";
    private static final String COL_ID = "id";
    private static final String COL_NOM = "nom";
    private static final String COL_PRENOM = "prenom";
    private static final String COL_SEXE = "sexe";
    private static final String COL_DOMINANTE = "dominante";
    private static final int NUM_COL_ID = 1;
    private static final int NUM_COL_NOM = 2;
    private static final int NUM_COL_PRENOM = 3;
    private static final int NUM_COL_SEXE = 4;
    private static final int NUM_COL_DOMINANTE = 5;

    private SQLiteDatabase bdd;
    private MaBase maBase;

    public EtudiantBDD(Context context){
        maBase = new MaBase(context, NOM_BDD,null, VERSION_BDD);
    }
    public void open(){
        bdd = maBase.getWritableDatabase();
    }
    public void close(){
        bdd.close();
    }
    public SQLiteDatabase getDB(){
        return bdd;
    }
}

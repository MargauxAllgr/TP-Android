package BDD;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MaBase extends SQLiteOpenHelper {

    public MaBase(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE etudiants(id INTEGER PRIMARY KEY AUTOINCREMENT,nom TEXT NOT NULL,prenom TEXT NOT NULL,sexe VARCHAR(1) NOT NULL,dominante TEXT NOT NULL)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS etudiants");
        onCreate(db);
    }
}

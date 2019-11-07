package com.example.t7_picture_listview;

import androidx.room.RoomDatabase;

@androidx.room.Database(entities = {Picture.class}, version = 1)

public abstract class Tietokanta extends RoomDatabase {
    public static final String NIMI = "TIETOKANTA";
    public abstract MyTableDao myTableDao();


}

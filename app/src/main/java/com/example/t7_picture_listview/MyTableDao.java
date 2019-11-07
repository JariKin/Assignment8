package com.example.t7_picture_listview;

import android.widget.ListView;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface MyTableDao {

    @Query("SELECT * FROM Picture ORDER BY id desc")
    List<Picture> getAllInDescendingOrder();

    @Insert
    void InsertMyentity(Picture... entity);

    @Delete
    void DeleteMyEntity(Picture entity);

}

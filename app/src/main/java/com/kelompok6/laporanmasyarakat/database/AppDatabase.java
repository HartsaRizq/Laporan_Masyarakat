package com.kelompok6.laporanmasyarakat.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.kelompok6.laporanmasyarakat.dao.DatabaseDao;
import com.kelompok6.laporanmasyarakat.model.ModelDatabase;

@Database(entities = {ModelDatabase.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract DatabaseDao databaseDao();
}

package com.example.tp1_duciel_romain.SW.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.tp1_duciel_romain.SW.data.model.SWMonstersRoom

@Dao
interface SWMonstersDao {
    @Query("SELECT * FROM sw_monsters_object_table ORDER BY name ASC")
    fun selectAll(): LiveData<List<SWMonstersRoom>>


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(swMonstersRoom: SWMonstersRoom)


    @Query("DELETE FROM sw_monsters_object_table")
    fun deleteAll()
}
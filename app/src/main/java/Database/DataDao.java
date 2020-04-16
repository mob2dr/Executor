package Database;

import android.annotation.SuppressLint;

import androidx.core.app.RemoteInput;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.PrimaryKey;
import androidx.room.Query;
import androidx.room.Update;

import com.example.recycler.AddData;
import com.example.recycler.Data;
import java.util.List;
@Dao
public interface DataDao {
    @Query("SELECT * FROM MyData")
    List<Data> getDatas();
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertData(Data data);
    @Update
    void updataData(Data data);
    @Delete
    void delete(Data data);

}

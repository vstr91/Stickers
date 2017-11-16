package br.com.vostre.stickers.model.dao;

import br.com.vostre.stickers.model.Album;

/**
 * Created by Almir on 12/11/2017.
 */

@Dao
public interface AlbumDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void salvarAlbuns(Album... albuns);

    @Update
    public void atualizarAlbuns(Album... albuns);

    @Delete
    public void deletarAlbuns(Album... albuns);

    @Query("SELECT * FROM album")
    public Album[] listarTodos();

}

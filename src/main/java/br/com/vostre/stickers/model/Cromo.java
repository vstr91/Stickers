package br.com.vostre.stickers.model;

/**
 * Created by Almir on 12/11/2017.
 */

@Entity(foreignKeys = @ForeignKey(entity = Album.class,
        parentColumns = "id",
        childColumns = "id_album"))
public class Cromo {

    @PrimaryKey
    private int id;
    private String ordem;
    private int quantidade;
    private boolean possui;

    @ColumnInfo(name = "id_album")
    public int idAlbum;

}

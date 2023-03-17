package lab3;

public class Lab3_3_9 {

    public static void main(String[] args) {

        Photo photo1 = new Photo("Turkey 2023");
        Photo photo2 = new Photo("BMSTU 2022");
        Photo photo3 = new Photo("2003");
        Photo photo4 = new Photo("Yaroslavl 2021");
        Photo photo5 = new Photo("Dancing 2007");

        PhotoAlbum album = new PhotoAlbum("Rita album");
            album.addPhoto(photo1);
            album.addPhoto(photo2);
            album.addPhoto(photo3);
            album.addPhoto(photo4);
            album.addPhoto(photo5);

            System.out.println("Number of photos in Rita album: " + album.getNumberOfPhotos());
    }
}

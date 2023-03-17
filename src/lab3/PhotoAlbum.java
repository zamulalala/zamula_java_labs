package lab3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PhotoAlbum {
    private String name;
    private final List<Photo> photos;

    public PhotoAlbum(String name) {
        this.name = name;
        this.photos = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addPhoto(Photo photo) {
        photos.add(photo);
    }

    public int getNumberOfPhotos() {
        return photos.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhotoAlbum that)) return false;
        return Objects.equals(getName(), that.getName()) &&
                Objects.equals(photos, that.photos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), photos);
    }

    @Override
    public String toString() {
        return "PhotoAlbum: " +
                "name='" + name + '\'' +
                ", photos=" + photos +
                '}';
    }
}


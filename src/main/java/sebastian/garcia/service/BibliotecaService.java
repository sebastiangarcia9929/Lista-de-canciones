package sebastian.garcia.service;

import sebastian.garcia.model.Biblioteca;
import sebastian.garcia.model.Cancion;
import sebastian.garcia.model.Genero;
import sebastian.garcia.model.PlayList;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class BibliotecaService {
    private BibliotecaService() {}
    private static Biblioteca biblioteca;
    public static BibliotecaService INSTANCE;

    public static List<PlayList> playLists = new ArrayList<>();

    public static BibliotecaService getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new BibliotecaService();
            initLibrary();
        }
        return INSTANCE;
    }
    public static void initLibrary(){
        biblioteca = new Biblioteca();
        List<Cancion> songs = new ArrayList<>();
        songs.add(new Cancion("Numb", "1094032", Genero.ROCK, new Date(), 60L, "NIRVANA", "Es una buena cancion"));
        songs.add(new Cancion("nada sin ti", "2034945", Genero.SALSA, new Date(), 60L, "ABRIENDO PUERTAS", "Es una buena cancion"));
        songs.add(new Cancion("maps", "10394385", Genero.ROCK, new Date(), 60L, "V", "Es una buena cancion"));
        biblioteca.setCanciones(songs);
    }

    public List<PlayList> getAllPlayList() {
        return playLists;
    }

    public List<Cancion> getAllSongs() {
        return biblioteca.getCanciones();
    }

    public void createPlayList(String name, List<Cancion> songs) {
        PlayList playList = new PlayList();
        playList.setName(name);
        playList.setCanciones(songs);
        playLists.add(playList);
    }

    public List<Cancion> findSongsGender(String genero) {
        return biblioteca.getCanciones().stream().filter(it -> it.getGenero().toString().equals(genero)).collect(Collectors.toList());
    }

    public List<Cancion> findSongsYear(int year) {
        return biblioteca.getCanciones().stream().filter(it -> it.getFecha().getYear() == year).collect(Collectors.toList());
    }

    public List<Cancion> orderSongs() {
        return biblioteca.getCanciones().stream().collect(Collectors.toList());
    }
}

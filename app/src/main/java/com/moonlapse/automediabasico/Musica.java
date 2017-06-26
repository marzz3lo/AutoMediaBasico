package com.moonlapse.automediabasico;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by marzzelo on 25/6/2017.
 */

public class Musica {
    @SerializedName("music")
    @Expose
    private List<PistaAudio> musica = null;

    public List<PistaAudio> getMusica() {
        return musica;
    }

    public void setMusic(List<PistaAudio> musica) {
        this.musica = musica;
    }
}

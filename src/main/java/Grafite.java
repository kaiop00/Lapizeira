classe pública Grafite {

    calibre de flutuação privada;
     dureza privada dureza;
    int tamanho privado;

     enum público Dureza {
        G_HB,
        G_2B,
        G_4B,
        G_6B
    }

     grafitepúblico ( calibreflutuante , Dureza dureza, int tamanho) {
        isso. calibre = calibre;
        isso. dureza = dureza;
        setTamanho(tamanho);
    }

    int público  desgastePorFolha() {
        int dureza;
        switch (getDureza(){{
            caso G_HB:
                dureza = 1;
                quebrar;
            caso G_2B:
                dureza = 2;
                quebrar;
            caso G_4B:
                dureza = 4;
                quebrar;
            padrão:
                dureza = 6;
                quebrar;
        }
        dureza retorno;
    }

    público int getTamanho() {
        devolver isso. tamanho;
    }

    vazio público  setTamanho(int tamanho) {
        isso. tamanho = tamanho;
    }
    
    público Dureza getDureza() {
        devolver isso. dureza;
    }

    flutuar público  getCalibre() {
        devolver isso. calibre;
    }
}
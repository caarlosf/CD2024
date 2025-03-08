1. 
    ```

    ```

# Exercicio 1

1. ### Movémonos ó cartafol correspondente
    ```
    cd /home/vagrant/Desktop/CD2024/ud02
    ```

1. ### Creamos o cartafol
    ```
    mkdir ExerciciosGit
    ```

1. ### Movémonos ó interior do cartafol
    ```
    cd ExerciciosGit
    ```

1. ### Crear arquivos `.txt` e `.md`
    ```
    nano carlos.txt
    nano actividades.txt
    nano comandos.md
    ```

1. ### Inicializamos o repositorio dentro do cartafol
    ```
    git init
    ```

1. ### Comezamos a realizar o seguemento dos arquivos por parte e git (o `.` inclue todo o que está dentro do cartafol)
    ```
    git add .
    ```

1. ### Comprobamos o estado dos arquivos
    ```
    git status
    ```

1. ### Facemos o primeiro `commit`, coa opción `-m` indicamos o comentario do `commit`
    ```
    git commit -m "primer commit"
    ```

1. ### Despois de modificar os arquivos facemos o segundo `commit`
    ```
    git add .
    git commit -m "segundo commit"
    ```

1. ### Creamos o novo cartafol
    ```
    mkdir cartafol_ignorado
    ```

1. ### Creamos os novos arquivos
    ```
    touch cartafol_ignorado/1.txt cartafol_ignorado/2.txt cartafol_ignorado/3.txt cartafol_ignorado/4.txt
    ```

1. ### Creamos o arquivo `.gitignore` (pra ignorar arquivos) e engadimmos no interior os arquivos a ignorar
    ```
    nano .gitignore
    ```
    (interior do arquivo)
    ```
    cartafol_ignorado/3.txt
    cartafol_ignorado/4.txt
    ```
1. ### Facemos o terceiro `commit`
    ```
    git add .
    git commit -m "terceiro commit"
    ```

1. ### Facemos un `git log` para comprobar o historial de `commits`, e quedámonos cos primeiros 10 dixitos do `commit` que queiramos restabler
    ```
    git log
    ```

1. ### Realizamos o `checkout` para volver a unha versión anterior dos ficheiros, nel incluimos os 10 primeiros díxitos do `commit` a restablecer
    ```
    git checkout 2cebfc5925
    ```

1. ### Este é o `commit` da finalización do primeiro exercicio
    ```
    git add .
    git commit -m "finalizado o exercicio 01_01_RepositorioLocal"
    ```


# Exercicio 2

1. ### Creamos a estructura de cartafoles e facemos o `git init`
    ```
    mkdir Exercicio2
    cd Exercicio2
    mkdir pagina_web
    cd pagina_web
    git init
    ```

1. ### Saida comando `ls -a` co contido despois do `git init`
    ```
    vagrant@vagrant-virtualbox:~/Desktop/CD2024/ud02/ExerciciosGit/Exercicio2/pagina_web$ ls -a
    .  ..  .git
    ```

1. ### Comprobamos o estado do repositorio con `git status`. O repositorio encontrase actualmente sen commits e non se atopa tampouco arquivos engadidos con `git add` (aínda non hay ningún arquivo creado).
    ```
    git status
    En la rama master

    No hay commits todavía

    no hay nada para confirmar (crea/copia archivos y usa "git add" para hacerles seguimiento)
    ```

1. ### Creamos o ficheiro `index.html` co comando `nano` e engadimos o contido
    ```
    nano index.html
    ```

1. ### Facemos o primeiro `commit`
    ```
    git add .
    git commit -m "Primera página html"
    [master (commit-raíz) 47a5780] Primera página html
    1 file changed, 8 insertions(+)
    create mode 100644 index.html
    ```

1. ### O estado do repositorio é de ter o commit realizado
    ```
    git status
    En la rama master
    nada para hacer commit, el árbol de trabajo está limpio
    ```

1. ### Cambiamos a web con `nano`
    ```
    nano index.html
    ```

1. ### Facemos un `commit -am` (`-a` para incluir automaticamente todos os arquivos modificados que xa son ratreados, e así non temos que facer o `git add` primeiro )
    ```
    git commit -am "Añadidas 3 ciudades que visitar"
    [master a52de54] Añadidas 3 ciudades que visitar
    1 file changed, 7 insertions(+), 2 deletions(-)
    ```

1. ### Mostramos o historial de `commits` con `git log`
    ```
    git log
    commit a52de540802dedd7410c7b2a58e48ec02c9fc8f7 (HEAD -> master)
    Author: Carlos <1999cfo@gmail.com>
    Date:   Wed Nov 20 09:32:04 2024 +0100

    Añadidas 3 ciudades que visitar

    commit 47a57803ad106d63714e8a5ff578be449eae8fd0
    Author: Carlos <1999cfo@gmail.com>
    Date:   Wed Nov 20 09:21:13 2024 +0100

        Primera página html
    ```

1. ### Creamos os novos cartafoles e arquivos para cada cidade a visitar
    ```
    mkdir "Moscu" "Tallin" "Rio de Janeiro"
    nano ./Moscu/index.html
    nano ./Tallin/index.html
    nano ./"Rio de Janeiro"/index.html
    ```

1. ### Facemos un `git add` xa que os novos arquivos aínda non están engadidos e despois facemos o `commit`
    ```
    gitt add .
    git commit -m "Añadida información sobre las ciudades a visitar"
    [master 96cb3ac] Añadida información sobre las ciudades a visitar
    3 files changed, 24 insertions(+)
    create mode 100644 Moscu/index.html
    create mode 100644 Rio de Janeiro/index.html
    create mode 100644 Tallin/index.html
    ```

1. ### Mostramos o `git log`
    ```
    commit 96cb3acb8f735e87c71d098665defd80c32de32d (HEAD -> master)
    Author: Carlos <1999cfo@gmail.com>
    Date:   Wed Nov 20 09:51:53 2024 +0100

        Añadida información sobre las ciudades a visitar

    commit a52de540802dedd7410c7b2a58e48ec02c9fc8f7
    Author: Carlos <1999cfo@gmail.com>
    Date:   Wed Nov 20 09:32:04 2024 +0100

        Añadidas 3 ciudades que visitar

    commit 47a57803ad106d63714e8a5ff578be449eae8fd0
    Author: Carlos <1999cfo@gmail.com>
    Date:   Wed Nov 20 09:21:13 2024 +0100

        Primera página html
    ```


# Exercicio 3

1. ### Creamos o repositorio libro e inicializámolo
    ```
    mkdir libro
    cd libro
    git init
    ```

1. ### Comrobamos o estado con `git status` e danos esta saída
    ```
    En la rama master
    No hay commits todavía
    no hay nada para confirmar (crea/copia archivos y usa "git add" para hacerles seguimiento)
    ```

1. ### Creamos o ficheiro indice.txt co contido
    ```
    nano indice.txt
    ```

1. ### Engadimos o arquivo e facemos o commit
    ```
    git add indice.txt
    git commit -m "Añadido índice del libro"
    ```

1. ### Comrobamos o estado con `git status` e danos esta saída
    ```
    En la rama master
    nada para hacer commit, el árbol de trabajo está limpio
    ```


1. ### Modificamos índice.txt
    ```
    nano indice.txt
    ```


1. ### Facemos o commit cos cambios realizados
    ```
    git commit -m "Añadido 4: La bella y la bestia"

    ```


1. ### Comrobamos o estado con `git status` e danos esta saída
    ```
    En la rama master
    nada para hacer commit, el árbol de trabajo está limpio
    ```


1. ### Mostramos o historial do repositorio con `git log`
    ```
    commit db75f8a638ef4b9dbfe768511aaea0b5e8359cfc (HEAD -> master)
    Author: Carlos <1999cfo@gmail.com>
    Date:   Mon Dec 9 19:34:13 2024 +0100

        Añadido 4: La bella y la bestia

    commit 1df885112d8240afc11277690fc98e3a657657d3
    Author: Carlos <1999cfo@gmail.com>
    Date:   Mon Dec 9 19:29:58 2024 +0100

        Añadido índice del libro
    ```


1. ### Creamos o cartafol capitulos e o arquivo capitulos2.txt
    ```
    mkdir capitulos
    cd capitulos
    nano capitulo2.txt
    ```


1. 
    ```

    ```


1. 
    ```

    ```


1. 
    ```

    ```


1. 
    ```

    ```


1. 
    ```

    ```


1. 
    ```

    ```


1. 
    ```

    ```


1. 
    ```

    ```


1. 
    ```

    ```


1. 
    ```

    ```


1. 
    ```

    ```


1. 
    ```

    ```


1. 
    ```

    ```


1. 
    ```

    ```


1. 
    ```

    ```


1. 
    ```

    ```


1. 
    ```

    ```


1. 
    ```

    ```


1. 
    ```

    ```


1. 
    ```

    ```


1. 
    ```

    ```


1. 
    ```

    ```


1. 
    ```

    ```


1. 
    ```

    ```


1. 
    ```

    ```


1. 
    ```

    ```


1. 
    ```

    ```


1. 
    ```

    ```


1. 
    ```

    ```


1. 
    ```

    ```


1. 
    ```

    ```


1. 
    ```

    ```


1. 
    ```

    ```


1. 
    ```

    ```


1. 
    ```

    ```


1. 
    ```

    ```


1. 
    ```

    ```


1. 
    ```

    ```


1. 
    ```

    ```


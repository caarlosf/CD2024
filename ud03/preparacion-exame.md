1. # Instalar Maven

`sudo apt install maven`

1. # Crear proxecto Maven

## 1ª Opción, comando clase e engadir parámetros, terminal

`mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.5`


* Define value for property 'groupId': 

*identificador único do proxecto*

`com.nome_do_proxecto`

`com.carlosf`


* Define value for property 'artifactId':

*nome do proxecto e do cartafol onde se garda o proxecto*

`nome_do_proxecto`

`carlosf`


* Define value for property 'version' 1.0-SNAPSHOT: 

*define a version do proxecto, 1.9-SNAPSHOT é a pordefecto e indica que a versión está en desenrolo e que pode cambiar*

`enter e selccionamos 1.0-SNAPSHOT por defecto`


* Define value for property 'package' com.carlosf:

*definir o nome do paquete base onde se crean os arquivos, é pra estructurar mellor, por agora deixamolo sen nada, por defecto, e gardase todo en `com.carlosf`*

`enter, por defecto`


* Unha vez introducidos os datos, así quedaría:

*confirmamos con enter e xa temos o proxecto creado*

`enter`

```
Define value for property 'groupId': com.carlosf
Define value for property 'artifactId': carlosf
Define value for property 'version' 1.0-SNAPSHOT: 
Define value for property 'package' com.carlosf: 
Confirm properties configuration:
javaCompilerVersion: 17
junitVersion: 5.11.0
groupId: com.carlosf
artifactId: carlosf
version: 1.0-SNAPSHOT
package: com.carlosf
 Y: 

```



## 2ª Opción, código completo, xa non pide máis datos, terminal

* Instalación "automatizada"

```
mvn archetype:generate \
  -DarchetypeGroupId=org.apache.maven.archetypes \
  -DarchetypeArtifactId=maven-archetype-quickstart \
  -DarchetypeVersion=1.5 \
  -DgroupId=com.carlosf \
  -DartifactId=carlosf \
  -Dversion=1.0-SNAPSHOT \
  -Dpackage=com.carlosf \


  -DinteractiveMode=false 
  (desactiva as preguntas interactivas de Maven no proceso de instalación, en principio non necesaria, xa que lle estamos a dar todos os parámetros)
```
## 3ª Opción, mediante as extension de maven en VS Code, modo gráfico

>Nome da extensión
>>Id da extensión

---

>Maven for Java
>>vscjava.vscode-maven

>Extension Pack for Java
>>vscjava.vscode-java-pack


---
---
---
---
---
---
---
---
---
---
---
---




 # Instalar Docker Engine en Ubuntu (la versión oficial y completa de Docker) en cualquier versión reciente de Ubuntu.
  https://docs.docker.com/engine/install/ubuntu/


1. ## Actualizar el sistema
Primero abre una terminal y actualiza los paquetes existentes para evitar conflictos:

```
sudo apt update
sudo apt upgrade -y
```


2. ## Desinstalar versiones antiguas (si existen)
Si anteriormente instalaste Docker con otro método, asegúrate de eliminar posibles versiones antiguas con:

```
sudo apt remove docker docker-engine docker.io containerd runc
```
(No pasa nada si estos paquetes no están instalados actualmente.)


3. ## Instalar dependencias básicas
Instala los paquetes necesarios que permiten usar repositorios HTTPS:

```
sudo apt install ca-certificates curl gnupg lsb-release -y
```


4. ## Añadir clave GPG oficial de Docker
Para verificar la autenticidad de los paquetes Docker, añade la clave oficial:

```
sudo mkdir -p /etc/apt/keyrings
curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo gpg --dearmor -o /etc/apt/keyrings/docker.gpg
```


5. ## Añadir el repositorio oficial de Docker
Agrega el repositorio oficial de Docker en tus fuentes de paquetes APT:

```
echo \
  "deb [arch=$(dpkg --print-architecture) signed-by=/etc/apt/keyrings/docker.gpg] \
  https://download.docker.com/linux/ubuntu \
  $(. /etc/os-release && echo "$VERSION_CODENAME") stable" | \
  sudo tee /etc/apt/sources.list.d/docker.list > /dev/null
```


6. ## Instalar Docker Engine
Actualiza el índice de paquetes y luego instala Docker Engine junto con otros componentes útiles:

```
sudo apt update
sudo apt install docker-ce docker-ce-cli containerd.io docker-buildx-plugin docker-compose-plugin -y
```

* `docker-ce`: Motor Docker, el componente principal.
* `docker-ce-cli`: Cliente Docker, interfaz de línea de comandos.
* `containerd.io`: Runtime de contenedores.
* `docker-buildx-plugin`: Plugin para construir contenedores multiarquitectura.
* `docker-compose-plugin`: Plugin para usar Docker Compose fácilmente.


7. ## Verificar la instalación
Para comprobar que Docker está correctamente instalado y funcionando, ejecuta:

```
sudo docker run hello-world
```

Esto descargará una imagen de prueba y mostrará un mensaje confirmando que Docker está instalado correctamente.


8. ## (Opcional) Configuración adicional
Por defecto, el comando `docker` debe ejecutarse con privilegios administrativos (usando sudo).
Para ejecutar Docker sin tener que escribir sudo cada vez, añade tu usuario actual al grupo de Docker:

```
sudo usermod -aG docker $USER
newgrp docker
```

Ahora puedes usar Docker sin `sudo`:

```
docker run hello-world
```


---
---
---
# Continuamos con la instalación de los apuntes

1. ### El primer paso es descargar la versión concreta que queremos utilizar del repositorio oficial de docker. Dentro de las distintas alternativas, elegimos la gratuita en su última versión.

```
sudo docker pull sonarqube:lts-community
```

2. ### Una vez tenemos la imagen, podemos crear un contenedor para trabajar sobre él, indicando el nombre (sonar) y el puerto que usaremos para acceder a la aplicación (9000).

```
sudo docker create -i -t -p 9000:9000 --name sonar sonarqube:lts-community
```

3. ### Con el contenedor creado, únicamente hay que arrancarlo para poder empezar a usar SonarQube. Recuerda que deberás hacer esto cada vez que quieras correr el contenedor.

```
sudo docker start --attach -i sonar
```

Se puede parar con Ctrl + C.


---
---
---

Continuar apuntes

---
---
---
---
---
---




git add .

git commit -m " "

git push -u origin main
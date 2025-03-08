1. # Instalar Maven

`sudo apt install maven`

1. # Crear proxecto Maven

## 1ª Opción, comando clase e engadir parámetros, terminal

```
mvn archetype:generate \
  -DarchetypeGroupId=org.apache.maven.archetypes \
  -DarchetypeArtifactId=maven-archetype-quickstart \
  -DarchetypeVersion=1.5 \
  -DgroupId=com.miempresa \
  -DartifactId=mi-proyecto \
  -Dversion=1.0-SNAPSHOT \
  -Dpackage=com.miempresa.app \
  -DinteractiveMode=false

```

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
1. # 


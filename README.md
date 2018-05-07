
Esta aplicacion pretende ofrecer una mayor comodidad al usuario a la hora de utilizar MidiMaker, proporcionando fluidez y facilidad de uso.

En el menu principal se encuentran dos opciones: "Analizar" e "Información"-

La opcion analizar procede a cargar una vista web de la página MidiMaker, utilizando la aplicación como ventana a la misma. La aplicacion lanzará una vista de explorador de archivos para seleccionar la cancion (.mp3, .wav). La página web recogerá este fichero y ejecutara el script correspondiente para traducirlo a .midi. 

El archivo .midi de la traducción se guardara en el directorio /MIDIMaker/ de Android.

Por motivos de rapidez, se intentará desarrollar un metodo que invoque un POST al servidor donde esta alojada la página web. El fichero de audio irá encapsulado en un objeto JSON para su transmision por la red. La aplicacion esperará con un HttpRequest la recepción de este objeto, que sera desserializado y guardado en el directorio /MIDIMaker/ de Android.

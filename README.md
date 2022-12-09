# Poketest

**Desarrollador: Oscar Medina (Oz)**

Test de evaluación

**Requerimientos e indicaciones**

1. Listar al menos los primeros 150 Pokemones del API https://pokeapi.co
2. Consulta de datos online y Offline
3. Posibilidad de búsqueda y vista de detalle
4. Usar patrón de diseño
5. Incluir test
6. Se permiten el uso de librerias
7. Sincronizar con repositorio GIT

---

### Por punto

**1. Listar al menos los primeros 150 Pokemones del API https://pokeapi.co**

Endpoints:
  
- Lista de Pokemones

    https://pokeapi.co/api/v2/pokemon/

- Avatars

    https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/pokemonID.png

    https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/pokemonID.png

    https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/dream-world/pokemonID.svg (vectorial)

    https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-v/black-white/animated/pokemonID.gif (animado)

    https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-i/yellow/gray/1.png (escala de grises solo hasta 150 pokemones)


- Detalle de Pokemon

    https://pokeapi.co/api/v2/pokemon/pokeminID/


**6. Librerías**

- Retrofit (Consumo de API)

    implementation 'com.squareup.retrofit2:retrofit:2.9.0'

- Gson (Formateo de información devuelta por el API)

    implementation 'com.google.code.gson:gson:2.10' (no funciona)
    implementation "com.squareup.retrofit2:converter-gson:2.9.0"

- Para uso de componentes de Material Design

    implementation 'androidx.recyclerview:recyclerview:1.2.1'
    implementation 'androidx.cardview:cardview:1.0.0'

- Para el manejo de hilos
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.6")

- Para mostrar las imágenes

    implementation 'com.github.bumptech.glide:glide:4.14.2'







    

    

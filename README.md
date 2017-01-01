# Recetas API RestFul Play

-	Play Framework con base de datos PostgreSQL
-	Entrada menú AWS :
-	**AWS** http://ec2-35-156-252-132.eu-central-1.compute.amazonaws.com

## Métodos

-	Enlaces para pruebas en local

#### Recetas

CREO LA RECETA PASANDO LOS DATOS EN JSON MEDIANTE BODY (xml/json)
-	**POST** curl -H "Content-Type: application/json" -H "Accept: application/xml" -X POST -d '{"name": "albondigas", "ingredients": [{"name": "tomate"},{"name": "cebolla"},{"name": "pan rallado"}], "tags": [{"name": "proteinas"},{"name": "facil"}]}' http://localhost:9000/recipes

RECETA GUARDADA EN CACHÉ
-	**GET** curl -i -H "Accept: application/xml" -X GET http://localhost:9000/recipecache/1

MUESTRA LA LISTA DE RECETAS (xml/json)
-	**GET**
-	 curl -i -H "Accept: application/json" -X GET http://localhost:9000/recipes

RECETAS POR ID (xml/json)
-	**GET**
-	curl -i -H "Accept: application/xml" -X GET http://localhost:9000/recipe/1

RECETAS POR NOMBRE (xml/json)
-	**GET**
-	curl -i -H "Accept: application/json" -X GET http://localhost:9000/recipe/name/albondigas

ACTUALIZAR RECETAS (xml/json)
-	**PUT**
-	curl -H "Content-Type: application/json" -H "Accept: application/xml" -X PUT -d '{"name": "Rodaballo", "ingredients": [{"name": "m"},{"name": "e"},{"name": "ii"}], "tags": [{"name": "ym"},{"name": "y"}]}' http://localhost:9000/recipe/1

ELIMINAR RECETAS POR ID (xml/json)
-	**DELETE**
-	curl -i -H "Accept: application/json" -X DELETE http://localhost:9000/recipe/1

CREO RECETA PASANDO MEDIANTE FORMFACTORY
-	**POST**
-	curl -i -X POST http://localhost:9000/recipesF\?name\=pan\&portions\=4

#### Ingredientes

CREO INGREDIENTE PASANDO MEDIANTE FORMFACTORY
-	**POST**
-	curl -i -X POST http://localhost:9000/ingredients\?name\=harina\&quantity\=450

RELACION MANUAL ManyToMany RECETAS_INGREDIENTES
- **PUT**
-	curl -i -H "Accept: application/xml" -X PUT http://localhost:9000/ingredients/1/recipe/1

MUESTRA LA LISTA DE INGREDIENTES (xml/json)
-	**GET**
-	curl -i -X GET http://localhost:9000/ingredients

#### Tags

RECETAS POR TAG (xml/json)
-	**GET**
-	curl -i -H "Accept: application/xml" -X GET http://localhost:9000/recipe/tag/facil


#### Tasks

RELACION MANUAL ManyToMany RECETAS_INGREDIENTES
-	**POST**
-	curl -i -H "Accept: application/xml" -X PUT http://localhost:9000/ingredients/1/recipe/1

RELACION MANUAL OneToMany RECETA_TASKS
-	**POST**
-	curl -i -H "Accept: application/xml" -X POST http://localhost:9000/1/task\?description\=bbbb

RELACION MANUAL OneToMany INGREDIENTE_TASKS
-	**POST**
-	curl -i -H "Accept: application/xml" -X POST http://localhost:9000/ingredients/1/task/1




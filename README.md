# Recetas API RestFul Play

-	Play Framework con base de datos PostgreSQL

## Métodos

#### Recetas

CREO LA RECETA PASANDO LOS DATOS EN JSON MEDIANTE BODY (xml/json)
-	**POST** curl -H "Content-Type: application/json" -H "Accept: application/xml" -X POST -d '{"name": "albondigas", "ingredients": [{"name": "tomate"},{"name": "cebolla"},{"name": "pan rallado"}], "tags": [{"name": "proteinas"},{"name": "facil"}]}' http://ec2-35-156-252-132.eu-central-1.compute.amazonaws.com/recipes

RECETA GUARDADA EN CACHÉ
-	**GET** curl -i -H "Accept: application/xml" -X GET http://ec2-35-156-252-132.eu-central-1.compute.amazonaws.com/recipecache/1

MUESTRA LA LISTA DE RECETAS (xml/json)
-	**GET** curl -i -H "Accept: application/json" -X GET http://ec2-35-156-252-132.eu-central-1.compute.amazonaws.com/recipes

RECETAS POR ID (xml/json)
-	**GET**curl -i -H "Accept: application/xml" -X GET http://ec2-35-156-252-132.eu-central-1.compute.amazonaws.com/recipe/1

RECETAS POR NOMBRE (xml/json)
-	**GET**curl -i -H "Accept: application/json" -X GET http://ec2-35-156-252-132.eu-central-1.compute.amazonaws.com/recipe/name/albondigas

ACTUALIZAR RECETAS (xml/json)
-	**PUT**curl -H "Content-Type: application/json" -H "Accept: application/xml" -X PUT -d '{"name": "Rodaballo", "ingredients": [{"name": "m"},{"name": "e"},{"name": "ii"}], "tags": [{"name": "ym"},{"name": "y"}]}' http://ec2-35-156-252-132.eu-central-1.compute.amazonaws.com/recipe/1

ELIMINAR RECETAS POR ID (xml/json)
-	**DELETE**curl -i -H "Accept: application/json" -X DELETE http://ec2-35-156-252-132.eu-central-1.compute.amazonaws.com/recipe/1

CREO RECETA PASANDO MEDIANTE FORMFACTORY
-	**POST**curl -i -X POST http://ec2-35-156-252-132.eu-central-1.compute.amazonaws.com/recipesF\?name\=pan\&portions\=4

#### Ingredientes

CREO INGREDIENTE PASANDO MEDIANTE FORMFACTORY
-	**POST**curl -i -X POST http://ec2-35-156-252-132.eu-central-1.compute.amazonaws.com/ingredients\?name\=harina\&quantity\=450

RELACION MANUAL ManyToMany RECETAS_INGREDIENTES
- **PUT**curl -i -H "Accept: application/xml" -X PUT http://ec2-35-156-252-132.eu-central-1.compute.amazonaws.com/ingredients/1/recipe/1

MUESTRA LA LISTA DE INGREDIENTES (xml/json)
-	**GET**curl -i -X GET http://ec2-35-156-252-132.eu-central-1.compute.amazonaws.com/ingredients

#### Tags

RECETAS POR TAG (xml/json)
-	**GET**curl -i -H "Accept: application/xml" -X GET http://ec2-35-156-252-132.eu-central-1.compute.amazonaws.com/recipe/tag/facil


#### Tasks

RELACION MANUAL ManyToMany RECETAS_INGREDIENTES
-	**POST**"Accept: application/xml" -X PUT http://ec2-35-156-252-132.eu-central-1.compute.amazonaws.com/ingredients/1/recipe/1

RELACION MANUAL OneToMany RECETA_TASKS
-	**POST**curl -i -H "Accept: application/xml" -X POST http://ec2-35-156-252-132.eu-central-1.compute.amazonaws.com/recipes/1/task\?description\=bbbb

RELACION MANUAL OneToMany INGREDIENTE_TASKS
-	**POST**curl -i -H "Accept: application/xml" -X POST http://ec2-35-156-252-132.eu-central-1.compute.amazonaws.com/ingredients/1/task/1




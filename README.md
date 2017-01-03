# Recetas API RestFul Play

-	Play Framework con base de datos PostgreSQL
-	Entrada menú AWS :
-	**AWS** http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com

## Métodos

-	Enlaces para pruebas en local

#### Recetas

MUESTRA LA LISTA DE RECETAS (xml/json)

-	**GET**
-	curl -H "Content-Type: application/json" -H "Accept: application/xml" -X GET  http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/recipes

<recipes>
	<recipe id="1">
		<name>ALBONDIGAS</name>
		<portions>4</portions>
		<createdAt>2017-01-02 23:39:43.414</createdAt>
	</recipe>

	<recipe id="33">
		<name>PAN</name>
		<portions>4</portions>
		<createdAt>2017-01-02 23:52:34.245</createdAt>
	</recipe>
</recipes>

<recipes>
    <recipe id="1">
        <name>ALBONDIGAS</name>
        <portions>4</portions>
        <createdAt>2017-01-02 23:39:43.414</createdAt>

        <ingredients>
            <ingredient id="1">
                <name>tomate</name>
                <quantity></quantity>
            </ingredient>
            <ingredient id="2">
                <name>cebolla</name>
                <quantity></quantity>
            </ingredient>
            <ingredient id="3">
                <name>pan</name>
                <quantity></quantity>
            </ingredient>
        </ingredients>
        
        <tags>
            <tag>
                <name>proteinas</name>
            </tag>
            <tag>
                <name>facil</name>
            </tag>
        </tags>
        
    </recipe>
    
    <recipe id="33">
        <name>PAN</name>
        <portions>4</portions>
        <createdAt>2017-01-02 23:52:34.245</createdAt>
        
        <ingredients>
            <ingredient id="33">
                <name>tomate</name>
                <quantity></quantity>
            </ingredient>
            <ingredient id="34">
                <name>cebolla</name>
                <quantity></quantity>
            </ingredient>
            <ingredient id="35">
                <name>pan</name>
                <quantity></quantity>
            </ingredient>
        </ingredients>
        
        <tags>
            <tag>
                <name>prot</name>
            </tag>
            <tag>
                <name>fa</name>
            </tag>
        </tags> 
    </recipe>
    
</recipes>

-	**GET**
-	curl -H "Content-Type: application/json" -H "Accept: application/json" -X GET  http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/recipes
-	[{"id":1,"name":"ALBONDIGAS","portions":4,"date":"2017-01-02 23:39:43.414"},{"id":33,"name":"PAN","portions":4,"date":"2017-01-02 23:52:34.245"}]




CREO LA RECETA PASANDO LOS DATOS EN JSON MEDIANTE BODY (xml/json)

-	**POST**
-	curl -H "Content-Type: application/json" -H "Accept: application/xml" -X POST -d '{"name": "pan","portions":"4","ingredients":[{"name":"tomate","quantity":"2"},{"name":"cebolla","quantity":"2"},{"name":"pa","quantity":"2"}],"tags":[{"name":"pro"},{"name":"facil"}]}' http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/recipesJ

<recipe id="41">

	<name>PAN</name>
	<portions>4</portions>
	<createdAt>2017-01-02 23:58:59.386</createdAt>
	
	<ingredients>
        <ingredient id="41">
            <name>tomate</name>
            <quantity>2</quantity>
        </ingredient>
        <ingredient id="42">
            <name>cebolla</name>
            <quantity>2</quantity>
        </ingredient>
        <ingredient id="43">
            <name>pa</name>
            <quantity>2</quantity>
        </ingredient>
	</ingredients>
	
	<tags>
        <tag>
            <name>pro</name>
        </tag>
        <tag>
            <name>facil</name>
        </tag>
	</tags>
	
</recipe>

-	**POST** 
-	curl -H "Content-Type: application/json" -H "Accept: application/json" -X POST -d '{"name": "pan","portions":"4","ingredients":[{"name":"tomate","quantity":"2"},{"name":"cebolla","quantity":"2"},{"name":"pa","quantity":"2"}],"tags":[{"name":"pro"},{"name":"facil"}]}' http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/recipesJ
-	{"id":42,"name":"PAN","portions":"4","date":"2017-01-03 00:12:34.294"}



RECETA GUARDADA EN CACHÉ

-	**GET** 
-	curl -i -H "Accept: application/xml" -X GET http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/recipe_cache/41

<recipe id="41">

	<name>PAN</name>
	<portions>4</portions>
	<createdAt>2017-01-02 23:58:59.386</createdAt>
	
	<ingredients>
        <ingredient id="41">
            <name>tomate</name>
            <quantity>2</quantity>
        </ingredient>
        <ingredient id="42">
            <name>cebolla</name>
            <quantity>2</quantity>
        </ingredient>
        <ingredient id="43">
            <name>pa</name>
            <quantity>2</quantity>
        </ingredient>
	</ingredients>

	<tags>
        <tag>
            <name>pro</name>
        </tag>
        <tag>
            <name>facil</name>
        </tag>
	</tags>
	
</recipe>

-	**GET** 
-	curl -i -H "Accept: application/json" -X GET http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/recipe_cache/41
-	{"id":41,"name":"PAN","portions":"4","date":"2017-01-02 23:58:59.386"}



RECETAS POR ID (xml/json)

-	**GET**
-	curl -i -H "Accept: application/xml" -X GET http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/recipe/41

 <recipe id="41">
 
	<name>PAN</name>
	<portions>4</portions>
	<createdAt>2017-01-02 23:58:59.386</createdAt>
	
	<ingredients>
        <ingredient id="41">
            <name>tomate</name>
            <quantity>2</quantity>
        </ingredient>
        <ingredient id="42">
            <name>cebolla</name>
            <quantity>2</quantity>
        </ingredient>
        <ingredient id="43">
            <name>pa</name>
            <quantity>2</quantity>
        </ingredient>
	</ingredients>

	<tags>
        <tag>
            <name>pro</name>
        </tag>
        <tag>
            <name>facil</name>
        </tag>
	</tags>
	
</recipe>

-	**GET**
-	curl -i -H "Accept: application/xml" -X GET http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/recipe/41
-	{"id":41,"name":"PAN","portions":"4","date":"2017-01-02 23:58:59.386"}




RECETAS POR NOMBRE (xml/json)

-	**GET**
-	curl -i -H "Accept: application/xml" -X GET http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/recipe/name/pan

<recipe id="41">

	<name>PAN</name>
	<portions>4</portions>
	<createdAt>2017-01-02 23:58:59.386</createdAt>
	
	<ingredients>
        <ingredient id="41">
            <name>tomate</name>
            <quantity>2</quantity>
        </ingredient>
        <ingredient id="42">
            <name>cebolla</name>
            <quantity>2</quantity>
        </ingredient>
        <ingredient id="43">
            <name>pa</name>
            <quantity>2</quantity>
        </ingredient>
	</ingredients>

	<tags>
        <tag>
            <name>pro</name>
        </tag>
        <tag>
            <name>facil</name>
        </tag>
	</tags>
	
</recipe>

-	**GET**
-	curl -i -H "Accept: application/json" -X GET http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/recipe/name/pan
-	[{"id":41,"name":"PAN","portions":"4","date":"2017-01-02 23:58:59.386"}]



ACTUALIZAR RECETAS (xml/json)

-	**PUT**
-	curl -H "Content-Type: application/json" -H "Accept: application/xml" -X PUT -d '{"name": "Rodaballo","portions":"5", "ingredients": [{"name": "ajos","quantity":"2"},{"name": "cebolla","quantity":"2"},{"name": "tomates","quantity":"2"}], "tags": [{"name": "facil"},{"name": "proteinas"}]}' http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/recipe/41

<recipe id="41">
	<portions>5</portions>
	<name>rodaballo</name>
	<createdAt>2017-01-02 23:58:59.386</createdAt>

	<ingredients>
        <ingredient id="68">
            <name>ajos</name>
            <quantity>2</quantity>
        </ingredient>
        <ingredient id="2">
            <name>cebolla</name>
            <quantity>2</quantity>
        </ingredient>
        <ingredient id="69">
            <name>tomates</name>
            <quantity>2</quantity>
        </ingredient>
	</ingredients>

	<tags>
        <tag>
            <name>facil</name>
        </tag>
        <tag>
            <name>proteinas</name>
        </tag>
	</tags>

</recipe>

-	**PUT**
-	curl -H "Content-Type: application/json" -H "Accept: application/json" -X PUT -d '{"name": "Rodaballo","portions":"5", "ingredients": [{"name": "ajos","quantity":"2"},{"name": "cebolla","quantity":"2"},{"name": "tomates","quantity":"2"}], "tags": [{"name": "facil"},{"name": "proteinas"}]}' http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/recipe/41
-	{"id":41,"name":"rodaballo","portions":"5","date":"2017-01-02 23:58:59.386"}



ELIMINAR RECETAS POR ID (xml/json)

-	**DELETE**
-	curl -i -H "Accept: application/json" -X DELETE http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/recipe/1
-	[{"id":41,"name":"rodaballo","portions":"5","date":"2017-01-02 23:58:59.386"},{"id":42,"name":"PAN","portions":"4","date":"2017-01-03 00:12:34.294"}]



CREO RECETA PASANDO MEDIANTE FORMFACTORY

-	**POST**
-	curl -i -X POST http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/recipesF\?name\=Fabada\&portions\=8
-	{"id":65,"name":"Fabada","portions":"8","ingredients":[],"tags":[],"tasks":[],"dateCreation":"2017-01-03 00:52:43.301"}



#### Tags

RECETAS POR TAG (xml/json)

-	**GET**
-	curl -i -H "Accept: application/xml" -X GET http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/recipe/tag/facil

<recipes>

	<recipe id="41">
		<name>rodaballo</name>
		<portions>5</portions>
		<createdAt>2017-01-02 23:58:59.386</createdAt>
	</recipe>

</recipes>

<recipes>

    <recipe id="41">
        <name>rodaballo</name>
        <portions>5</portions>
        <createdAt>2017-01-02 23:58:59.386</createdAt>

        <ingredients>
            <ingredient id="2">
                <name>cebolla</name>
                <quantity>2</quantity>
            </ingredient>
            <ingredient id="68">
                <name>ajos</name>
                <quantity>2</quantity>
            </ingredient>
            <ingredient id="69">
                <name>tomates</name>
                <quantity>2</quantity>
            </ingredient>
        </ingredients>

        <tags>
            <tag>
                <name>proteinas</name>
            </tag>
            <tag>
                <name>facil</name>
            </tag>
        </tags>
    </recipe>

</recipes

-	**GET**
-	curl -i -H "Accept: application/json" -X GET http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/recipe/tag/facil
-	[{"id":41,"name":"rodaballo","portions":"5","date":"2017-01-02 23:58:59.386"}]




#### Ingredientes

CREO INGREDIENTE PASANDO MEDIANTE FORMFACTORY

-	**POST**
-	curl -i -X POST http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/ingredients\?name\=harina\&quantity\=450
-	{"id":70,"name":"harina","quantity":"450"}



RELACION MANUAL ManyToMany RECETAS_INGREDIENTES

- **PUT**
-	curl -i -H "Accept: application/xml" -X PUT http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/ingredients/ingredients/65/recipe/70



MUESTRA LA LISTA DE INGREDIENTES (xml/json)

-	**GET**
-	curl -i -X GET http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/ingredients
-	[{"id":41,"name":"tomate","quantity":"2"},{"id":42,"name":"cebolla","quantity":"2"},{"id":43,"name":"pa","quantity":"2"},{"id":44,"name":"tomate","quantity":"2"},{"id":45,"name":"cebolla","quantity":"2"},{"id":46,"name":"pa","quantity":"2"},{"id":70,"name":"harina","quantity":"450"}]



#### Tasks

RELACION MANUAL OneToMany RECETA_TASKS

-	**POST**
-	curl -i -H "Accept: application/xml" -X POST http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/recipes/70/task\description\=otra



RELACION MANUAL OneToMany INGREDIENTE_TASKS

-	**POST**
-	curl -i -H "Accept: application/xml" -X POST http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/ingredients/65/task/1




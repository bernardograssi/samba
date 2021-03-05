# Question 4 
This is a simple Java Web App using Spring framework and Maven dependencies capable of handling GET and POST requests. The application receives, stores, and searches for medias.

Download the file, unzip it, open and run it in an IDE, i.e. [Intellij IDEA](https://www.jetbrains.com/idea/download/#section=windows).
Explore the API requests using [Postman](https://getpostman.com).

# Requests

## Add a new media
In Postman, create a POST request and enter the following URL:
```
localhost:8080/medias
```
Select **Body**, then select **raw**, and **JSON** as the file type.
Input the media data in the following way:
```
{
  "id": "*insert id here*",
  "name": "*insert name here*",
  "url": "*insert url here*",
  "duration": "*insert duration here*"
}
```
## Get a list of all medias
Create a GET request under the following URL:
```
localhost:8080/medias
```
The response must be something similar to:
 ```
 {
	"id": 1939,
	"name": "Turing",
	"url": "https://turing.org.uk",
	"duration": 3759721
 }
 ,
  {
	"id": 256,
	"name": "Merrimack",
	"url": "https://merrimack.edu",
	"duration": 65536
}
 ```

## Get a specific media by id
Create a GET request using the following URL, where the "id" should be the numerical id of the media you are looking for:
```
localhost:8080/medias/id
```
The expected response is:
The response must be something similar to:
 ```
 {
	"id": id,
	"name": "media name",
	"url": "media url",
	"duration": media duration
 }
```

## To run the collection
Download the zipped file, import the Postman collection JSON file into Postman and try the requests.

## Notes
- Id and duration are integers, name and url are strings.
- GET might only work after an item is created with a POST.
- If there are any questions, please feel free to contact me at [santosbe@merrimack.edu](mailto:santosbe@merrimack.edu).

## Built With

* [Spring Framework](https://spring.io/projects/spring-framework) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management

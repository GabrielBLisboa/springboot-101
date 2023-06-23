Projects created with https://start.spring.io/ <br>
Framework: Maven + Java + Spring Boot <br>
Dependencies: H2 Database + Spring Data JPA + SpringWeb <br>

Both <b> jparepository </b> and <b> userdept </b> have the same main purpose: to connect the Java program with records in a SQL database. The database was populated with a import.sql file. 

The Spring framework provides us with Annotations that save us a lot of time used to inform the objects relation to the database, like:<br>
@Id - mark the variable that contains the primary key<br>
@Generated Value - indicates that the id values will be automatically generated as a new object is created<br>
@ManyToOne - indicates that that this entity can have only a single relation to the entity below<br>
@JoinColumn - marks the value as the foreign key used to connect two tables<br>
@Autowired - eliminates the necessity of instantiate objects by using internal constructors <br>
@GetMapping - create a HTTP GET method (which could be POST, PUT or DELETE, for example)<br>

Plus the <b> jparepository </b> project show us that Spring JPA have a feature that eliminates the need to write your own SQL string if you use supported keywords inside methods names (https://docs.spring.io/spring-data/jpa/docs/1.5.0.RELEASE/reference/html/jpa.repositories.html) 

Both projects were created by @devsuperior as exercises and examples for Spring Boot lessons

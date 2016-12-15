package models;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.Valid;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.JsonIgnore;

import play.data.validation.Constraints.Required;

@Entity
public class Receta extends Model {
	@Id
	private Long id;
	
	//@Valid
	@Required
	private String nombre;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "ingrediente")
    private Set<RecIngre> recIngrediente = new HashSet<RecIngre>();

	
	
	private static final Find<Long, Receta> find = new Find<Long, Receta>() {
	};
	
	/*
	User user = new User();
	Service service = new Service();
	UserService userService = new UserService();

	user.addUserService(userService);
	userService.setUser(user);

	service.addUserService(userService);
	userService.setService(service);

	session.save(user);
	session.save(service);
	session.save(userService);
	*/

}

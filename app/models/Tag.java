package models;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.JsonIgnore;

import play.data.validation.Constraints.Required;

@Entity
public class Tag extends Model{
	@Id
	private Long id;
	
	@Required
	@JsonIgnore
	private String name;
    
	@ManyToMany(mappedBy = "tags")
	@JsonIgnore
    public Set<Receta> recetas;
	
	private static final Find<Long,Tag> find =new Find<Long,Tag>(){};
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
	//GESTIÓN TAGS
	public void addReceta(Receta receta){
		this.recetas.add(receta);
	}

	public static List<Tag> getByName(String tagName){
		 return find.where().eq("name",tagName ).findList(); 
	}
	
	@Override
	public String toString() {
		return "Tag [name=" + name + "]";
	}	
 
}

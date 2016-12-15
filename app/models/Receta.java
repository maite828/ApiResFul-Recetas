package models;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.JsonNode;

import play.data.validation.Constraints.Required;
import play.libs.Json;
import models.RecIngre;
import models.Tag;

@Entity
public class Receta extends Model {
	@Id
	private Long id;

	// @Valid
	@Required
	private String name;

	@Required
	private Date createdAt;

	@JsonIgnore
	@OneToMany(mappedBy = "receta")
	private Set<RecIngre> recIngrediente = new HashSet<RecIngre>();

	@ManyToMany(cascade = CascadeType.PERSIST)
	private Set<Tag> tags;

	private Receta(String name) {
		this.tags = new TreeSet<Tag>();
		this.name = name;
		this.createdAt = new Date();
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Receta tagItWith(String name) {
		this.tags.add(Tag.findOrCreateByName(name));
		return this;
	}

	public static FetchType findTaggedWith(String tag) {
		return Receta.find("select distinct p from Receta p join p.tags as t where t.name = ?", tag).fetch();
	}

	private static ManyToMany find(String string, String tag) {
		// TODO Auto-generated method stub
		return null;
	}

	private static final Find<Long, Receta> find = new Find<Long, Receta>() {
	};

	public static Receta findById(Long id) {
		return find.byId(id);
	}

	public static List<Receta> findByNickname(String nickname) {
		return find.where().eq("nickname", nickname).findList();
	}

	public static List<Receta> findPage(Integer page, Integer count) {
		return find.setFirstRow(page * count).setMaxRows(count).findList();
	}

	public JsonNode toJson() {
		return Json.toJson(this);
	}

}

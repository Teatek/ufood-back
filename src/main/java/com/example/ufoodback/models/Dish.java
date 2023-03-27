package com.example.ufoodback.models;

import java.util.List;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Dish{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	@Lob @Basic(fetch=FetchType.LAZY)
	@Column(columnDefinition="BLOB NOT NULL")
	private byte[] picture;

	private String description;

	private int score;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "category_id")
	private Category category;

	private String recipeInstruction;

	@OneToMany
	private List<Tag> tags;

	@OneToMany(mappedBy = "dish")
	private List<RecipeIngredients> recipesIngredients;

	public Dish(String name, byte[] picture, String description, int score, Category category, List<Tag> tags,
			String recipeInstruction, List<RecipeIngredients> recipesIngredients) {
		this.name = name;
		this.picture = picture;
		this.description = description;
		this.score = score;
		this.category = category;
		this.tags = tags;
		this.recipeInstruction = recipeInstruction;
		this.recipesIngredients = recipesIngredients;
	}

	public Dish() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public String getRecipeInstruction() {
		return recipeInstruction;
	}

	public void setRecipeInstruction(String recipeInstruction) {
		this.recipeInstruction = recipeInstruction;
	}

	public List<RecipeIngredients> getRecipesIngredients() {
		return recipesIngredients;
	}

	public void setRecipesIngredients(List<RecipeIngredients> recipesIngredients) {
		this.recipesIngredients = recipesIngredients;
	}
}

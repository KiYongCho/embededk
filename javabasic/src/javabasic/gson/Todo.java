package javabasic.gson;

public class Todo {
	
	private String userId;
	private String id;
	private String title;
	private Boolean completed;
	
	public Todo() {
	}

	public Todo(String userId, String id, String title, Boolean completed) {
		this.userId = userId;
		this.id = id;
		this.title = title;
		this.completed = completed;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Boolean getCompleted() {
		return completed;
	}

	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}

	@Override
	public String toString() {
		return "Todo [userId=" + userId + ", id=" + id + ", title=" + title + ", completed=" + completed + "]";
	}
	
}

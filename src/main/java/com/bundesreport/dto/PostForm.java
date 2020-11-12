package com.bundesreport.dto;

import java.time.LocalDateTime;

import com.bundesreport.domain.Post;
import com.bundesreport.domain.User;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostForm {
	private Long id;
	private String title;
	private String content;
	private int category;
	private LocalDateTime createdDate;
	private boolean deleted;
	private User user;

	public Post toEntity() {
		return Post.builder().id(id).title(title).content(content).category(category).deleted(deleted).user(user)
				.build();
	}
	
	@Builder
	/*public PostForm(Long id, String title, String content, int category, LocalDateTime createdDate, boolean deleted, User user) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.category = category;
		this.createdDate = createdDate;
		this.deleted = deleted;
		this.user = user;
	}*/
	public PostForm(User user) {
		this.user = user;
	}
}

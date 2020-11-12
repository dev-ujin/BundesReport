package com.bundesreport.service;


import java.util.List;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bundesreport.domain.Post;
import com.bundesreport.domain.User;
import com.bundesreport.dto.PostForm;
import com.bundesreport.repository.PostRepository;
import com.bundesreport.repository.UserRepository;
import com.bundesreport.type.CategoryType;

import lombok.RequiredArgsConstructor;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class PostService {
	
	private final PostRepository postRepository;
	private final UserService userService;
	
	/**글 조회*/
	public Post findPost(Long postId) {
		return postRepository.findOne(postId);
	}
	
	public List<Post> findPosts() {
		return postRepository.findAll();
	}
	
	public List<Post> findPostsByCategory(CategoryType categoryType) {
		return postRepository.findByCategory(categoryType);
	}
	
	@Transactional
	public Long createPost(PostForm postForm) {
		//postForm.setUser(user);
		Post post = postForm.toEntity();
		postRepository.save(post);
		return post.getId();
	}
	
}

package com.tweetapp.dto;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Prince Kumar
 */
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Comment {

	private String username;
	private String comment;

}

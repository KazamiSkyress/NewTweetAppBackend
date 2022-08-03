package com.tweetapp.dto;

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
public class NewPassword {
	private String newPassword;
	private String contact;

}

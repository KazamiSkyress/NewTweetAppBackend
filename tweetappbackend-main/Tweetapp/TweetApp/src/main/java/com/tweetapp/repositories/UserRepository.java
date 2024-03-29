package com.tweetapp.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tweetapp.entities.UserModel;

/**
 * Persistance Layer for UserModel
 * @author Prince Kumar
 */
@Repository
public interface UserRepository extends MongoRepository<UserModel, String> {

	/**
	 * @return userModel for respective username
	 * */
	UserModel findByUsername(String username);

}

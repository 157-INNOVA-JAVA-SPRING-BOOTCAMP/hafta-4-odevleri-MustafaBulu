package com.mustafabulu.repository;

import com.mustafabulu.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

//UserEntity için oluşturulmuş repository
public interface IUserRepository extends CrudRepository<UserEntity,Long> {
}

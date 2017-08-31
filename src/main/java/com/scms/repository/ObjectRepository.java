package com.scms.repository;

/**
 * Created by xieding001 on 2017/8/30.
 */

import com.scms.model.Channel;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ObjectRepository extends CrudRepository<Channel, Long> {

}

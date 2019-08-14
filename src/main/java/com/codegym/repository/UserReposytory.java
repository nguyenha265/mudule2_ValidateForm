package com.codegym.repository;

import com.codegym.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserReposytory extends PagingAndSortingRepository<User,Long> {
}

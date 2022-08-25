package com.mightyjava.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mightyjava.domain.Book;

@RepositoryRestResource(collectionResourceRel = "book", path = "book")

// define interface and methods

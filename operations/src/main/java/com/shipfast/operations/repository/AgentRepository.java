package com.shipfast.operations.repository;

import com.shipfast.operations.entity.AgentProfile;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AgentRepository extends MongoRepository<AgentProfile, String> {
}

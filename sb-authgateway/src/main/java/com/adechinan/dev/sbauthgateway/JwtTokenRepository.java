package com.adechinan.dev.sbauthgateway;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JwtTokenRepository extends MongoRepository<JwtToken,String> {
}

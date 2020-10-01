package mbanana.mb.repo;


import mbanana.mb.model.TokenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenEntityRepo extends JpaRepository <TokenEntity, Long> {

    TokenEntity findByTokenValue(String tokenValue);
}

package tk.bghgu.apigateway.protocol;

import org.springframework.data.jpa.repository.JpaRepository;
import tk.bghgu.apigateway.model.Contents;

/**
 * Created by ds on 2018-06-09.
 */
public interface TestRepository extends JpaRepository<Contents, String> {

}

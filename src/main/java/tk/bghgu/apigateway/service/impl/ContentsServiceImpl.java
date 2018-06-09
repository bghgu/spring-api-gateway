package tk.bghgu.apigateway.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.bghgu.apigateway.model.Contents;
import tk.bghgu.apigateway.model.Routing;
import tk.bghgu.apigateway.protocol.ContentsHttpProtocol;
import tk.bghgu.apigateway.protocol.ContentsTcpProtocol;
import tk.bghgu.apigateway.protocol.TestRepository;
import tk.bghgu.apigateway.service.ContentsService;

/**
 * Created by ds on 2018-06-05.
 */

/**
 * 라우팅
 * 각 액션 메소드 별로 라우팅은 별개
 */

@Slf4j
@Service
public class ContentsServiceImpl implements ContentsService {

    @Autowired
    private ContentsHttpProtocol contentsHttpProtocol;

    @Autowired
    private ContentsTcpProtocol contentsTcpProtocol;

    @Autowired
    private TestRepository testRepository;

    @Override
    public void getContentsByContentId(final String content_id) {
        // HTTP
        // 127.0.0.1:8080/contents/{content_id}
        // GET
        Routing Routing = new Routing("127.0.0.1", 8080, "/contents");
        contentsHttpProtocol.findAll();
    }

    @Override
    public void getContentsByUserId(final String user_id) {
        // TCP
        // 127.0.0.1:5000
        // GET
        Routing Routing = new Routing("127.0.0.1", 5000);
        contentsTcpProtocol.findAll();
    }

    @Override
    public void postContents(final Contents contents) {
        log.info("postContents");
        log.info(contents.getUser_id());
    }

    @Override
    public void putContentsByContentId(final Contents contents, final String content_id) {
        log.info("putContentsByContentId");
        log.info(content_id);
        log.info(contents.getUser_id());
    }

    @Override
    public void deleteContentsByContentId(final String content_id) {
        log.info("deleteContentsByContentId");
        log.info(content_id);
    }
}

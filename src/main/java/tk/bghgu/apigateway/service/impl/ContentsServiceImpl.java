package tk.bghgu.apigateway.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tk.bghgu.apigateway.model.Contents;
import tk.bghgu.apigateway.model.routing;
import tk.bghgu.apigateway.service.ContentsService;
import tk.bghgu.apigateway.utils.URI;

import static tk.bghgu.apigateway.model.Method.GET;
import static tk.bghgu.apigateway.model.Protocol.HTTP;
import static tk.bghgu.apigateway.model.Protocol.TCP;

/**
 * Created by ds on 2018-06-05.
 */

/**
 * 라우팅
 */

@Slf4j
@Service
public class ContentsServiceImpl implements ContentsService {

    @Override
    public void getContentsByContentId(final String content_id) {
        // HTTP
        // 127.0.0.1:8080/contents/{content_id}
        // GET
        routing routing = new routing("127.0.0.1", 8080, "/contents", HTTP, GET);
    }

    @Override
    public void getContentsByUserId(final String user_id) {
        // TCP
        // 127.0.0.1:5000
        // GET
        routing routing = new routing("127.0.0.1", 5000, TCP, GET);
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

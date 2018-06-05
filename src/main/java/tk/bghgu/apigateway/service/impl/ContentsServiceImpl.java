package tk.bghgu.apigateway.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.bghgu.apigateway.model.Contents;
import tk.bghgu.apigateway.protocol.HttpProtocol;
import tk.bghgu.apigateway.service.ContentsService;
import tk.bghgu.apigateway.utils.URI;

/**
 * Created by ds on 2018-06-05.
 */

@Slf4j
@Service
public class ContentsServiceImpl implements ContentsService {

    @Autowired
    private HttpProtocol httpProtocol;

    @Override
    public void getContentsByContentId(final String content_id) {
        log.info("getContentsByContentId");
        log.info(content_id);
        String uri = URI.HTTP + URI.CONTENTS_BASE_URL + ":" + URI.BASE_PORT + "/contents" + "/" + content_id;
        System.out.println(uri);
        //httpProtocol.get(url.toString());
    }

    @Override
    public void getContentsByUserId(final String user_id) {
        log.info("getContentsByUserId");
        log.info(user_id);
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

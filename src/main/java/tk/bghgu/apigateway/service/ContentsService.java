package tk.bghgu.apigateway.service;

import tk.bghgu.apigateway.model.Contents;

/**
 * Created by ds on 2018-06-05.
 */
public interface ContentsService {
    void getContentsByContentId(final String content_id);
    void getContentsByUserId(final String user_id);
    void postContents(final Contents contents);
    void putContentsByContentId(final Contents contents, final String content_id);
    void deleteContentsByContentId(final String content_id);
}

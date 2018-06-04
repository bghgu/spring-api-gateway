package tk.bghgu.apigateway.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tk.bghgu.apigateway.model.Contents;

/**
 * Created by ds on 2018-06-05.
 */

@Slf4j
@RestController
public class ContentsController {

    @GetMapping("contents/{content_id}")
    public ResponseEntity getContentsByContentId(@PathVariable final String content_id) {
        log.info(content_id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("users/{user_id}/contents")
    public ResponseEntity getContentsByUserId(
            @PathVariable final String user_id,
            @RequestParam(defaultValue = "1") final String offset,
            @RequestParam(defaultValue = "15") final String limit,
            @RequestParam(defaultValue = "asc") final String order
    ) {
        log.info(offset);
        log.info(limit);
        log.info(order);
        log.info(user_id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("contents")
    public ResponseEntity postContents(final Contents contents) {
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping("contents/{content_id}")
    public ResponseEntity putContentsByContentId(
            @PathVariable final String content_id,
            final Contents contents
    ) {
        log.info(content_id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping("contents/{content_id}")
    public ResponseEntity deleteContentsByContentId(@PathVariable final String content_id) {
        log.info(content_id);
        return new ResponseEntity(HttpStatus.OK);
    }

}

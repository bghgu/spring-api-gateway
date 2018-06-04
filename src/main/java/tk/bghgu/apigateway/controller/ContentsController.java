package tk.bghgu.apigateway.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ds on 2018-06-05.
 */

@Slf4j
@RestController
@RequestMapping("contents")
public class ContentsController {

    @GetMapping("{content_id}")
    public ResponseEntity getContents(@PathVariable final String content_id) {
        log.info(content_id);
        return new ResponseEntity(HttpStatus.OK);
    }
}

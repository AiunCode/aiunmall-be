package com.amall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author lenovo
 */
public interface IFileService {
    String upload(MultipartFile file, String path);
}

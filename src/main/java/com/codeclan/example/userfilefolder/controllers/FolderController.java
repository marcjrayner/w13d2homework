package com.codeclan.example.userfilefolder.controllers;

import com.codeclan.example.userfilefolder.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/files")
public class FolderController {

    @Autowired
    FolderRepository folderRepository;

}

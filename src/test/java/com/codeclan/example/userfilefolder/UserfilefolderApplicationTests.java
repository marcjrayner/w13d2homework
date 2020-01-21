package com.codeclan.example.userfilefolder;

import com.codeclan.example.userfilefolder.models.File;
import com.codeclan.example.userfilefolder.models.Folder;
import com.codeclan.example.userfilefolder.repositories.FileRepository;
import com.codeclan.example.userfilefolder.repositories.FolderRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class UserfilefolderApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void createFileAndFolder() {
		Folder folder1 = new Folder("MyStuff");
		folderRepository.save(folder1);
		File file1 = new File("TheGame", ".txt", 12, folder1);
		fileRepository.save(file1);
	}

}

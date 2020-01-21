package com.codeclan.example.userfilefolder;

import com.codeclan.example.userfilefolder.models.File;
import com.codeclan.example.userfilefolder.models.Folder;
import com.codeclan.example.userfilefolder.models.User;
import com.codeclan.example.userfilefolder.repositories.FileRepository;
import com.codeclan.example.userfilefolder.repositories.FolderRepository;
import com.codeclan.example.userfilefolder.repositories.UserRepository;
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

	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void createFileAndFolderAndUser() {
		User user1 = new User("Jim");
		userRepository.save(user1);
		Folder folder1 = new Folder("MyStuff", user1);
		folderRepository.save(folder1);
		File file1 = new File("TheGame", ".txt", 12, folder1);
		fileRepository.save(file1);
	}

}

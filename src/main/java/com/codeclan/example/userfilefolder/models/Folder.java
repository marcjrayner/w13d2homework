package com.codeclan.example.userfilefolder.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

    @Entity
    @Table(name = "folders")
    public class Folder {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "folder_id")
        private Long id;

        @Column(name = "name")
        private String name;

        @JsonIgnoreProperties("folder")
        @OneToMany(mappedBy = "folder")
        private List<File> files;

        @JsonIgnoreProperties("folders")
        @ManyToOne
        @JoinColumn(name = "user_id", nullable = false)
        private User user;

        public Folder(String name, User user) {
            this.name = name;
            this.files = new ArrayList<>();
            this.user = user;
        }

        public Folder() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<File> getFiles() {
            return files;
        }

        public void setFiles(List<File> files) {
            this.files = files;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }
    }


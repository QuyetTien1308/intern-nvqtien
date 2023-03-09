//package com.example.tien.Final.entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@Table(name = "roles_tbl")
//public class Role implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//    @Id
//    @Column(name = "role_key")
//    public String roleKey;
//    @Column(name = "role_name")
//    public String roleName;
//    @Column(name = "desc")
//    public String desc;
//
//    @ManyToMany(mappedBy = "roles", fetch = FetchType.LAZY)
//    public Set<User> users = new HashSet<>();
//}

package com.trunghp.notemicroservice.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "category")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String id;
	@Column(name = "CODE")
	private String code;
	@Column(name = "NAME")
	private String name;
	@CreationTimestamp
	@Column(name = "CREATED_AT")
	private LocalDateTime createdAt;
	@UpdateTimestamp
	@Column(name = "LAST_MODIFIED_AT")
	private LocalDateTime lastModifiedAt;
}

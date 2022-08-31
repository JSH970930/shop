package com.shop.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.shop.constant.OrderStatus;

import lombok.Getter;
import lombok.Setter;

@Entity 
@Table(name = "orders") 
@Getter
@Setter 
public class Order {
	@Id 
	@GeneratedValue 
	@Column(name = "order_id") 
	private Long id;
	@ManyToOne // 
	@JoinColumn
	(name = "member_id") private Member member; 
	private LocalDateTime orderDate;
	@Enumerated(EnumType.STRING) 
	private OrderStatus orderStatus; 
	
	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL,
			orphanRemoval = true, fetch = FetchType.LAZY) 
	private List<OrderItem> orderItems = new ArrayList<>();
	private LocalDateTime regTime; 
	private LocalDateTime updateTime;

}

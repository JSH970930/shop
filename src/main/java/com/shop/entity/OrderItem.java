package com.shop.entity;

import java.time.LocalDateTime;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity 
@Getter 
@Setter
public class OrderItem {
	
	@Id 
	@GeneratedValue 
	@Column(name = "order_item_id") private Long id; 
	
	@ManyToOne(fetch = FetchType.LAZY) // 하나의 상품은 여러 주문 상품으로 들어갈 수 있으므로 주문 상품 기준으로 다대일 매핑을 설정한다. 
	@JoinColumn(name = "item_id") 
	private item item; 
	
	@ManyToOne(fetch = FetchType.LAZY) // 한 번의 주문에 여러 개의 상품을 주문할 수 있으므로 주문 상품 엔티티와 주문 엔티티를 다대일 단방향 매핑
	@JoinColumn(name = "order_id") 
	private Order order;
	
	private int orderPrice; //주문가격
	private int count; //수량
	private LocalDateTime regTime; 
	private LocalDateTime updateTime;

}

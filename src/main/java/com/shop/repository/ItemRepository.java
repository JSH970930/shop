package com.shop.repository;

import com.shop.entity.item;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;




public interface ItemRepository extends JpaRepository<item, Long>,
QuerydslPredicateExecutor<item>{


//	List<item> findByItemNm(String itemNm);
//	List<item> findByItemNmOrItemDetail(String itemNm, String itemDetail);
//	List<item> findByPriceLessThanOrderByPriceDesc(Integer price);
//	@Query("select i from item i where i.itemDetail like " +
//			"%:itemDetail% order by i.price desc")
//			List<item> findByItemDetail(@Param("itemDetail") String itemDetail);
	
//	@Query(value="select * from item i where i.item_detail like " +
//			"%:itemDetail% order by i.price desc", nativeQuery = true)
//			List<item> findByItemDetailByNative(@Param("itemDetail") String itemDetail);
//			
			
			


	



}

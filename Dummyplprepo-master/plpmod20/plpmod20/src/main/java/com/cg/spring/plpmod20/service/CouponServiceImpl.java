package com.cg.spring.plpmod20.service;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spring.plpmod20.beans.Coupons;
import com.cg.spring.plpmod20.repo.CouponRepo;
import com.cg.spring.plpmod20.util.DatabaseUtil;

@Service
public class CouponServiceImpl implements CouponService {

	@Autowired
	CouponRepo repo;

	@Override
	public void addCoupon(Coupons p) throws ClassNotFoundException, IOException {
		java.sql.Timestamp expiry_time = new java.sql.Timestamp(new java.util.Date().getTime());
		p.setTimestamp(expiry_time);
		PreparedStatement preparedStatement = null;
		// String sql = "DELETE FROM coupons WHERE timestamp < (NOW() - INTERVAL 1
		// MINUTE)";
		String sql = "DELETE FROM coupons WHERE timestamp < (NOW() - INTERVAL 1 DAY)";
		try {
			preparedStatement = new DatabaseUtil().getConnection().prepareStatement(sql);
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		repo.save(p);
	}

}

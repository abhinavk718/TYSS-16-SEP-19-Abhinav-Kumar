package com.tyss.assetmanagement_backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tyss.assetmanagement_backend.dao.AssetDao;
import com.tyss.assetmanagement_backend.dto.Asset;

@Service
public class AssetServiceImpl implements AssetService
{
	
@Autowired
private AssetDao dao;
	
	@Override
	public boolean addAsset(Asset a) {
		
		return dao.addAsset(a);
	}

	@Override
	public boolean deleteAsset(String assetName) {
		return dao.deleteAsset(assetName);
	}

	@Override
	public Asset getAsset(String assetName) {
		return dao.getAsset(assetName);
	}

	@Override
	public List<Asset> getAllAsset() {
		return dao.getAllAsset();
	}

	@Override
	public boolean modifyAsset(Asset a) {
		return dao.modifyAsset(a);
	}
}

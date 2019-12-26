package com.tyss.assetmanagement_backend.dao;

import java.util.List;

import com.tyss.assetmanagement_backend.dto.Asset;

public interface AssetDao {
	
	public boolean addAsset(Asset a);
	public boolean modifyAsset(Asset a);
	public boolean deleteAsset(String assetName);
	public Asset getAsset(String assetName);
	public List<Asset> getAllAsset();
	public boolean approveAsset(Asset a);
	public boolean rejectAsset(Asset a);
}

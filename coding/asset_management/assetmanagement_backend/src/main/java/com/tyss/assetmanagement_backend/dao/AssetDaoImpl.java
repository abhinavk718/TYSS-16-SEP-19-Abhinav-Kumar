package com.tyss.assetmanagement_backend.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.tyss.assetmanagement_backend.dto.Asset;

@Repository
public class AssetDaoImpl implements AssetDao{

	@PersistenceUnit
	private EntityManagerFactory factory;


	@Override
	public boolean addAsset(Asset a) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transection=manager.getTransaction();
		try {
			transection.begin();
			manager.persist(a);
			transection.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean modifyAsset(Asset a) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transection=manager.getTransaction();
		transection.begin();
		Asset asset=manager.find(Asset.class, a.getAssetName());
		asset.setAssetName(a.getAssetName());
		asset.setAssetQuantity(a.getAssetQuantity());
		asset.setAssetDesc(a.getAssetDesc());
		manager.persist(asset);
		transection.commit();
		return true;
	}

	@Override
	public boolean deleteAsset(String assetName) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transection=manager.getTransaction();
		transection.begin();
		Asset asset=manager.find(Asset.class, assetName);
		if(asset!=null) {
			manager.remove(asset);
			transection.commit();
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public Asset getAsset(String assetName) {
		EntityManager manager=factory.createEntityManager();
		Asset asset=manager.find(Asset.class, assetName);
		return asset;
	}

	@Override
	public List<Asset> getAllAsset() {
		String jpql="from Asset";
		EntityManager manager=factory.createEntityManager();
		TypedQuery<Asset>query=manager.createQuery(jpql,Asset.class);
		List<Asset>asset=query.getResultList();
		return asset;
	}

	@Override
	public boolean approveAsset(Asset a) {
		
		return false;
	}

	@Override
	public boolean rejectAsset(Asset a) {
		
		return false;
	}

}
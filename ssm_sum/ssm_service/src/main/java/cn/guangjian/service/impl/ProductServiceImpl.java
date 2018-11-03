package cn.guangjian.service.impl;

import cn.guangjian.dao.ProductDao;
import cn.guangjian.domain.Product;
import cn.guangjian.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("productService")
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;
    @Override
    public List<Product> findAll() throws Exception {
        List<Product> list = productDao.findAll();
        return list;
    }

    @Override
    public void save(Product product) {
        productDao.save(product);
    }
}

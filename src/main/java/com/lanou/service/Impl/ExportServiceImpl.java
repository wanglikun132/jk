package com.lanou.service.Impl;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lanou.entity.Contract;
import com.lanou.entity.Contractproduct;
import com.lanou.entity.Export;
import com.lanou.entity.Exportproduct;
import com.lanou.entity.Extcproduct;
import com.lanou.entity.Exteproduct;
import com.lanou.mapper.ContractMapper;
import com.lanou.mapper.ContractproductMapper;
import com.lanou.mapper.ExportMapper;
import com.lanou.mapper.ExportproductMapper;
import com.lanou.mapper.ExtcproductMapper;
import com.lanou.mapper.ExteproductMapper;
import com.lanou.service.ExportService;
import com.lanou.service.HisService;
import com.lanou.util.UtilFuns;
@Service
public class ExportServiceImpl implements ExportService {
@Resource
private ExportMapper exportMapper;
@Resource
private ExportproductMapper exportproductMapper;
@Resource
private ExteproductMapper exteproductMapper;
@Resource 
private ContractMapper contractMapper;
@Resource 
private ContractproductMapper contractProductMapper;
@Resource
private ExtcproductMapper extCproductMapper;
@Resource
private HisService hisService;
	public List<Export> selectAllExport() {
		// TODO Auto-generated method stub
		return exportMapper.selectAll();
	}
	public List<Exportproduct> selectExportproductByExportId(String exportId) {
		// TODO Auto-generated method stub
		return exportproductMapper.selectByExportId(exportId);
	}
	public List<Exteproduct> selectByExportProductId(String exportProductId) {
		// TODO Auto-generated method stub
		return exteproductMapper.selectByExportProductId(exportProductId);
	}
	public List<Export> selectExportByExportIds(Map<String,Object>map) {
		
		return exportMapper.selectByExportIds(map);
	}
	
	public void baoyun(String[] ids) {
		
			//1:根据合同id 查询多个合同的信息
			Export e = new Export();
			e.setContractIds(UtilFuns.joinStr(ids,","));
			StringBuffer sb = new StringBuffer();
			for (String s : ids) {
				Contract c = contractMapper.selectByPrimaryKey(s);
				//添加历史合同
				hisService.insertContractSelective(c);
				sb.append(c.getContractNo()+" ");
			}
			
			e.setCustomerContract(sb.toString());
			e.setExportId(UUID.randomUUID().toString());
			e.setInputDate(new Date());
			//  默认草稿
			e.setState((short)0);
			exportMapper.insertSelective(e);
			
//			 * 3. 将合同中的货物信息进行“搬家”
//			 * 4. 将合同中的附件信息进行“搬家”
			
			for (String id : ids) {
				List<Contractproduct> cp  = contractProductMapper.selectByContractId(id);
				for (Contractproduct cpp : cp) {
					//添加历史合同货物
					hisService.insertContractproductSelective(cpp);
					
					Exportproduct ep = new Exportproduct();
					ep.setFactoryId(cpp.getFactoryId());
					ep.setFactoryName(cpp.getFactoryName());
					ep.setPrice(cpp.getPrice());
					ep.setCnumber(cpp.getCnumber());
					ep.setPackingUnit(cpp.getPackingUnit());
					ep.setOrderNo(cpp.getOrderNo());
					ep.setProductNo(cpp.getProductNo());
					ep.setBoxNum(cpp.getBoxNum());
					ep.setPrice(cpp.getPrice());
					ep.setExportId(e.getExportId());
					ep.setExportProductId(UUID.randomUUID().toString());
					exportproductMapper.insertSelective(ep);
					// 合同货物Id
					String contractProductId = cpp.getContractProductId();
					
					List<Extcproduct> list  = extCproductMapper.selectAll(contractProductId);
					for (Extcproduct ec : list) {
						
						//添加历史合同附件
						hisService.insertExtcproductSelective(ec);
						
						// 保运附件 
						Exteproduct eproduct = new Exteproduct();
						eproduct.setExtEproductId(UUID.randomUUID().toString());
						eproduct.setExportProductId(ep.getExportProductId());
						eproduct.setAmount(ec.getAmount());
						eproduct.setCnumber(ec.getCnumber());
						eproduct.setFactoryId(ec.getFactoryId());
						eproduct.setFactoryName(ec.getFactoryName());
						eproduct.setPackingUnit(ec.getPackingUnit());
						eproduct.setPrice(ec.getPrice());
						eproduct.setProductNo(ec.getProductNo());
						eproduct.setProductImage(ec.getProductImage());
						eproduct.setProductDesc(ec.getProductDesc());
						exteproductMapper.insertSelective(eproduct);
					}
				}
			}
		}
	public List<Export> selectByExportIdss(String[] ids) {
		// TODO Auto-generated method stub
		return exportMapper.selectByExportIdss(ids);
	}
	public List<Export> selectByCustomerContracts(List<String> customerContracts) {
		// TODO Auto-generated method stub
		return exportMapper.selectByCustomerContracts(customerContracts);
	}
	public int deletecustomerContracts(String customerContract) {
		// TODO Auto-generated method stub
		return exportMapper.deletecustomerContracts(customerContract);
	}
	public int deleteByPrimaryKeySe(String id) {
		// TODO Auto-generated method stub
		return exportMapper.deleteByPrimaryKey(id);
	}
	public int deleteByExportProductId(String exportProductId) {
		// TODO Auto-generated method stub
		return exteproductMapper.deleteByExportProductId(exportProductId);
	}
	public int deleteByExportId(String exportId) {
		// TODO Auto-generated method stub
		return exportproductMapper.deleteByExportId(exportId);
	}
	@Override
	public int updateByPrimaryKeySelective(Export record) {
		// TODO Auto-generated method stub
		return exportMapper.updateByPrimaryKeySelective(record);
	}
	@Override
	public Export selectByPrimaryKey(String exportId) {
		// TODO Auto-generated method stub
		return exportMapper.selectByPrimaryKey(exportId);
	}

	

}

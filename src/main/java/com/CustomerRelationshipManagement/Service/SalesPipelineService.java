package com.CustomerRelationshipManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CustomerRelationshipManagement.Entity.SalesPipeline;
import com.CustomerRelationshipManagement.Repository.SalesPipelineRepository;

@Service
public class SalesPipelineService {
	
	@Autowired
    private SalesPipelineRepository salesPipelineRepository;

    public List<SalesPipeline> getAllPipelines() {
        return salesPipelineRepository.findAll();
    }

    public SalesPipeline getPipelineById(Long id) {
        return salesPipelineRepository.findById(id).orElse(null);
    }

    public SalesPipeline savePipeline(SalesPipeline salesPipeline) {
        return salesPipelineRepository.save(salesPipeline);
    }

    public void deletePipeline(Long id) {
        salesPipelineRepository.deleteById(id);
    }

}

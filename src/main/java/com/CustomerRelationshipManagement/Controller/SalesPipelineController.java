package com.CustomerRelationshipManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CustomerRelationshipManagement.Entity.SalesPipeline;
import com.CustomerRelationshipManagement.Service.SalesPipelineService;

@RestController
@RequestMapping("/api/pipelines")
public class SalesPipelineController {
	
	@Autowired
    private SalesPipelineService salesPipelineService;

    @GetMapping
    public List<SalesPipeline> getAllPipelines() {
        return salesPipelineService.getAllPipelines();
    }

    @GetMapping("/{id}")
    public SalesPipeline getPipelineById(@PathVariable Long id) {
        return salesPipelineService.getPipelineById(id);
    }

    @PostMapping
    public SalesPipeline createPipeline(@RequestBody SalesPipeline salesPipeline) {
        return salesPipelineService.savePipeline(salesPipeline);
    }

    @PutMapping("/{id}")
    public SalesPipeline updatePipeline(@PathVariable Long id, @RequestBody SalesPipeline salesPipeline) {
        salesPipeline.setId(id);
        return salesPipelineService.savePipeline(salesPipeline);
    }

    @DeleteMapping("/{id}")
    public void deletePipeline(@PathVariable Long id) {
        salesPipelineService.deletePipeline(id);
    }

}

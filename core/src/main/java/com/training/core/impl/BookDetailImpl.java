package com.training.core.impl;

import com.day.cq.wcm.api.Page;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.training.core.models.BookDetail;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;

@Model(adaptables = Resource.class, adapters = BookDetail.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        resourceType = BookDetailImpl.RESOURCE_TYPE)
@Exporter(name = "jackson", extensions = {"json", "xml"},selector = "training")
public class BookDetailImpl implements BookDetail {
    public static final String RESOURCE_TYPE = "training/components/bookdetail";

    @Inject
    private String title;

    @ScriptVariable
    public Page currentPage;

    @SlingObject
    ResourceResolver resourceResolver;

    @Override
    public String getJcrTitle() {
        //sling api
        //Resource resource = resourceResolver.getResource(currentPage.getPath() +"/jcr:content");

        //jcr API
        //Node pageNode = resource
        return "getJcrTitle";
    }

    @JsonProperty
    public String nonGetMethodExposedinJson() {
        return "exposing via @jsonProperty";
    }

    @Override
    public String getSlingTitle() {
        return "getSlingTitle";
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public List<String> getListItems() {
        return Arrays.asList(new String[]{"1", "2", "a", "b"});

    }
}

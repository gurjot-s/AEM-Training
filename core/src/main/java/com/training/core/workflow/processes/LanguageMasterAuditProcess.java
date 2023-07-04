package com.training.core.workflow.processes;

import com.adobe.granite.workflow.WorkflowSession;
import com.adobe.granite.workflow.exec.WorkItem;
import com.adobe.granite.workflow.exec.WorkflowProcess;
import com.adobe.granite.workflow.metadata.MetaDataMap;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Custom WF Process to log details in a specific Log File
 */
@Component(immediate = true, property = {"process.label=Language Masters Audit WF Process"})
public class LanguageMasterAuditProcess implements WorkflowProcess {
    Logger log = LoggerFactory.getLogger("language-masters");

    @Override
    public void execute(WorkItem workItem, WorkflowSession workflowSession, MetaDataMap metaDataMap) {
        log.info("WF Started for Path- " + workItem.getContentPath());
        //add custom logic here
        MetaDataMap metaData = workItem.getWorkflowData().getMetaDataMap();
        log.info("Initiated By- " + metaData.get("userId") + ", initiated at -" + workItem.getTimeStarted().toString());
    }
}

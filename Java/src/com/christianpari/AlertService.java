package com.christianpari;

import java.util.*;

public class AlertService {
  private final AlertDAO storage;

  public AlertService(AlertDAO dao) { storage = dao; }

  public UUID raiseAlert() {
    return storage.addAlert(new Date());
  }

  public Date getAlertTime(UUID id) {
    return storage.getAlert(id);
  }
}

class MapAlertDAO implements AlertDAO {
  private final Map<UUID, Date> alerts = new HashMap<UUID, Date>();

  public UUID addAlert(Date time) {
    UUID id = UUID.randomUUID();
    this.alerts.put(id, time);
    return id;
  }

  public Date getAlert(UUID id) {
    return this.alerts.get(id);
  }
}

interface AlertDAO {
  UUID addAlert(Date time);
  Date getAlert(UUID id);
}
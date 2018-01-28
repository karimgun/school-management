package com.akg.sm.domain.system;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Table;

public enum UserType {
    admin, head, manager, teacher, student, parent;
}

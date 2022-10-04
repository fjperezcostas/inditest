package org.fjpc.tests.inditest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "applicable price not found")
public class ApplicablePriceNotFoundException extends RuntimeException {}

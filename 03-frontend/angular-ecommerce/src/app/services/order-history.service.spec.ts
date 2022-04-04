import { HttpClient } from '@angular/common/http';
import { TestBed } from '@angular/core/testing';

import { OrderHistoryService } from './order-history.service';

describe('OrderHistoryService', () => {

  let httpClientSpy: jasmine.SpyObj<HttpClient>;
  let orderService: OrderHistoryService;

  beforeEach(() => {

    httpClientSpy = jasmine.createSpyObj('HttpClient', ['get']);
    orderService = new OrderHistoryService(httpClientSpy);

  });

  it('should be created', () => {
    expect(orderService).toBeDefined();
  });
});

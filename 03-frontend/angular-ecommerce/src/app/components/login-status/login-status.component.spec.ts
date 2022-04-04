import { ComponentFixture, TestBed } from '@angular/core/testing';
import { OktaAuthStateService, OKTA_AUTH } from '@okta/okta-angular';
import { OktaAuth } from '@okta/okta-auth-js';

import { LoginStatusComponent } from './login-status.component';

describe('LoginStatusComponent', () => {

  let authStateServiceSpy = jasmine.createSpyObj(OktaAuthStateService, ['authState'])
  let oktaAuthSpy = jasmine.createSpyObj(OktaAuth, ['getUser', 'signOut']);

  let component: LoginStatusComponent;
  let fixture: ComponentFixture<LoginStatusComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LoginStatusComponent ],
      imports: [],
      providers: [
        {provide: OktaAuthStateService, useValue: authStateServiceSpy},
        {provide: OktaAuth, useValue: oktaAuthSpy}
      ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(LoginStatusComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

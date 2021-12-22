import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LoginCaseComponent } from './login-case.component';

describe('LoginCaseComponent', () => {
  let component: LoginCaseComponent;
  let fixture: ComponentFixture<LoginCaseComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LoginCaseComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(LoginCaseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

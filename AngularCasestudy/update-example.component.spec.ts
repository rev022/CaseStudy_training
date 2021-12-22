import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateExampleComponent } from './update-example.component';

describe('UpdateExampleComponent', () => {
  let component: UpdateExampleComponent;
  let fixture: ComponentFixture<UpdateExampleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UpdateExampleComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdateExampleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

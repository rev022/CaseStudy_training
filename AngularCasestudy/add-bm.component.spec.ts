import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddBmComponent } from './add-bm.component';

describe('AddBmComponent', () => {
  let component: AddBmComponent;
  let fixture: ComponentFixture<AddBmComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddBmComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddBmComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

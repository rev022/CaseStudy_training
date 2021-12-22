import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TaskCaseComponent } from './task-case.component';

describe('TaskCaseComponent', () => {
  let component: TaskCaseComponent;
  let fixture: ComponentFixture<TaskCaseComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TaskCaseComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TaskCaseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ReactivdrivenformComponent } from './reactivdrivenform.component';

describe('ReactivdrivenformComponent', () => {
  let component: ReactivdrivenformComponent;
  let fixture: ComponentFixture<ReactivdrivenformComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ReactivdrivenformComponent]
    });
    fixture = TestBed.createComponent(ReactivdrivenformComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

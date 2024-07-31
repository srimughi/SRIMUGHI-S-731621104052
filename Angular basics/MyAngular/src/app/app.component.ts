import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  items: { name: string }[] = [];
  newItem: { name: string } = { name: '' };
  editingItem: { name: string } | null = null;

  addItem(event: Event): void {
    event.preventDefault();
    if (this.newItem.name.trim()) {
      this.items.push({ name: this.newItem.name });
      this.newItem.name = '';
    }
  }

  editItem(item: { name: string }): void {
    this.editingItem = { ...item };
  }

  updateItem(event: Event): void {
    event.preventDefault();
    if (this.editingItem) {
      const index = this.items.findIndex(item => item.name === this.editingItem?.name);
      if (index > -1) {
        this.items[index] = this.editingItem;
        this.editingItem = null;
      }
    }
  }

  deleteItem(item: { name: string }): void {
    this.items = this.items.filter(i => i !== item);
  }
}

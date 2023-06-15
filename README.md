# supermart-frontend
[![License: MIT](https://img.shields.io/bower/l/bootstrap)](https://github.com/pavas23/supermart-frontend)
[![Github Repo Size](https://img.shields.io/github/repo-size/pavas23/supermart-frontend)](https://github.com/pavas23/supermart-frontend)
[![npm version](https://img.shields.io/npm/v/npm)](https://github.com/pavas23/supermart-frontend)
[![last commit](https://img.shields.io/github/last-commit/pavas23/supermart-frontend)](https://github.com/pavas23/supermart-frontend)
[![contributors](https://img.shields.io/github/contributors/pavas23/supermart-frontend)](https://github.com/pavas23/supermart-frontend)


This is a web based application for an online supermarket. Through which customers can register and order items made using React JS.

### User Management
  - A user can be ```admin, manager or customer```
  - Admin is the super user with all permissions.
  - Users (customer, admin and manager) will have information such as- user name, a user
  - Users (customer, admin and manager) will have information such as user name, user id etc.
  - ```id (unique across the system)```, phone number, and email id, and address.
  - An existing user should log into the system with user id and password.
  - New customers are permitted to register.
  - Manager/admin can add or delete items, modify details about the items (price/qty/offers etc.)
  - A user can ```withdraw``` himself from the Application.
  - Password change (reset) facility is required.

### Admin/Manager publishing item details
  - Manager or admin users should be allowed to publish the details of the items made available for sale. Details needed are item_name, item_code, price, offer if any, qty available, delivery time etc.
  - A manager or admin can delete the published item whenever required.

### Customer order management
  - A customer should be allowed to ```view/search the items``` published/available for sale.
  - Select items to the cart.
  - Customers can register and order items.
  - Confirm order and make payment
  - User should get a ```confirmation message``` with expected delivery date.
  - User will have a Wallet from where payments will be made, and user can ```top-up the wallet``` if necessary. But at the time of registration must start with minimum of 1000/-.
  - User can add review about the website.

### Other functionality
  - Admin user should be able to generate reports like – items sold on a date, customer order details(summary) for a month, item stock status etc.
  - Any user can generate his/her ```order history``` (summary) for a given month.


## Preview
![supermart](https://github.com/pavas23/supermart-frontend/assets/97559428/80431fd0-6826-452b-a2d4-de83463462b6)


## Run Locally
Install my-project with npm

```bash
  cd my-app
  npm install
  npm start
```

## Tech Stack
- HTML
- CSS
- JavaScript
- Tailwind CSS
- React JS

### Link to Backend Repo
<a href = "https://github.com/pavas23/supermart-backend">Backend Repo</a>

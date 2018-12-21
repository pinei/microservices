# Koa

Koa requires node v7.6.0 or higher for ES2015 and async function support.

```bash
$ npm install koa
```

```javascript
const Koa = require('koa');
const app = new Koa();

app.use(async ctx => {
  ctx.body = 'Hello World';
});

app.listen(3000);
```


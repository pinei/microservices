const Koa = require('koa');
const app = new Koa();

let i = 0

app.use(async ctx => {
  ctx.body = `Hello World (${++i})`;
});

app.listen(3000, () => {
  console.log('Listening on http://localhost:3000');
});
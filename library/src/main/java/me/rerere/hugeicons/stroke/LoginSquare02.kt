package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LoginSquare02: ImageVector
    get() {
        if (_loginSquare02 != null) {
            return _loginSquare02!!
        }
        _loginSquare02 = ImageVector.Builder(
            name = "LoginSquare02",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.9999f, 6.99976f)
        curveTo(19.923f, 5.58248f, 19.7124f, 4.66416f, 19.1363f, 3.96219f)
        curveTo(18.9701f, 3.75965f, 18.7844f, 3.57394f, 18.5819f, 3.40772f)
        curveTo(17.4755f, 2.49976f, 15.8318f, 2.49976f, 12.5443f, 2.49976f)
        lineTo(11.9999f, 2.49992f)
        curveTo(8.22871f, 2.49992f, 6.34309f, 2.49992f, 5.17152f, 3.67149f)
        curveTo(3.99994f, 4.84307f, 3.99994f, 6.72868f, 3.99994f, 10.4999f)
        verticalLineTo(13.4999f)
        curveTo(3.99994f, 17.2712f, 3.99994f, 19.1568f, 5.17152f, 20.3283f)
        curveTo(6.34309f, 21.4999f, 8.22871f, 21.4999f, 11.9999f, 21.4999f)
        lineTo(12.5443f, 21.4998f)
        curveTo(15.8318f, 21.4998f, 17.4755f, 21.4998f, 18.5819f, 20.5918f)
        curveTo(18.7844f, 20.4256f, 18.9701f, 20.2399f, 19.1363f, 20.0373f)
        curveTo(19.7124f, 19.3354f, 19.923f, 18.417f, 19.9999f, 16.9998f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 7.99992f)
        curveTo(13f, 7.99992f, 9.00001f, 10.9459f, 9f, 12f)
        curveTo(8.99999f, 13.054f, 13f, 15.9999f, 13f, 15.9999f)
        moveTo(9.5f, 12f)
        horizontalLineTo(20f)
        }
        }.build()

        return _loginSquare02!!
    }

private var _loginSquare02: ImageVector? = null

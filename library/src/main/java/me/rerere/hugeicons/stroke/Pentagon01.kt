package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Pentagon01: ImageVector
    get() {
        if (_pentagon01 != null) {
            return _pentagon01!!
        }
        _pentagon01 = ImageVector.Builder(
            name = "Pentagon01",
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
        moveTo(8.43816f, 3.93226f)
        curveTo(10.1564f, 2.64409f, 11.0155f, 2f, 12f, 2f)
        curveTo(12.9845f, 2f, 13.8436f, 2.64409f, 15.5618f, 3.93226f)
        lineTo(19.004f, 6.51285f)
        curveTo(20.7222f, 7.80103f, 21.5814f, 8.44512f, 21.8856f, 9.41125f)
        curveTo(22.1898f, 10.3774f, 21.8616f, 11.4195f, 21.2053f, 13.5038f)
        lineTo(19.8905f, 17.6793f)
        curveTo(19.2342f, 19.7636f, 18.9061f, 20.8058f, 18.1096f, 21.4029f)
        curveTo(17.3132f, 22f, 16.2512f, 22f, 14.1274f, 22f)
        horizontalLineTo(9.87263f)
        curveTo(7.74876f, 22f, 6.68682f, 22f, 5.89037f, 21.4029f)
        curveTo(5.09392f, 20.8058f, 4.76576f, 19.7636f, 4.10945f, 17.6793f)
        lineTo(2.79467f, 13.5038f)
        curveTo(2.13835f, 11.4195f, 1.8102f, 10.3774f, 2.11441f, 9.41125f)
        curveTo(2.41863f, 8.44512f, 3.27776f, 7.80103f, 4.99601f, 6.51285f)
        lineTo(8.43816f, 3.93226f)
        }
        }.build()

        return _pentagon01!!
    }

private var _pentagon01: ImageVector? = null

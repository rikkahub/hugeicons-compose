package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Scan: ImageVector
    get() {
        if (_scan != null) {
            return _scan!!
        }
        _scan = ImageVector.Builder(
            name = "Scan",
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
        moveTo(16.0042f, 2.5f)
        curveTo(17.9974f, 2.61348f, 19.2576f, 2.93381f, 20.1619f, 3.83811f)
        curveTo(21.0662f, 4.74243f, 21.3865f, 6.00268f, 21.5f, 7.99598f)
        moveTo(7.99582f, 2.5f)
        curveTo(6.00261f, 2.61348f, 4.74241f, 2.93381f, 3.83812f, 3.83811f)
        curveTo(2.9338f, 4.74243f, 2.61347f, 6.00268f, 2.5f, 7.99598f)
        moveTo(21.5f, 16.004f)
        curveTo(21.3865f, 17.9973f, 21.0662f, 19.2576f, 20.1619f, 20.1619f)
        curveTo(19.2576f, 21.0662f, 17.9973f, 21.3865f, 16.004f, 21.5f)
        moveTo(2.5f, 16.004f)
        curveTo(2.61347f, 17.9973f, 2.9338f, 19.2576f, 3.83812f, 20.1619f)
        curveTo(4.74244f, 21.0662f, 6.00268f, 21.3865f, 7.99597f, 21.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 12f)
        horizontalLineTo(19f)
        }
        }.build()

        return _scan!!
    }

private var _scan: ImageVector? = null

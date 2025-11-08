package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PowerSocket02: ImageVector
    get() {
        if (_powerSocket02 != null) {
            return _powerSocket02!!
        }
        _powerSocket02 = ImageVector.Builder(
            name = "PowerSocket02",
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
        moveTo(2.5f, 12f)
        curveTo(2.5f, 7.77027f, 2.5f, 5.6554f, 3.69797f, 4.25276f)
        curveTo(3.86808f, 4.05358f, 4.05358f, 3.86808f, 4.25276f, 3.69797f)
        curveTo(5.6554f, 2.5f, 7.77027f, 2.5f, 12f, 2.5f)
        curveTo(16.2297f, 2.5f, 18.3446f, 2.5f, 19.7472f, 3.69797f)
        curveTo(19.9464f, 3.86808f, 20.1319f, 4.05358f, 20.302f, 4.25276f)
        curveTo(21.5f, 5.6554f, 21.5f, 7.77027f, 21.5f, 12f)
        curveTo(21.5f, 16.2297f, 21.5f, 18.3446f, 20.302f, 19.7472f)
        curveTo(20.1319f, 19.9464f, 19.9464f, 20.1319f, 19.7472f, 20.302f)
        curveTo(18.3446f, 21.5f, 16.2297f, 21.5f, 12f, 21.5f)
        curveTo(7.77027f, 21.5f, 5.6554f, 21.5f, 4.25276f, 20.302f)
        curveTo(4.05358f, 20.1319f, 3.86808f, 19.9464f, 3.69797f, 19.7472f)
        curveTo(2.5f, 18.3446f, 2.5f, 16.2297f, 2.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 9f)
        horizontalLineTo(9f)
        curveTo(7.58579f, 9f, 6.87868f, 9f, 6.43934f, 9.43934f)
        curveTo(6f, 9.87868f, 6f, 10.5858f, 6f, 12f)
        curveTo(6f, 13.4142f, 6f, 14.1213f, 6.43934f, 14.5607f)
        curveTo(6.87868f, 15f, 7.58579f, 15f, 9f, 15f)
        horizontalLineTo(15f)
        curveTo(16.4142f, 15f, 17.1213f, 15f, 17.5607f, 14.5607f)
        curveTo(18f, 14.1213f, 18f, 13.4142f, 18f, 12f)
        curveTo(18f, 10.5858f, 18f, 9.87868f, 17.5607f, 9.43934f)
        curveTo(17.1213f, 9f, 16.4142f, 9f, 15f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.4912f, 12f)
        horizontalLineTo(14.5002f)
        moveTo(9.5f, 12f)
        horizontalLineTo(9.50897f)
        }
        }.build()

        return _powerSocket02!!
    }

private var _powerSocket02: ImageVector? = null

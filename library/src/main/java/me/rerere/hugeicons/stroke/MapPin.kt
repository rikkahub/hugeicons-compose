package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MapPin: ImageVector
    get() {
        if (_mapPin != null) {
            return _mapPin!!
        }
        _mapPin = ImageVector.Builder(
            name = "MapPin",
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
        moveTo(7f, 9.00183f)
        curveTo(4.82497f, 9.01495f, 3.64706f, 9.11944f, 2.87868f, 9.95185f)
        curveTo(2f, 10.9038f, 2f, 12.4358f, 2f, 15.4999f)
        curveTo(2f, 18.5641f, 2f, 20.0961f, 2.87868f, 21.048f)
        curveTo(3.75736f, 21.9999f, 5.17157f, 21.9999f, 8f, 21.9999f)
        horizontalLineTo(16f)
        curveTo(18.8284f, 21.9999f, 20.2426f, 21.9999f, 21.1213f, 21.048f)
        curveTo(22f, 20.0961f, 22f, 18.5641f, 22f, 15.4999f)
        curveTo(22f, 12.4358f, 22f, 10.9038f, 21.1213f, 9.95185f)
        curveTo(20.3529f, 9.11944f, 19.175f, 9.01495f, 17f, 9.00183f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 12f)
        lineTo(10.5f, 14.625f)
        moveTo(18f, 19f)
        lineTo(13.8f, 16.55f)
        moveTo(13.8f, 16.55f)
        lineTo(18f, 13.75f)
        moveTo(13.8f, 16.55f)
        lineTo(10.5f, 14.625f)
        moveTo(10.5f, 14.625f)
        lineTo(6f, 17.6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 7f)
        curveTo(13.3807f, 7f, 14.5f, 5.88071f, 14.5f, 4.5f)
        curveTo(14.5f, 3.11929f, 13.3807f, 2f, 12f, 2f)
        curveTo(10.6193f, 2f, 9.5f, 3.11929f, 9.5f, 4.5f)
        curveTo(9.5f, 5.88071f, 10.6193f, 7f, 12f, 7f)
        moveTo(12f, 7f)
        verticalLineTo(11f)
        }
        }.build()

        return _mapPin!!
    }

private var _mapPin: ImageVector? = null

package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Apron: ImageVector
    get() {
        if (_apron != null) {
            return _apron!!
        }
        _apron = ImageVector.Builder(
            name = "Apron",
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
        moveTo(19f, 11f)
        verticalLineTo(16f)
        curveTo(19f, 18.8284f, 19f, 20.2426f, 18.1213f, 21.1213f)
        curveTo(17.2426f, 22f, 15.8284f, 22f, 13f, 22f)
        horizontalLineTo(11f)
        curveTo(8.17157f, 22f, 6.75736f, 22f, 5.87868f, 21.1213f)
        curveTo(5f, 20.2426f, 5f, 18.8284f, 5f, 16f)
        verticalLineTo(11f)
        moveTo(8f, 8f)
        horizontalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.5f, 13f)
        horizontalLineTo(11.5f)
        curveTo(10.5572f, 13f, 10.0858f, 13f, 9.79289f, 13.2929f)
        curveTo(9.5f, 13.5858f, 9.5f, 14.0572f, 9.5f, 15f)
        verticalLineTo(16f)
        curveTo(9.5f, 16.9428f, 9.5f, 17.4142f, 9.79289f, 17.7071f)
        curveTo(10.0858f, 18f, 10.5572f, 18f, 11.5f, 18f)
        horizontalLineTo(12.5f)
        curveTo(13.4428f, 18f, 13.9142f, 18f, 14.2071f, 17.7071f)
        curveTo(14.5f, 17.4142f, 14.5f, 16.9428f, 14.5f, 16f)
        verticalLineTo(15f)
        curveTo(14.5f, 14.0572f, 14.5f, 13.5858f, 14.2071f, 13.2929f)
        curveTo(13.9142f, 13f, 13.4428f, 13f, 12.5f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.0302f, 6.5f)
        curveTo(21.8897f, 7.89188f, 20.9043f, 11f, 18.5243f, 11f)
        curveTo(15.7119f, 11f, 16.015f, 7.9346f, 16.015f, 6f)
        curveTo(16.015f, 3.79086f, 14.2174f, 2f, 12f, 2f)
        curveTo(9.7826f, 2f, 7.98504f, 3.79086f, 7.98504f, 6f)
        curveTo(7.98504f, 7.9346f, 8.28808f, 11f, 5.47569f, 11f)
        curveTo(3.09553f, 11f, 2.11029f, 7.89156f, 3.97008f, 6.49982f)
        }
        }.build()

        return _apron!!
    }

private var _apron: ImageVector? = null

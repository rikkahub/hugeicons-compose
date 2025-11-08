package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Warehouse: ImageVector
    get() {
        if (_warehouse != null) {
            return _warehouse!!
        }
        _warehouse = ImageVector.Builder(
            name = "Warehouse",
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
        moveTo(10.4478f, 2.98351f)
        lineTo(4.94777f, 5.2993f)
        curveTo(3.76103f, 5.79898f, 3.16767f, 6.04882f, 2.83383f, 6.5516f)
        curveTo(2.5f, 7.05438f, 2.5f, 7.6982f, 2.5f, 8.98585f)
        verticalLineTo(21.5f)
        horizontalLineTo(5.5f)
        verticalLineTo(11.5f)
        curveTo(5.5f, 10.5572f, 5.5f, 10.0858f, 5.79289f, 9.79289f)
        curveTo(6.08579f, 9.5f, 6.55719f, 9.5f, 7.5f, 9.5f)
        horizontalLineTo(16.5f)
        curveTo(17.4428f, 9.5f, 17.9142f, 9.5f, 18.2071f, 9.79289f)
        curveTo(18.5f, 10.0858f, 18.5f, 10.5572f, 18.5f, 11.5f)
        verticalLineTo(21.5f)
        horizontalLineTo(21.5f)
        verticalLineTo(8.98585f)
        curveTo(21.5f, 7.6982f, 21.5f, 7.05438f, 21.1662f, 6.5516f)
        curveTo(20.8323f, 6.04882f, 20.239f, 5.79898f, 19.0522f, 5.2993f)
        lineTo(13.5522f, 2.98351f)
        curveTo(12.7867f, 2.66117f, 12.4039f, 2.5f, 12f, 2.5f)
        curveTo(11.5961f, 2.5f, 11.2133f, 2.66117f, 10.4478f, 2.98351f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 6.5f)
        horizontalLineTo(13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 15.5f)
        horizontalLineTo(11f)
        curveTo(10.0572f, 15.5f, 9.58579f, 15.5f, 9.29289f, 15.7929f)
        curveTo(9f, 16.0858f, 9f, 16.5572f, 9f, 17.5f)
        verticalLineTo(19.5f)
        curveTo(9f, 20.4428f, 9f, 20.9142f, 9.29289f, 21.2071f)
        curveTo(9.58579f, 21.5f, 10.0572f, 21.5f, 11f, 21.5f)
        horizontalLineTo(13f)
        curveTo(13.9428f, 21.5f, 14.4142f, 21.5f, 14.7071f, 21.2071f)
        curveTo(15f, 20.9142f, 15f, 20.4428f, 15f, 19.5f)
        verticalLineTo(17.5f)
        curveTo(15f, 16.5572f, 15f, 16.0858f, 14.7071f, 15.7929f)
        curveTo(14.4142f, 15.5f, 13.9428f, 15.5f, 13f, 15.5f)
        }
        }.build()

        return _warehouse!!
    }

private var _warehouse: ImageVector? = null

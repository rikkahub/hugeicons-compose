package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ChartColumnStacked: ImageVector
    get() {
        if (_chartColumnStacked != null) {
            return _chartColumnStacked!!
        }
        _chartColumnStacked = ImageVector.Builder(
            name = "ChartColumnStacked",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(10f, 17f)
            horizontalLineTo(9f)
            curveTo(8.44772f, 17f, 8f, 16.5523f, 8f, 16f)
            lineTo(8f, 10f)
            curveTo(8f, 9.44772f, 8.44772f, 9f, 9f, 9f)
            lineTo(10f, 9f)
            curveTo(10.5523f, 9f, 11f, 9.44772f, 11f, 10f)
            lineTo(11f, 16f)
            curveTo(11f, 16.5523f, 10.5523f, 17f, 10f, 17f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(17f, 17f)
            horizontalLineTo(16f)
            curveTo(15.4477f, 17f, 15f, 16.5523f, 15f, 16f)
            lineTo(15f, 6f)
            curveTo(15f, 5.44772f, 15.4477f, 5f, 16f, 5f)
            lineTo(17f, 5f)
            curveTo(17.5523f, 5f, 18f, 5.44771f, 18f, 6f)
            lineTo(18f, 16f)
            curveTo(18f, 16.5523f, 17.5523f, 17f, 17f, 17f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(18f, 9f)
            lineTo(15f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(11f, 13f)
            lineTo(8f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(3f, 3f)
            verticalLineTo(13f)
            curveTo(3f, 16.7712f, 3f, 18.6569f, 4.17157f, 19.8284f)
            curveTo(5.34315f, 21f, 7.22876f, 21f, 11f, 21f)
            horizontalLineTo(21f)
        }
        }.build()

        return _chartColumnStacked!!
    }

private var _chartColumnStacked: ImageVector? = null

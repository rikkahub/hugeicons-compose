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

val HugeIcons.MonitorDot: ImageVector
    get() {
        if (_monitorDot != null) {
            return _monitorDot!!
        }
        _monitorDot = ImageVector.Builder(
            name = "MonitorDot",
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
            moveTo(13f, 3f)
            horizontalLineTo(8f)
            curveTo(5.17157f, 3f, 3.75736f, 3f, 2.87868f, 3.87868f)
            curveTo(2f, 4.75736f, 2f, 6.17157f, 2f, 9f)
            verticalLineTo(11f)
            curveTo(2f, 13.8284f, 2f, 15.2426f, 2.87868f, 16.1213f)
            curveTo(3.75736f, 17f, 5.17157f, 17f, 8f, 17f)
            horizontalLineTo(16f)
            curveTo(18.8284f, 17f, 20.2426f, 17f, 21.1213f, 16.1213f)
            curveTo(21.8897f, 15.3529f, 21.9862f, 14.175f, 21.9983f, 12f)
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
            moveTo(14f, 21f)
            horizontalLineTo(16f)
            moveTo(14f, 21f)
            curveTo(13.1716f, 21f, 12.5f, 20.3284f, 12.5f, 19.5f)
            verticalLineTo(17f)
            lineTo(12f, 17f)
            moveTo(14f, 21f)
            horizontalLineTo(10f)
            moveTo(10f, 21f)
            horizontalLineTo(8f)
            moveTo(10f, 21f)
            curveTo(10.8284f, 21f, 11.5f, 20.3284f, 11.5f, 19.5f)
            verticalLineTo(17f)
            lineTo(12f, 17f)
            moveTo(12f, 17f)
            verticalLineTo(21f)
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
            moveTo(22f, 6f)
            arcTo(3f, 3f, 0f, true, false, 16f, 6f)
            arcTo(3f, 3f, 0f, true, false, 22f, 6f)
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
            moveTo(14f, 21f)
            horizontalLineTo(16f)
            moveTo(14f, 21f)
            curveTo(13.1716f, 21f, 12.5f, 20.3284f, 12.5f, 19.5f)
            verticalLineTo(17f)
            lineTo(12f, 17f)
            moveTo(14f, 21f)
            horizontalLineTo(10f)
            moveTo(10f, 21f)
            horizontalLineTo(8f)
            moveTo(10f, 21f)
            curveTo(10.8284f, 21f, 11.5f, 20.3284f, 11.5f, 19.5f)
            verticalLineTo(17f)
            lineTo(12f, 17f)
            moveTo(12f, 17f)
            verticalLineTo(21f)
        }
        }.build()

        return _monitorDot!!
    }

private var _monitorDot: ImageVector? = null

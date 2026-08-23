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

val HugeIcons.ArrowDownAZ: ImageVector
    get() {
        if (_arrowDownAZ != null) {
            return _arrowDownAZ!!
        }
        _arrowDownAZ = ImageVector.Builder(
            name = "ArrowDownAZ",
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
            moveTo(8f, 19f)
            verticalLineTo(4f)
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
            moveTo(16f, 8f)
            horizontalLineTo(20f)
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
            moveTo(20f, 10f)
            verticalLineTo(6f)
            curveTo(20f, 4.89543f, 19.1046f, 4f, 18f, 4f)
            curveTo(16.8954f, 4f, 16f, 4.89543f, 16f, 6f)
            verticalLineTo(10f)
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
            moveTo(16f, 14f)
            horizontalLineTo(18.365f)
            curveTo(19.2886f, 14f, 19.7504f, 14f, 19.8853f, 14.2879f)
            curveTo(20.0201f, 14.5758f, 19.7245f, 14.9306f, 19.1332f, 15.6402f)
            lineTo(16.8668f, 18.3598f)
            curveTo(16.2755f, 19.0694f, 15.9799f, 19.4242f, 16.1147f, 19.7121f)
            curveTo(16.2496f, 20f, 16.7114f, 20f, 17.635f, 20f)
            horizontalLineTo(20f)
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
            moveTo(4f, 16f)
            curveTo(4f, 16f, 6.94596f, 20f, 8.00003f, 20f)
            curveTo(9.05411f, 20f, 12f, 16f, 12f, 16f)
        }
        }.build()

        return _arrowDownAZ!!
    }

private var _arrowDownAZ: ImageVector? = null

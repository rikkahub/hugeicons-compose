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

val HugeIcons.ArrowUpZA: ImageVector
    get() {
        if (_arrowUpZA != null) {
            return _arrowUpZA!!
        }
        _arrowUpZA = ImageVector.Builder(
            name = "ArrowUpZA",
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
            moveTo(16f, 18f)
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
            moveTo(20f, 20f)
            verticalLineTo(16f)
            curveTo(20f, 14.8954f, 19.1046f, 14f, 18f, 14f)
            curveTo(16.8954f, 14f, 16f, 14.8954f, 16f, 16f)
            verticalLineTo(20f)
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
            moveTo(4f, 7.99997f)
            curveTo(4f, 7.99997f, 6.94596f, 4.00001f, 8.00003f, 4f)
            curveTo(9.05411f, 3.99999f, 12f, 8f, 12f, 8f)
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
            moveTo(8f, 5f)
            verticalLineTo(20f)
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
            moveTo(16f, 4f)
            horizontalLineTo(18.365f)
            curveTo(19.2886f, 4f, 19.7504f, 4f, 19.8853f, 4.28792f)
            curveTo(20.0201f, 4.57584f, 19.7245f, 4.93062f, 19.1332f, 5.64018f)
            lineTo(16.8668f, 8.35982f)
            curveTo(16.2755f, 9.06938f, 15.9799f, 9.42416f, 16.1147f, 9.71208f)
            curveTo(16.2496f, 10f, 16.7114f, 10f, 17.635f, 10f)
            horizontalLineTo(20f)
        }
        }.build()

        return _arrowUpZA!!
    }

private var _arrowUpZA: ImageVector? = null

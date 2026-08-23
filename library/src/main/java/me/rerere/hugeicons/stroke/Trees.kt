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

val HugeIcons.Trees: ImageVector
    get() {
        if (_trees != null) {
            return _trees!!
        }
        _trees = ImageVector.Builder(
            name = "Trees",
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
            moveTo(3f, 13f)
            verticalLineTo(9f)
            curveTo(3f, 7.34315f, 4.34315f, 6f, 6f, 6f)
            horizontalLineTo(8f)
            curveTo(9.65685f, 6f, 11f, 7.34315f, 11f, 9f)
            verticalLineTo(13f)
            curveTo(11f, 14.6569f, 9.65685f, 16f, 8f, 16f)
            horizontalLineTo(6f)
            curveTo(4.34315f, 16f, 3f, 14.6569f, 3f, 13f)
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
            moveTo(10f, 3.5f)
            lineTo(11.1599f, 2.34017f)
            curveTo(11.3777f, 2.12236f, 11.6731f, 2f, 11.9811f, 2f)
            curveTo(12.3113f, 2f, 12.6259f, 2.14057f, 12.8462f, 2.38654f)
            lineTo(16.7929f, 6.79289f)
            curveTo(16.9255f, 6.9255f, 17f, 7.10536f, 17f, 7.29289f)
            curveTo(17f, 7.68342f, 16.6834f, 8f, 16.2929f, 8f)
            horizontalLineTo(15f)
            lineTo(18.7929f, 11.7929f)
            curveTo(18.9255f, 11.9255f, 19f, 12.1054f, 19f, 12.2929f)
            curveTo(19f, 12.6834f, 18.6834f, 13f, 18.2929f, 13f)
            horizontalLineTo(17f)
            lineTo(20.7929f, 16.7929f)
            curveTo(20.9255f, 16.9255f, 21f, 17.1054f, 21f, 17.2929f)
            curveTo(21f, 17.6834f, 20.6834f, 18f, 20.2929f, 18f)
            horizontalLineTo(12f)
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
            moveTo(13f, 18f)
            verticalLineTo(22f)
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
            moveTo(7.00003f, 11f)
            verticalLineTo(22f)
        }
        }.build()

        return _trees!!
    }

private var _trees: ImageVector? = null

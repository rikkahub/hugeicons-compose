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

val HugeIcons.MoveTo: ImageVector
    get() {
        if (_moveTo != null) {
            return _moveTo!!
        }
        _moveTo = ImageVector.Builder(
            name = "MoveTo",
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
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(8f, 17.625f)
            lineTo(20f, 17.625f)
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
            moveTo(17f, 14.625f)
            lineTo(20f, 17.625f)
            lineTo(17f, 20.625f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(8f, 3.625f)
            lineTo(20f, 3.625f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(8f, 10.625f)
            lineTo(20f, 10.625f)
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
            moveTo(4.375f, 3.625f)
            horizontalLineTo(4.25f)
            moveTo(4.5f, 3.625f)
            curveTo(4.5f, 3.76307f, 4.38807f, 3.875f, 4.25f, 3.875f)
            curveTo(4.11193f, 3.875f, 4f, 3.76307f, 4f, 3.625f)
            curveTo(4f, 3.48693f, 4.11193f, 3.375f, 4.25f, 3.375f)
            curveTo(4.38807f, 3.375f, 4.5f, 3.48693f, 4.5f, 3.625f)
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
            moveTo(4.375f, 10.625f)
            horizontalLineTo(4.25f)
            moveTo(4.5f, 10.625f)
            curveTo(4.5f, 10.7631f, 4.38807f, 10.875f, 4.25f, 10.875f)
            curveTo(4.11193f, 10.875f, 4f, 10.7631f, 4f, 10.625f)
            curveTo(4f, 10.4869f, 4.11193f, 10.375f, 4.25f, 10.375f)
            curveTo(4.38807f, 10.375f, 4.5f, 10.4869f, 4.5f, 10.625f)
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
            moveTo(4.375f, 17.625f)
            horizontalLineTo(4.25f)
            moveTo(4.5f, 17.625f)
            curveTo(4.5f, 17.7631f, 4.38807f, 17.875f, 4.25f, 17.875f)
            curveTo(4.11193f, 17.875f, 4f, 17.7631f, 4f, 17.625f)
            curveTo(4f, 17.4869f, 4.11193f, 17.375f, 4.25f, 17.375f)
            curveTo(4.38807f, 17.375f, 4.5f, 17.4869f, 4.5f, 17.625f)
            close()
        }
        }.build()

        return _moveTo!!
    }

private var _moveTo: ImageVector? = null

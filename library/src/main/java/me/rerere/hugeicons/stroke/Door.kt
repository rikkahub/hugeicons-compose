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

val HugeIcons.Door: ImageVector
    get() {
        if (_door != null) {
            return _door!!
        }
        _door = ImageVector.Builder(
            name = "Door",
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
            moveTo(5f, 22f)
            verticalLineTo(8f)
            curveTo(5f, 5.17157f, 5f, 3.75736f, 5.87868f, 2.87868f)
            curveTo(6.75736f, 2f, 8.17157f, 2f, 11f, 2f)
            horizontalLineTo(13f)
            curveTo(15.8284f, 2f, 17.2426f, 2f, 18.1213f, 2.87868f)
            curveTo(19f, 3.75736f, 19f, 5.17157f, 19f, 8f)
            verticalLineTo(22f)
            horizontalLineTo(5f)
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
            moveTo(8f, 11f)
            verticalLineTo(7f)
            curveTo(8f, 5.34533f, 8.34533f, 5f, 10f, 5f)
            horizontalLineTo(14f)
            curveTo(15.6547f, 5f, 16f, 5.34533f, 16f, 7f)
            verticalLineTo(11f)
            curveTo(16f, 12.6547f, 15.6547f, 13f, 14f, 13f)
            horizontalLineTo(10f)
            curveTo(8.34533f, 13f, 8f, 12.6547f, 8f, 11f)
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
            moveTo(3f, 22f)
            horizontalLineTo(21f)
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
            moveTo(12f, 5f)
            verticalLineTo(13f)
            moveTo(16f, 9f)
            lineTo(8f, 9f)
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
            moveTo(8.125f, 17f)
            horizontalLineTo(8f)
            moveTo(8.25f, 17f)
            curveTo(8.25f, 17.1381f, 8.13807f, 17.25f, 8f, 17.25f)
            curveTo(7.86193f, 17.25f, 7.75f, 17.1381f, 7.75f, 17f)
            curveTo(7.75f, 16.8619f, 7.86193f, 16.75f, 8f, 16.75f)
            curveTo(8.13807f, 16.75f, 8.25f, 16.8619f, 8.25f, 17f)
            close()
        }
        }.build()

        return _door!!
    }

private var _door: ImageVector? = null

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

val HugeIcons.DoorClosed: ImageVector
    get() {
        if (_doorClosed != null) {
            return _doorClosed!!
        }
        _doorClosed = ImageVector.Builder(
            name = "DoorClosed",
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
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(8.375f, 12f)
            horizontalLineTo(8.25f)
            moveTo(8.5f, 12f)
            curveTo(8.5f, 12.1381f, 8.38807f, 12.25f, 8.25f, 12.25f)
            curveTo(8.11193f, 12.25f, 8f, 12.1381f, 8f, 12f)
            curveTo(8f, 11.8619f, 8.11193f, 11.75f, 8.25f, 11.75f)
            curveTo(8.38807f, 11.75f, 8.5f, 11.8619f, 8.5f, 12f)
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
            moveTo(14f, 5f)
            horizontalLineTo(10f)
            curveTo(9.05719f, 5f, 8.58579f, 5f, 8.29289f, 5.29289f)
            curveTo(8f, 5.58579f, 8f, 6.05719f, 8f, 7f)
            curveTo(8f, 7.94281f, 8f, 8.41421f, 8.29289f, 8.70711f)
            curveTo(8.58579f, 9f, 9.05719f, 9f, 10f, 9f)
            horizontalLineTo(14f)
            curveTo(14.9428f, 9f, 15.4142f, 9f, 15.7071f, 8.70711f)
            curveTo(16f, 8.41421f, 16f, 7.94281f, 16f, 7f)
            curveTo(16f, 6.05719f, 16f, 5.58579f, 15.7071f, 5.29289f)
            curveTo(15.4142f, 5f, 14.9428f, 5f, 14f, 5f)
            close()
        }
        }.build()

        return _doorClosed!!
    }

private var _doorClosed: ImageVector? = null

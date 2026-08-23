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

val HugeIcons.CircleParkingOff: ImageVector
    get() {
        if (_circleParkingOff != null) {
            return _circleParkingOff!!
        }
        _circleParkingOff = ImageVector.Builder(
            name = "CircleParkingOff",
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
            moveTo(7.88376f, 2.88376f)
            curveTo(9.13912f, 2.31604f, 10.5327f, 2f, 12f, 2f)
            curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
            curveTo(22f, 13.4673f, 21.684f, 14.8609f, 21.1162f, 16.1162f)
            moveTo(4.92893f, 4.92893f)
            curveTo(3.11929f, 6.73858f, 2f, 9.23858f, 2f, 12f)
            curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
            curveTo(14.7614f, 22f, 17.2614f, 20.8807f, 19.0711f, 19.0711f)
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
            moveTo(9f, 13f)
            verticalLineTo(18f)
            moveTo(9f, 13f)
            horizontalLineTo(13f)
            moveTo(9f, 13f)
            verticalLineTo(9f)
            moveTo(12f, 7f)
            horizontalLineTo(13f)
            curveTo(14.6569f, 7f, 16f, 8.34315f, 16f, 10f)
            curveTo(16f, 10.3031f, 15.9551f, 10.5957f, 15.8715f, 10.8715f)
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
            moveTo(2f, 2f)
            lineTo(22f, 22f)
        }
        }.build()

        return _circleParkingOff!!
    }

private var _circleParkingOff: ImageVector? = null

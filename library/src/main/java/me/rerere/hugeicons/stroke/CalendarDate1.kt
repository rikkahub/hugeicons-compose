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

val HugeIcons.CalendarDate1: ImageVector
    get() {
        if (_calendarDate1 != null) {
            return _calendarDate1!!
        }
        _calendarDate1 = ImageVector.Builder(
            name = "CalendarDate1",
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
            moveTo(16f, 2f)
            verticalLineTo(6f)
            moveTo(8f, 2f)
            verticalLineTo(6f)
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
            moveTo(3f, 10f)
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
            moveTo(10.5f, 18f)
            horizontalLineTo(13.5f)
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
            moveTo(13f, 4f)
            horizontalLineTo(11f)
            curveTo(7.22876f, 4f, 5.34315f, 4f, 4.17157f, 5.17157f)
            curveTo(3f, 6.34315f, 3f, 8.22876f, 3f, 12f)
            verticalLineTo(14f)
            curveTo(3f, 17.7712f, 3f, 19.6569f, 4.17157f, 20.8284f)
            curveTo(5.34315f, 22f, 7.22876f, 22f, 11f, 22f)
            horizontalLineTo(13f)
            curveTo(16.7712f, 22f, 18.6569f, 22f, 19.8284f, 20.8284f)
            curveTo(21f, 19.6569f, 21f, 17.7712f, 21f, 14f)
            verticalLineTo(12f)
            curveTo(21f, 8.22876f, 21f, 6.34315f, 19.8284f, 5.17157f)
            curveTo(18.6569f, 4f, 16.7712f, 4f, 13f, 4f)
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
            moveTo(12f, 18f)
            verticalLineTo(14.4878f)
            curveTo(12f, 13.6127f, 12f, 13.1752f, 11.7927f, 13.0367f)
            curveTo(11.5854f, 12.8981f, 11.3236f, 13.1606f, 10.8f, 13.6856f)
            lineTo(10.5f, 13.9864f)
        }
        }.build()

        return _calendarDate1!!
    }

private var _calendarDate1: ImageVector? = null

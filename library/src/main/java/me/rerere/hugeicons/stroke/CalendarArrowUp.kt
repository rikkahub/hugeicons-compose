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

val HugeIcons.CalendarArrowUp: ImageVector
    get() {
        if (_calendarArrowUp != null) {
            return _calendarArrowUp!!
        }
        _calendarArrowUp = ImageVector.Builder(
            name = "CalendarArrowUp",
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
            moveTo(13f, 22f)
            horizontalLineTo(11f)
            curveTo(7.22876f, 22f, 5.34315f, 22f, 4.17157f, 20.8284f)
            curveTo(3f, 19.6569f, 3f, 17.7712f, 3f, 14f)
            verticalLineTo(12f)
            curveTo(3f, 8.22876f, 3f, 6.34315f, 4.17157f, 5.17157f)
            curveTo(5.34315f, 4f, 7.22876f, 4f, 11f, 4f)
            horizontalLineTo(13f)
            curveTo(16.7712f, 4f, 18.6569f, 4f, 19.8284f, 5.17157f)
            curveTo(21f, 6.34315f, 21f, 8.22876f, 21f, 12f)
            verticalLineTo(13f)
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
            moveTo(14f, 18.5f)
            curveTo(14.6881f, 17.792f, 16.5197f, 15f, 17.5f, 15f)
            curveTo(18.4803f, 15f, 20.3119f, 17.792f, 21f, 18.5f)
            moveTo(17.5f, 15.5f)
            lineTo(17.5f, 22f)
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
        }.build()

        return _calendarArrowUp!!
    }

private var _calendarArrowUp: ImageVector? = null

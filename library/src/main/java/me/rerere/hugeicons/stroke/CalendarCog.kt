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

val HugeIcons.CalendarCog: ImageVector
    get() {
        if (_calendarCog != null) {
            return _calendarCog!!
        }
        _calendarCog = ImageVector.Builder(
            name = "CalendarCog",
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
            moveTo(17.4616f, 20f)
            curveTo(18.5662f, 20f, 19.4616f, 19.1046f, 19.4616f, 18f)
            curveTo(19.4616f, 16.8954f, 18.5662f, 16f, 17.4616f, 16f)
            moveTo(17.4616f, 20f)
            curveTo(16.357f, 20f, 15.4616f, 19.1046f, 15.4616f, 18f)
            curveTo(15.4616f, 16.8954f, 16.357f, 16f, 17.4616f, 16f)
            moveTo(17.4616f, 20f)
            verticalLineTo(22f)
            moveTo(17.4616f, 16f)
            verticalLineTo(14f)
            moveTo(19.1962f, 16.9956f)
            lineTo(20.9282f, 15.9956f)
            moveTo(15.7321f, 18.9956f)
            lineTo(14f, 19.9956f)
            moveTo(19.2012f, 18.9956f)
            lineTo(20.9332f, 19.9956f)
            moveTo(15.7371f, 16.9956f)
            lineTo(14.005f, 15.9956f)
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
            moveTo(21f, 12f)
            curveTo(21f, 8.22876f, 21f, 6.34315f, 19.8284f, 5.17157f)
            curveTo(18.6569f, 4f, 16.7712f, 4f, 13f, 4f)
            horizontalLineTo(11f)
            curveTo(7.22876f, 4f, 5.34315f, 4f, 4.17157f, 5.17157f)
            curveTo(3f, 6.34315f, 3f, 8.22876f, 3f, 12f)
            verticalLineTo(14f)
            curveTo(3f, 17.7712f, 3f, 19.6569f, 4.17157f, 20.8284f)
            curveTo(5.34315f, 22f, 7.22876f, 22f, 11f, 22f)
        }
        }.build()

        return _calendarCog!!
    }

private var _calendarCog: ImageVector? = null

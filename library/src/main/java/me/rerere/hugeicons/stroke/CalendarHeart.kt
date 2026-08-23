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

val HugeIcons.CalendarHeart: ImageVector
    get() {
        if (_calendarHeart != null) {
            return _calendarHeart!!
        }
        _calendarHeart = ImageVector.Builder(
            name = "CalendarHeart",
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
            moveTo(15.015f, 15.3866f)
            curveTo(16.0876f, 14.7469f, 17.0238f, 15.0047f, 17.5863f, 15.4153f)
            curveTo(17.8169f, 15.5837f, 17.9322f, 15.6679f, 18f, 15.6679f)
            curveTo(18.0678f, 15.6679f, 18.1831f, 15.5837f, 18.4137f, 15.4153f)
            curveTo(18.9762f, 15.0047f, 19.9124f, 14.7469f, 20.985f, 15.3866f)
            curveTo(22.3928f, 16.2261f, 22.7113f, 18.9958f, 19.4642f, 21.3324f)
            curveTo(18.8457f, 21.7775f, 18.5365f, 22f, 18f, 22f)
            curveTo(17.4635f, 22f, 17.1543f, 21.7775f, 16.5358f, 21.3324f)
            curveTo(13.2887f, 18.9958f, 13.6072f, 16.2261f, 15.015f, 15.3866f)
            close()
        }
        }.build()

        return _calendarHeart!!
    }

private var _calendarHeart: ImageVector? = null

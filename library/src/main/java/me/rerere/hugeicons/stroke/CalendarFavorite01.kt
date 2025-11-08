package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CalendarFavorite01: ImageVector
    get() {
        if (_calendarFavorite01 != null) {
            return _calendarFavorite01!!
        }
        _calendarFavorite01 = ImageVector.Builder(
            name = "CalendarFavorite01",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 2f)
        verticalLineTo(6f)
        moveTo(8f, 2f)
        verticalLineTo(6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 14f)
        verticalLineTo(12f)
        curveTo(21f, 8.22876f, 21f, 6.34315f, 19.8284f, 5.17157f)
        curveTo(18.6569f, 4f, 16.7712f, 4f, 13f, 4f)
        horizontalLineTo(11f)
        curveTo(7.22876f, 4f, 5.34315f, 4f, 4.17157f, 5.17157f)
        curveTo(3f, 6.34315f, 3f, 8.22876f, 3f, 12f)
        verticalLineTo(14f)
        curveTo(3f, 17.7712f, 3f, 19.6569f, 4.17157f, 20.8284f)
        curveTo(5.34315f, 22f, 7.22876f, 22f, 11f, 22f)
        horizontalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 10f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.1047f, 15.5055f)
        lineTo(18.7206f, 16.7475f)
        curveTo(18.8046f, 16.9204f, 19.0286f, 17.0862f, 19.2175f, 17.118f)
        lineTo(20.3339f, 17.305f)
        curveTo(21.0478f, 17.425f, 21.2158f, 17.9472f, 20.7014f, 18.4624f)
        lineTo(19.8335f, 19.3374f)
        curveTo(19.6865f, 19.4856f, 19.606f, 19.7715f, 19.6515f, 19.9761f)
        lineTo(19.9f, 21.0594f)
        curveTo(20.096f, 21.9168f, 19.6445f, 22.2485f, 18.8921f, 21.8004f)
        lineTo(17.8457f, 21.1758f)
        curveTo(17.6567f, 21.0629f, 17.3453f, 21.0629f, 17.1528f, 21.1758f)
        lineTo(16.1064f, 21.8004f)
        curveTo(15.3575f, 22.2485f, 14.9025f, 21.9133f, 15.0985f, 21.0594f)
        lineTo(15.347f, 19.9761f)
        curveTo(15.3925f, 19.7715f, 15.312f, 19.4856f, 15.165f, 19.3374f)
        lineTo(14.2971f, 18.4624f)
        curveTo(13.7861f, 17.9472f, 13.9506f, 17.425f, 14.6646f, 17.305f)
        lineTo(15.7809f, 17.118f)
        curveTo(15.9664f, 17.0862f, 16.1904f, 16.9204f, 16.2744f, 16.7475f)
        lineTo(16.8903f, 15.5055f)
        curveTo(17.2263f, 14.8315f, 17.7722f, 14.8315f, 18.1047f, 15.5055f)
        }
        }.build()

        return _calendarFavorite01!!
    }

private var _calendarFavorite01: ImageVector? = null

package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CalendarDownload02: ImageVector
    get() {
        if (_calendarDownload02 != null) {
            return _calendarDownload02!!
        }
        _calendarDownload02 = ImageVector.Builder(
            name = "CalendarDownload02",
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
        moveTo(18f, 2f)
        verticalLineTo(4f)
        moveTo(6f, 2f)
        verticalLineTo(4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 8f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 12.2432f)
        curveTo(2.5f, 7.88594f, 2.5f, 5.70728f, 3.75212f, 4.35364f)
        curveTo(5.00424f, 3f, 7.01949f, 3f, 11.05f, 3f)
        horizontalLineTo(12.95f)
        curveTo(16.9805f, 3f, 18.9958f, 3f, 20.2479f, 4.35364f)
        curveTo(21.5f, 5.70728f, 21.5f, 7.88594f, 21.5f, 12.2432f)
        verticalLineTo(12.7568f)
        curveTo(21.5f, 17.1141f, 21.5f, 19.2927f, 20.2479f, 20.6464f)
        curveTo(18.9958f, 22f, 16.9805f, 22f, 12.95f, 22f)
        horizontalLineTo(11.05f)
        curveTo(7.01949f, 22f, 5.00424f, 22f, 3.75212f, 20.6464f)
        curveTo(2.5f, 19.2927f, 2.5f, 17.1141f, 2.5f, 12.7568f)
        verticalLineTo(12.2432f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 15.5f)
        curveTo(9.99153f, 16.0057f, 11.2998f, 18f, 12f, 18f)
        moveTo(14.5f, 15.5f)
        curveTo(14.0085f, 16.0057f, 12.7002f, 18f, 12f, 18f)
        moveTo(12f, 18f)
        verticalLineTo(12f)
        }
        }.build()

        return _calendarDownload02!!
    }

private var _calendarDownload02: ImageVector? = null

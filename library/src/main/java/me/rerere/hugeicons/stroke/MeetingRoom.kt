package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MeetingRoom: ImageVector
    get() {
        if (_meetingRoom != null) {
            return _meetingRoom!!
        }
        _meetingRoom = ImageVector.Builder(
            name = "MeetingRoom",
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
        moveTo(17f, 16f)
        verticalLineTo(8f)
        curveTo(17f, 5.64298f, 17f, 4.46447f, 16.2678f, 3.73223f)
        curveTo(15.5355f, 3f, 14.357f, 3f, 12f, 3f)
        horizontalLineTo(8f)
        curveTo(5.64298f, 3f, 4.46447f, 3f, 3.73223f, 3.73223f)
        curveTo(3f, 4.46447f, 3f, 5.64298f, 3f, 8f)
        verticalLineTo(16f)
        curveTo(3f, 18.357f, 3f, 19.5355f, 3.73223f, 20.2678f)
        curveTo(4.46447f, 21f, 5.64298f, 21f, 8f, 21f)
        horizontalLineTo(12f)
        curveTo(14.357f, 21f, 15.5355f, 21f, 16.2678f, 20.2678f)
        curveTo(17f, 19.5355f, 17f, 18.357f, 17f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 21f)
        horizontalLineTo(17f)
        curveTo(18.8856f, 21f, 19.8284f, 21f, 20.4142f, 20.4142f)
        curveTo(21f, 19.8284f, 21f, 18.8856f, 21f, 17f)
        verticalLineTo(10f)
        curveTo(21f, 8.11438f, 21f, 7.17157f, 20.4142f, 6.58579f)
        curveTo(19.8284f, 6f, 18.8856f, 6f, 17f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 11f)
        verticalLineTo(13f)
        }
        }.build()

        return _meetingRoom!!
    }

private var _meetingRoom: ImageVector? = null

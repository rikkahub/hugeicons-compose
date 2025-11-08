package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.NoMeetingRoom: ImageVector
    get() {
        if (_noMeetingRoom != null) {
            return _noMeetingRoom!!
        }
        _noMeetingRoom = ImageVector.Builder(
            name = "NoMeetingRoom",
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
        moveTo(2.00024f, 2f)
        lineTo(22.0002f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.0005f, 21f)
        horizontalLineTo(8.00049f)
        curveTo(5.64347f, 21f, 4.46495f, 21f, 3.73272f, 20.2678f)
        curveTo(3.00049f, 19.5355f, 3.00049f, 18.357f, 3.00049f, 16f)
        verticalLineTo(8f)
        curveTo(3.00049f, 5.64298f, 3.00049f, 4.46447f, 3.73272f, 3.73223f)
        moveTo(12.0005f, 21f)
        curveTo(14.3575f, 21f, 15.536f, 21f, 16.2683f, 20.2678f)
        curveTo(16.889f, 19.647f, 16.9835f, 18.7056f, 16.9979f, 16.9974f)
        moveTo(12.0005f, 21f)
        horizontalLineTo(17.0005f)
        curveTo(18.8861f, 21f, 19.8289f, 21f, 20.4147f, 20.4142f)
        moveTo(21.0005f, 16.9974f)
        verticalLineTo(10f)
        curveTo(21.0005f, 8.11438f, 21.0005f, 7.17157f, 20.4147f, 6.58579f)
        curveTo(19.8289f, 6f, 18.8861f, 6f, 17.0005f, 6f)
        moveTo(17.0005f, 13.1109f)
        verticalLineTo(8f)
        curveTo(17.0005f, 5.64298f, 17.0005f, 4.46447f, 16.2683f, 3.73223f)
        curveTo(15.536f, 3f, 14.3575f, 3f, 12.0005f, 3f)
        horizontalLineTo(8.00049f)
        curveTo(7.5983f, 3f, 7.23042f, 3f, 6.89321f, 3.00364f)
        }
        }.build()

        return _noMeetingRoom!!
    }

private var _noMeetingRoom: ImageVector? = null

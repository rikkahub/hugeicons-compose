package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UserSettings02: ImageVector
    get() {
        if (_userSettings02 != null) {
            return _userSettings02!!
        }
        _userSettings02 = ImageVector.Builder(
            name = "UserSettings02",
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
        moveTo(14f, 7.5f)
        curveTo(14f, 4.73858f, 11.7614f, 2.5f, 9f, 2.5f)
        curveTo(6.23858f, 2.5f, 4f, 4.73858f, 4f, 7.5f)
        curveTo(4f, 10.2614f, 6.23858f, 12.5f, 9f, 12.5f)
        curveTo(11.7614f, 12.5f, 14f, 10.2614f, 14f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 19.5f)
        curveTo(16f, 15.634f, 12.866f, 12.5f, 9f, 12.5f)
        curveTo(5.13401f, 12.5f, 2f, 15.634f, 2f, 19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 13f)
        lineTo(19f, 14.5f)
        moveTo(19f, 13f)
        curveTo(19.737f, 13f, 20.3809f, 12.6013f, 20.7278f, 12.0079f)
        moveTo(19f, 13f)
        curveTo(18.263f, 13f, 17.6191f, 12.6013f, 17.2722f, 12.0079f)
        moveTo(19f, 9f)
        lineTo(19f, 7.5f)
        moveTo(19f, 9f)
        curveTo(19.737f, 9f, 20.3809f, 9.39866f, 20.7278f, 9.99209f)
        moveTo(19f, 9f)
        curveTo(18.263f, 9f, 17.6191f, 9.39865f, 17.2722f, 9.99209f)
        moveTo(22f, 9.25f)
        lineTo(20.7278f, 9.99209f)
        moveTo(16f, 12.75f)
        lineTo(17.2722f, 12.0079f)
        moveTo(22f, 12.75f)
        lineTo(20.7278f, 12.0079f)
        moveTo(16f, 9.25f)
        lineTo(17.2722f, 9.99209f)
        moveTo(20.7278f, 12.0079f)
        curveTo(20.9009f, 11.7119f, 21f, 11.3676f, 21f, 11f)
        curveTo(21f, 10.6324f, 20.9009f, 10.288f, 20.7278f, 9.99209f)
        moveTo(17.2722f, 9.99209f)
        curveTo(17.0992f, 10.288f, 17f, 10.6324f, 17f, 11f)
        curveTo(17f, 11.3676f, 17.0991f, 11.712f, 17.2722f, 12.0079f)
        }
        }.build()

        return _userSettings02!!
    }

private var _userSettings02: ImageVector? = null

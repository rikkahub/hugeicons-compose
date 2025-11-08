package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UserTime02: ImageVector
    get() {
        if (_userTime02 != null) {
            return _userTime02!!
        }
        _userTime02 = ImageVector.Builder(
            name = "UserTime02",
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
        moveTo(18.5f, 18.5f)
        lineTo(17f, 17.9f)
        verticalLineTo(15.5f)
        moveTo(13f, 17.5f)
        curveTo(13f, 19.7091f, 14.7909f, 21.5f, 17f, 21.5f)
        curveTo(19.2091f, 21.5f, 21f, 19.7091f, 21f, 17.5f)
        curveTo(21f, 15.2909f, 19.2091f, 13.5f, 17f, 13.5f)
        curveTo(14.7909f, 13.5f, 13f, 15.2909f, 13f, 17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 18.5f)
        verticalLineTo(16.4704f)
        curveTo(3f, 15.2281f, 3.55927f, 14.0099f, 4.68968f, 13.4946f)
        curveTo(6.0685f, 12.8661f, 7.72212f, 12.5f, 9.5f, 12.5f)
        curveTo(10.5541f, 12.5f, 11.5646f, 12.6287f, 12.5f, 12.8645f)
        }
        }.build()

        return _userTime02!!
    }

private var _userTime02: ImageVector? = null

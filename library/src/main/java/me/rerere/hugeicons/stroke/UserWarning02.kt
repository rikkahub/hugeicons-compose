package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UserWarning02: ImageVector
    get() {
        if (_userWarning02 != null) {
            return _userWarning02!!
        }
        _userWarning02 = ImageVector.Builder(
            name = "UserWarning02",
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
        moveTo(18f, 20f)
        verticalLineTo(17.9704f)
        curveTo(18f, 16.7281f, 17.4407f, 15.5099f, 16.3103f, 14.9946f)
        curveTo(14.9315f, 14.3661f, 13.2779f, 14f, 11.5f, 14f)
        curveTo(9.72212f, 14f, 8.0685f, 14.3661f, 6.68968f, 14.9946f)
        curveTo(5.55927f, 15.5099f, 5f, 16.7281f, 5f, 17.9704f)
        verticalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 6f)
        verticalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 13f)
        verticalLineTo(13.01f)
        }
        }.build()

        return _userWarning02!!
    }

private var _userWarning02: ImageVector? = null

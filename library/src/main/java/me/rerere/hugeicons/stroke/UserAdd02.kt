package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UserAdd02: ImageVector
    get() {
        if (_userAdd02 != null) {
            return _userAdd02!!
        }
        _userAdd02 = ImageVector.Builder(
            name = "UserAdd02",
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
        moveTo(14f, 8.5f)
        curveTo(14f, 5.73858f, 11.7614f, 3.5f, 9f, 3.5f)
        curveTo(6.23858f, 3.5f, 4f, 5.73858f, 4f, 8.5f)
        curveTo(4f, 11.2614f, 6.23858f, 13.5f, 9f, 13.5f)
        curveTo(11.7614f, 13.5f, 14f, 11.2614f, 14f, 8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 20.5f)
        curveTo(16f, 16.634f, 12.866f, 13.5f, 9f, 13.5f)
        curveTo(5.13401f, 13.5f, 2f, 16.634f, 2f, 20.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 9f)
        verticalLineTo(15f)
        moveTo(22f, 12f)
        lineTo(16f, 12f)
        }
        }.build()

        return _userAdd02!!
    }

private var _userAdd02: ImageVector? = null

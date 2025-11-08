package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.User: ImageVector
    get() {
        if (_user != null) {
            return _user!!
        }
        _user = ImageVector.Builder(
            name = "User",
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
        moveTo(17f, 8.5f)
        curveTo(17f, 5.73858f, 14.7614f, 3.5f, 12f, 3.5f)
        curveTo(9.23858f, 3.5f, 7f, 5.73858f, 7f, 8.5f)
        curveTo(7f, 11.2614f, 9.23858f, 13.5f, 12f, 13.5f)
        curveTo(14.7614f, 13.5f, 17f, 11.2614f, 17f, 8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 20.5f)
        curveTo(19f, 16.634f, 15.866f, 13.5f, 12f, 13.5f)
        curveTo(8.13401f, 13.5f, 5f, 16.634f, 5f, 20.5f)
        }
        }.build()

        return _user!!
    }

private var _user: ImageVector? = null

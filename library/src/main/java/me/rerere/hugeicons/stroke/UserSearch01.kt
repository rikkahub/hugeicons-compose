package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UserSearch01: ImageVector
    get() {
        if (_userSearch01 != null) {
            return _userSearch01!!
        }
        _userSearch01 = ImageVector.Builder(
            name = "UserSearch01",
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
        moveTo(15f, 7.5f)
        curveTo(15f, 4.73858f, 12.7614f, 2.5f, 10f, 2.5f)
        curveTo(7.23858f, 2.5f, 5f, 4.73858f, 5f, 7.5f)
        curveTo(5f, 10.2614f, 7.23858f, 12.5f, 10f, 12.5f)
        curveTo(12.7614f, 12.5f, 15f, 10.2614f, 15f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 21.5f)
        lineTo(19.5f, 20f)
        moveTo(20f, 17.5f)
        curveTo(20f, 15.8431f, 18.6569f, 14.5f, 17f, 14.5f)
        curveTo(15.3431f, 14.5f, 14f, 15.8431f, 14f, 17.5f)
        curveTo(14f, 19.1569f, 15.3431f, 20.5f, 17f, 20.5f)
        curveTo(18.6569f, 20.5f, 20f, 19.1569f, 20f, 17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 19.5f)
        curveTo(3f, 15.634f, 6.13401f, 12.5f, 10f, 12.5f)
        curveTo(11.0736f, 12.5f, 12.0907f, 12.7417f, 13f, 13.1736f)
        }
        }.build()

        return _userSearch01!!
    }

private var _userSearch01: ImageVector? = null

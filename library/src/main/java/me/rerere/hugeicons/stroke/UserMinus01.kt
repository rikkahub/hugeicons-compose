package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UserMinus01: ImageVector
    get() {
        if (_userMinus01 != null) {
            return _userMinus01!!
        }
        _userMinus01 = ImageVector.Builder(
            name = "UserMinus01",
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
        moveTo(15f, 8.5f)
        curveTo(15f, 5.73858f, 12.7614f, 3.5f, 10f, 3.5f)
        curveTo(7.23858f, 3.5f, 5f, 5.73858f, 5f, 8.5f)
        curveTo(5f, 11.2614f, 7.23858f, 13.5f, 10f, 13.5f)
        curveTo(12.7614f, 13.5f, 15f, 11.2614f, 15f, 8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 19f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 20.5f)
        curveTo(3f, 16.634f, 6.13401f, 13.5f, 10f, 13.5f)
        curveTo(11.4872f, 13.5f, 12.8662f, 13.9638f, 14f, 14.7547f)
        }
        }.build()

        return _userMinus01!!
    }

private var _userMinus01: ImageVector? = null

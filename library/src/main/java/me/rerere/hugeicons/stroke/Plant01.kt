package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Plant01: ImageVector
    get() {
        if (_plant01 != null) {
            return _plant01!!
        }
        _plant01 = ImageVector.Builder(
            name = "Plant01",
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
        moveTo(18f, 10f)
        curveTo(18f, 10f, 12f, 14f, 12f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.34882f, 11.1825f)
        curveTo(7.73784f, 12.3891f, 5.44323f, 12.26f, 3.9785f, 10.7953f)
        curveTo(1.55484f, 8.37164f, 2.03957f, 3.03957f, 2.03957f, 3.03957f)
        curveTo(2.03957f, 3.03957f, 7.37164f, 2.55484f, 9.7953f, 4.9785f)
        curveTo(10.7548f, 5.93803f, 11.1412f, 7.25369f, 10.9543f, 8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.9638f, 12.8175f)
        curveTo(13.644f, 11.3832f, 13.6797f, 9.14983f, 15.0708f, 7.75867f)
        curveTo(17.2252f, 5.6043f, 21.9648f, 6.03517f, 21.9648f, 6.03517f)
        curveTo(21.9648f, 6.03517f, 22.3957f, 10.7748f, 20.2413f, 12.9292f)
        curveTo(19.4877f, 13.6828f, 18.487f, 14.0386f, 17.5f, 13.9967f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 7f)
        curveTo(6f, 7f, 12f, 12f, 12f, 21f)
        }
        }.build()

        return _plant01!!
    }

private var _plant01: ImageVector? = null

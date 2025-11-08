package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Atom01: ImageVector
    get() {
        if (_atom01 != null) {
            return _atom01!!
        }
        _atom01 = ImageVector.Builder(
            name = "Atom01",
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
        moveTo(22f, 9f)
        horizontalLineTo(21.99f)
        moveTo(2.00995f, 9f)
        horizontalLineTo(2f)
        moveTo(12.005f, 22f)
        horizontalLineTo(11.995f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.55556f, 21f)
        curveTo(4.47364f, 19.4999f, 2.37683f, 16.5285f, 2f, 13.1273f)
        moveTo(16.4444f, 21f)
        curveTo(19.5264f, 19.4999f, 21.6232f, 16.5285f, 22f, 13.1273f)
        moveTo(5.55555f, 4.25658f)
        curveTo(9.23956f, 1.24781f, 14.5382f, 1.24781f, 18.2222f, 4.25658f)
        }
        }.build()

        return _atom01!!
    }

private var _atom01: ImageVector? = null

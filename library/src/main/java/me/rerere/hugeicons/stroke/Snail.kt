package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Snail: ImageVector
    get() {
        if (_snail != null) {
            return _snail!!
        }
        _snail = ImageVector.Builder(
            name = "Snail",
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
        moveTo(9.57687f, 14f)
        curveTo(9.57687f, 16.5f, 11.5f, 20f, 15.5399f, 20f)
        curveTo(19.5798f, 20f, 21.9999f, 16.866f, 21.9999f, 13f)
        curveTo(21.9999f, 8.02944f, 17.7699f, 4f, 12.0615f, 4f)
        curveTo(6.41519f, 4f, 1.41338f, 8.25529f, 2.0558f, 15.3865f)
        curveTo(2.08969f, 15.7628f, 2.34812f, 16.0843f, 2.71438f, 16.1769f)
        curveTo(5.41315f, 16.8591f, 8.18768f, 15.8637f, 9.57687f, 14f)
        moveTo(9.57687f, 14f)
        curveTo(9.57687f, 8.87223f, 17.5276f, 7.79116f, 17.5276f, 13f)
        curveTo(17.5276f, 14.4689f, 16.4999f, 15.7264f, 15.043f, 16.2456f)
        }
        }.build()

        return _snail!!
    }

private var _snail: ImageVector? = null

package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Infinity01: ImageVector
    get() {
        if (_infinity01 != null) {
            return _infinity01!!
        }
        _infinity01 = ImageVector.Builder(
            name = "Infinity01",
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
        moveTo(12f, 12f)
        curveTo(12f, 12f, 9.26142f, 17f, 6.5f, 17f)
        curveTo(3.73858f, 17f, 2f, 14.7614f, 2f, 12f)
        curveTo(2f, 9.23858f, 3.73858f, 7f, 6.5f, 7f)
        curveTo(9.26142f, 7f, 12f, 12f, 12f, 12f)
        moveTo(12f, 12f)
        curveTo(12f, 12f, 14.7386f, 17f, 17.5f, 17f)
        curveTo(20.2614f, 17f, 22f, 14.7614f, 22f, 12f)
        curveTo(22f, 9.23858f, 20.2614f, 7f, 17.5f, 7f)
        curveTo(14.7386f, 7f, 12f, 12f, 12f, 12f)
        }
        }.build()

        return _infinity01!!
    }

private var _infinity01: ImageVector? = null

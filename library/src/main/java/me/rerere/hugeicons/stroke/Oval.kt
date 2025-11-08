package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Oval: ImageVector
    get() {
        if (_oval != null) {
            return _oval!!
        }
        _oval = ImageVector.Builder(
            name = "Oval",
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
        moveTo(22f, 12f)
        curveTo(22f, 16.9706f, 17.5228f, 21f, 12f, 21f)
        curveTo(6.47715f, 21f, 2f, 16.9706f, 2f, 12f)
        curveTo(2f, 7.02944f, 6.47715f, 3f, 12f, 3f)
        curveTo(17.5228f, 3f, 22f, 7.02944f, 22f, 12f)
        }
        }.build()

        return _oval!!
    }

private var _oval: ImageVector? = null

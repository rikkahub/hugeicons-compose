package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Monocle: ImageVector
    get() {
        if (_monocle != null) {
            return _monocle!!
        }
        _monocle = ImageVector.Builder(
            name = "Monocle",
            defaultWidth = 24.dp,
            defaultHeight = 25.dp,
            viewportWidth = 24f,
            viewportHeight = 25f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 17.4961f)
        verticalLineTo(19.4961f)
        curveTo(22f, 19.8467f, 21.9398f, 20.1833f, 21.8293f, 20.4961f)
        moveTo(20f, 22.3254f)
        curveTo(19.6872f, 22.4359f, 19.3506f, 22.4961f, 19f, 22.4961f)
        curveTo(18.6494f, 22.4961f, 18.3128f, 22.4359f, 18f, 22.3254f)
        moveTo(16f, 17.4961f)
        verticalLineTo(19.4961f)
        curveTo(16f, 19.8467f, 16.0602f, 20.1833f, 16.1707f, 20.4961f)
        moveTo(22f, 8.49609f)
        verticalLineTo(5.49609f)
        moveTo(22f, 14.4961f)
        verticalLineTo(11.4961f)
        moveTo(16f, 14.4961f)
        verticalLineTo(10.4961f)
        }
        }.build()

        return _monocle!!
    }

private var _monocle: ImageVector? = null

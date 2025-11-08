package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Capcut: ImageVector
    get() {
        if (_capcut != null) {
            return _capcut!!
        }
        _capcut = ImageVector.Builder(
            name = "Capcut",
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
        moveTo(9.99826f, 12f)
        lineTo(2f, 16f)
        curveTo(2f, 17.8856f, 2f, 18.3284f, 2.58579f, 18.9142f)
        curveTo(3.17157f, 19.5f, 4.11438f, 19.5f, 6f, 19.5f)
        horizontalLineTo(14f)
        curveTo(15.8856f, 19.5f, 16.8284f, 19.5f, 17.4142f, 18.9142f)
        curveTo(18f, 18.3284f, 18f, 17.8856f, 18f, 16f)
        moveTo(9.99826f, 12f)
        lineTo(21.9957f, 6f)
        moveTo(9.99826f, 12f)
        lineTo(2f, 8f)
        curveTo(2f, 6.61438f, 2f, 5.67157f, 2.58579f, 5.08579f)
        curveTo(3.17157f, 4.5f, 4.11438f, 4.5f, 6f, 4.5f)
        horizontalLineTo(14f)
        curveTo(15.8856f, 4.5f, 16.8284f, 4.5f, 17.4142f, 5.08579f)
        curveTo(18f, 5.67157f, 18f, 6.61438f, 18f, 8f)
        moveTo(9.99826f, 12f)
        lineTo(21.9957f, 18f)
        }
        }.build()

        return _capcut!!
    }

private var _capcut: ImageVector? = null

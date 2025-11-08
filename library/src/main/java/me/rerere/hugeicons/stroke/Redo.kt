package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Redo: ImageVector
    get() {
        if (_redo != null) {
            return _redo!!
        }
        _redo = ImageVector.Builder(
            name = "Redo",
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
        moveTo(21f, 12f)
        curveTo(21f, 16.9706f, 16.9706f, 21f, 12f, 21f)
        curveTo(7.02944f, 21f, 3f, 16.9706f, 3f, 12f)
        curveTo(3f, 7.02944f, 7.02944f, 3f, 12f, 3f)
        curveTo(15.2073f, 3f, 18.0227f, 4.67765f, 19.6166f, 7.20327f)
        moveTo(20.7066f, 3.00076f)
        lineTo(20.5344f, 5.05452f)
        curveTo(20.4104f, 6.53384f, 20.3484f, 7.27349f, 19.8664f, 7.68914f)
        curveTo(19.3844f, 8.10479f, 18.6733f, 8.03185f, 17.251f, 7.88595f)
        lineTo(15.2066f, 7.67625f)
        }
        }.build()

        return _redo!!
    }

private var _redo: ImageVector? = null

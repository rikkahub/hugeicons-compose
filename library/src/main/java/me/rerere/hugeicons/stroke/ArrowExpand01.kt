package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowExpand01: ImageVector
    get() {
        if (_arrowExpand01 != null) {
            return _arrowExpand01!!
        }
        _arrowExpand01 = ImageVector.Builder(
            name = "ArrowExpand01",
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
        moveTo(16.4999f, 3.26621f)
        curveTo(17.3443f, 3.25421f, 20.1408f, 2.67328f, 20.7337f, 3.26621f)
        curveTo(21.3266f, 3.85913f, 20.7457f, 6.65559f, 20.7337f, 7.5f)
        moveTo(20.5059f, 3.49097f)
        lineTo(13.5021f, 10.4961f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.26637f, 16.5001f)
        curveTo(3.25437f, 17.3445f, 2.67344f, 20.141f, 3.26637f, 20.7339f)
        curveTo(3.85929f, 21.3268f, 6.65575f, 20.7459f, 7.50016f, 20.7339f)
        moveTo(10.502f, 13.4976f)
        lineTo(3.49825f, 20.5027f)
        }
        }.build()

        return _arrowExpand01!!
    }

private var _arrowExpand01: ImageVector? = null

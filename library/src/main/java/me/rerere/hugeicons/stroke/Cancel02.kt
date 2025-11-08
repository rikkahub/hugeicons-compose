package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Cancel02: ImageVector
    get() {
        if (_cancel02 != null) {
            return _cancel02!!
        }
        _cancel02 = ImageVector.Builder(
            name = "Cancel02",
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
        moveTo(5.43212f, 18.5679f)
        curveTo(6.00828f, 19.144f, 6.94243f, 19.144f, 7.51859f, 18.5679f)
        lineTo(12.0003f, 14.0863f)
        lineTo(16.4814f, 18.5672f)
        curveTo(17.0573f, 19.1431f, 17.9909f, 19.1434f, 18.5672f, 18.5679f)
        curveTo(19.144f, 17.9919f, 19.1443f, 17.0573f, 18.5679f, 16.4809f)
        lineTo(14.0868f, 12f)
        lineTo(18.5679f, 7.51913f)
        curveTo(19.1438f, 6.94326f, 19.1441f, 6.0097f, 18.5686f, 5.43346f)
        curveTo(17.9925f, 4.85669f, 17.0578f, 4.85638f, 16.4814f, 5.43278f)
        lineTo(12.0003f, 9.91365f)
        lineTo(7.51859f, 5.4321f)
        curveTo(6.94243f, 4.85597f, 6.00828f, 4.85597f, 5.43212f, 5.4321f)
        curveTo(4.85596f, 6.00823f, 4.85596f, 6.94232f, 5.43212f, 7.51845f)
        lineTo(9.91387f, 12f)
        lineTo(5.43212f, 16.4816f)
        curveTo(4.85596f, 17.0577f, 4.85596f, 17.9918f, 5.43212f, 18.5679f)
        }
        }.build()

        return _cancel02!!
    }

private var _cancel02: ImageVector? = null

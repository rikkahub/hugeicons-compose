package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Skew: ImageVector
    get() {
        if (_skew != null) {
            return _skew!!
        }
        _skew = ImageVector.Builder(
            name = "Skew",
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
        moveTo(10.9171f, 4.5752f)
        lineTo(17.0848f, 6.4255f)
        moveTo(19.1544f, 8.99455f)
        lineTo(19.8476f, 18.0061f)
        moveTo(18.0162f, 19.7523f)
        lineTo(5.98574f, 18.2484f)
        moveTo(8.32812f, 5.88435f)
        lineTo(4.67383f, 16.1164f)
        }
        }.build()

        return _skew!!
    }

private var _skew: ImageVector? = null

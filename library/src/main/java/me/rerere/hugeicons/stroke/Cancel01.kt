package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Cancel01: ImageVector
    get() {
        if (_cancel01 != null) {
            return _cancel01!!
        }
        _cancel01 = ImageVector.Builder(
            name = "Cancel01",
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
        moveTo(18f, 6f)
        lineTo(6.00081f, 17.9992f)
        moveTo(17.9992f, 18f)
        lineTo(6f, 6.00085f)
        }
        }.build()

        return _cancel01!!
    }

private var _cancel01: ImageVector? = null
